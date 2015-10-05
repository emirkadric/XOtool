package com.iaeste.entityModels;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;

/**
 * Created by emirk on 03/10/2015.
 */
@Entity
@Table(name = "educations", schema = "", catalog = "iaeste_test")
public class EducationsEntity implements Serializable{
    private static final long serialVersionUID = 8886584961812948959L;
    private int pkEduId;
    private int fkStudyLevel;
    private String university;
    private String studyField;
    private String status;
    private String studyCode;
    private Date startDate;
    private Date expectedFinishDate;
    private int completedEcts;
    private int totalEcts;
    private String comment;
    private byte[] transcript;
    private byte[] confirmationEnrollment;
    private byte[] studyPlan;
    private byte[] awards;
    private StudyLevelsEntity studyLevelsByFkStudyLevel;
    private List<StudentsEntity> pk_edu_id;

    @Id
    @Column(name = "pk_edu_id", nullable = false, insertable = true, updatable = true)
    public int getPkEduId() {
        return pkEduId;
    }

    public void setPkEduId(int pkEduId) {
        this.pkEduId = pkEduId;
    }

    @Basic
    @Column(name = "fk_study_level", nullable = false, insertable = true, updatable = true)
    public int getFkStudyLevel() {
        return fkStudyLevel;
    }

    public void setFkStudyLevel(int fkStudyLevel) {
        this.fkStudyLevel = fkStudyLevel;
    }

    @Basic
    @Column(name = "university", nullable = false, insertable = true, updatable = true, length = 200)
    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Basic
    @Column(name = "study_field", nullable = false, insertable = true, updatable = true, length = 100)
    public String getStudyField() {
        return studyField;
    }

    public void setStudyField(String studyField) {
        this.studyField = studyField;
    }

    @Basic
    @Column(name = "status", nullable = false, insertable = true, updatable = true, length = 9)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "study_code", nullable = false, insertable = true, updatable = true, length = 50)
    public String getStudyCode() {
        return studyCode;
    }

    public void setStudyCode(String studyCode) {
        this.studyCode = studyCode;
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
    @Column(name = "expected_finish_date", nullable = false, insertable = true, updatable = true)
    public Date getExpectedFinishDate() {
        return expectedFinishDate;
    }

    public void setExpectedFinishDate(Date expectedFinishDate) {
        this.expectedFinishDate = expectedFinishDate;
    }

    @Basic
    @Column(name = "completed_ects", nullable = false, insertable = true, updatable = true)
    public int getCompletedEcts() {
        return completedEcts;
    }

    public void setCompletedEcts(int completedEcts) {
        this.completedEcts = completedEcts;
    }

    @Basic
    @Column(name = "total_ects", nullable = false, insertable = true, updatable = true)
    public int getTotalEcts() {
        return totalEcts;
    }

    public void setTotalEcts(int totalEcts) {
        this.totalEcts = totalEcts;
    }

    @Basic
    @Column(name = "comment", nullable = false, insertable = true, updatable = true, length = 500)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "transcript", nullable = false, insertable = true, updatable = true)
    public byte[] getTranscript() {
        return transcript;
    }

    public void setTranscript(byte[] transcript) {
        this.transcript = transcript;
    }

    @Basic
    @Column(name = "confirmation_enrollment", nullable = false, insertable = true, updatable = true)
    public byte[] getConfirmationEnrollment() {
        return confirmationEnrollment;
    }

    public void setConfirmationEnrollment(byte[] confirmationEnrollment) {
        this.confirmationEnrollment = confirmationEnrollment;
    }

    @Basic
    @Column(name = "study_plan", nullable = false, insertable = true, updatable = true)
    public byte[] getStudyPlan() {
        return studyPlan;
    }

    public void setStudyPlan(byte[] studyPlan) {
        this.studyPlan = studyPlan;
    }

    @Basic
    @Column(name = "awards", nullable = false, insertable = true, updatable = true)
    public byte[] getAwards() {
        return awards;
    }

    public void setAwards(byte[] awards) {
        this.awards = awards;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EducationsEntity that = (EducationsEntity) o;

        if (pkEduId != that.pkEduId) return false;
        if (fkStudyLevel != that.fkStudyLevel) return false;
        if (completedEcts != that.completedEcts) return false;
        if (totalEcts != that.totalEcts) return false;
        if (university != null ? !university.equals(that.university) : that.university != null) return false;
        if (studyField != null ? !studyField.equals(that.studyField) : that.studyField != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (studyCode != null ? !studyCode.equals(that.studyCode) : that.studyCode != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (expectedFinishDate != null ? !expectedFinishDate.equals(that.expectedFinishDate) : that.expectedFinishDate != null)
            return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (!Arrays.equals(transcript, that.transcript)) return false;
        if (!Arrays.equals(confirmationEnrollment, that.confirmationEnrollment)) return false;
        if (!Arrays.equals(studyPlan, that.studyPlan)) return false;
        if (!Arrays.equals(awards, that.awards)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkEduId;
        result = 31 * result + fkStudyLevel;
        result = 31 * result + (university != null ? university.hashCode() : 0);
        result = 31 * result + (studyField != null ? studyField.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (studyCode != null ? studyCode.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (expectedFinishDate != null ? expectedFinishDate.hashCode() : 0);
        result = 31 * result + completedEcts;
        result = 31 * result + totalEcts;
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (transcript != null ? Arrays.hashCode(transcript) : 0);
        result = 31 * result + (confirmationEnrollment != null ? Arrays.hashCode(confirmationEnrollment) : 0);
        result = 31 * result + (studyPlan != null ? Arrays.hashCode(studyPlan) : 0);
        result = 31 * result + (awards != null ? Arrays.hashCode(awards) : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "fk_study_level", referencedColumnName = "pk_sl_id", nullable = false)
    public StudyLevelsEntity getStudyLevelsByFkStudyLevel() {
        return studyLevelsByFkStudyLevel;
    }

    public void setStudyLevelsByFkStudyLevel(StudyLevelsEntity studyLevelsByFkStudyLevel) {
        this.studyLevelsByFkStudyLevel = studyLevelsByFkStudyLevel;
    }

    @OneToMany(mappedBy = "fkEducationId")
    public List<StudentsEntity> getPk_edu_id() {
        return pk_edu_id;
    }

    public void setPk_edu_id(List<StudentsEntity> pk_edu_id) {
        this.pk_edu_id = pk_edu_id;
    }
}
