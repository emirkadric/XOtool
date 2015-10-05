package com.iaeste.entityModels;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by emirk on 03/10/2015.
 */
@Entity
@Table(name = "job_contacts", schema = "", catalog = "iaeste_test")
public class JobContactsEntity implements Serializable {
    private static final long serialVersionUID = 108375705924729489L;
    private int pkJcId;
    private String firstname;
    private String lastname;
    private String email;
    private int phone;
    private String position;
    private Collection<JobsEntity> jobsesByPkJcId;

    @Id
    @Column(name = "pk_jc_id", nullable = false, insertable = true, updatable = true)
    public int getPkJcId() {
        return pkJcId;
    }

    public void setPkJcId(int pkJcId) {
        this.pkJcId = pkJcId;
    }

    @Basic
    @Column(name = "firstname", nullable = false, insertable = true, updatable = true, length = 50)
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "lastname", nullable = false, insertable = true, updatable = true, length = 50)
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "email", nullable = false, insertable = true, updatable = true, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone", nullable = false, insertable = true, updatable = true)
    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "position", nullable = false, insertable = true, updatable = true, length = 50)
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JobContactsEntity that = (JobContactsEntity) o;

        if (pkJcId != that.pkJcId) return false;
        if (phone != that.phone) return false;
        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
        if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkJcId;
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + phone;
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "jobContactsByFkJobcontactId")
    public Collection<JobsEntity> getJobsesByPkJcId() {
        return jobsesByPkJcId;
    }

    public void setJobsesByPkJcId(Collection<JobsEntity> jobsesByPkJcId) {
        this.jobsesByPkJcId = jobsesByPkJcId;
    }
}
