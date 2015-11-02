package com.iaeste.dataaccess;

import com.iaeste.entityModels.StudentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by emirk on 19/10/2015.
 */

public interface StudentsRepository extends JpaRepository<StudentsEntity,Integer > {

    @Modifying
    @Query("UPDATE StudentsEntity se SET se.token= :token WHERE se.username= :username")
    void addToken(@Param("token") String token,
                  @Param("username") String username);


    @Query("UPDATE StudentsEntity se SET se.token=NULL WHERE se.token= :token")
    void deleteToken(@Param("token") String token);

    StudentsEntity findByToken(String token);

    StudentsEntity findByUsername(String username);


}
