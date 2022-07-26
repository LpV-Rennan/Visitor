public class Cigarro implements Produto{
    private float valor;

    public float getValor() {
        return this.valor;
    }

    public Cigarro(float valor) {
        this.valor = valor;
    }

    @Override
    public float aceitar(Tarifador tarifador) {
        return tarifador.tarifarCigarro(this);
    }


}
