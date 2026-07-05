package com.ajeet.ispringlms.user.controller;

import com.ajeet.ispringlms.common.response.ApiResponse;
import com.ajeet.ispringlms.user.dto.response.UserResponse;
import com.ajeet.ispringlms.user.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public ApiResponse<UserResponse> register(
            @Valid @RequestBody UserResponse.UserRegistrationRequest request){

        UserResponse response =
                userService.register(request);

        return ApiResponse.<UserResponse>builder()
                .success(true)
                .message("User registered successfully")
                .data(response)
                .build();

    }
    }



// Testing Git Commit