package francescaBattistini.springLezione3.entities;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Drinks extends DettagliMenu {


    public Drinks(String name, int calories, Double price) {
        super(name, calories, price);
    }

    @Override
    public void stampaDettaglicibo() {
        System.out.println("nome= " + getName());
        System.out.println("calorie =" + getCalories());
        System.out.println("prezzo=" + getPrice());
    }
}
