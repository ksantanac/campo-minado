import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Teste {

    @Test
    public void veriricarJunit(){

        int a = 1 + 1;

        assertEquals(2, a);
    }

    @Test
    void testarSeIgualTres() {
        int x = 2 + 10 - 9;

        assertEquals(3, x);
    }
}
