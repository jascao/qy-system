package com.jason.controller;

import com.jason.service.HeartBeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HeartbeatController
 * @Description heartbeat
 * @Author Jason Cao
 * @Date 2021/6/30 11:24 AM
 **/
@RestController
@RequestMapping(value = "/heartbeat")
public class HeartbeatController {
    @Autowired
    HeartBeatService heartBeatService;

    @GetMapping(value = "")
    public ResponseEntity<String> heartBeat() {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @GetMapping(value = "/liveness")
    public ResponseEntity<String> getHeartBeat() {
        return heartBeatService.heartBeat();
    }
}
