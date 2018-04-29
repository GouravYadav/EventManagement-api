package com.ms.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ms.eventmanagement.entities.Participant;

public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {

}
