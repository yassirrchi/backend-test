package com.peacock.backend.mapper;

import com.peacock.backend.dto.UserDTO;
import com.peacock.backend.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface UserMapper {
    UserDTO toUserDTO(User user);
}
