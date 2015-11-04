package com.iaeste.tokenization;

import com.iaeste.dataaccess.StudentsRepository;
import com.iaeste.entityModels.AdminsEntity;
import com.iaeste.entityModels.StudentsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.codec.Base64;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;

/**
 * Created by emirk on 31/10/2015.
 */
@Service
public class TokenService implements TokenManager{

    @Autowired
    StudentsRepository studentsRepository;

    @Override
    public String createNewToken() {

        byte[] tokenBytes = new byte[64];
        new SecureRandom().nextBytes(tokenBytes);
        return new String(Base64.encode(tokenBytes), StandardCharsets.UTF_8);
    }

    @Override
    public void addToken(String username, String token) {
        studentsRepository.addToken(token,username);
    }

    @Override
    public void removeToken(String token) {
        studentsRepository.deleteToken(token);
    }

    @Override
    public StudentsEntity getStudentDetails(String token) {
        return null;
    }

    @Override
    public AdminsEntity getAdminDetails(String token) {
        return null;
    }

    @Override
    public StudentsEntity getCurrentStudent() {
        return null;
    }

    @Override
    public AdminsEntity getCurrentAdmin() {
        return null;
    }


}
