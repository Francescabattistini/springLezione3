package francescaBattistini.springLezione3;


import francescaBattistini.springLezione3.entities.*;
import francescaBattistini.springLezione3.enums.StatoTavolo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration//essenziale per creare i beans
@PropertySource("application.properties")
public class AppConfing {
    // Beans TOPPINGS
    @Bean
    public Toppings formaggio(){
        return new Toppings("mozzarella",102, 1.0);
    }
    @Bean
    public Toppings sugo(){
        return new Toppings("Sugo",104, 2.0);
    } @Bean
    public Toppings prosciutto(){
        return new Toppings("prosciutto",202, 3.0);
    } @Bean
    public Toppings ananas(){
        return new Toppings("ananas",50, 1.0);
    }



// Beans pizze
    @Bean
    public Pizzas margherita(){
        Pizzas pizzaMargherita = new Pizzas("Margherita",140,10.0);
        pizzaMargherita.addToppings(formaggio());
        pizzaMargherita.addToppings(sugo());
        return pizzaMargherita;
    }
    public Pizzas Hawai(){
        Pizzas pizzaHawai = new Pizzas("Hawai",205,13.0);
        pizzaHawai.addToppings(formaggio());
        pizzaHawai.addToppings(sugo());
        pizzaHawai.addToppings(ananas());
        return pizzaHawai;
    }
    //beats Drinks
    @Bean
    public Drinks cocacola(){
        return new Drinks("Coca cola",102,3.0);
    }
    @Bean
    public Drinks birra(){
        return new Drinks("birra",200,5.0);
    }
    @Bean
    public Drinks acqua(){
        return new Drinks("Aqua",0,2.5);
    }

    @Bean
    public Menu menu(){
      Menu menu = new Menu();
      menu.aggiungiDettagliMenu(margherita());
      menu.aggiungiDettagliMenu(Hawai());
      menu.aggiungiDettagliMenu(sugo());
      menu.aggiungiDettagliMenu(prosciutto());
      menu.aggiungiDettagliMenu(ananas());
      menu.aggiungiDettagliMenu(acqua());
      menu.aggiungiDettagliMenu(cocacola());
      menu.aggiungiDettagliMenu(birra());
      return menu;
    }
    @Bean
    public String PrezzoCoperto(@Value("$ {costo.coperto}")String costoCoperto) {return costoCoperto;}
@Bean
    public Tavolo tavolo(){return new Tavolo(2,3, StatoTavolo.LIBERO);}
@Bean
    public Ordine ordine1 ( @Value("${costo.coperto}")Double costoCoperto ){
        Ordine ordine = new Ordine(12,120,1, tavolo());
        Pizzas margheritaConProsciutto = margherita();
        ordine.addportata(margheritaConProsciutto);
        margheritaConProsciutto.addToppings(prosciutto());
        ordine.addportata(Hawai());
        ordine.addportata(acqua());
        ordine.addportata(cocacola());
        ordine.getContoTavolo();
                return ordine;
}

}
