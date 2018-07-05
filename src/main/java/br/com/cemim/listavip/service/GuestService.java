package br.com.cemim.listavip.service;

import br.com.cemim.listavip.AppConfig;
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

    @Autowired
    private AppConfig app;

    public List<Guest> list() {
        return repository.findAll();
    }

    public Guest get(Long id) {
        Guest guest = repository.findById(id).orElse(null);
        logger.info("Got " + guest);
        return guest;
    }

    public Guest save(Guest guest) {
        repository.save(guest);
        logger.info("Saved " + guest);
        return guest;
    }

    public void delete(Long id) {
        repository.deleteById(id);
        logger.info("Deleted Guest of id " + id);
    }

}
