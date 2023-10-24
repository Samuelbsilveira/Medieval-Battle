package br.com.infnet.personagem;

import br.com.infnet.util.DadoUtil;

public class Orc extends Personagem{
    public Orc() {
        super(20, 6, 2, 2);
    }

    @Override
    public int calcularPontosDeDano() {
        DadoUtil dadoUtil = new DadoUtil();
        return dadoUtil.rollD8() + getPontosDeForca();
    }
}
