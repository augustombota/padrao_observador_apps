package monitorizacao;

public class Carro implements Observer {

    private String nome;

    public Carro(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String estado) {

        if (estado.equals("VERDE")) {
            System.out.println(nome + " → AVANÇAR");
        }

        else if (estado.equals("AMARELO")) {
            System.out.println(nome + " → REDUZIR VELOCIDADE");
        }

        else if (estado.equals("VERMELHO")) {
            System.out.println(nome + " → PARAR");
        }
    }
}