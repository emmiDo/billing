package com.clinic.billing.beans;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "billings")
public class Billing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private long visitId;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date billedTime;

    public Billing () {}

    public Billing (long visitId, Date billedTime) {
        this.visitId = visitId;
        this.billedTime = billedTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getVisitId() {
        return visitId;
    }

    public void setVisitId(long visitId) {
        this.visitId = visitId;
    }

    public Date getBilledTime() {
        return billedTime;
    }

    public void setBilledTime(Date billedTime) {
        this.billedTime = billedTime;
    }
}
