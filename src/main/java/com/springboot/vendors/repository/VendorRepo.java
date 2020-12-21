package com.springboot.vendors.repository;

import com.springboot.vendors.entity.VendorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VendorRepo extends JpaRepository<VendorEntity,String> {

   Optional <VendorEntity> findByvendorId(String vendorId);
}
