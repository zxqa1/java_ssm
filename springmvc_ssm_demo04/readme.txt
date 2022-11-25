1 SSM整合流程
    1. 创建工程
    2. SSM整合
        1. Spring
            + SpringConfig
        2. MyBatis
            + MybatisConfig
            + JdbcConfig
            + Jdbc.properties
        3. SpringMVC
            + ServletConfig
            + SpringMvcConfig
    3. 功能模块
        1. 表与实体类
        2. dao(接口+自动代理)
        3. service(接口+实现类)
            + 业务层接口测试(整合 JUnit)
        4. controller
            + 表现层接口测试(Postman)

2 表现层数据封装
    + Result 返回数据格式封装
    + code 操作代码
    + 此时， 记得更换 controller 层的返回数据

public class Result{
    private String msg;
    private Integer code;
    private Object data;
}

3 异常处理
    1. 异常处理思想
        + 分类处理
        + 在表现层处理
        + 使用 AOP 思想处理
          + Spring 提供了实现类. 需要 SpringMVC 扫描该类

          **
           * 异常处理器
           * + 处理controller层出现的异常，
           *   controller层出现异常之后，直接被该类的doException方法捕捉，之后走该方法中的逻辑，不再走controller后续代码
           */
          @RestControllerAdvice // 使用 Rest 风格
          //@ControllerAdvice
          public class ProjectExceptionAdvice {

              @ExceptionHandler({Exception.class})
              public Result doException(Exception e){
                  return new Result(666,null,"报异常了哦");
              }
          }
    2. 项目异常处理方案
        + 创建异常处理器 @RestControllerAdvice @ExceptionHandler
        + 自定义异常  SystemException BusinessException
        + 异常编码 Code
        + 自定义消息  msg
4 SSM整合开发案例

5 SpringMVC拦截器
    1. 创建拦截器类 ProjectInterceptor implements HandlerInterceptor
    2. 在 SpringMvcSupport 中配置该拦截器处理的请求