package francescaBattistini.springLezione3.entities;

import FrancescaBattistini.LezioneSpring2.enums.StatoTavolo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Tavolo {
    private int numerotavolo;
    private int numeroCoperti;
    private StatoTavolo statotavolo;


    private void stampaDettagli (){
        System.out.println("il numero del tavolo è :" + numerotavolo);
        System.out.println("il numero dei coperti  è :" + numeroCoperti);
        System.out.println("lo stato del tavolo è :" +statotavolo);
    }
}
