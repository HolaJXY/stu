#!/bin/bash

PROJECTNAME=eureka-client
#获取当前java项目的进程ID
pid=`ps -ef | grep $PROJECTNAME |grep -v "grep" |awk '{print $2}'`
if [ $pid ];then
   echo "$PROJECTNAME is running and pid=$pid"
   #关闭当前java项目的进程ID
   kill -9 $pid
   if [[ $? -eq 0 ]];then
      echo "success to stop $PROJECTNAME "
   else
      echo "fail to stop $PROJECTNAME "
   fi
fi
