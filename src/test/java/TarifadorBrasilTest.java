import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TarifadorBrasilTest {

    @Test
    public void deveRetornarImpostoCigarro(){
        Cigarro cigarro = new Cigarro(6f);
        TarifadorBrasil tarifador = new TarifadorBrasil();
        assertEquals(4.2f, tarifador.tarifar(cigarro)) ;
    }
    @Test
    public void deveRetornarImpostoBebida(){
        BebidaAlcolica bebidaAlcolica = new BebidaAlcolica(6f);
        TarifadorBrasil tarifador = new TarifadorBrasil();
        assertEquals(3f, tarifador.tarifar(bebidaAlcolica)) ;
    }
    @Test
    public void deveRetornarImpostoAlimento(){
        Alimento alimento = new Alimento(6f);
        TarifadorBrasil tarifador = new TarifadorBrasil();
        assertEquals(0.012f, tarifador.tarifar(alimento)) ;
    }

}