package com.iaeste.entityModels;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by emirk on 03/10/2015.
 */
@Entity
@Table(name = "admins", schema = "", catalog = "iaeste_test")
public class AdminsEntity implements Serializable{
    private static final long serialVersionUID = 9059480116453474424L;
    private int pkAdminId;
    private String firstname;
    private String lastname;
    private String email;
    private long phone;
    private String username;
    private String password;
    private String token;
    private RespLocalCommitteeEntity respLocalCommitteeByFkRlcId;

    @Id
    @Column(name = "pk_admin_id", nullable = false, insertable = true, updatable = true)
    public int getPkAdminId() {
        return pkAdminId;
    }

    public void setPkAdminId(int pkAdminId) {
        this.pkAdminId = pkAdminId;
    }

    @Basic
    @Column(name = "firstname", nullable = false, insertable = true, updatable = true, length = 100)
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "lastname", nullable = false, insertable = true, updatable = true, length = 100)
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "email", nullable = false, insertable = true, updatable = true, length = 60)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone", nullable = false, insertable = true, updatable = true)
    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "username", nullable = false, insertable = true, updatable = true, length = 100)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = false, insertable = true, updatable = true, length = 50)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "token", nullable = false, insertable = true, updatable = true, length = 64)
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdminsEntity that = (AdminsEntity) o;

        if (pkAdminId != that.pkAdminId) return false;
        if (phone != that.phone) return false;
        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
        if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (token != null ? !token.equals(that.token) : that.token != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkAdminId;
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (int) (phone ^ (phone >>> 32));
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (token != null ? token.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "fk_rlc_id", referencedColumnName = "pk_rlc_id", nullable = false)
    public RespLocalCommitteeEntity getRespLocalCommitteeByFkRlcId() {
        return respLocalCommitteeByFkRlcId;
    }

    public void setRespLocalCommitteeByFkRlcId(RespLocalCommitteeEntity respLocalCommitteeByFkRlcId) {
        this.respLocalCommitteeByFkRlcId = respLocalCommitteeByFkRlcId;
    }
}
