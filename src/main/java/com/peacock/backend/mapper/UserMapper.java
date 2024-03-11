package com.peacock.backend.mapper;

import com.peacock.backend.dto.UserDTO;
import com.peacock.backend.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")

public interface UserMapper {
    @Mapping(source = "role", target = "role")
    UserDTO toUserDTO(User user);

    List<UserDTO> toUserDTOList(List<User> userList);
}
