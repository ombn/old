package com.om.hibernate.dto.onetotone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="account_table")
public class AccountDTO {
	@Id
	@GenericGenerator(name="anyThing",strategy="increment")
	@GeneratedValue(generator="anyThing")
	@Column(name="acc_id")
	private Integer aid;
	@Column(name="acc_type")
	private String type;
	@Column(name="acc_no")
	private Long accountNo;
	@Column(name="acc_ifsc")
	private String ifsc;	
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private CreditCardDTO creditCardDTO;

	public AccountDTO() {
		System.out.println(this.getClass().getSimpleName() + "Created...");
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public CreditCardDTO getCreditCardDTO() {
		return creditCardDTO;
	}

	public void setCreditCardDTO(CreditCardDTO creditCardDTO) {
		this.creditCardDTO = creditCardDTO;
	}

}
