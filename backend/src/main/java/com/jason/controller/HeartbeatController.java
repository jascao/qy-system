package com.jason.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity heartBeat() {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
