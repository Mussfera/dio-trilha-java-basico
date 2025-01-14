import java.util.Locale;
import java.util.Scanner;

import javax.tools.SimpleJavaFileObject;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //TODO: conhecer e importar a classe escanner

        //Exibir as mensagens para o nosso usuario

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
        
        System.out.println("Olá, qual seu nome? ");
        String nome = scanner.next();

        System.out.println("Dígite a sua agência: ");
        String agência = scanner.next();

        System.out.println("Dígite a sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Dígite a seu saldo: ");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agência + " conta: " + conta + " e seu saldo é de " + saldo + " já está disponivel para saque "  );

        


        

      

      

    }
}
