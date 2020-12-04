#!/bin/bash
PROJECTNAME=eureka-client
#获取当前java项目的进程ID
pid=`ps -ef |grep $PROJECTNAME |grep -v "grep" |awk '{print $2}'`

if [ $pid ];then
   #进程已经在运行 无需重启
   echo "$PROJECTNAME is running and pid=$pid"
else
   echo "Start success to start $PROJECTNAME ..."
   #查看防火墙状态
   firewallState=$(firewall-cmd --state 2>&1)
   if [ "$firewallState" == "running" ] ; then
      echo "firewallState is runnning"
      #查看防火墙已经开通的端口
      ports=$(firewall-cmd --zone=public --list-ports)
      echo "opened ports:$ports"
      needport="8081"
      #判断当前项目运行的端口是否已经开启
      if [[ ! "$ports" =~ "$needport" ]] ; then
          #打开指定端口
      	  firewall-cmd --zone=public --add-port=$needport/tcp --permanent
      	  echo "Start success to open tcp port $needport"
      fi
   fi
   #重启防火墙
   systemctl restart firewalld.service
   cd /$USER/soft/client/
   nohup java -jar eureka-client-1.0-SNAPSHOT.jar >> catalina.out 2>&1 &

fi
