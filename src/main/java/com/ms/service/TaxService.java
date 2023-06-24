package com.ms.service;

import org.springframework.stereotype.Service;

import com.ms.model.TaxModel;

@Service
public class TaxService {
	public void computeTax(TaxModel taxModel) {
		int income=taxModel.getIncome();
		int age=taxModel.getAge();
		int tax=0;
		int rebate=0;
		int netTax=0;
		if(income>=500000) {
			tax=income*20/100;
		}else {
			tax=income*10/100;
		}
		if(age>=60) {
			rebate=tax*20/100;
		}
		netTax=tax-rebate;
		taxModel.setTax(tax);
		taxModel.setRebate(rebate);
		taxModel.setNetTax(netTax);
	}
}
