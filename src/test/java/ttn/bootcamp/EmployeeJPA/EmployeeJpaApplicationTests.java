package ttn.bootcamp.EmployeeJPA;

import java.util.List;

//import java.awt.print.Pageable;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

@SpringBootTest
class EmployeeJpaApplicationTests {	
	@Autowired
	EmployeeRepository repo;
	
	@Test
	void create() {
		
		Employee emp=new Employee("Amit",4,30,"UP");		
		repo.save(emp);
		System.out.println("***************Employee Created********************");

	}
	@Test
	void update() {
		Employee emp=new Employee("Gaurav",2,23,"Delhi");		
		repo.save(emp);
		System.out.println("***************Employee Updated********************");
	}
	
	@Test
	void updateById() {
		Employee emp=repo.findById(1).get();		
		emp.setName("Kanika");
		repo.save(emp);
		System.out.println("***************Employee Updated********************");
	}
	
	@Test
	void delete() {
		repo.deleteById(2);
		System.out.println("***************Employee Deleted********************");
	}

	@Test
	void read() {
		repo.findAll().forEach(p->System.out.println("Name : "+p.getName()+" Age : "+p.getAge()+" Id : "+p.getId()+" Location : "+p.getLocation()));
	}
	
	@Test
	void getCount() {
		long count = repo.count();
		System.out.println("Total numbers of records in table are : "+count);
	}

	
	@Test
	void pagingAndSorting() {

		PageRequest pagerequest =PageRequest.of(0, 4, Sort.DEFAULT_DIRECTION,"age");
		repo.findAll(pagerequest).forEach(p->System.out.println("Name : "+p.getName()+" Age : "+p.getAge()+" Id : "+p.getId()+" Location : "+p.getLocation()));
	}
	
	@Test
	void findEmpByName() {
		repo.findByName("Gaurav").forEach(p->System.out.println("NAME : "+p.getName()+" AGE : "+p.getAge()+" ID : "+p.getId()+" LOCATION : "+p.getLocation()));;
	}
	
	@Test 
	void findEmpStartingByAll() {
		repo.findByNameLike("A%").forEach(p->System.out.println(" ID : "+p.getId()+" AGE : "+p.getAge()+"	NAME : "+p.getName()));
	}
	
	@Test
	void findEmpByAgeBetween() {
		repo.findByAgeBetween(28, 32).forEach(p->System.out.println(" ID : "+p.getId()+" AGE : "+p.getAge()+"	NAME : "+p.getName()));
		
		
	}
	
	
	
	
}
