package com.ms.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ms.eventmanagement.entities.Organizer;

public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {

}
