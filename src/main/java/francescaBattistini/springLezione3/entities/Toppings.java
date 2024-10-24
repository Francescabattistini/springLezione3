package francescaBattistini.springLezione3.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Toppings extends DettagliMenu {


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
