import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);    

        System.out.println("Por favor, digite o Número:");
        int numero = Integer.parseInt(sc.nextLine());

        System.out.println("Por favor, digite a Agência:");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o Nome do Cliente:");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o Saldo:");
        Double saldo = sc.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é"+ agencia +", conta "+ Integer.toString(numero) +" e seu saldo "+ Double.toString(saldo) +" já está disponível para saque.");
        sc.close();
    }
}
