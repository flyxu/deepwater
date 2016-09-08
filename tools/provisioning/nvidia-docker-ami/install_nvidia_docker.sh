#!/bin/bash

set -e 

# Install nvidia-docker and nvidia-docker-plugin

wget -P /tmp https://github.com/NVIDIA/nvidia-docker/releases/download/v1.0.0-rc.3/nvidia-docker_1.0.0.rc.3-1_amd64.deb
sudo dpkg -i /tmp/nvidia-docker*.deb && rm /tmp/nvidia-docker*.deb

sudo service docker start

# Test nvidia-smi
sudo nvidia-docker run --rm nvidia/cuda nvidia-smi

# pre-cache images 
sudo nvidia-docker pull nvidia/cuda:7.5-cudnn5-devel 
