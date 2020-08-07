package kr.fedev.todolist.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="TODOLIST")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id; // ID
    String contents; // 할일
}
