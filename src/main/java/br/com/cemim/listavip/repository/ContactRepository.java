package br.com.cemim.listavip.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cemim.listavip.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
