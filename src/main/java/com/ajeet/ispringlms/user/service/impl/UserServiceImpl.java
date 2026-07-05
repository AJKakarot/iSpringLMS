package com.ajeet.ispringlms.user.service.impl;

import com.ajeet.ispringlms.user.dto.UserRegistrationRequest;
import com.ajeet.ispringlms.user.entity.User;
import com.ajeet.ispringlms.user.enums.Role;
import com.ajeet.ispringlms.user.repository.UserRepository;
import com.ajeet.ispringlms.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void register(UserRegistrationRequest request) {

        if(userRepository.existsByEmail(request.getEmail())){

            throw new RuntimeException("Email already exists");

        }

        User user = User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(request.getPassword())
                .role(Role.STUDENT)
                .build();

        userRepository.save(user);

    }

}