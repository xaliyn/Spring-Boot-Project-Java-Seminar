package hu.nje.townsapp.repository;

import hu.nje.townsapp.model.Population;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PopulationRepository extends JpaRepository<Population, Long> {
}
