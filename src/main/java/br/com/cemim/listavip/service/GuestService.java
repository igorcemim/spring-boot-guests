package br.com.cemim.listavip.service;

import br.com.cemim.listavip.exception.ResourceNotFoundException;
import br.com.cemim.listavip.model.Guest;
import br.com.cemim.listavip.repository.GuestRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {

    private static final Logger logger = LoggerFactory.getLogger(GuestService.class);

    @Autowired
    private GuestRepository repository;

    public List<Guest> list() {
        return repository.findAll();
    }

    public Guest get(Long id) {
        Guest guest = repository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException());
        logger.info("Got " + guest);
        return guest;
    }

    public Guest create(Guest guest) {
        repository.save(guest);
        logger.info("Created " + guest);
        return guest;
    }

    public Guest update(Long id, Guest guest) {
        guest = repository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException());
        repository.save(guest);
        logger.info("Updated " + guest);
        return guest;
    }

    public void delete(Long id) {
        Guest guest = repository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException());
        repository.delete(guest);
        logger.info("Deleted " + guest);
    }

}
