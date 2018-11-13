package com.greenfox.filip5.repository;

import org.springframework.data.repository.CrudRepository;
import com.greenfox.filip5.models.Todo;

public interface TodoRepository extends CrudRepository<Todo, Long> {



}
