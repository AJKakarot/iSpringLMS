package com.ajeet.ispringlms.auth.service;

import com.ajeet.ispringlms.auth.dto.LoginRequest;
import com.ajeet.ispringlms.auth.dto.LoginResponse;

/**
 * Service interface for authentication operations.
 */
public interface AuthService {

    LoginResponse login(LoginRequest request);

}