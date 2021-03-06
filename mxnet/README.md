## Build Requirements

1. A C++ compiler with C++11 support
1. [SWIG](http://www.swig.org/)
1. [OpenCV](http://opencv.org) - optional

#### Build mxnet 
##### Ubuntu

```bash
cd ../thirdparty/mxnet
git submodule update --init --recursive
cp make/config.mk .
### EDIT config.mk - USE_OPENCV=0, USE_CUDA=1, USE_CUDA_PATH=...
make -j8
```

##### Macosx

First install [homebrew](http://brew.sh).
```bash
git submodule update --init --recursive --depth 1
brew update
brew uninstall homebrew/science
## sudo chown -R $(whoami):admin /usr/local ##if you get write permission issues
brew tap homebrew/science
brew install openblas

cd ../thirdparty/mxnet 
cp make/osx.mk ./config.mk
cat << EOF >> ./config.mk
ADD_LDFLAGS = '-L/usr/local/opt/openblas/lib'
ADD_CFLAGS = '-I/usr/local/opt/openblas/include'
EOF
make -j$(sysctl -n hw.ncpu)
```

For other options see the [official mxnet build instructions](http://mxnet.readthedocs.io/en/latest/how_to/build.html).

#### Build mxnet H2O bindings
Once libmxnet.so is built, go back to the top-level directory of the deepwater repo, and follow the directions there.
