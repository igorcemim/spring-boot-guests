package br.com.cemim.listavip.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name="contact")
@ToString @Getter @Setter
public class Contact {

    @Id
    @GeneratedValue
    private Long id;

    private String type;

    private String data;

}
