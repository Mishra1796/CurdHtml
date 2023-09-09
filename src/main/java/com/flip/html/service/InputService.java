package com.flip.html.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flip.html.entity.InputEntity;
import com.flip.html.model.InputDTO;
import com.flip.html.repo.InputRepo;

@Service
public class InputService {
	@Autowired
	InputRepo repo;
	
	public String saveOrder(InputDTO order) {
		try {
		  InputEntity entity = new InputEntity();
		  entity.setAmount(order.getAmount());
		  entity.setOrderProduct(order.getOrderProduct());
		  entity.setTransactionDate(order.getTimeStamp());
		  entity.setEmail(order.getEmail());
		  InputEntity saveRecord = repo.save(entity);
		  if(saveRecord!=null) {
			  System.out.println(saveRecord);
			  return "Data saved";
		  }
		  return "Failed";
		}catch(Exception ex) {
			  ex.printStackTrace();
			  return "Exception Occured";
		  }
	}
}
