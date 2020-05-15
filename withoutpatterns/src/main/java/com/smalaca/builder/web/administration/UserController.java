package com.smalaca.builder.web.administration;

import com.smalaca.builder.domain.*;
import com.smalaca.builder.http.Request;
import com.smalaca.builder.http.Response;
import com.smalaca.builder.web.administration.dto.UserDto;
import com.smalaca.builder.web.administration.dto.UserDtoFactory;

public class UserController {
    private final UserDtoFactory userDtoFactory;
    private final UserRepository userRepository;

    public UserController(UserDtoFactory userDtoFactory, UserRepository userRepository) {
        this.userDtoFactory = userDtoFactory;
        this.userRepository = userRepository;
    }

    public Response create(Request request) {
        UserDto userDto = userDtoFactory.from(request);

        UserBuilder builder = new UserBuilder()
                .withName(userDto.firstName(), userDto.lastName())
                .withAddress(userDto.street(), userDto.postalCode(), userDto.city(), userDto.country())
                .withLogin(userDto.login())
                .withPassword(userDto.password())
                .withPhone(userDto.phone())
                .withMail(userDto.mail());

        userRepository.save(builder.build());

        return Response.success();
    }
}
