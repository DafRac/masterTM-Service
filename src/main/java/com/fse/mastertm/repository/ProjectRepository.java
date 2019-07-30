package com.fse.mastertm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fse.mastertm.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
