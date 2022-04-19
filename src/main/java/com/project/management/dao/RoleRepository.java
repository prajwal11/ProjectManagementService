package com.project.management.dao;

import com.project.management.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,String> {

	Role findByIdAndIsDeleted(String id, boolean b);
}
