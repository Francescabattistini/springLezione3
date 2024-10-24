package francescaBattistini.springLezione3.entities;


import francescaBattistini.springLezione3.enums.StatoOrdine;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

/*LocalDateTime = rappresenta una data e un'ora (ad esempio, 23 ottobre 2024 alle 15:30:45).
LocalDate = rappresenta solo una data (ad esempio, 23 ottobre 2024), senza l'informazione relativa all'ora.*/

@Getter
@Setter
public class Ordine {
    private Tavolo tavolo; // L'ordine è associato a un tavolo
    private List<DettagliMenu> elementiMenu; // numero arbitrario di elementi menu
    private int numeroOrdine;
    private StatoOrdine statoOrdine;
    private int numeroCoperti;
    private LocalDateTime OraOrdine;
    private int costoCoperto;
// modifico il costrutto perchè così gli do dei valori predefiniti di partenza che poi cambierò in seguito.

    public Ordine(Tavolo tavolo, int numeroOrdine, int numeroCoperti,int costoCoperto) {
        this.tavolo = tavolo;
        this.elementiMenu = elementiMenu;
        this.numeroOrdine = numeroOrdine;
        this.statoOrdine = statoOrdine;
        this.numeroCoperti = numeroCoperti;
        this.OraOrdine = LocalDateTime.now();// Ottenere l'ora e la data corrente  che non ha fuso orario
        this.costoCoperto = costoCoperto; // lo prenderò dall'aplication.properties
        //ordine.setStatoOrdine(StatoOrdineType.PRONTO); per cambiarlo
    }

    // prendiamo ordine del tavolo
    public int getContoTavolo(){
        int totale = costoCoperto * numeroCoperti;
        for ( DettagliMenu portata : elementiMenu){
            totale += portata.getPrice();
        }
        return totale;
    }

    public void addportata(DettagliMenu portata){
        this.elementiMenu.add(portata);
    }

    public void stampaOrdine(){
        System.out.println("numero d'ordine: " +getNumeroOrdine());
        System.out.println("stato d'ordine: " +getStatoOrdine());
        System.out.println("numero coperti: " +getNumeroCoperti());
        System.out.println("ora: " + getOraOrdine());
        System.out.println(" Costo coperto: " +getCostoCoperto());
        System.out.println("Tavolo: " +getTavolo());
        System.out.println("Piatti ordinati: " );
        for (DettagliMenu portata : elementiMenu){
            System.out.println("-" + portata.getName() + " " + portata.getPrice() + "€");
        }
    }
     public void stampaConto(){
         System.out.println("il totale del vostro tavolo è : " + getContoTavolo()+ "€");

     }

}
