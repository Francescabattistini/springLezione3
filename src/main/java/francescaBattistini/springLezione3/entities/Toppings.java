package francescaBattistini.springLezione3.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Toppings extends DettagliMenu {
@ManyToMany(mappedBy = "toppings")  // con pizza
private List<Pizzas> pizzas = new ArrayList<>();

    public Toppings(String name, int calories, Double price) {
        super(name, calories, price);
    }

    @Override
    public void stampaDettaglicibo() {
        System.out.println(" I topping sono  ");
        System.out.println("name = " + getName());
        System.out.println("Calories = " + getCalories());
        System.out.println("Price = " + getPrice());
    }
}
