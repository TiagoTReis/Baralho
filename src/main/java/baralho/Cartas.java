package baralho;

public class Cartas {
    private Valor valor;
    private Naipe naipe;


    public enum Valor {
        A, DOIS, TRES, QUATRO, CINCO, SEIS, SETE, OITO, NOVE, DEZ, J, Q, K, CORINGA;

        public boolean isCoringa() {
            return this == CORINGA;
        }
    }

    public enum Naipe {
        OURO, PAUS, ESPADA, COPAS, CORINGA;

        public boolean isCoringa() {
            return this == CORINGA;
        }
    }


    public Cartas(Valor valor, Naipe naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    public String toString() {
        if (valor.isCoringa() && naipe.isCoringa()) {
            return "Coringa";
        } else {
            return valor.name() + " de " + naipe.name();
        }
    }
}