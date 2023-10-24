package br.com.infnet.personagem;

import br.com.infnet.util.DadoUtil;

public class Paladino extends Personagem {

    public Paladino() {
        super(15, 2, 5, 1);
    }

    public int calcularPontosDeDano() {
        DadoUtil dadoUtil = new DadoUtil();
        return dadoUtil.rollD4() + dadoUtil.rollD4() + getPontosDeForca();
    }
}
