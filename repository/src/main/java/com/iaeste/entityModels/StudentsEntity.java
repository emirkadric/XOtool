package com.iaeste.entityModels;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;

/**
 * Created by emirk on 05/10/2015.
 */
@Entity
@Table(name = "students", schema = "", catalog = "iaeste_test")
public class StudentsEntity implements Serializable {
    private static final long serialVersionUID = -8991959588808563883L;
    private int studentIdPk;
    private String firstname;
    private String lastname;
    private String sex;
    private Date dob;
    private String nationality;
    private String faculty;
    private String city;
    private int zip;
    private String address;
    private int phone;
    private String email;
    private int totalYears;
    private int completedYears;
    private Date changeDate;
    private byte[] passport;
    private byte[] cv;
    private byte[] langCertificate;
    private RespLocalCommitteeEntity fkRlcId;
    private EmergencyContactsEntity fkEmergencyContactId;
    private MembershipStatusesEntity fkMembershipStatus;
    private LanguagesEntity fkNativeLanguage;
    private EducationsEntity fkEducationId;
    private PrevEmploymentsEntity fkPrevEmploymentId;
    private AdminsEntity fkUpdatedByAdmin;
    private CountriesEntity fkCountryId;
    private List<LanguagesEntity> studentLanguages;
    private String username;
    private String password;
    private String token;

    @Id
    @Column(name = "student_id_pk", nullable = false, insertable = true, updatable = true)
    public int getStudentIdPk() {
        return studentIdPk;
    }

    public void setStudentIdPk(int studentIdPk) {
        this.studentIdPk = studentIdPk;
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
    @Column(name = "sex", nullable = false, insertable = true, updatable = true, length = 50)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "DOB", nullable = false, insertable = true, updatable = true)
    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Basic
    @Column(name = "nationality", nullable = false, insertable = true, updatable = true, length = 200)
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Basic
    @Column(name = "faculty", nullable = false, insertable = true, updatable = true, length = 200)
    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
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

    @Basic
    @Column(name = "phone", nullable = false, insertable = true, updatable = true)
    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "email", nullable = false, insertable = true, updatable = true, length = 70)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "total_years", nullable = false, insertable = true, updatable = true)
    public int getTotalYears() {
        return totalYears;
    }

    public void setTotalYears(int totalYears) {
        this.totalYears = totalYears;
    }

    @Basic
    @Column(name = "completed_years", nullable = false, insertable = true, updatable = true)
    public int getCompletedYears() {
        return completedYears;
    }

    public void setCompletedYears(int completedYears) {
        this.completedYears = completedYears;
    }

    @Basic
    @Column(name = "change_date", nullable = false, insertable = true, updatable = true)
    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    @Basic
    @Column(name = "passport", nullable = false, insertable = true, updatable = true)
    public byte[] getPassport() {
        return passport;
    }

    public void setPassport(byte[] passport) {
        this.passport = passport;
    }

    @Basic
    @Column(name = "cv", nullable = false, insertable = true, updatable = true)
    public byte[] getCv() {
        return cv;
    }

    public void setCv(byte[] cv) {
        this.cv = cv;
    }

    @Basic
    @Column(name = "lang_certificate", nullable = false, insertable = true, updatable = true)
    public byte[] getLangCertificate() {
        return langCertificate;
    }

    public void setLangCertificate(byte[] langCertificate) {
        this.langCertificate = langCertificate;
    }

    @OneToOne
//    @Column(name = "fk_rlc_id", nullable = false, insertable = true, updatable = true)
    @JoinColumn(name = "fk_rlc_id", referencedColumnName = "pk_rlc_id", nullable = false)
    public RespLocalCommitteeEntity getFkRlcId() {
        return fkRlcId;
    }

    public void setFkRlcId(RespLocalCommitteeEntity fkRlcId) {
        this.fkRlcId = fkRlcId;
    }

    @ManyToOne
//    @Column(name = "fk_emergency_contact_id", nullable = false, insertable = true, updatable = true)
    @JoinColumn(name = "fk_emergency_contact_id", referencedColumnName = "pk_emergency_contact_id", nullable = false)
    public EmergencyContactsEntity getFkEmergencyContactId() {
        return fkEmergencyContactId;
    }

    public void setFkEmergencyContactId(EmergencyContactsEntity fkEmergencyContactId) {
        this.fkEmergencyContactId = fkEmergencyContactId;
    }

    @ManyToOne
//    @Column(name = "fk_membership_status", nullable = false, insertable = true, updatable = true)
    @JoinColumn(name = "fk_membership_status", referencedColumnName = "pk_mb_id", nullable = false)
    public MembershipStatusesEntity getFkMembershipStatus() {
        return fkMembershipStatus;
    }

    public void setFkMembershipStatus(MembershipStatusesEntity fkMembershipStatus) {
        this.fkMembershipStatus = fkMembershipStatus;
    }

    @OneToOne
//    @Column(name = "fk_native_language", nullable = false, insertable = true, updatable = true)
    @JoinColumn(name = "fk_native_language", referencedColumnName = "pk_language_id", nullable = false)
    public LanguagesEntity getFkNativeLanguage() {
        return fkNativeLanguage;
    }

    public void setFkNativeLanguage(LanguagesEntity fkNativeLanguage) {
        this.fkNativeLanguage = fkNativeLanguage;
    }

    @ManyToOne
//    @Column(name = "fk_education_id", nullable = false, insertable = true, updatable = true)
    @JoinColumn(name = "fk_education_id", referencedColumnName = "pk_edu_id", nullable = false)
    public EducationsEntity getFkEducationId() {
        return fkEducationId;
    }

    public void setFkEducationId(EducationsEntity fkEducationId) {
        this.fkEducationId = fkEducationId;
    }

    @ManyToOne
//    @Column(name = "fk_prev_employment_id", nullable = false, insertable = true, updatable = true)
    @JoinColumn(name = "fk_prev_employment_id", referencedColumnName = "pk_pe_id", nullable = false)
    public PrevEmploymentsEntity getFkPrevEmploymentId() {
        return fkPrevEmploymentId;
    }

    public void setFkPrevEmploymentId(PrevEmploymentsEntity fkPrevEmploymentId) {
        this.fkPrevEmploymentId = fkPrevEmploymentId;
    }

    @ManyToOne
//    @Column(name = "fk_updated_by_admin", nullable = false, insertable = true, updatable = true)
    @JoinColumn(name = "fk_updated_by_admin", referencedColumnName = "pk_admin_id", nullable = false)
    public AdminsEntity getFkUpdatedByAdmin() {
        return fkUpdatedByAdmin;
    }

    public void setFkUpdatedByAdmin(AdminsEntity fkUpdatedByAdmin) {
        this.fkUpdatedByAdmin = fkUpdatedByAdmin;
    }

    @ManyToMany
    @JoinTable(name="students_languages", joinColumns = @JoinColumn(name = "fk_student_id"), inverseJoinColumns = @JoinColumn(name = "fk_language_id"))
    public List<LanguagesEntity> getStudentLanguages()
    {
        return studentLanguages;
    }

    public void setStudentLanguages(List<LanguagesEntity> langs)
    {
        this.studentLanguages = langs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentsEntity that = (StudentsEntity) o;

        if (studentIdPk != that.studentIdPk) return false;
        if (zip != that.zip) return false;
        if (phone != that.phone) return false;
        if (totalYears != that.totalYears) return false;
        if (completedYears != that.completedYears) return false;
        if (fkRlcId != that.fkRlcId) return false;
        if (fkCountryId != that.fkCountryId) return false;
        if (fkEmergencyContactId != that.fkEmergencyContactId) return false;
        if (fkMembershipStatus != that.fkMembershipStatus) return false;
        if (fkNativeLanguage != that.fkNativeLanguage) return false;
        if (fkEducationId != that.fkEducationId) return false;
        if (fkPrevEmploymentId != that.fkPrevEmploymentId) return false;
        if (fkUpdatedByAdmin != that.fkUpdatedByAdmin) return false;
        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
        if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (dob != null ? !dob.equals(that.dob) : that.dob != null) return false;
        if (nationality != null ? !nationality.equals(that.nationality) : that.nationality != null) return false;
        if (faculty != null ? !faculty.equals(that.faculty) : that.faculty != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (changeDate != null ? !changeDate.equals(that.changeDate) : that.changeDate != null) return false;
        if (!Arrays.equals(passport, that.passport)) return false;
        if (!Arrays.equals(cv, that.cv)) return false;
        if (!Arrays.equals(langCertificate, that.langCertificate)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentIdPk;
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (dob != null ? dob.hashCode() : 0);
        result = 31 * result + (nationality != null ? nationality.hashCode() : 0);
        result = 31 * result + (faculty != null ? faculty.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + zip;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + phone;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + totalYears;
        result = 31 * result + completedYears;
        result = 31 * result + (changeDate != null ? changeDate.hashCode() : 0);
        result = 31 * result + (passport != null ? Arrays.hashCode(passport) : 0);
        result = 31 * result + (cv != null ? Arrays.hashCode(cv) : 0);
        result = 31 * result + (langCertificate != null ? Arrays.hashCode(langCertificate) : 0);
        return result;
    }

    @OneToOne
//    @Column(name = "fk_country_id", nullable = false, insertable = true, updatable = true)
    @JoinColumn(name = "fk_country_id", referencedColumnName = "pk_country_id", nullable = false)
    public CountriesEntity getFkCountryId() {
        return fkCountryId;
    }

    public void setFkCountryId(CountriesEntity fkCountryId) {
        this.fkCountryId = fkCountryId;
    }

    @Basic
    @Column(name = "username", nullable = false, insertable = true, updatable = true, length = 50)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = false, insertable = true, updatable = true, length = 64)
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
}
