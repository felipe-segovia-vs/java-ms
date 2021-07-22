package com.valposystems.javams.repository;

import com.valposystems.javams.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {
}