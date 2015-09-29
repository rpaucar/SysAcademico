package pe.edu.academico.core.dao;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author ocalin
 *
 */

public class CustomerDaoImplTest extends AbstractUnitTest {

	@Autowired
	protected CustomerDao customerDao;

	public void testCustomerList() {
		System.out.println("::::: " + customerDao.findCustomerAll());
		logger.info("::::::::: size :::::::: " + customerDao.findCustomerAll());
	}

//	public void test() {
//		List<Customer> list = customerDao.findCustomerByAllName("pe");
//		assertNotNull(list);
//
//	}

}
