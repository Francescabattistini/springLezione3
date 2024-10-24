package francescaBattistini.springLezione3.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "dettaglimenu")
public abstract class DettagliMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;
    protected String name;
    protected int calories;
    protected Double price;

    public DettagliMenu(String name, int calories, Double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    public abstract void stampaDettaglicibo();
}
