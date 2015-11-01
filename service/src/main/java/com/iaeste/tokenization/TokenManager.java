package com.iaeste.tokenization;

import com.iaeste.entityModels.AdminsEntity;
import com.iaeste.entityModels.StudentsEntity;

/**
 * Created by emirk on 31/10/2015.
 */
public interface TokenManager {

    String createNewToken();

    void addToken(String username, String token);

    void removeToken(String token);

    StudentsEntity getStudentDetails(String token);

    AdminsEntity getAdminDetails(String token);

    StudentsEntity getCurrentStudent();

    AdminsEntity getCurrentAdmin();


}
