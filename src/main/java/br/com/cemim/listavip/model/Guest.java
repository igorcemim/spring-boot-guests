package br.com.cemim.listavip.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name="guest")
@ToString @Getter @Setter
public class Guest {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(targetEntity = Contact.class, cascade={CascadeType.ALL})
    private List<Contact> contacts;

}
