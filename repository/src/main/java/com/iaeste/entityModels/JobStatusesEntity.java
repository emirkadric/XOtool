package com.iaeste.entityModels;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by emirk on 03/10/2015.
 */
@Entity
@Table(name = "job_statuses", schema = "", catalog = "iaeste_test")
public class JobStatusesEntity implements Serializable {
    private static final long serialVersionUID = -386419848903366468L;
    private int pkJstatusesId;
    private String status;
    private Collection<JobsEntity> jobsesByPkJstatusesId;

    @Id
    @Column(name = "pk_jstatuses_id", nullable = false, insertable = true, updatable = true)
    public int getPkJstatusesId() {
        return pkJstatusesId;
    }

    public void setPkJstatusesId(int pkJstatusesId) {
        this.pkJstatusesId = pkJstatusesId;
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

        JobStatusesEntity that = (JobStatusesEntity) o;

        if (pkJstatusesId != that.pkJstatusesId) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkJstatusesId;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "jobStatusesByFkJobstatusId")
    public Collection<JobsEntity> getJobsesByPkJstatusesId() {
        return jobsesByPkJstatusesId;
    }

    public void setJobsesByPkJstatusesId(Collection<JobsEntity> jobsesByPkJstatusesId) {
        this.jobsesByPkJstatusesId = jobsesByPkJstatusesId;
    }
}
