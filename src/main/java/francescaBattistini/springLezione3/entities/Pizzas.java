package francescaBattistini.springLezione3.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Pizzas extends DettagliMenu {
    @ManyToMany//con toppings
    @JoinTable(name = "pizza", joinColumns = @JoinColumn(name = "pizza-id"),
    inverseJoinColumns = @JoinColumn(name = "toppings_id"))

    private List<Toppings> toppings;

    public Pizzas(String name, int calories, Double price) {
        super(name, calories, price);
        this.toppings = new ArrayList<>();// è []
    }

    public void addToppings(Toppings top){ //aggiungo i Topping alla pizza  quando richiamato
        this.toppings.add(top);
    }

    public Double getPrice(){
        Double totalePrezzo= this.price;
        for (Toppings toppings : toppings){
            totalePrezzo+= toppings.getPrice();
        }
        return totalePrezzo;

    }

    @Override
    public void stampaDettaglicibo() {
        System.out.println("La pizza " + getName());
        System.out.println("La pizza " + getCalories());
        System.out.println("La pizza " + getPrice());
        System.out.println("il topping è: ");
        for (Toppings toppings:toppings){
            System.out.println(" - " + toppings.getName());
        }
    }
}
