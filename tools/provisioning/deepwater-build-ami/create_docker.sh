#!/bin/sh

aws ecr get-login && packer build -only=docker ${1:-packer.json} 
