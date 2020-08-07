package kr.fedev.todolist.Controller;

import kr.fedev.todolist.DAO.TodoDAO;
import kr.fedev.todolist.VO.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoDAO todoDAO;

    @RequestMapping("/todo")
    public List<Todo> getTodoList() {
        return todoDAO.findAll();
    }

    @RequestMapping("/todo/{id}")
    public Todo getTodoById(@PathVariable("id") int id) {
        return todoDAO.findById(id).get();
    }

    @RequestMapping("/todo/add")
    public Todo addTodo(Todo Todo) {
        todoDAO.save(Todo);
        return Todo;
    }
}