package com.ajeet.ispringlms.user.controller;

import com.ajeet.ispringlms.common.response.ApiResponse;
import com.ajeet.ispringlms.user.dto.request.UserRegistrationRequest;
import com.ajeet.ispringlms.user.dto.response.UserResponse;
import com.ajeet.ispringlms.user.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * REST controller for user-related APIs.
 */
@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    /**
     * Register a new user.
     */
    @PostMapping("/register")
    public ApiResponse<UserResponse> register(
            @Valid @RequestBody UserRegistrationRequest request) {

        UserResponse response = userService.register(request);

        return ApiResponse.<UserResponse>builder()
                .success(true)
                .message("User registered successfully")
                .data(response)
                .build();
    }
}