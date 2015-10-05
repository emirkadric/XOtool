package com.iaeste.entityModels;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by emirk on 03/10/2015.
 */
@Entity
@Table(name = "resp_local_committee", schema = "", catalog = "iaeste_test")
public class RespLocalCommitteeEntity implements Serializable {
    private static final long serialVersionUID = -8151507085545600337L;
    private int pkRlcId;
    private String lc;
    private Collection<AdminsEntity> adminsesByPkRlcId;
    private Collection<EmployersEntity> employersesByPkRlcId;

    @Id
    @Column(name = "pk_rlc_id", nullable = false, insertable = true, updatable = true)
    public int getPkRlcId() {
        return pkRlcId;
    }

    public void setPkRlcId(int pkRlcId) {
        this.pkRlcId = pkRlcId;
    }

    @Basic
    @Column(name = "lc", nullable = false, insertable = true, updatable = true, length = 50)
    public String getLc() {
        return lc;
    }

    public void setLc(String lc) {
        this.lc = lc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RespLocalCommitteeEntity that = (RespLocalCommitteeEntity) o;

        if (pkRlcId != that.pkRlcId) return false;
        if (lc != null ? !lc.equals(that.lc) : that.lc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkRlcId;
        result = 31 * result + (lc != null ? lc.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "respLocalCommitteeByFkRlcId")
    public Collection<AdminsEntity> getAdminsesByPkRlcId() {
        return adminsesByPkRlcId;
    }

    public void setAdminsesByPkRlcId(Collection<AdminsEntity> adminsesByPkRlcId) {
        this.adminsesByPkRlcId = adminsesByPkRlcId;
    }

    @OneToMany(mappedBy = "respLocalCommitteeByFkRlc")
    public Collection<EmployersEntity> getEmployersesByPkRlcId() {
        return employersesByPkRlcId;
    }

    public void setEmployersesByPkRlcId(Collection<EmployersEntity> employersesByPkRlcId) {
        this.employersesByPkRlcId = employersesByPkRlcId;
    }
}
