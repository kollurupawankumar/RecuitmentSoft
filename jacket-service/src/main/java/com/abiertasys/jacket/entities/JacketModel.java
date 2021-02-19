package com.abiertasys.jacket.entities;

import org.springframework.stereotype.Component;


@Component
public class JacketModel {
        private long id;
        private Long jacketNo;
        private String rfId1;
        private String rfId2;


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
}
