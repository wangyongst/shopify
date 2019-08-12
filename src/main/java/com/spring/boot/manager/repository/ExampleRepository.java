package com.spring.boot.manager.repository;

import com.spring.boot.manager.entity.Carturl;
import com.spring.boot.manager.entity.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryDefinition(domainClass = Example.class, idClass = Integer.class)
public interface ExampleRepository extends JpaRepository<Example, Integer>, JpaSpecificationExecutor {

}