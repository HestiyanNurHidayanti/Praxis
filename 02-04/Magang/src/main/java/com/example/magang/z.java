package com.example.magang;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

interface CustomerRepository extends CrudRepository<customer, Long> {

    List<customer> findByLastName(String lastName);

    customer findById(long id);
}
