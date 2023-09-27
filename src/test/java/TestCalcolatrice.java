import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalcolatrice {
    Calcolatrice c = new Calcolatrice();

    @Test
    public void Testsomma(){
        Assertions.assertEquals(4, c.somma(2, 2), "somma corretta");
    }
    public void Testmoltiplicazione(){
        Assertions.assertEquals(6, c.somma(3, 2), "moltiplicazione corretta");
    }
}
