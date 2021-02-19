package com.abiertasys.jacket.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "jacket")
public class Jacket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "jacket_no")
    private Long jacketNo;

    @Column(name = "rf_id1")
    private String rfId1;

    @Column(name = "rf_id2")
    private String rfId2;

    @Column(name = "registered_by")
    private String registeredUsr;

    @Column(name = "registered_date")
    private Date registeredDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getJacketNo() {
        return jacketNo;
    }

    public void setJacketNo(Long jacketNo) {
        this.jacketNo = jacketNo;
    }

    public String getRfId1() {
        return rfId1;
    }

    public void setRfId1(String rfId1) {
        this.rfId1 = rfId1;
    }

    public String getRfId2() {
        return rfId2;
    }

    public void setRfId2(String rfId2) {
        this.rfId2 = rfId2;
    }

    public String getRegisteredUsr() {
        return registeredUsr;
    }

    public void setRegisteredUsr(String registeredUsr) {
        this.registeredUsr = registeredUsr;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }
}
