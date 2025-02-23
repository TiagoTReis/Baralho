package baralho;

public class Cartas {
    private Valor valor;
    private Naipe naipe;

    public enum Valor {
        A, DOIS, TRES, QUATRO, CINCO, SEIS, SETE, OITO, NOVE, DEZ, J, Q, K, CORINGA;
    }

    public enum Naipe {
        COPAS, OUROS, ESPADAS, PAUS, CORINGA;
    }

    public Cartas(Valor valor, Naipe naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public Valor getValor() {
        return valor;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    @Override
    public String toString() {
        if (valor == Valor.CORINGA || naipe == Naipe.CORINGA) {
            return "Coringa";
        }
        return valor.name() + " de " + naipe.name();
    }
}