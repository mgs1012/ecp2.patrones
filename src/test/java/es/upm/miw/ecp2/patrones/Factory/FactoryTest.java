package es.upm.miw.ecp2.patrones.Factory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class FactoryTest {

    @Test
    public void testFactoryReferencesIsSingleton() {
        assertSame(Factory.getFactory(), Factory.getFactory());
    }
    
    @Test
    public void testFactoryReferencesSingletonNotNull() {
        assertNotNull(Factory.getFactory());
    }

    @Test
    public void testFactoryReferences() {
        assertEquals(0, Factory.getFactory().getReference("cero"));
        assertEquals(1, Factory.getFactory().getReference("uno"));
        Factory.getFactory().removeReference("cero");        
        assertEquals(2, Factory.getFactory().getReference("cero"));
    }
}
