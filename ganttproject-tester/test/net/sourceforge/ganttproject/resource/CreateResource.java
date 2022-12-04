package net.sourceforge.ganttproject.resource;
import net.sf.mpxj.ganttproject.schema.Role;
import net.sourceforge.ganttproject.CustomPropertyManager;
import net.sourceforge.ganttproject.roles.*;
import net.sourceforge.ganttproject.task.CustomColumnsManager;
import org.junit.jupiter.api.Test;
import net.sourceforge.ganttproject.roles.RoleImpl;
import junit.framework.TestCase;
//import net.sourceforge.ganttproject.roles;

import junit.framework.TestCase;

import java.math.BigDecimal;
import java.util.ArrayList;

public class CreateResource {
    // teste que falha uma vez que o recurso tem o mesmo nome e as mesmas funcoes indefinidas
    @Test
    void createResource() {
        HumanResource resource1 = new HumanResource("Nadia",2,null );
        HumanResource resource2 = new HumanResource("Nadia",2,null );
        assert(!resource1.getName().equals(resource2.getName()) && !resource1.getRole().equals(resource2.getRole()));
    }

    // testa que nao cria o recurso uma vez que o seus nomes sao diferentes neste caso as suas funcoes podem ser iguais ou distintas
    @Test
    void createResource2() {
        HumanResource resource1 = new HumanResource("Nadia",2,null );
        HumanResource resource2 = new HumanResource("Joao",2,null );
        assert(!resource1.getName().equals(resource2.getName()) && !resource1.getRole().equals(resource2.getRole()));
    }
    // testa que cria o recurso uma vez que o seus nomes sao diferentes e as suas funcoes tambem
    @Test
    void createResource3() {
        HumanResource resource1 = new HumanResource("Nadia",2,null );
        HumanResource resource2 = new HumanResource("Jose",2,null );
        assert( !resource1.getName().equals(resource2.getName()) && !resource1.getRole().equals(resource2.getRole()));
    }
}
