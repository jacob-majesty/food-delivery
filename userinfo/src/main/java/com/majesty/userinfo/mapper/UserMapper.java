package com.majesty.userinfo.mapper;

import com.majesty.userinfo.dto.UserDto;
import com.majesty.userinfo.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User mapUserDtoToUser(UserDto userDtO);
    UserDto mapUserToUserDto(User user);
}
