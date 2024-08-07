import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);



        System.out.println("Olá! Somos o DevBank venha criar sua conta!");
        System.out.println("Vamos Começar ? digite S para SIM e N para NÃO");
        
        String createAcount = scanner.next().toLowerCase();

        if(createAcount.equals("s")) {

            //Solicitar número da conta
            System.out.println("Digite o número da conta!");
            int numero = scanner.nextInt();


            //Solicitar número da Agência
            System.out.println("Agora digite o número da agência no formato 067-8");
            String agencia = scanner.next();



            //Solicitar nome do cliente
            System.out.println("Digite seu Nome!");
            String nomeCliente = scanner.next(); 

            //Solicitar sobrenome do cliente
            System.out.println("Digite seu Sobrenome!");
            String sobrenomeCliente = scanner.next(); 



            //Solicitar Saldo da conta
            System.out.println("Digite o saldo a ser depositado inicialmente!");
            double saldo = scanner.nextDouble();


            System.out.println(" ");
            System.out.println("Olá " + nomeCliente.concat(" " + sobrenomeCliente) + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");
            System.out.println(" ");
            System.out.println("Obrigado por se tornar nosso cliente!!!");

        } else {
            System.out.println("Que pena, adorariamos ter você como cliente.");     
        }

    
    }
}
