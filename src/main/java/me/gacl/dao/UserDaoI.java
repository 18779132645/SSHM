package me.gacl.dao;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import me.gacl.model.User;

public interface UserDaoI {

    /**
     * �����û�
     * @param user
     * @return
     */
    Serializable save(User user); 
}