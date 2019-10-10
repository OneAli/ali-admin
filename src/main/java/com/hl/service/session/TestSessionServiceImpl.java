package com.hl.service.session;

import com.hl.controller.session.LoginResponseDto;
import com.hl.controller.ResultDto;
import com.hl.controller.exception.BusinessRuntimeException;
import org.springframework.stereotype.Service;

@Service
public class TestSessionServiceImpl implements SessionService{
    @Override
    public LoginResponseDto login(String uname, String upassword) {
        if("error".equals(uname) || "error".equals(upassword)){
            throw new BusinessRuntimeException(ResultDto.INVALID_LOGIN_TOKEN, "invalid login token", uname);
        }
        LoginResponseDto responseDto = new LoginResponseDto(1L, uname, "api-key", 3600 * 1000,
                "flush-key", 24 * 3600 * 1000);
        return responseDto;
    }
}
