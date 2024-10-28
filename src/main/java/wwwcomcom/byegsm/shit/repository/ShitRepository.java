package wwwcomcom.byegsm.shit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wwwcomcom.byegsm.shit.entity.Shit;

@Repository
public interface ShitRepository extends JpaRepository<Shit,Long> {
}
