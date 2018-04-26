#!/bin/sh
docker stop $1
docker rm $1
docker rmi quay.io/dxk19911212/$1