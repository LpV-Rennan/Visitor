import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TarifadorEuropaTest {

    @Test
    public void deveRetornarImpostoCigarro(){
        Cigarro cigarro = new Cigarro(6f);
        TarifadorEuropa tarifador = new TarifadorEuropa();
        assertEquals(4.8f, tarifador.tarifar(cigarro)) ;
    }
    @Test
    public void deveRetornarImpostoBebida(){
        BebidaAlcolica bebidaAlcolica = new BebidaAlcolica(6f);
        TarifadorEuropa tarifador = new TarifadorEuropa();
        assertEquals(2.4f, tarifador.tarifar(bebidaAlcolica)) ;
    }
    @Test
    public void deveRetornarImpostoAlimento(){
        Alimento alimento = new Alimento(6f);
        TarifadorEuropa tarifador = new TarifadorEuropa();
        assertEquals(0f, tarifador.tarifar(alimento)) ;
    }

}