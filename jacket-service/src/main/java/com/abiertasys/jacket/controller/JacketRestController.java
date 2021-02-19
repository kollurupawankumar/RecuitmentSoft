package com.abiertasys.jacket.controller;

import com.abiertasys.jacket.entities.JacketModel;
import com.abiertasys.jacket.entities.JacketStatusResponse;
import com.abiertasys.jacket.entity.Jacket;
import com.abiertasys.jacket.service.JacketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/jacket")
public class JacketRestController {

    @Autowired
    private JacketService jacketService;

    // display list of jackets
    @GetMapping("/list")
    public List<Jacket> getAllJackets() {
        List<Jacket> jackets = jacketService.getAllJackets();
        return jackets;
    }


    @PostMapping("/saveJacket")
    public JacketStatusResponse saveJacket(@RequestBody JacketModel jacket)  {
        // save jacket to database
        Jacket jacket1 = new Jacket();
        jacket1.setJacketNo(jacket.getJacketNo());
        jacket1.setRfId1(jacket.getRfId1());
        jacket1.setRfId2(jacket.getRfId2());
        jacketService.saveJacket(jacket1);
        JacketStatusResponse jacketStatusResponse = new JacketStatusResponse(200, "Success");
        return jacketStatusResponse;
    }

    @PostMapping("/updateJacket/{id}")
    public Jacket showFormForUpdate(@PathVariable(value = "id") long id,
                                    @RequestBody JacketModel jacketModel) {

        // get jacket from the service
        Jacket jacket = jacketService.getJacketById(id);
        jacket.setJacketNo(jacketModel.getJacketNo());
        jacket.setRfId1(jacketModel.getRfId1());
        jacket.setRfId2(jacketModel.getRfId2());
        jacketService.saveJacket(jacket);
        return jacket;
    }

    @GetMapping("/deleteJacket/{id}")
    public JacketStatusResponse deleteJacket(@PathVariable(value = "id") long id) {

        // call delete jacket method
        this.jacketService.deleteJacketById(id);
        JacketStatusResponse jacketStatusResponse = new JacketStatusResponse(200, "Success");
        return jacketStatusResponse;
    }
}
