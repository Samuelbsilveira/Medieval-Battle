package br.com.infnet.personagem;

import br.com.infnet.util.DadoUtil;

public class Kobold extends Personagem{
    public Kobold() {
        super(20, 4, 2, 4);
    }

    @Override
    public int calcularPontosDeDano() {
        DadoUtil dadoUtil = new DadoUtil();
        int somaDados = 0;
        for(int i=0;i<3;i++){
            somaDados += dadoUtil.rollD2();
        }
        return somaDados + getPontosDeForca();
    }
}
