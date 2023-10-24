package br.com.infnet.personagem;

import br.com.infnet.util.DadoUtil;

public class Barbaro extends Personagem{
    public Barbaro(){
        super(13, 6, 1, 3);
    }
    public int calcularPontosDeDano() {
        DadoUtil dadoUtil = new DadoUtil();
        return dadoUtil.rollD6() + dadoUtil.rollD6() + getPontosDeForca();
    }
}
