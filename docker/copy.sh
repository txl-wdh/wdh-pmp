#!/bin/sh

# 复制项目的文件到对应docker路径，便于一键生成镜像。
usage() {
	echo "Usage: sh copy.sh"
	exit 1
}


# copy sql
echo "begin copy sql "
cp ../sql/ry_20210908.sql ./mysql/db
cp ../sql/ry_config_20220114.sql ./mysql/db

# copy html
echo "begin copy html "
cp -r ../wdh-ui/dist/** ./nginx/html/dist


# copy jar
echo "begin copy wdh-gateway "
cp ../wdh-gateway/target/wdh-gateway.jar ./ruoyi/gateway/jar

echo "begin copy wdh-auth "
cp ../wdh-auth/target/wdh-auth.jar ./ruoyi/auth/jar

echo "begin copy wdh-visual "
cp ../wdh-visual/wdh-monitor/target/wdh-visual-monitor.jar  ./ruoyi/visual/monitor/jar

echo "begin copy wdh-modules-system "
cp ../wdh-modules/wdh-system/target/wdh-modules-system.jar ./ruoyi/modules/system/jar

echo "begin copy wdh-modules-file "
cp ../wdh-modules/wdh-file/target/wdh-modules-file.jar ./ruoyi/modules/file/jar

echo "begin copy wdh-modules-job "
cp ../wdh-modules/wdh-job/target/wdh-modules-job.jar ./ruoyi/modules/job/jar

echo "begin copy wdh-modules-gen "
cp ../wdh-modules/wdh-gen/target/wdh-modules-gen.jar ./ruoyi/modules/gen/jar

