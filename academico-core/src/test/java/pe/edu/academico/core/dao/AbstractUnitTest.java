package pe.edu.academico.core.dao;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

public class AbstractUnitTest extends AbstractTransactionalDataSourceSpringContextTests {

    @Override
    protected String[] getConfigLocations() {
        setPopulateProtectedVariables(true);
        setAutowireMode(AUTOWIRE_BY_TYPE);
        return new String[] {
                "pe/edu/academico/core/config/applicationContext-config.xml",
                "pe/edu/academico/core/config/applicationContext-dao.xml"
                };
    }

    public void testApp() {
        assertTrue(true);
    }

}
