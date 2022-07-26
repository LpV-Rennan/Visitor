public class TarifadorBrasil implements Tarifador{

    float tarifar(Produto produto){
        return produto.aceitar(this);
    }

    @Override
    public float tarifarCigarro(Cigarro cigarro) {
        return cigarro.getValor() * 0.7f;
    }

    @Override
    public float tarifarAlimento(Alimento alimento) {
        return alimento.getValor() * 0.002f;
    }

    @Override
    public float tarifarBebidaAlcolica(BebidaAlcolica bebidaAlcolica) {
        return bebidaAlcolica.getValor()*0.5f;
    }
}
