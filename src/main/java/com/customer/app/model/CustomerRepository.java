package com.customer.app.model;

import com.customer.app.dto.Customerdto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customerdto,Integer>{
	

	
}
