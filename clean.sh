#!/bin/sh

docker stop $1
if [ $? -ne 0 ]; then
  echo ""
fi

docker rm $1
if [ $? -ne 0 ]; then
  echo ""
fi

docker rmi quay.io/dxk19911212/$1
if [ $? -ne 0 ]; then
  echo ""
fi