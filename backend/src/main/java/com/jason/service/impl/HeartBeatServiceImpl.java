package com.jason.service.impl;

import com.jason.service.HeartBeatService;
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
    @Override
    public ResponseEntity heartBeat() {
        return new ResponseEntity<>("OK2", HttpStatus.OK);
    }
}
