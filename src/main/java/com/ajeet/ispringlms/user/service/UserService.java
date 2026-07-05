package com.ajeet.ispringlms.user.service;

import com.ajeet.ispringlms.user.dto.response.UserResponse;

public interface UserService {

    UserResponse register(UserResponse.UserRegistrationRequest request);

}