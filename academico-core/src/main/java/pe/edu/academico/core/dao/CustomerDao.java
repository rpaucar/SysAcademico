package pe.edu.academico.core.dao;

import java.util.List;

import pe.edu.academico.core.domain.Customer;

/**
 * 
 * @author ocalsin
 * 
 */

public interface CustomerDao {

	List<Customer> findCustomerAll();

//	Customer findCustomerById(Long customerId);
//
//	void saveCustomer(Customer customer);
//
//	List<Customer> findCustomerByAllName(String allName);
//
//	void deleteCustomer(Customer customer);
	
}
