package com.iaeste.entityModels;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by emirk on 03/10/2015.
 */
@Entity
@Table(name = "payments", schema = "", catalog = "iaeste_test")
public class PaymentsEntity implements Serializable {
    private static final long serialVersionUID = -7566125857135798674L;
    private int pkPaymentId;
    private String currency;
    private int amount;
    private String paymentFreq;
    private String deduction;
    private Collection<JobsEntity> jobsesByPkPaymentId;

    @Id
    @Column(name = "pk_payment_id", nullable = false, insertable = true, updatable = true)
    public int getPkPaymentId() {
        return pkPaymentId;
    }

    public void setPkPaymentId(int pkPaymentId) {
        this.pkPaymentId = pkPaymentId;
    }

    @Basic
    @Column(name = "currency", nullable = false, insertable = true, updatable = true, length = 10)
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Basic
    @Column(name = "amount", nullable = false, insertable = true, updatable = true)
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "payment_freq", nullable = false, insertable = true, updatable = true, length = 20)
    public String getPaymentFreq() {
        return paymentFreq;
    }

    public void setPaymentFreq(String paymentFreq) {
        this.paymentFreq = paymentFreq;
    }

    @Basic
    @Column(name = "deduction", nullable = false, insertable = true, updatable = true, length = 100)
    public String getDeduction() {
        return deduction;
    }

    public void setDeduction(String deduction) {
        this.deduction = deduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PaymentsEntity that = (PaymentsEntity) o;

        if (pkPaymentId != that.pkPaymentId) return false;
        if (amount != that.amount) return false;
        if (currency != null ? !currency.equals(that.currency) : that.currency != null) return false;
        if (paymentFreq != null ? !paymentFreq.equals(that.paymentFreq) : that.paymentFreq != null) return false;
        if (deduction != null ? !deduction.equals(that.deduction) : that.deduction != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkPaymentId;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + amount;
        result = 31 * result + (paymentFreq != null ? paymentFreq.hashCode() : 0);
        result = 31 * result + (deduction != null ? deduction.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "paymentsByFkPaymentId")
    public Collection<JobsEntity> getJobsesByPkPaymentId() {
        return jobsesByPkPaymentId;
    }

    public void setJobsesByPkPaymentId(Collection<JobsEntity> jobsesByPkPaymentId) {
        this.jobsesByPkPaymentId = jobsesByPkPaymentId;
    }
}
