/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Breno W. Carvalho, C. Bruno Garcia, Ian Villar, Rafael Grillo
 */
package Menus;

public class FinalizaEstadoMenu extends EstadoMenuAbstrato {

    public FinalizaEstadoMenu(){
	this.setMsg("--------------------------------\n" +
	"Volte sempre :D\n" +
	"--------------------------------");
    }

   public boolean selecionaOpcao(int opt){
	System.exit(0);
        return true;
    }

}
