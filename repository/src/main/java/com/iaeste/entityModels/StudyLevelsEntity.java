package com.iaeste.entityModels;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by emirk on 03/10/2015.
 */
@Entity
@Table(name = "study_levels", schema = "", catalog = "iaeste_test")
public class StudyLevelsEntity implements Serializable {
    private static final long serialVersionUID = -5082856061807071462L;
    private int pkSlId;
    private String name;
    private Collection<EducationsEntity> educationsesByPkSlId;

    @Id
    @Column(name = "pk_sl_id", nullable = false, insertable = true, updatable = true)
    public int getPkSlId() {
        return pkSlId;
    }

    public void setPkSlId(int pkSlId) {
        this.pkSlId = pkSlId;
    }

    @Basic
    @Column(name = "name", nullable = false, insertable = true, updatable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudyLevelsEntity that = (StudyLevelsEntity) o;

        if (pkSlId != that.pkSlId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkSlId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "studyLevelsByFkStudyLevel")
    public Collection<EducationsEntity> getEducationsesByPkSlId() {
        return educationsesByPkSlId;
    }

    public void setEducationsesByPkSlId(Collection<EducationsEntity> educationsesByPkSlId) {
        this.educationsesByPkSlId = educationsesByPkSlId;
    }
}
