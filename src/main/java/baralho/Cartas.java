package baralho;

public class Cartas {
    private String nome;
    private String naipe;

    public enum Valor {
        A, DOIS, TRES, QUATRO, CINCO, SEIS, SETE, OITO, NOVE, DEZ, J, Q, K, CORINGA;
    }

    public enum Naipe {
        COPAS, OUROS, ESPADAS, PAUS, CORINGA;
    }

    public Cartas(Valor valor, Naipe naipe) {
        if (valor == Valor.CORINGA || naipe == Naipe.CORINGA) {
            this.nome = "Coringa";
            this.naipe = "Coringa";
        } else {
            this.nome = valor.name();
            this.naipe = naipe.name();
        }
    }

    public String getNome() {
        return nome;
    }
}