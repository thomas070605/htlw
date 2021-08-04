package com.wds.example.htlw.persistence;

import com.wds.example.htlw.domain.Person;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PersonRepository extends PagingAndSortingRepository<Person, Integer> {
}
