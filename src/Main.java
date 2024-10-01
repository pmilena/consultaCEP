import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        BuscadorCEP buscador = new BuscadorCEP();
        SalvaJson armazenadorCEP = new SalvaJson();
        System.out.println("Digite o número do CEP a ser consultado: ");
        try {
            Endereco novoEndereco = buscador.buscadorCEP(leitor.nextLine());
            System.out.println(novoEndereco);
            armazenadorCEP.SalvaJson(novoEndereco);
        } catch (Exception e) {
            System.out.println(e.getMessage());
    }

}}