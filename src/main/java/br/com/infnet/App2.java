package br.com.infnet;

import br.com.infnet.jogador.Player;

public class App2 {
    public static void main(String[] args) {
        Player player = new Player();
        Player Samuel = Player.builder().nome("Samuel").cpf("1231312321").build();
    }
}
