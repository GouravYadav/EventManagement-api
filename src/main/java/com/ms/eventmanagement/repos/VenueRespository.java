package com.ms.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ms.eventmanagement.entities.Venue;

public interface VenueRespository extends PagingAndSortingRepository<Venue, Long> {

}
