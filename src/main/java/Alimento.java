public class Alimento implements Produto{

    private float valor;

    public Alimento(float valor) {
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
        return tarifador.tarifarAlimento(this);
    }
}
