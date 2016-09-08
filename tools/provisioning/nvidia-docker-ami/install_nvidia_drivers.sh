#!/bin/bash

set -e 

export DEBIAN_FRONTEND=noninteractive

# This script installs Nvidia Driver on ec2
# https://github.com/NVIDIA/nvidia-docker/wiki/Deploy-on-Amazon-EC2

sudo apt-get install linux-headers-`uname -r`

# Install NVIDIA drivers 361.42
echo "installing NVIDIA drivers 361.42"
sudo apt-get install --no-install-recommends -y build-essential gcc g++ make binutils libc-dev linux-headers-`uname -r`

wget -P /tmp http://us.download.nvidia.com/XFree86/Linux-x86_64/361.42/NVIDIA-Linux-x86_64-361.42.run
sudo sh /tmp/NVIDIA-Linux-x86_64-361.42.run --silent

