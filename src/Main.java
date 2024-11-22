package src;

public class Main {

    public static void main(String[] args) {

        // QUESTÃO 4

        System.out.println("<<<<< QUESTÃO 4 >>>>>\n");

        Questao4 lampada = new Questao4("Philips", "LED", 220, 32, 1111,
        15);

        System.out.println(lampada.getPotencia());
        lampada.setPreco(17);
        System.out.println(lampada.getPreco());

        // QUESTÃO 13

        System.out.println("<<<<< QUESTÃO 13 >>>>>\n");

        Questao13 conta = new Questao13("João",  0, false);

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