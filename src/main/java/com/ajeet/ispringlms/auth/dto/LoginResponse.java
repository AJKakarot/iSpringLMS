package com.ajeet.ispringlms.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class LoginResponse {

    private String accessToken;

    private String tokenType;

    private String name;

    private String email;

    private String role;

}