package baralho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Cartas> cartas;

    public Baralho() {
        this.cartas = criarBaralho();
    }

    private List<Cartas> criarBaralho() {
        List<Cartas> cartas = new ArrayList<>();

        // Adicionando as 52 cartas normais
        for (Cartas.Naipe naipe : Cartas.Naipe.values()) {
            if (naipe != Cartas.Naipe.CORINGA) {
                for (Cartas.Valor valor : Cartas.Valor.values()) {
                    if (valor != Cartas.Valor.CORINGA) {
                        cartas.add(new Cartas(valor, naipe));
                    }
                }
            }
        }

        // Adicionando os 4 coringas
        for (int i = 0; i < 4; i++) {
            cartas.add(new Cartas(Cartas.Valor.CORINGA, Cartas.Naipe.CORINGA));
        }

        return cartas;
    }

    public void embaralhar() {
        if (cartas.isEmpty()) {
            System.out.println("Baralho vazio!");
            return;
        }
        Collections.shuffle(cartas);
        System.out.println("Baralho embaralhado!");
    }

    public void retirarUmaCarta() throws BaralhoVazioException {
        if (cartas.isEmpty()) {
            throw new BaralhoVazioException("Não é possível retirar uma carta de um baralho vazio.");
        }
        Cartas cartaRetirada = cartas.get(0);
        cartas.remove(0);
        System.out.println("Carta retirada: " + cartaRetirada);
        System.out.println("Cartas restantes: " + cartas.size());
    }

    public void imprimirBaralho() {
        for (Cartas carta : cartas) {
            System.out.println(carta);
        }
        System.out.println("\nTotal de cartas no baralho: " + cartas.size());
    }

    public boolean hasCarta() {
        return !cartas.isEmpty();
    }

    public List<Cartas> getCartas() {
        return cartas;
    }

    public void setCartas(List<Cartas> cartas) {
        this.cartas = cartas;
    }
}
