package com.iaeste.entityModels;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by emirk on 03/10/2015.
 */
@Entity
@Table(name = "students_languages", schema = "", catalog = "iaeste_test")
public class StudentsLanguagesEntity implements Serializable {
    private static final long serialVersionUID = -818322242395424032L;
    private int pkStulangsId;
    private int fk_student_id;
    private int fk_language_id;

    @Id
    @Column(name = "pk_stulangs_id", nullable = false, insertable = true, updatable = true)
    public int getPkStulangsId() {
        return pkStulangsId;
    }

    public void setPkStulangsId(int pkStulangsId) {
        this.pkStulangsId = pkStulangsId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentsLanguagesEntity that = (StudentsLanguagesEntity) o;

        if (pkStulangsId != that.pkStulangsId) return false;


        return true;
    }

    @Override
    public int hashCode() {
        int result = pkStulangsId;
           return result;
    }


}
