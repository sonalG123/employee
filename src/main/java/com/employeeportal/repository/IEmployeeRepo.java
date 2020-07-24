package com.employeeportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.employeeportal.entity.Employee;

@Repository
public interface IEmployeeRepo extends CrudRepository<Employee, Integer>{
	
	@Query(value = "select * from employee e where empage between :minAge and :maxAge and empgender= :gender", nativeQuery =true)
	List<Employee> findEmployeeByGenderAge(@Param("minAge") int minAge,@Param("maxAge") int maxAge, @Param("gender") String gender);

}
