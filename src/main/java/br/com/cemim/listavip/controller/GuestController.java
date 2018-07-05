package br.com.cemim.listavip.controller;

import java.util.List;

import br.com.cemim.listavip.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cemim.listavip.model.Guest;

@RestController
public class GuestController {

    @Autowired
    private GuestService service;

    @RequestMapping(path = "/guests", method = RequestMethod.GET)
    public List<Guest> list() {
        return service.list();
    }

    @RequestMapping(path = "/guests/{id}", method = RequestMethod.GET)
    public Guest get(@PathVariable Long id) {
        return service.get(id);
    }

    @RequestMapping(path = "/guests", method = RequestMethod.POST)
    public Guest save(@RequestBody Guest guest) {
        service.save(guest);
        return guest;
    }

    @RequestMapping(path = "/guests/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}
