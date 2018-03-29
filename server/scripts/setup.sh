#!/bin/sh

if [ "$#" -ne 3 ]; then
    echo "Usage: setup.sh /path/to/gitrepo /path/to/SHMFolder /path/to/JSVMFolder"
fi

pToRepo=$1
pToSHM=$2
pToJSVM=$3

filesBase=/var/spool/vector

mkdir ${filesBase}/bin ${filesBase}/scripts ${filesBase}/rec ${filesBase}/php

cp -r ${path}/cfg ${path}/scripts ${path}/php ${filesBase}/
cd ${path}/src
make
cp ${path}/src/CombineLS ${path}/src/ExtractAddLS ${filesBase}/bin
cd -

echo 0 > ${filesBase}/counter

cd ${pToSHM}/build/linux
make
cp ${pToSHM}/bin/*Static* ${filesBase}/bin
cd -

cd ${pToJSVM}/H264Extension/build/linux
make
cp ${pToJSVM}/bin/DownConvertStatic* ${filesBase}/bin
cd -

chmod a+x ${filesBase}/scripts/*