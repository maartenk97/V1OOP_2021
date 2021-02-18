package practica.practicum2a;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

;

class ZwembadTest {

    private Zwembad z;

    @BeforeEach
    public void Zwembad(){
        z = new Zwembad(5.0, 8.0, 3.0);
    }

    @Test
    public void testBerekendeInhoud(){
        z.inhoud();
        assertEquals(120, z.inhoud(), "De verwachte uitkomst klopt niet!" );
    }
}