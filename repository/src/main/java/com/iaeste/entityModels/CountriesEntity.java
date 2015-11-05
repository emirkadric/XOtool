package com.iaeste.entityModels;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by emirk on 03/10/2015.
 */
@Entity
@Table(name = "countries", schema = "", catalog = "iaeste_test")
public class CountriesEntity implements Serializable{
    private static final long serialVersionUID = 6152277910827081291L;
    private int pkCountryId;
    private String countryCode;
    private String countryName;
    private Collection<EmergencyContactsEntity> emergencyContactsesByPkCountryId;
    private Collection<EmployersEntity> employersesByPkCountryId;
    private StudentsEntity pk_country_id;

    @Id
    @Column(name = "pk_country_id", nullable = false, insertable = true, updatable = true)
    public int getPkCountryId() {
        return pkCountryId;
    }

    public void setPkCountryId(int pkCountryId) {
        this.pkCountryId = pkCountryId;
    }

    @Basic
    @Column(name = "country_code", nullable = false, insertable = true, updatable = true, length = 2)
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Basic
    @Column(name = "country_name", nullable = false, insertable = true, updatable = true, length = 100)
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CountriesEntity that = (CountriesEntity) o;

        if (pkCountryId != that.pkCountryId) return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (countryName != null ? !countryName.equals(that.countryName) : that.countryName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkCountryId;
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (countryName != null ? countryName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "countriesByFkCountryId")
    public Collection<EmployersEntity> getEmployersesByPkCountryId() {
        return employersesByPkCountryId;
    }

    public void setEmployersesByPkCountryId(Collection<EmployersEntity> employersesByPkCountryId) {
        this.employersesByPkCountryId = employersesByPkCountryId;
    }

    @OneToOne(mappedBy = "fkCountryId")
    public StudentsEntity getPk_country_id() {
        return pk_country_id;
    }

    public void setPk_country_id(StudentsEntity pk_country_id) {
        this.pk_country_id = pk_country_id;
    }
}
