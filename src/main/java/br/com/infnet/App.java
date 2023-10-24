package br.com.infnet;

import br.com.infnet.personagem.Barbaro;
import br.com.infnet.personagem.Guerreiro;
import br.com.infnet.personagem.Paladino;
import br.com.infnet.personagem.Personagem;
import br.com.infnet.util.PersonagemUtil;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Escolha seu heroi 1-3");
        Scanner scanner = new Scanner(System.in);
        int escolhaHeroi = scanner.nextInt();
        PersonagemUtil personagemUtil = new PersonagemUtil();
        Personagem heroi = personagemUtil.escolherHeroi(escolhaHeroi);
        Personagem monstro = personagemUtil.escolherMonstro();
        int quantidadeRodadas = 0;

        while (heroi.getPontosDeVida() > 0 && monstro.getPontosDeVida() > 0) {
            quantidadeRodadas++;
            int iniciativaHeroi = heroi.calcularIniciativa();
            int iniciativaMonstro = monstro.calcularIniciativa();

            Personagem atacante, atacado;
            if (iniciativaHeroi > iniciativaMonstro) {
                atacante = heroi;
                atacado = monstro;
            } else {
                atacante = monstro;
                atacado = heroi;
            }

            if (conseguiuAtacar(atacante, atacado)) {
                System.out.println("Ataque bem sucedido");
                int dano = atacante.calcularPontosDeDano();
                atacado.retirarPontosDeVida(dano);
            } else {
                System.out.println("Ataque mal sucedido");
            }
        }

        if (heroi.getPontosDeVida() <= 0) {
            System.out.println("O monstro venceu a batalha!");
        } else if (monstro.getPontosDeVida() <= 0) {
            System.out.println("Seu herói venceu a batalha!");
        } else {
            System.out.println("A batalha terminou em empate!");
        }

        System.out.println("Quantidade de rodadas: " + quantidadeRodadas);
    }

    private static boolean conseguiuAtacar(Personagem atacante, Personagem monstro) {
        return atacante.calcularFatorDeAtaque() > monstro.calcularFatorDeDefesa();
    }
}
