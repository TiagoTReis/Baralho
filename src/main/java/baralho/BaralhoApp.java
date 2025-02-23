package baralho;

public class BaralhoApp {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();

        try {
            System.out.println("Baralho antes de embaralhar:");
            baralho.imprimirBaralho();

            baralho.embaralhar();

            System.out.println("\nBaralho após embaralhar:");
            baralho.imprimirBaralho();

            baralho.retirarUmaCarta();

            if (baralho.hasCarta()) {
                System.out.println("\nAinda existem cartas no baralho.");
            } else {
                System.out.println("\nNão há mais cartas no baralho.");
            }

        } catch (BaralhoVazioException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}