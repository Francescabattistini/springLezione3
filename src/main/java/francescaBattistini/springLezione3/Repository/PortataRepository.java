package francescaBattistini.springLezione3.Repository;

import francescaBattistini.springLezione3.entities.DettagliMenu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortataRepository extends JpaRepository<DettagliMenu, Long> {


    
}
