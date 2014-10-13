package es.upm.miw.ecp2.patrones.Factory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class FactoryTest {
	
    @Test
    public void testFactoryReferencesIsSingleton() {
        assertSame(Factory.getInstance(), Factory.getInstance());
    }
    
    @Test
    public void testFactoryReferencesSingletonNotNull() {
        assertNotNull(Factory.getInstance());
    }

    @Test
    public void testFactoryReferences() {
        assertEquals(0, Factory.getInstance().getReference("cero"));
        assertEquals(1, Factory.getInstance().getReference("uno"));
        Factory.getInstance().removeReference("cero");        
        assertEquals(2, Factory.getInstance().getReference("cero"));
    }
}
