import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalcolatrice {
    Calcolatrice c;

    @Before
    public final void setUp(){
        c = new Calcolatrice();
    }
    @Test
    public void Testsomma(){
        Assertions.assertTrue( c.somma(2, 2) ==4, "somma corretta");
    }
    @Test
    public void Testmoltiplicazione(){
        Assertions.assertTrue( c.moltiplicazione(3, 2)==6, "moltiplicazione corretta");
    }

    @Test
    public void TestSottrazione(){
        Assertions.assertTrue(c.sottrazione(5, 3)==2, "sottrazione corretta");
    }

    @Test
    public void TestDivisione(){
        Assertions.assertTrue(c.divisione(10, 2)==5, "divisione corretta");
    }

    @Test
    public void TestDivisionePerZero(){
        Assertions.assertTrue(c.divisione(10, 0)==0, "divisione corretta");
    }
}
