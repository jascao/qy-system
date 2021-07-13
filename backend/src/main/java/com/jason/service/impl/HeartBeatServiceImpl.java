package com.jason.service.impl;

import com.jason.dao.UserRepository;
import com.jason.entity.User;
import com.jason.service.HeartBeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * @ClassName HeartBeatServiceImpl
 * @Description heartbeat
 * @Author Jason Cao
 * @Date 2021/7/13 10:25 AM
 **/
@Service
public class HeartBeatServiceImpl implements HeartBeatService {
    @Autowired
    private UserRepository userRepo;

    @Override
    public ResponseEntity<String> heartBeat() {
        User u = userRepo.getOne(1l);
        System.out.println(u);
        return new ResponseEntity<>("OK2", HttpStatus.OK);
    }
}
