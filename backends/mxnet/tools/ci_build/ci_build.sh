#!/bin/bash


git submodule update --init --recursive
cd backends/mxnet/mxnet
cp make/config.mk .
export MAKEFLAGS="-j $(grep -c ^processor /proc/cpuinfo) USE_CUDNN=1 USE_CUDA=1 USE_OPENCV=0 USE_CUDA_PATH=/usr/local/cuda"
make clean
make
cd ..
make
