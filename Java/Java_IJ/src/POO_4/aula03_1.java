/*
Pessoa:
nome: String
sobrenome: String
+getNome(): String
+setNome(value: String)
+getSobrenome(): String
+setSobrenome(value: String)
+getNomeCompleto(): String
 */

package POO_4;
import java.util.Scanner;
public class aula03_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        System.out.println("SISTEMA PENITENCIÁRIO");
        System.out.println("Cadastro de detento:");
        System.out.println("Digite o primeiro nome do detento: ");
        String nome = sc.nextLine();
        System.out.println("Digite o sobrenome: ");
        String sobrenome = sc.nextLine();
        pessoa.setNome(nome);
        pessoa.setSobrenome(sobrenome);
        System.out.println("Nome completo do safado: " + pessoa.getNomeCompleto());
    }
}
