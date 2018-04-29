package com.ms.eventmanagement.repos;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ms.eventmanagement.entities.Event;
import com.ms.eventmanagement.entities.projections.PartialEventProjection;

import java.lang.String;
import java.util.List;

@RepositoryRestResource(excerptProjection=PartialEventProjection.class)
public interface EventRepository extends PagingAndSortingRepository<Event, Long> {
	
	Page<Event> findByName(@Param("name") String name, Pageable pageable);

}
