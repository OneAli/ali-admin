package com.hl.service.session;

import com.hl.controller.session.LoginResponseDto;

public interface SessionService {

    LoginResponseDto login(String uname, String upassword);

}
