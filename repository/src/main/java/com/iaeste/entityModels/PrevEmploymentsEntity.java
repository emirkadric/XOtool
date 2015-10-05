package com.iaeste.entityModels;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Arrays;

/**
 * Created by emirk on 03/10/2015.
 */
@Entity
@Table(name = "prev_employments", schema = "", catalog = "iaeste_test")
public class PrevEmploymentsEntity implements Serializable {
    private static final long serialVersionUID = 9177454382623892282L;
    private int pkPeId;
    private String name;
    private Date fromDate;
    private Date toDate;
    private String description;
    private byte[] certificate;

    @Id
    @Column(name = "pk_pe_id", nullable = false, insertable = true, updatable = true)
    public int getPkPeId() {
        return pkPeId;
    }

    public void setPkPeId(int pkPeId) {
        this.pkPeId = pkPeId;
    }

    @Basic
    @Column(name = "name", nullable = false, insertable = true, updatable = true, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "from_date", nullable = false, insertable = true, updatable = true)
    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Basic
    @Column(name = "to_date", nullable = false, insertable = true, updatable = true)
    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    @Basic
    @Column(name = "description", nullable = false, insertable = true, updatable = true, length = 500)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "certificate", nullable = false, insertable = true, updatable = true)
    public byte[] getCertificate() {
        return certificate;
    }

    public void setCertificate(byte[] certificate) {
        this.certificate = certificate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrevEmploymentsEntity that = (PrevEmploymentsEntity) o;

        if (pkPeId != that.pkPeId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (fromDate != null ? !fromDate.equals(that.fromDate) : that.fromDate != null) return false;
        if (toDate != null ? !toDate.equals(that.toDate) : that.toDate != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (!Arrays.equals(certificate, that.certificate)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkPeId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (fromDate != null ? fromDate.hashCode() : 0);
        result = 31 * result + (toDate != null ? toDate.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (certificate != null ? Arrays.hashCode(certificate) : 0);
        return result;
    }
}
