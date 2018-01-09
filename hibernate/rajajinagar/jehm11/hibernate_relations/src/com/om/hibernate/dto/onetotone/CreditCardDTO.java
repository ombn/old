package com.om.hibernate.dto.onetotone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="credit_table")
public class CreditCardDTO {
	@Id
	@GenericGenerator(name="anyThing",strategy="increment")
	@GeneratedValue(generator="anyThing")
	@Column(name="cc_id")
	private Integer cid;
	@Column(name="cc_bank_name")
	private String bankName;
	@Column(name="cc_card_no")
	private Long cardNo;
	@Column(name="cc_cvv")
	private Integer cvv;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="acc_id")
	private AccountDTO accountDTO;

	public CreditCardDTO() {
		System.out.println(this.getClass().getSimpleName() + "Created...");
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Long getCardNo() {
		return cardNo;
	}

	public void setCardNo(Long cardNo) {
		this.cardNo = cardNo;
	}

	public Integer getCvv() {
		return cvv;
	}

	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}

	public AccountDTO getAccountDTO() {
		return accountDTO;
	}

	public void setAccountDTO(AccountDTO accountDTO) {
		this.accountDTO = accountDTO;
	}

}
