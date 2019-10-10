package com.hl.controller.session;

import com.hl.controller.ResultDto;
import com.hl.service.session.SessionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/session")
public class SessionController {

    @Resource(name = "testSessionServiceImpl")
    private SessionService sessionService;

    @RequestMapping("/login")
    public ResultDto<LoginResponseDto> login(String uname, String upassword){
        LoginResponseDto loginResponseDto = sessionService.login(uname, upassword);
        return new ResultDto<>(ResultDto.SUCCESS, "success", loginResponseDto);
    }

}
