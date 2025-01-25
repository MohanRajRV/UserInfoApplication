package com.ace.project.UserInfoPortal.respository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ace.project.UserInfoPortal.model.UserInfo;

@Repository
public interface UserRepository  extends CrudRepository<UserInfo,Integer>{
    
}
