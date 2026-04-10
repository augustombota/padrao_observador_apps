package monitorizacao;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Semaforo semaforo = new Semaforo();

        Carro carro1_ = new Carro("Carro a direita");
        Carro carro2_ = new Carro("Carro de baixo");

        semaforo.addObserver(carro1_);
        semaforo.addObserver(carro2_);

        Scanner ler = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("============= SISTEMA DE MONITORIZAÇÃO ==========");
            System.out.println("1. Verde");
            System.out.println("2.  Amarelo");
            System.out.println("3- Vermelho");
            System.out.println("0. sair");
            System.out.print("Escolha uma opção: ");

            if (ler.hasNextInt()) {

                opcao = ler.nextInt();

                switch (opcao) {

                    case 1:
                        semaforo.setEstado("VERDE");
                        break;

                    case 2:
                        semaforo.setEstado("AMARELO");
                        break;

                    case 3:
                        semaforo.setEstado("VERMELHO");
                        break;

                    case 0:
                        System.out.println("A sair do sistema...");
                        break;

                    default:
                        System.out.println("Opção inválida");
                        System.out.println("A aguardar 3 segundos...");

                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            System.out.println(e.getMessage());
                        }
                }

            } else {

                String invalido = ler.next();

                System.out.println("Entrada inválida: " + invalido);
                System.out.println("A aguardar 5 segundos...");

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());

                }

                // limpar entrada inválida
                opcao = -1;
            }

        } while (opcao != 0);
        ler.close();
    }
}