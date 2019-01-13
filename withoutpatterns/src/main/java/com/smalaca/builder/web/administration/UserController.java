package com.smalaca.builder.web.administration;

import com.smalaca.builder.domain.Address;
import com.smalaca.builder.domain.Mail;
import com.smalaca.builder.domain.Name;
import com.smalaca.builder.domain.Phone;
import com.smalaca.builder.domain.User;
import com.smalaca.builder.domain.UserRepository;
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

        Name name = new Name(userDto.firstName(), userDto.lastName());
        Address address = new Address(userDto.street(), userDto.postalCode(), userDto.city(), userDto.country());
        User user = new User(userDto.login(), userDto.password(), name, address);

        if (userDto.hasPhone()) {
            user.add(new Phone(userDto.phone()));
        }

        if (userDto.hasMail()) {
            user.add(new Mail(userDto.mail()));
        }

        userRepository.save(user);

        return Response.success();
    }
}
