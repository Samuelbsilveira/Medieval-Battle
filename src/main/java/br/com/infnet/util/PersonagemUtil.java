package br.com.infnet.util;

import br.com.infnet.personagem.*;

import java.util.List;
import java.util.Random;

public class PersonagemUtil {
    public Personagem escolherHeroi(int escolha){
        return switch (escolha) {
            case 2 -> new Barbaro();
            case 3 -> new Paladino();
            default -> new Guerreiro();
        };
    }
    public Personagem escolherHeroiFromArray(int escolha){
        List<Personagem> personagens =
        List.of(new Guerreiro(), new Barbaro(), new Paladino());
        try {
            return personagens.get(escolha -1);
        } catch (Exception e) {
            return new Guerreiro();
        }
    }
    public Personagem escolherMonstro(){
        Random random = new Random();
        List<Personagem> monstros = List.of(new MortoVivo(),new Orc(),new Kobold());
        int escolhaMonstro = random.nextInt(monstros.size());
        return monstros.get(escolhaMonstro);

    }
}
