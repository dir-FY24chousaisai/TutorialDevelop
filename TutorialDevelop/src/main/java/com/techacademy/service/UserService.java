package com.techacademy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techacademy.entity.User;
import com.techacademy.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    /** 全件を検索して返す */
    public List<User> getUserList() {
        // リポジトリのfindAllメソッドを呼び出す
        return userRepository.findAll();
    }

    // ----- 追加:ここから -----
    /** Userを1件検索して返す */
    public User getUser(Integer id) {
        return userRepository.findById(id).get();
    }
    // ----- 追加:ここまで -----


    /** Userの登録を行う */
    @Transactional
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}