package todo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
public class todorepository extends JpaRepository<todo,Integer>{
	public List<Todo> findByUsername(String username);

}
