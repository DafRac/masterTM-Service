package com.fse.mastertm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fse.mastertm.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
}
