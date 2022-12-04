package net.sourceforge.ganttproject.resource;
import org.junit.jupiter.api.Test;

public class TesteFunc1CreateResourceName {
    // teste que falha  porque o recurso nao tem nome atribuido pelo manager
    @Test
    void createResourceTesting() {
        HumanResource resource = new HumanResource("",2,null );
        assert(!resource.getName().equals(""));
    }

    // teste que nao falha porque o recurso tem nome atribuido pelo manager
    @Test
    void createResourceTesting1() {
        HumanResource resource = new HumanResource("Nadia",2,null );
        assert(!resource.getName().equals(""));
    }
}
