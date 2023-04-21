package br.edu.fescfafic.segregacaoInterfaces.Main;

import br.edu.fescfafic.segregacaoInterfaces.Model.FadaAgua;
import br.edu.fescfafic.segregacaoInterfaces.Model.FadaFogo;
import br.edu.fescfafic.segregacaoInterfaces.Model.FadaTerra;

public class Main {
    public static void main(String[] args) {
        FadaFogo fadaFogo = new FadaFogo();

        fadaFogo.lancaChamas();

        FadaTerra fadaTerra = new FadaTerra();

        fadaTerra.deslocarSolo();

        FadaAgua fadaAgua = new FadaAgua();

        fadaAgua.furacaoAquatico();

    }
}