

一、spring boot 的启动方式
1、直接运行main方法
2、使用shell进入项目目录，使用mvn spring-boot:run启动
3、使用mvn install 一下，然后进入target目录中，使用 java -jar 启动

二、配置管理
在application配置文件中可以配置属性信息
   server.port  server.context-path 等一些信息
   配置文件也可以是yml文件

三、controller的配置
RequestMapping(value={"/hello,"/hi"})配置可以使用多路径进行反问

@GetMapping 是指定请求方法的一个RequestMapping的简单书写方式


四、数据库连接设置
1、在pom文件中引入mysql连接驱动，和jpa包
2、配置application配置文件