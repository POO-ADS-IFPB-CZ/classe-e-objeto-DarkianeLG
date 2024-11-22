package src;
public class Main {

    public static void main(String[] args) {

        Questao13 conta = new Questao13("João", 0,
                false);

        System.out.println("Dados inicias: \n");
        conta.dados();

        conta.deposito(500);
        System.out.println("\nDeposito realizado com sucesso.");

        if (conta.transfere(100)) {
            System.out.println("\nTranferência realizada com sucesso.");
        } else {
            System.out.println("\nSaldo insuficiente.");
        }

        conta.retirar(100);
        System.out.println("\nSaque realizado com sucesso.");

        System.out.println("\nDados finais:\n");
        conta.dados();
    }
}