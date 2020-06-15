package com.paulo.omniong.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paulo.omniong.model.Ong;

@Repository
public interface OngRepository extends JpaRepository<Ong, Long> {

}
