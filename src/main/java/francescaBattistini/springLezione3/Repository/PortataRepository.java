package francescaBattistini.springLezione3.Repository;

import francescaBattistini.springLezione3.entities.DettagliMenu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PortataRepository extends JpaRepository<DettagliMenu, Long> {
// Estendendo JpaRepository ottengo tutti i metodi CRUD già pronti, cioè non dovrò neanche implementarli
    // Eventualmente posso aggiungere ulteriori metodi personalizzati per fare operazioni non CRUD
    // Nelle parentesi angolari dovrò inserire <Classe dell'entità, Tipo dell'id di quell'entità>
    List<DettagliMenu> findbyId (Long id);


}
