package br.com.cemim.listavip.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.cemim.listavip.model.Guest;

public interface GuestRepository extends CrudRepository<Guest, Long> {

}
