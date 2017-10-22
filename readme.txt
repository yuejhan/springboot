

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

五、spring Aop 的理解

1、什么是JoinPoint，连接点就是 允许使用通知 的地方。spring中目前只支持方法级别的连接点。
2、什么是PointCut， 切入点就是在 哪些连接点使用通知。是根据你的需求筛选出需要使用通知的连接点。
3、什么是advice，   通知就是你的特定的需求，也就是你需要在切入点做的事情。
4、什么是aspect，   切面就是切入点和通知的组合就是一个切面。

5、PointCut expression切面表达式
   wildcards（通配符）
       *匹配任意数量的字符
       +匹配指定类及其子类
       ..匹配任意数的子包或参数
   designators(指示器)
       匹配方法：execution()
       匹配注解：
          @target()
          @args()
          @within()
          @annotations()
       匹配包／类型
          within()
       匹配对象
          this()
          bean()
          target()
       匹配参数
          args()

6、动态代理
   jdk动态代理，可以使用一个系统变量来保存动态代理生成的类
   System.setProperties().put("sum.misc.ProxyGenerator.saveGeneratedFiles","true")