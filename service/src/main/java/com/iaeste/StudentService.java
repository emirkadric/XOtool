package com.iaeste;

import com.iaeste.dataaccess.StudentsRepository;
import com.iaeste.entityModels.StudentsEntity;
import com.iaeste.tokenization.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.MissingServletRequestParameterException;

/**
 * Created by emirk on 28/10/2015.
 */
@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentsRepository studentsRepository;

    @Autowired
    private TokenService tokenService;

    public StudentsEntity addNewStudent(StudentsEntity studentsEntity) throws MissingServletRequestParameterException {

        studentsEntity.setToken(tokenService.createNewToken());
        StudentsEntity se = studentsRepository.save(studentsEntity);

        return se;
    }


}
