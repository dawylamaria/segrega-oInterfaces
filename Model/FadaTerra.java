package br.edu.fescfafic.segregacaoInterfaces.Model;
import br.edu.fescfafic.segregacaoInterfaces.Interface.PoderTerra;
public class FadaTerra implements PoderTerra{

    @Override
    public void raizesDasPlantas(){
        System.out.println(this.getClass().getName().substring(44) + " Usou as Raizes das Plantas");


    }
    @Override
    public void deslocarSolo(){
        System.out.println(this.getClass().getName().substring(44) + " Deslocou o Solo");
    }
}
