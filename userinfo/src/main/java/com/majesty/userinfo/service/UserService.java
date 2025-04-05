package com.majesty.userinfo.service;

import com.majesty.userinfo.dto.UserDto;
import com.majesty.userinfo.entity.User;
import com.majesty.userinfo.mapper.UserMapper;
import com.majesty.userinfo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserDto addUser(UserDto userDto) {
        User savedUser = userRepository.save(UserMapper.INSTANCE.mapUserDtoToUser(userDto));
        return UserMapper.INSTANCE.mapUserToUserDto(savedUser);

    }

    public ResponseEntity<UserDto> fetchUserDetailsById(Integer userId) {
        Optional<User> fetchedUser =  userRepository.findById(userId);
        return fetchedUser.map(user -> new ResponseEntity<>(UserMapper.INSTANCE.mapUserToUserDto(user),
                HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(null, HttpStatus.NOT_FOUND));

    }
}
