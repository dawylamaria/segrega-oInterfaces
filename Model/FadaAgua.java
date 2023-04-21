package br.edu.fescfafic.segregacaoInterfaces.Model;

import br.edu.fescfafic.segregacaoInterfaces.Interface.PoderAgua;

public class FadaAgua implements PoderAgua {

    @Override
    public void furacaoAquatico(){
        System.out.println(this.getClass().getName().substring(44) + " Usou o Furacao Aquatico");

    }

    @Override
    public void jatoDeAgua(){
        System.out.println(this.getClass().getName().substring(44) + " Usou o Jato de Agua");

    }
}
