package src;
public class Questao13 {

    private String nomeDoCorrentista;
    private float saldo;
    private boolean contaEhEspecial;

    public Questao13(String nomeDoCorrentista, float saldo, boolean contaEhEspecial) {
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.contaEhEspecial = false;
        saldo = 0;
    }

    public void deposito(float valor) {
        this.saldo += valor;
    }

    public boolean retirar(float valor) {
        if (contaEhEspecial == false) {
            if (valor <= saldo) {
                saldo = saldo - valor;
                return true;
            } else
                return false;
        } else {
            saldo = saldo - valor;
            return true;
        }
    }

    public boolean transfere(float valor) {
        if (retirar(valor)) {
            return true;
        }
        return false;
    }

    public void dados() {
        System.out.println("O nome do correntista é " + nomeDoCorrentista);
        System.out.println("Seu saldo é de " + saldo + " reais.");
        if (contaEhEspecial) {
            System.out.println("Sua conta é especial.");
        } else {
            System.out.println("Sua conta é comum.");
        }
    }
}