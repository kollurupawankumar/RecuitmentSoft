package com.abiertasys.jacket.service;



import com.abiertasys.jacket.dao.JacketRepository;
import com.abiertasys.jacket.entity.Jacket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Service
public class JacketServiceImpl implements JacketService {

    @Autowired
    private JacketRepository jacketRepository;

    @Override
    public List<Jacket> getAllJackets() {
        return jacketRepository.findAll();
    }

    @Override
    public void saveJacket(Jacket jacket) {
        this.jacketRepository.save(jacket);
    }

    @Override
    public Jacket getJacketById(long id) {
        Optional <Jacket> optional = jacketRepository.findById(id);
        Jacket jacket = null;
        if (optional.isPresent()) {
            jacket = optional.get();
        } else {
            throw new RuntimeException(" jacket not found for id :: " + id);
        }
        return jacket;
    }

    @Override
    @Transactional
    public void deleteJacketById(long id) {
        this.jacketRepository.deleteById(id);
    }
}