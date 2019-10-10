package com.hl.controller.exception;

import com.hl.controller.ResultDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理
 */
@ControllerAdvice
public class GlobalExceptionResolver {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    /**
     * 处理所有不可知异常
     * @param e 异常
     * @return json结果
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultDto<String> handleException(Exception e) {
        // 打印异常堆栈信息
        log.error(e.getMessage(), e);
        return new ResultDto<>(ResultDto.SERVICE_ERROR, "service exception", e.getMessage());
    }

    /**
     * 处理所有业务异常
     * @param e 业务异常
     * @return json结果
     */
    @ExceptionHandler(BusinessRuntimeException.class)
    @ResponseBody
    public ResultDto handleBusinessRuntimeException(BusinessRuntimeException e) {
        //log.error(e.getMessage(), e);
        return new ResultDto(e.getCode(), e.getErrorMsg(), e.getErrorData());
    }
}
