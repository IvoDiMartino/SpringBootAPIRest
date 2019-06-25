package com.softwarevision.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.softwarevision.model.Clients;
import com.softwarevision.repositories.ClientsRepository;

//Spring REST Service
@RestController
@RequestMapping("API/V1/Clients")
public class ClientsController<ClientID> {
	
	// Importing ClientsRepository to use CRUD methods
	@Autowired
	private ClientsRepository CR;
	
	// General View
	@GetMapping // http://localhost:8080/API/V1/Clients
	public List<Clients> Select() {
		return CR.findAll();
	}
	
	// Create Method
	@PostMapping("/create")
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Clients clients) {
		CR.save(clients);
	}
	
	// Read Method
	@GetMapping("/{ClientID}")
	public Clients get(@PathVariable("ClientID") long ClientID) {
		if (CR.existsById(ClientID)) {
			// If ClientID was found
			return CR.getOne(ClientID);
		} else {
			// if ClientID was not found
			return null;
		}
	}

	// Delete Method
	@DeleteMapping("/delete/{ClientID}")
	public String delete(@PathVariable long ClientID) {
		if (CR.existsById(ClientID)) {
			// If ClientID was found
				CR.deleteById(ClientID);
					return "Delete Successful.";
		} else {
			// If ClientID was not found
					return "Data not found or inexistent.";
		}
	}
}