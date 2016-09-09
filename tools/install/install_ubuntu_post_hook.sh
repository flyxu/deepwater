#!/bin/bash

set -e

DEBIAN_FRONTEND=noninteractive

echo 'DPkg::Post-Invoke {"/bin/rm -f /var/cache/apt/archives/*.deb || true";};' | tee /etc/apt/apt.conf.d/no-cache 
echo "deb http://ap-northeast-1.ec2.archive.ubuntu.com/ubuntu trusty main universe" >> /etc/apt/sources.list 
apt-get update -q -y 
apt-get dist-upgrade -y 
apt-get clean 
rm -rf /var/cache/apt/* 
