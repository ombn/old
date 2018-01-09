package com.om.hibernate.util;

import com.om.hibernate.dao.AccountDAO;
import com.om.hibernate.dto.onetotone.AccountDTO;
import com.om.hibernate.dto.onetotone.CreditCardDTO;

public class OneToOneTester {

	public static void main(String[] args) {

		// Create a account and init all prop's
		// Create a credit card and init all prop's
		// relate/ref account with credit card --BI direction

		AccountDTO accountDTO = new AccountDTO();
		accountDTO.setAccountNo(23876L);
		accountDTO.setIfsc("CITI00001");
		accountDTO.setType("Current");

		CreditCardDTO cardDTO = new CreditCardDTO();
		cardDTO.setBankName("CITI");
		cardDTO.setCardNo(4386l);
		cardDTO.setCvv(123);

		accountDTO.setCreditCardDTO(cardDTO);
		cardDTO.setAccountDTO(accountDTO);
		
		
		AccountDAO accountDAO=new AccountDAO();
		//accountDAO.save(accountDTO);
		
		accountDAO.fetchById(1);
		

	}

}
