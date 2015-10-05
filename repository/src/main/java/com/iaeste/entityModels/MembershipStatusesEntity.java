package com.iaeste.entityModels;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by emirk on 03/10/2015.
 */
@Entity
@Table(name = "membership_statuses", schema = "", catalog = "iaeste_test")
public class MembershipStatusesEntity implements Serializable {
    private static final long serialVersionUID = -2269138536762521778L;
    private int pkMbId;
    private String status;

    @Id
    @Column(name = "pk_mb_id", nullable = false, insertable = true, updatable = true)
    public int getPkMbId() {
        return pkMbId;
    }

    public void setPkMbId(int pkMbId) {
        this.pkMbId = pkMbId;
    }

    @Basic
    @Column(name = "status", nullable = false, insertable = true, updatable = true, length = 50)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MembershipStatusesEntity that = (MembershipStatusesEntity) o;

        if (pkMbId != that.pkMbId) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkMbId;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
