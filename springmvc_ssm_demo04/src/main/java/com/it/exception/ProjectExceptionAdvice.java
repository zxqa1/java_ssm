package com.it.exception;

import com.it.vo.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常处理器
 * + 处理controller层出现的异常，
 *   controller层出现异常之后，直接被该类的doException方法捕捉，之后走该方法中的逻辑，不再走controller后续代码
 */
@RestControllerAdvice // 使用 Rest 风格
//@ControllerAdvice
public class ProjectExceptionAdvice {

    // 处理系统异常
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException e){
        // 记录日志
        // 发送消息给运维
        // 发送邮件给开发人员, 发送 e 给开发人员
        return new Result(e.getCode(),null,e.getMessage());
    }

    // 处理业务异常
    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException e){
        return new Result(e.getCode(),null,e.getMessage());
    }

    // 处理其他异常
    @ExceptionHandler({Exception.class})
    public Result doException(Exception e){
        return new Result(666,null,"报异常了哦");
    }
}
