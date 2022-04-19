package com.project.management.dao;

import com.project.management.model.User;
import com.project.management.model.UserRoleMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRoleMappingRepository extends JpaRepository<UserRoleMapping,String> {

	List<UserRoleMapping> findByUser_Id(String id);

}
