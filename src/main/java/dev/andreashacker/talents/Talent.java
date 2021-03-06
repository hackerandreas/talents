package dev.andreashacker.talents;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Talent {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
