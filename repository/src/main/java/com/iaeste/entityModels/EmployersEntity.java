package com.iaeste.entityModels;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by emirk on 03/10/2015.
 */
@Entity
@Table(name = "employers", schema = "", catalog = "iaeste_test")
public class EmployersEntity implements Serializable {
    private static final long serialVersionUID = -4113919183172665042L;
    private int pkEmployerId;
    private String name;
    private String city;
    private int zip;
    private String address;
    private String email;
    private String website;
    private String contactPerson;
    private RespLocalCommitteeEntity respLocalCommitteeByFkRlc;
    private CountriesEntity countriesByFkCountryId;
    private Collection<JobsEntity> jobsesByPkEmployerId;

    @Id
    @Column(name = "pk_employer_id", nullable = false, insertable = true, updatable = true)
    public int getPkEmployerId() {
        return pkEmployerId;
    }

    public void setPkEmployerId(int pkEmployerId) {
        this.pkEmployerId = pkEmployerId;
    }

    @Basic
    @Column(name = "name", nullable = false, insertable = true, updatable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "city", nullable = false, insertable = true, updatable = true, length = 50)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "zip", nullable = false, insertable = true, updatable = true)
    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Basic
    @Column(name = "address", nullable = false, insertable = true, updatable = true, length = 50)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
    @Column(name = "website", nullable = false, insertable = true, updatable = true, length = 40)
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Basic
    @Column(name = "contact_person", nullable = false, insertable = true, updatable = true, length = 100)
    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployersEntity that = (EmployersEntity) o;

        if (pkEmployerId != that.pkEmployerId) return false;
        if (zip != that.zip) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (website != null ? !website.equals(that.website) : that.website != null) return false;
        if (contactPerson != null ? !contactPerson.equals(that.contactPerson) : that.contactPerson != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkEmployerId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + zip;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (website != null ? website.hashCode() : 0);
        result = 31 * result + (contactPerson != null ? contactPerson.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "fk_rlc", referencedColumnName = "pk_rlc_id", nullable = false)
    public RespLocalCommitteeEntity getRespLocalCommitteeByFkRlc() {
        return respLocalCommitteeByFkRlc;
    }

    public void setRespLocalCommitteeByFkRlc(RespLocalCommitteeEntity respLocalCommitteeByFkRlc) {
        this.respLocalCommitteeByFkRlc = respLocalCommitteeByFkRlc;
    }

    @ManyToOne
    @JoinColumn(name = "fk_country_id", referencedColumnName = "pk_country_id", nullable = false)
    public CountriesEntity getCountriesByFkCountryId() {
        return countriesByFkCountryId;
    }

    public void setCountriesByFkCountryId(CountriesEntity countriesByFkCountryId) {
        this.countriesByFkCountryId = countriesByFkCountryId;
    }

    @OneToMany(mappedBy = "employersByFkEmployerId")
    public Collection<JobsEntity> getJobsesByPkEmployerId() {
        return jobsesByPkEmployerId;
    }

    public void setJobsesByPkEmployerId(Collection<JobsEntity> jobsesByPkEmployerId) {
        this.jobsesByPkEmployerId = jobsesByPkEmployerId;
    }
}
