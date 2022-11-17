package com.xworkz.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.entity.Bank;
@Repository
public class BankDaoImpl implements BankDAO{
	@Autowired
	private EntityManagerFactory factory;
	private EntityManager manager=null;
	
	@Override
	public Bank saveBank(Bank bank) {
		boolean isBankSaved = false;
		try {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(bank);
			transaction.commit();
			System.out.println("Bank saved");
			isBankSaved = true;
			//manager.close();
			//factory.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return isBankSaved? bank:null;
	}
	
	
		public Bank findByBranchName(String branchName) {
			Bank bank=null;
			
		try {
			 manager = factory.createEntityManager();
			Query query= manager.createQuery("Select s from Bank s where s.branchName=:branchName");
				query.setParameter("branchName", branchName);
				 bank=  (Bank) query.getSingleResult();
				System.out.println("Branch name" + bank.toString());
			} 
			catch (Exception e) {
				e.printStackTrace();		
			}finally {
			//	manager.close();
			}
			return bank;
		}


	@Override
	public Bank updateBankAddressByBankName(String bankName, String address) {
		System.out.println("----Update Bank Address by BankName--@BankDAHOImpl--");
		String updateJpql = "uppdate bank b set b.address=:address where b.bankName=:bankName";
		try {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			
			Query query = manager.createQuery(updateJpql);
			query.setParameter("bankName", bankName);
			query.setParameter("address", address);
			query.executeUpdate();
			transaction.commit();
			System.out.println("Address updated Successfully-----@BankDAOIMPL--");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
		return null;
	}


	@Override
	public Bank deleteBankDetailsByBankName(String BankName) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
