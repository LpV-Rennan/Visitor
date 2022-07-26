public class BebidaAlcolica implements Produto{

    private float valor;

    public BebidaAlcolica(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public float aceitar(Tarifador tarifador) {
        return tarifador.tarifarBebidaAlcolica(this);
    }
}
