package repository;

import model.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {

    @Query("SELECT m.player1Id FROM Match m WHERE m.id = :matchId")
    Long getPlayer1IdbyMatchId(Long matchId);

}