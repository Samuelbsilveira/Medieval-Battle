package br.com.infnet.personagem;

import br.com.infnet.util.DadoUtil;

public class MortoVivo extends Personagem{
    public MortoVivo() {
        super(25, 4, 0, 1);
    }

    @Override
    public int calcularPontosDeDano() {
        DadoUtil dadoUtil = new DadoUtil();
        return dadoUtil.rollD4() + dadoUtil.rollD4() + getPontosDeForca();
    }
}
