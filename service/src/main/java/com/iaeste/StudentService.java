package com.iaeste;

import com.iaeste.entityModels.StudentsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.MissingServletRequestParameterException;

/**
 * Created by emirk on 28/10/2015.
 */
@Service
public class StudentService {


    @Autowired
    private StudentsRepository studentsRepository;

    public StudentsEntity addNewStudent(StudentsEntity studentsEntity) throws MissingServletRequestParameterException
    {
        StudentsEntity se = studentsRepository.save(studentsEntity);
        return se;
    }
}
