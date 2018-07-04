package br.com.cemim.listavip;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cemim.listavip.model.Guest;
import br.com.cemim.listavip.repository.GuestRepository;

@RestController
public class GuestController {

    @Autowired
    private GuestRepository repository;

    @RequestMapping(path = "/guests", method = RequestMethod.GET)
    public List<Guest> list() {
        return repository.findAll();
    }

    @RequestMapping(path = "/guests/{id}", method = RequestMethod.GET)
    public Guest get(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @RequestMapping(path = "/guests", method = RequestMethod.POST)
    public Guest save(@RequestBody Guest guest) {
        repository.save(guest);
        return guest;
    }

    @RequestMapping(path = "/guests/{id}", method = RequestMethod.DELETE)
    public void save(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
