package com.iaeste.dataaccess;

import com.iaeste.entityModels.StudentsEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by emirk on 19/10/2015.
 */
//TODO instead of JpaRepository maybe use org.springframework.data.repository.CrudRepository
@Transactional
public interface StudentsRepository extends CrudRepository<StudentsEntity, Integer> {

    @Modifying
    @Query("UPDATE StudentsEntity se SET se.token= :token WHERE se.username= :username")
    void addToken(@Param("token") String token,
                  @Param("username") String username);


    @Query("UPDATE StudentsEntity se SET se.token=NULL WHERE se.token= :token")
    void deleteToken(@Param("token") String token);

    StudentsEntity findByToken(String token);

    StudentsEntity findByUsername(String username);


}
