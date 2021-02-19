package com.abiertasys.jacket.service;

import com.abiertasys.jacket.entity.Jacket;
import java.util.List;


public interface JacketService {
    List <Jacket> getAllJackets();
    void saveJacket(Jacket jacket);
    Jacket getJacketById(long id);
    void deleteJacketById(long id);
}