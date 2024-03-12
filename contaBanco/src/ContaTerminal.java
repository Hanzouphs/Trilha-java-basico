import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public void cadastrar() {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US); 
        System.out.println("Por favor, digite a agência, formato (xxx-x):");
        agencia = sc.nextLine();
        System.out.println("Por favor, digite o número da agência:");
        numero = sc.nextInt();
        System.out.println("Por favor, digite seu nome completo:");
        sc.nextLine();
        nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o valor que deseja depositar:");
        saldo = sc.nextDouble();

        sc.close();
    }

    public void messageCadastro(){
        cadastrar();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        ", conta " + numero + " e seu saldo " + saldo +" já está disponível para saque.");
    }
}
