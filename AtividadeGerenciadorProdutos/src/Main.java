import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> listProducts = new ArrayList<>();
        boolean isOn = true;
        Scanner scanner = new Scanner(System.in);
        while (isOn){
            System.out.println("O Gerenciador de Produtos apresenta as seguintes funcoes\n" +
                    "1 - Cadastro de Produto\n" +
                    "2 - Listagem de Produtos\n" +
                    "3 - Exclusao de Produto\n" +
                    "4 - Alteracao de Produto\n" +
                    "0 - Sair do Programa\n");
            int option = scanner.nextInt();
            switch (option){
                case 0:
                    isOn = false;
                    break;
                case 1:
                    System.out.println("Digite o Nome do produto que voce gostaria de adicionar\n");
                    listProducts.add(scanner.nextLine());
                    System.out.println("Voce Adicionou a lista");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("O numero que voce digitou nao e uma opcap");
                    break;
            }
        }
    }
}