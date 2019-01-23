import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.appleyk.Repository.CatReponsitory;
import com.appleyk.nodeentity.Cat;
public class test {
	@Autowired
	     private CatReponsitory catRepository;
	  
	     @Test
	     public void testCRUDCat() {
	        Cat cat = new Cat();
	       cat = catRepository.save(cat);
	       
	       assertNotNull(cat);
	       assertNotNull(cat.getId());
	 
	      Long catId = cat.getId();
	       catRepository.delete(cat);
	      cat = catRepository.findOne(catId);
	       assertNull(cat);
	   }
}
