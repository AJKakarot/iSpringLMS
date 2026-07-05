package com.ajeet.ispringlms.user.service;

import com.ajeet.ispringlms.user.dto.request.UserRegistrationRequest;
import com.ajeet.ispringlms.user.dto.response.UserResponse;

public interface UserService {



    UserResponse register(UserRegistrationRequest request);
}