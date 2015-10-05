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
    private int fkStudentId;
    private int fkLanguageId;
    private LanguagesEntity languagesByFkLanguageId;

    @Id
    @Column(name = "pk_stulangs_id", nullable = false, insertable = true, updatable = true)
    public int getPkStulangsId() {
        return pkStulangsId;
    }

    public void setPkStulangsId(int pkStulangsId) {
        this.pkStulangsId = pkStulangsId;
    }

    @Basic
    @Column(name = "fk_student_id", nullable = false, insertable = true, updatable = true)
    public int getFkStudentId() {
        return fkStudentId;
    }

    public void setFkStudentId(int fkStudentId) {
        this.fkStudentId = fkStudentId;
    }

    @Basic
    @Column(name = "fk_language_id", nullable = false, insertable = true, updatable = true)
    public int getFkLanguageId() {
        return fkLanguageId;
    }

    public void setFkLanguageId(int fkLanguageId) {
        this.fkLanguageId = fkLanguageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentsLanguagesEntity that = (StudentsLanguagesEntity) o;

        if (pkStulangsId != that.pkStulangsId) return false;
        if (fkStudentId != that.fkStudentId) return false;
        if (fkLanguageId != that.fkLanguageId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkStulangsId;
        result = 31 * result + fkStudentId;
        result = 31 * result + fkLanguageId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "fk_language_id", referencedColumnName = "pk_language_id", nullable = false)
    public LanguagesEntity getLanguagesByFkLanguageId() {
        return languagesByFkLanguageId;
    }

    public void setLanguagesByFkLanguageId(LanguagesEntity languagesByFkLanguageId) {
        this.languagesByFkLanguageId = languagesByFkLanguageId;
    }
}
