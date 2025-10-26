package hu.nje.townsapp.repository;

import hu.nje.townsapp.model.Town;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TownRepository extends JpaRepository<Town, Long> {
}
