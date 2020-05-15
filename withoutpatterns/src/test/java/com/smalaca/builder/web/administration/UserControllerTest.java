package com.smalaca.builder.web.administration;

import com.smalaca.builder.domain.*;
import com.smalaca.builder.http.Request;
import com.smalaca.builder.web.administration.dto.UserDto;
import com.smalaca.builder.web.administration.dto.UserDtoFactory;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;

class UserControllerTest {
    private static final Request REQUEST = mock(Request.class);
    private static final String LOGIN = UUID.randomUUID().toString();
    private static final String PASSWORD = UUID.randomUUID().toString();
    private static final String FIRST_NAME = UUID.randomUUID().toString();
    private static final String LAST_NAME = UUID.randomUUID().toString();
    private static final Name NAME = new Name(FIRST_NAME, LAST_NAME);
    private static final String STREET = UUID.randomUUID().toString();
    private static final String POSTAL_CODE = UUID.randomUUID().toString();
    private static final String CITY = UUID.randomUUID().toString();
    private static final String COUNTRY = UUID.randomUUID().toString();
    private static final Address ADDRESS = new Address(STREET, POSTAL_CODE, CITY, COUNTRY);
    private static final String PHONE_NUMBER = UUID.randomUUID().toString();
    private static final Phone PHONE = new Phone(PHONE_NUMBER);
    private static final String EMAIL_ADDRESS = UUID.randomUUID().toString();
    private static final Mail MAIL = new Mail(EMAIL_ADDRESS);

    private final UserDtoFactory userDtoFactory = Mockito.mock(UserDtoFactory.class);
    private final UserRepository userRepository = Mockito.mock(UserRepository.class);
    private final UserController controller = new UserController(userDtoFactory, userRepository);

    @Test
    void shouldCreateUser() {
        User expected = new User(LOGIN, PASSWORD, NAME, ADDRESS);
        UserDto userDto = getUserDto();
        BDDMockito.given(userDtoFactory.from(REQUEST)).willReturn(userDto);

        controller.create(REQUEST);

        then(userRepository).should().save(expected);
    }

    @Test
    void shouldCreateUserWithPhone() {
        User expected = new User(LOGIN, PASSWORD, NAME, ADDRESS);
        expected.add(PHONE);
        UserDto userDto = getUserDto();
        given(userDto.hasPhone()).willReturn(true);
        given(userDto.phone()).willReturn(PHONE_NUMBER);
        BDDMockito.given(userDtoFactory.from(REQUEST)).willReturn(userDto);

        controller.create(REQUEST);

        then(userRepository).should().save(expected);
    }

    @Test
    void shouldCreateUserWithMail() {
        User expected = new User(LOGIN, PASSWORD, NAME, ADDRESS);
        expected.add(MAIL);
        UserDto userDto = getUserDto();
        given(userDto.hasMail()).willReturn(true);
        given(userDto.mail()).willReturn(EMAIL_ADDRESS);
        BDDMockito.given(userDtoFactory.from(REQUEST)).willReturn(userDto);

        controller.create(REQUEST);

        then(userRepository).should().save(expected);
    }

    @Test
    void shouldCreateUserWithMailAndPhone() {
        User expected = new User(LOGIN, PASSWORD, NAME, ADDRESS);
        expected.add(MAIL);
        expected.add(PHONE);

        UserDto userDto = getUserDto();
        given(userDto.hasPhone()).willReturn(true);
        given(userDto.phone()).willReturn(PHONE_NUMBER);
        given(userDto.hasMail()).willReturn(true);
        given(userDto.mail()).willReturn(EMAIL_ADDRESS);

        BDDMockito.given(userDtoFactory.from(REQUEST)).willReturn(userDto);

        controller.create(REQUEST);

        then(userRepository).should().save(expected);
    }

    private UserDto getUserDto() {
        UserDto userDto = mock(UserDto.class);
        given(userDto.login()).willReturn(LOGIN);
        given(userDto.password()).willReturn(PASSWORD);
        given(userDto.firstName()).willReturn(FIRST_NAME);
        given(userDto.lastName()).willReturn(LAST_NAME);
        given(userDto.street()).willReturn(STREET);
        given(userDto.postalCode()).willReturn(POSTAL_CODE);
        given(userDto.city()).willReturn(CITY);
        given(userDto.country()).willReturn(COUNTRY);
        return userDto;
    }
}