package francescaBattistini.springLezione3.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@ToString
@Component
public class Menu {
    private List<DettagliMenu> menu;

    public Menu() {
        this.menu = new ArrayList<>();
    }
    public void aggiungiDettagliMenu(DettagliMenu dettagli){
        this.menu.add(dettagli);// aggioungo tutte le info cioè nome, prezzo e calorie al menù
    }
     public void stampaMenu(){
         System.out.println(" ");
         System.out.println("MENU del giorno :");
         System.out.println(" ");
         for(DettagliMenu info: menu){
             info.stampaDettaglicibo();
             System.out.println("-----------------");
         }
     }
}
