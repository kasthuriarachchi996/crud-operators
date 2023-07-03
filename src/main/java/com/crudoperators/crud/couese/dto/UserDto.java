package com.crudoperators.crud.couese.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {
    private Integer id;
    private String name;
    private String email;
    private String city;
    private Integer age;
}
