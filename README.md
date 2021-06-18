# 优软商城项目SDK

## sdk接入说明

- 私服地址

```
<repository>
  <snapshots>
    <enabled>false</enabled>
  </snapshots>
  <id>release</id>
  <name>libs-release</name>
  <url>https://artifactory.uuzcc.cn/artifactory/libs-release</url>
</repository>
<repository>
  <snapshots />
  <id>snapshots</id>
  <name>libs-snapshot</name>
  <url>https://artifactory.uuzcc.cn/artifactory/libs-snapshot</url>
</repository>
```

- 版本引用

```
<dependency>
    <groupId>com.usoft.sdk</groupId>
    <artifactId>usoft-sdk-mall</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

- 版本号地址

[snapshot 版本](https://artifactory.uuzcc.cn/artifactory/libs-snapshot/com/usoft/sdk/usoft-sdk-mall) 

[release 版本](https://artifactory.uuzcc.cn/artifactory/libs-release/com/usoft/sdk/usoft-sdk-mall)

## API文档地址

[API文档地址](https://document.usoftchina.com/mall)

## 使用示例地址

[使用示例地址](src/test/java/com/usoft/sdk/mall)

## sdk开发规范

- 1、GitHub地址：[https://github.com/usoft-china/usoft-sdk-mall](https://github.com/usoft-china/usoft-sdk-mall)

-  2、当SDK开发完成后，合并代码入Master分支，并同步推送到GitHub地址

