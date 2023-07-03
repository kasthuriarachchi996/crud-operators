package com.crudoperators.crud.couese.controller;

import com.crudoperators.crud.couese.dto.UserDto;
import com.crudoperators.crud.couese.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/vi/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/saveuser")
    private UserDto SaveUser(@RequestBody UserDto userDto)
    {
        return userService.saveuser(userDto);
    }
}
