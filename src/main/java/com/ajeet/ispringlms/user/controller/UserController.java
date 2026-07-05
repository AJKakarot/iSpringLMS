package com.ajeet.ispringlms.user.controller;

import com.ajeet.ispringlms.user.dto.UserRegistrationRequest;
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
    public void register(@Valid @RequestBody UserRegistrationRequest request){

        userService.register(request);

    }

}