package com.iaeste.entityModels;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by emirk on 03/10/2015.
 */
@Entity
@Table(name = "emergency_contacts", schema = "", catalog = "iaeste_test")
public class EmergencyContactsEntity implements Serializable {
    private static final long serialVersionUID = 5659810252830124115L;
    private int pkEmergencyContactId;
    private int fkCountryId;
    private String firstname;
    private String lastname;
    private String email;
    private long phone;
    private String city;
    private int zip;
    private String address;
    private CountriesEntity countriesByFkCountryId;

    @Id
    @Column(name = "pk_emergency_contact_id", nullable = false, insertable = true, updatable = true)
    public int getPkEmergencyContactId() {
        return pkEmergencyContactId;
    }

    public void setPkEmergencyContactId(int pkEmergencyContactId) {
        this.pkEmergencyContactId = pkEmergencyContactId;
    }

    @Basic
    @Column(name = "fk_country_id", nullable = false, insertable = true, updatable = true)
    public int getFkCountryId() {
        return fkCountryId;
    }

    public void setFkCountryId(int fkCountryId) {
        this.fkCountryId = fkCountryId;
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
    @Column(name = "email", nullable = false, insertable = true, updatable = true, length = 75)
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
    @Column(name = "address", nullable = false, insertable = true, updatable = true, length = 200)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmergencyContactsEntity that = (EmergencyContactsEntity) o;

        if (pkEmergencyContactId != that.pkEmergencyContactId) return false;
        if (fkCountryId != that.fkCountryId) return false;
        if (phone != that.phone) return false;
        if (zip != that.zip) return false;
        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
        if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkEmergencyContactId;
        result = 31 * result + fkCountryId;
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (int) (phone ^ (phone >>> 32));
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + zip;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "fk_country_id", referencedColumnName = "pk_country_id", nullable = false)
    public CountriesEntity getCountriesByFkCountryId() {
        return countriesByFkCountryId;
    }

    public void setCountriesByFkCountryId(CountriesEntity countriesByFkCountryId) {
        this.countriesByFkCountryId = countriesByFkCountryId;
    }
}
