package com.iaeste.entityModels;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by emirk on 03/10/2015.
 */
@Entity
@Table(name = "accommodations", schema = "", catalog = "iaeste_test")
public class AccommodationsEntity implements Serializable {
    private static final long serialVersionUID = 2172483081293372695L;

    private int pkAccommId;
    private String provider;
    private int cost;
    private int fkPayFrequencyId;
    private PayFrequenciesEntity payFrequenciesByFkPayFrequencyId;
    private Collection<JobsEntity> jobsesByPkAccommId;

    @Id
    @Column(name = "pk_accomm_id", nullable = false, insertable = true, updatable = true)
    public int getPkAccommId() {
        return pkAccommId;
    }

    public void setPkAccommId(int pkAccommId) {
        this.pkAccommId = pkAccommId;
    }

    @Basic
    @Column(name = "provider", nullable = false, insertable = true, updatable = true, length = 200)
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    @Basic
    @Column(name = "cost", nullable = false, insertable = true, updatable = true)
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Basic
    @Column(name = "fk_pay_frequency_id", nullable = false, insertable = true, updatable = true)
    public int getFkPayFrequencyId() {
        return fkPayFrequencyId;
    }

    public void setFkPayFrequencyId(int fkPayFrequencyId) {
        this.fkPayFrequencyId = fkPayFrequencyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccommodationsEntity that = (AccommodationsEntity) o;

        if (pkAccommId != that.pkAccommId) return false;
        if (cost != that.cost) return false;
        if (fkPayFrequencyId != that.fkPayFrequencyId) return false;
        if (provider != null ? !provider.equals(that.provider) : that.provider != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkAccommId;
        result = 31 * result + (provider != null ? provider.hashCode() : 0);
        result = 31 * result + cost;
        result = 31 * result + fkPayFrequencyId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "fk_pay_frequency_id", referencedColumnName = "pk_pf_id", nullable = false)
    public PayFrequenciesEntity getPayFrequenciesByFkPayFrequencyId() {
        return payFrequenciesByFkPayFrequencyId;
    }

    public void setPayFrequenciesByFkPayFrequencyId(PayFrequenciesEntity payFrequenciesByFkPayFrequencyId) {
        this.payFrequenciesByFkPayFrequencyId = payFrequenciesByFkPayFrequencyId;
    }

    @OneToMany(mappedBy = "accommodationsByFkAccommodationId")
    public Collection<JobsEntity> getJobsesByPkAccommId() {
        return jobsesByPkAccommId;
    }

    public void setJobsesByPkAccommId(Collection<JobsEntity> jobsesByPkAccommId) {
        this.jobsesByPkAccommId = jobsesByPkAccommId;
    }
}
