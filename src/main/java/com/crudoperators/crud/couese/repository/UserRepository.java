package com.crudoperators.crud.couese.repository;

import com.crudoperators.crud.couese.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}
