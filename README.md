# quartz-demo

## 简介

## 使用
### 1. 下载代码
```git clone https://github.com/qq1136389101/quartz-demo.git```

运行 `mvn install` 安装依赖包


### 2. 修改 application.yml 配置文件
修改mysql 配置

### 3. 导入数据库
导入项目根目录sql文件夹下的两个 sql 文件
- job_entity.sql  
    存放自定义 job 的基本信息
- quartz.mysql.sql  
    quartz 自带的sql文件
    
### 4. 更新定时
修改 job_entity 表的数据后，需要刷新定时器，否则不会生效

- 刷新全部定时任务  
http://localhost:8082/refresh/all
- 刷新指定 id 的定时任务  
http://localhost:8082/refresh/{id}