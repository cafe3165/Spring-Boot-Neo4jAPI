package com.appleyk.Repository;


import org.springframework.data.neo4j.repository.GraphRepository;
 
import com.appleyk.nodeentity.Cat;
 
public interface CatReponsitory extends GraphRepository<Cat>{
 
}
