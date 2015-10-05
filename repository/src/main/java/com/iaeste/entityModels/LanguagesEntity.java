package com.iaeste.entityModels;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by emirk on 03/10/2015.
 */
@Entity
@Table(name = "languages", schema = "", catalog = "iaeste_test")
public class LanguagesEntity implements Serializable {
    private static final long serialVersionUID = -3216156540940729689L;
    private int pkLanguageId;
    private String name;
    private String langshort;
    private Collection<StudentsLanguagesEntity> studentsLanguagesByPkLanguageId;

    @Id
    @Column(name = "pk_language_id", nullable = false, insertable = true, updatable = true)
    public int getPkLanguageId() {
        return pkLanguageId;
    }

    public void setPkLanguageId(int pkLanguageId) {
        this.pkLanguageId = pkLanguageId;
    }

    @Basic
    @Column(name = "name", nullable = false, insertable = true, updatable = true, length = 16777215)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "langshort", nullable = false, insertable = true, updatable = true, length = 16777215)
    public String getLangshort() {
        return langshort;
    }

    public void setLangshort(String langshort) {
        this.langshort = langshort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LanguagesEntity that = (LanguagesEntity) o;

        if (pkLanguageId != that.pkLanguageId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (langshort != null ? !langshort.equals(that.langshort) : that.langshort != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkLanguageId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (langshort != null ? langshort.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "languagesByFkLanguageId")
    public Collection<StudentsLanguagesEntity> getStudentsLanguagesByPkLanguageId() {
        return studentsLanguagesByPkLanguageId;
    }

    public void setStudentsLanguagesByPkLanguageId(Collection<StudentsLanguagesEntity> studentsLanguagesByPkLanguageId) {
        this.studentsLanguagesByPkLanguageId = studentsLanguagesByPkLanguageId;
    }
}
