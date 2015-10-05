package com.iaeste.entityModels;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by emirk on 03/10/2015.
 */
@Entity
@Table(name = "jobs", schema = "", catalog = "iaeste_test")
public class JobsEntity implements Serializable {
    private static final long serialVersionUID = 3305605676364373047L;
    private int pkJobsId;
    private String refNo;
    private Date deadline;
    private String publicComment;
    private String internalComment;
    private int workingHours;
    private String description;
    private Date startDate;
    private Date endDate;
    private int livingCost;
    private int fkEmployerId;
    private int fkStudentId;
    private int fkJobcontactId;
    private int fkPaymentId;
    private int fkAccommodationId;
    private int fkJobstatusId;
    private EmployersEntity employersByFkEmployerId;
    private JobContactsEntity jobContactsByFkJobcontactId;
    private PaymentsEntity paymentsByFkPaymentId;
    private AccommodationsEntity accommodationsByFkAccommodationId;
    private JobStatusesEntity jobStatusesByFkJobstatusId;

    @Id
    @Column(name = "pk_jobs_id", nullable = false, insertable = true, updatable = true)
    public int getPkJobsId() {
        return pkJobsId;
    }

    public void setPkJobsId(int pkJobsId) {
        this.pkJobsId = pkJobsId;
    }

    @Basic
    @Column(name = "ref_no", nullable = false, insertable = true, updatable = true, length = 50)
    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    @Basic
    @Column(name = "deadline", nullable = false, insertable = true, updatable = true)
    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    @Basic
    @Column(name = "public_comment", nullable = false, insertable = true, updatable = true, length = 500)
    public String getPublicComment() {
        return publicComment;
    }

    public void setPublicComment(String publicComment) {
        this.publicComment = publicComment;
    }

    @Basic
    @Column(name = "internal_comment", nullable = false, insertable = true, updatable = true, length = 500)
    public String getInternalComment() {
        return internalComment;
    }

    public void setInternalComment(String internalComment) {
        this.internalComment = internalComment;
    }

    @Basic
    @Column(name = "working_hours", nullable = false, insertable = true, updatable = true)
    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Basic
    @Column(name = "description", nullable = false, insertable = true, updatable = true, length = 1000)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "start_date", nullable = false, insertable = true, updatable = true)
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "end_date", nullable = false, insertable = true, updatable = true)
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "living_cost", nullable = false, insertable = true, updatable = true)
    public int getLivingCost() {
        return livingCost;
    }

    public void setLivingCost(int livingCost) {
        this.livingCost = livingCost;
    }

    @Basic
    @Column(name = "fk_employer_id", nullable = false, insertable = true, updatable = true)
    public int getFkEmployerId() {
        return fkEmployerId;
    }

    public void setFkEmployerId(int fkEmployerId) {
        this.fkEmployerId = fkEmployerId;
    }

    @Basic
    @Column(name = "fk_student_id", nullable = false, insertable = true, updatable = true)
    public int getFkStudentId() {
        return fkStudentId;
    }

    public void setFkStudentId(int fkStudentId) {
        this.fkStudentId = fkStudentId;
    }

    @Basic
    @Column(name = "fk_jobcontact_id", nullable = false, insertable = true, updatable = true)
    public int getFkJobcontactId() {
        return fkJobcontactId;
    }

    public void setFkJobcontactId(int fkJobcontactId) {
        this.fkJobcontactId = fkJobcontactId;
    }

    @Basic
    @Column(name = "fk_payment_id", nullable = false, insertable = true, updatable = true)
    public int getFkPaymentId() {
        return fkPaymentId;
    }

    public void setFkPaymentId(int fkPaymentId) {
        this.fkPaymentId = fkPaymentId;
    }

    @Basic
    @Column(name = "fk_accommodation_id", nullable = false, insertable = true, updatable = true)
    public int getFkAccommodationId() {
        return fkAccommodationId;
    }

    public void setFkAccommodationId(int fkAccommodationId) {
        this.fkAccommodationId = fkAccommodationId;
    }

    @Basic
    @Column(name = "fk_jobstatus_id", nullable = false, insertable = true, updatable = true)
    public int getFkJobstatusId() {
        return fkJobstatusId;
    }

    public void setFkJobstatusId(int fkJobstatusId) {
        this.fkJobstatusId = fkJobstatusId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JobsEntity that = (JobsEntity) o;

        if (pkJobsId != that.pkJobsId) return false;
        if (workingHours != that.workingHours) return false;
        if (livingCost != that.livingCost) return false;
        if (fkEmployerId != that.fkEmployerId) return false;
        if (fkStudentId != that.fkStudentId) return false;
        if (fkJobcontactId != that.fkJobcontactId) return false;
        if (fkPaymentId != that.fkPaymentId) return false;
        if (fkAccommodationId != that.fkAccommodationId) return false;
        if (fkJobstatusId != that.fkJobstatusId) return false;
        if (refNo != null ? !refNo.equals(that.refNo) : that.refNo != null) return false;
        if (deadline != null ? !deadline.equals(that.deadline) : that.deadline != null) return false;
        if (publicComment != null ? !publicComment.equals(that.publicComment) : that.publicComment != null)
            return false;
        if (internalComment != null ? !internalComment.equals(that.internalComment) : that.internalComment != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkJobsId;
        result = 31 * result + (refNo != null ? refNo.hashCode() : 0);
        result = 31 * result + (deadline != null ? deadline.hashCode() : 0);
        result = 31 * result + (publicComment != null ? publicComment.hashCode() : 0);
        result = 31 * result + (internalComment != null ? internalComment.hashCode() : 0);
        result = 31 * result + workingHours;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + livingCost;
        result = 31 * result + fkEmployerId;
        result = 31 * result + fkStudentId;
        result = 31 * result + fkJobcontactId;
        result = 31 * result + fkPaymentId;
        result = 31 * result + fkAccommodationId;
        result = 31 * result + fkJobstatusId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "fk_employer_id", referencedColumnName = "pk_employer_id", nullable = false)
    public EmployersEntity getEmployersByFkEmployerId() {
        return employersByFkEmployerId;
    }

    public void setEmployersByFkEmployerId(EmployersEntity employersByFkEmployerId) {
        this.employersByFkEmployerId = employersByFkEmployerId;
    }

    @ManyToOne
    @JoinColumn(name = "fk_jobcontact_id", referencedColumnName = "pk_jc_id", nullable = false)
    public JobContactsEntity getJobContactsByFkJobcontactId() {
        return jobContactsByFkJobcontactId;
    }

    public void setJobContactsByFkJobcontactId(JobContactsEntity jobContactsByFkJobcontactId) {
        this.jobContactsByFkJobcontactId = jobContactsByFkJobcontactId;
    }

    @ManyToOne
    @JoinColumn(name = "fk_payment_id", referencedColumnName = "pk_payment_id", nullable = false)
    public PaymentsEntity getPaymentsByFkPaymentId() {
        return paymentsByFkPaymentId;
    }

    public void setPaymentsByFkPaymentId(PaymentsEntity paymentsByFkPaymentId) {
        this.paymentsByFkPaymentId = paymentsByFkPaymentId;
    }

    @ManyToOne
    @JoinColumn(name = "fk_accommodation_id", referencedColumnName = "pk_accomm_id", nullable = false)
    public AccommodationsEntity getAccommodationsByFkAccommodationId() {
        return accommodationsByFkAccommodationId;
    }

    public void setAccommodationsByFkAccommodationId(AccommodationsEntity accommodationsByFkAccommodationId) {
        this.accommodationsByFkAccommodationId = accommodationsByFkAccommodationId;
    }

    @ManyToOne
    @JoinColumn(name = "fk_jobstatus_id", referencedColumnName = "pk_jstatuses_id", nullable = false)
    public JobStatusesEntity getJobStatusesByFkJobstatusId() {
        return jobStatusesByFkJobstatusId;
    }

    public void setJobStatusesByFkJobstatusId(JobStatusesEntity jobStatusesByFkJobstatusId) {
        this.jobStatusesByFkJobstatusId = jobStatusesByFkJobstatusId;
    }
}
