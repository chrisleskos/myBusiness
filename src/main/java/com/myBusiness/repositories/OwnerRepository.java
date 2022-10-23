package com.myBusiness.repositories;

import com.myBusiness.models.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository
        extends JpaRepository<Owner, Integer>{
}
