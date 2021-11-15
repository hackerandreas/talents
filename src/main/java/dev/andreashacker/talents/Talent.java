package dev.andreashacker.talents;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class Talent {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
}
