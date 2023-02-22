springMVC

先安装 tomcat
    Tomcat 官网下载：https://tomcat.apache.org/download-80.cgi

如果idea里没有集成tomcat：
    idea里安装 & 配置 tomcat插件
        参考：MyDoc/idea_tomcat.jpg
        参考：springMVC_summary.txt   安装一节

    项目访问地址：
        edit configuration配置好，运行tomcat后，console面板最终会出现 http://localhost:8077/springmvc-deom

如果idea里集成tomcat：
    参考：springMVC_summary.txt   安装一节


问题描述：
    无法在地址[localhost]和端口[8005]上创建服务器关闭套接字（基本端口[8005]和偏移量[0]）
原因：
    8005端口被占用

问题描述：
    IDEA 启动项目时报错：Error running tomcat: Can‘t find catalina.jar解决办法
解决办法：
    Configuration -> tomcat server -> 配置tomcat软件的根目录，比如：/Users/user/Downloads/my_applications/apache-tomcat-8.5.85/
参考文档：
    https://blog.csdn.net/qq_39331255/article/details/107053127

