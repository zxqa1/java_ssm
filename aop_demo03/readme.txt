AOP
1. 导入坐标
    aop坐标包含在 Spring-context 中
            <!--aop 的 aspect 坐标 -->
            <!--aop 坐标包含于 spring-context-->
            <dependency>
                <groupId>org.aspectj</groupId>
                <artifactId>aspectjweaver</artifactId>
                <version>1.9.4</version>
            </dependency>
2. 制作连接点方法(原始操作,Dao 接口与实现类)
3. 制作共性功能(通知类与通知) MyAdvice
4. 定义切入点 @PointCut("execute(返回值类型 全类名.方法名())")
5. 绑定切入点与通知关系(切面)
    1. MyAdvice
        1. 类:@Aspect @Component(注入Bean)
        2.方法:@Before @After
    3. SpringConfig
        1. 类 @EnableAspectJAutoProxy
