package com.greenfox.filip5.repository;

import org.springframework.data.repository.CrudRepository;
import com.greenfox.filip5.models.Todo;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {

    @Override
    List<Todo> findAll();

    List<Todo> findAllByOrderByIdDesc();


    List<Todo> findAllByCompletedIsFalseOrderByIdDesc();

    List<Todo> findAllByCompletedIsTrueOrderByIdDesc();

    List<Todo> findAllByUrgentIsTrueAndCompletedIsFalseOrderByIdDesc();

    List<Todo> findAllByUrgentIsTrueOrderByIdDesc();

}
