#!/bin/bash
set -e 

export DEBIAN_FRONTEND=noninteractive

echo " setup TensorFlow build variables"

# Configure the build for our CUDA configuration.

sudo echo "export CUDA_TOOLKIT_PATH=/usr/local/cuda" > /etc/profile.d/cuda.sh
sudo echo "export CUDNN_INSTALL_PATH=/usr/local/cuda" >> /etc/profile.d/cuda.sh
sudo echo "export TF_NEED_CUDA=1" >> /etc/profile.d/cuda.sh

