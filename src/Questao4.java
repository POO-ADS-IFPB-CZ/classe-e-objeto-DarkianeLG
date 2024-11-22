package src;

public class Questao4 {

    private String marca;
    private String tipo;
    private float voltagem;
    private float potencia;
    private final int identificacao;
    private float preco;

    public Questao4(String marca, String tipo, float voltagem, float potencia,
            int identificacao, float preco) {

        this.marca = marca;
        this.tipo = tipo;
        this.voltagem = voltagem;
        this.potencia = potencia;
        this.identificacao = identificacao;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(float voltagem) {
        this.voltagem = voltagem;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
