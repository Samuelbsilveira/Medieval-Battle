package br.com.infnet.personagem;

import br.com.infnet.util.DadoUtil;

public class Guerreiro extends Personagem{
    public Guerreiro(){
        super(12, 4 , 3, 3);
    }
    public int calcularPontosDeDano() {
        DadoUtil dadoUtil = new DadoUtil();
        return dadoUtil.rollD4() + dadoUtil.rollD4() + getPontosDeForca();
    }
}
