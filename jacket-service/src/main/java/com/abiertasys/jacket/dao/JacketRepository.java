package com.abiertasys.jacket.dao;


import com.abiertasys.jacket.entity.Jacket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface JacketRepository extends JpaRepository<Jacket, Long>{

    Optional<Jacket> findById(long id);

    void deleteById(long id);
}