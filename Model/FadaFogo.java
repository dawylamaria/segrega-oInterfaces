package br.edu.fescfafic.segregacaoInterfaces.Model;

import br.edu.fescfafic.segregacaoInterfaces.Interface.PoderFogo;

public class FadaFogo implements PoderFogo {
    @Override
    public void lancaChamas(){
        System.out.println(this.getClass().getName().substring(44) + " soltou Lanca Chamas");

    }

    @Override
    public void bolaDeFogo() {
        System.out.println(this.getClass().getName().substring(44) + " soltou Bola de Fogo");


    }


}
