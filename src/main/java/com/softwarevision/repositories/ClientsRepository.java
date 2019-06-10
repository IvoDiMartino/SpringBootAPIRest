package com.softwarevision.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softwarevision.model.Clients;

// Repository type Class
public interface ClientsRepository extends JpaRepository<Clients, Long> {
	// Spring Data helps making JpaRepository able to give us most of the useful data
}