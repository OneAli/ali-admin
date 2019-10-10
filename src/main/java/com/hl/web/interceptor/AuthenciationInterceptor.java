package com.hl.web.interceptor;

import com.alibaba.fastjson.JSON;
import com.hl.controller.ResultDto;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截未认证非法请求
 */
public class AuthenciationInterceptor implements HandlerInterceptor{

    private String apiKeyHeaderName = "api-key";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String apiKey = request.getHeader(apiKeyHeaderName);
        boolean authenciated = checkApiKey(apiKey);
        if(!authenciated){
            ResultDto<String> resultDto = new ResultDto<>(ResultDto.API_KEY_ERROR, "invalid api key", apiKeyHeaderName);
            response.getWriter().write(JSON.toJSONString(resultDto));
            return false;
        }else{
            return true;
        }
    }

    private boolean checkApiKey(String apiKey) {
        if(StringUtils.isBlank(apiKey)){
            return false;
        }
        if(!"admin".equals(apiKey)){
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
