package com.fsc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fsc.models.Usuario;


@Repository
public interface EmailRepository extends JpaRepository<Usuario, Long>{

}
