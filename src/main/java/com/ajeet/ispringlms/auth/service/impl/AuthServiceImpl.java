package com.ajeet.ispringlms.auth.service.impl;

import com.ajeet.ispringlms.auth.dto.LoginRequest;
import com.ajeet.ispringlms.auth.dto.LoginResponse;
import com.ajeet.ispringlms.auth.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final AuthenticationManager authenticationManager;

    @Override
    public LoginResponse login(LoginRequest request) {

        authenticationManager.authenticate(

                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )

        );

        return LoginResponse.builder()
                .accessToken("JWT will come here")
                .tokenType("Bearer")
                .name("Dummy")
                .email(request.getEmail())
                .role("STUDENT")
                .build();

    }

}