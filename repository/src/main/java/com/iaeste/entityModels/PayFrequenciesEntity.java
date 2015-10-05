package com.iaeste.entityModels;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by emirk on 03/10/2015.
 */
@Entity
@Table(name = "pay_frequencies", schema = "", catalog = "iaeste_test")
public class PayFrequenciesEntity implements Serializable {
    private static final long serialVersionUID = -4821794172247526119L;
    private int pkPfId;
    private String status;
    private Collection<AccommodationsEntity> accommodationsesByPkPfId;

    @Id
    @Column(name = "pk_pf_id", nullable = false, insertable = true, updatable = true)
    public int getPkPfId() {
        return pkPfId;
    }

    public void setPkPfId(int pkPfId) {
        this.pkPfId = pkPfId;
    }

    @Basic
    @Column(name = "status", nullable = false, insertable = true, updatable = true, length = 50)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PayFrequenciesEntity that = (PayFrequenciesEntity) o;

        if (pkPfId != that.pkPfId) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkPfId;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "payFrequenciesByFkPayFrequencyId")
    public Collection<AccommodationsEntity> getAccommodationsesByPkPfId() {
        return accommodationsesByPkPfId;
    }

    public void setAccommodationsesByPkPfId(Collection<AccommodationsEntity> accommodationsesByPkPfId) {
        this.accommodationsesByPkPfId = accommodationsesByPkPfId;
    }
}
