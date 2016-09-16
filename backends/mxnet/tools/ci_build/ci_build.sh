#!/bin/bash


git submodule update --init --recursive
cd backends/mxnet/mxnet
cp make/config.mk .
export MAKEFLAGS="-j $(grep -c ^processor /proc/cpuinfo)"
make 
cd ..
make 
