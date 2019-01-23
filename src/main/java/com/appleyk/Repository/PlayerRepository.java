package com.appleyk.Repository;



import org.springframework.data.neo4j.repository.GraphRepository;
 
import com.appleyk.nodeentity.Player;
 
public interface PlayerRepository extends GraphRepository<Player>{
 
}
