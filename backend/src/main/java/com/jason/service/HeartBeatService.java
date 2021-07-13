package com.jason.service;

import org.springframework.http.ResponseEntity;

/**
 * @ClassName HeartBeatService
 * @Description heartbeat
 * @Author Jason Cao
 * @Date 2021/7/13 10:24 AM
 **/
public interface HeartBeatService {
    ResponseEntity<String> heartBeat();
}
