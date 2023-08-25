package com.dbstore.storemanagement.repository;

import com.dbstore.storemanagement.entity.StoreInformation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface StoreInformationRepository extends CrudRepository<StoreInformation, Integer> {
    List<StoreInformation> findByStoreName(String name);
    List<StoreInformation> findByStorePhoneNumber(String phoneNumber);

    Iterable<StoreInformation> findByStoreDetails(String lg_center);
    Optional<StoreInformation> findById(Integer storeId);
}
