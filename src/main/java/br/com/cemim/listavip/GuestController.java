package br.com.cemim.listavip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cemim.listavip.model.Guest;
import br.com.cemim.listavip.repository.GuestRepository;

@Controller
public class GuestController {

    @Autowired
    private GuestRepository repository;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/guest-list")
    public String list(Model model) {

        Iterable<Guest> guests = repository.findAll();
        model.addAttribute("guests", guests);

        return "guest-list";
    }

}
