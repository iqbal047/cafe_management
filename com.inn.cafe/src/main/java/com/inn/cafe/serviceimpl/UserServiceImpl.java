package com.inn.cafe.serviceimpl;

import com.inn.cafe.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public ResponseEntity<String> singUp(Map<String, String> requestMap) {
        return null;
    }
}
