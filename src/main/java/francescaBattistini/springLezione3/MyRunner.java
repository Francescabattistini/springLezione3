package francescaBattistini.springLezione3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// i runner per esistere devono
//1. essere @component
//2. implementare l'interfaccia e il suo metodo

// mettendo Component crea un oggetto(il bean) di tipo myRunner( nello scatolone ci sarà l'oggetto MyRunner)
// E' come se fosse un altro main, però aggisce prima del MAin ma senza component non fa niente, serve sempre il Component
// *******SI POSSONO UTILIZZARE COME SETUP INIZIALE DELL'APPLICAZIONE  COME AD ESEMPIO DATI NEL DATABASE  *****


@Component// fa eseguire prima del Min il runner
public class MyRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {// metodo di default
        System.out.println("CIAO DAL RUNNER");

    }
}
