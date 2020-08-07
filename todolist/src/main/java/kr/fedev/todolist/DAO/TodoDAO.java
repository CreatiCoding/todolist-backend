package kr.fedev.todolist.DAO;

import kr.fedev.todolist.VO.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoDAO  extends JpaRepository<Todo, Integer> {

}
