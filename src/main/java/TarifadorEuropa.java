public class TarifadorEuropa implements Tarifador{

    public float tarifar(Produto produto){
        return produto.aceitar(this);
    }

    @Override
    public float tarifarCigarro(Cigarro cigarro) {
        return cigarro.getValor() * 0.8f;
    }

    @Override
    public float tarifarAlimento(Alimento alimento) {
        return alimento.getValor() * 0f;
    }

    @Override
    public float tarifarBebidaAlcolica(BebidaAlcolica bebidaAlcolica) {
        return bebidaAlcolica.getValor()*0.4f;
    }
}
