package com.romario.java_persistence_mybatis_practice.repository;

import com.romario.java_persistence_mybatis_practice.model.entity.Address;

import java.util.List;

public interface AddressMapper {

    List<Address> findAll();

    Address findById();

    void save(Address address);
}
