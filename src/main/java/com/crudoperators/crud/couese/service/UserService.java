package com.crudoperators.crud.couese.service;

import com.crudoperators.crud.couese.dto.UserDto;
import com.crudoperators.crud.couese.entity.UserEntity;
import com.crudoperators.crud.couese.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public UserDto saveuser(UserDto userDto)
    {
        userRepository.save(modelMapper.map(userDto , UserEntity.class));
        return userDto;
    }

}
