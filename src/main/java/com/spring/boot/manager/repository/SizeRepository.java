package com.spring.boot.manager.repository;

import com.spring.boot.manager.entity.Product;
import com.spring.boot.manager.entity.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryDefinition(domainClass = Size.class, idClass = Integer.class)
public interface SizeRepository extends JpaRepository<Size, Integer>, JpaSpecificationExecutor {

}