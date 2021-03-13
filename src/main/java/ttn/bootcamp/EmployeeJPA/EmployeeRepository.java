package ttn.bootcamp.EmployeeJPA;

//import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Pageable;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

//import antlr.collections.List;


public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
	
	List<Employee> findAll();
	
	List<Employee> findByName(String name);
	
	List<Employee> findAllByAge(int age);
	
	List <Employee> findByNameLike(String a); 
	
	List<Employee> findByAgeBetween(int a,int b);


}
