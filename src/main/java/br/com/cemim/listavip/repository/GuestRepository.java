package br.com.cemim.listavip.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cemim.listavip.model.Guest;

public interface GuestRepository extends JpaRepository<Guest, Long> {

}
