package com.fincare.upiprelogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fincare.upiprelogin.model.Request;
import com.fincare.upiprelogin.model.Response;



public interface UPIRepository extends JpaRepository<Request, Long>{

	public void saveAll(Response response);

}
