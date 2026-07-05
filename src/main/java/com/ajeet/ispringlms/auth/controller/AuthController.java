package com.ajeet.ispringlms.auth.controller;

import com.ajeet.ispringlms.auth.dto.LoginRequest;
import com.ajeet.ispringlms.auth.dto.LoginResponse;
import com.ajeet.ispringlms.auth.service.AuthService;
import com.ajeet.ispringlms.common.response.ApiResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public ApiResponse<LoginResponse> login(
            @Valid @RequestBody LoginRequest request) {

        LoginResponse response = authService.login(request);

        return ApiResponse.<LoginResponse>builder()
                .success(true)
                .message("Login Successful")
                .data(response)
                .build();

    }
}