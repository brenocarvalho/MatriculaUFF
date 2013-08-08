/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author breno
 */
public class LoginEstadoMenu extends EstadoMenuAbstrato {

    public LoginEstadoMenu(){
	this.setMsg = "--------------------------------\n" +
	"Bem-vindo ao MatrículaUFF:\n" +
	"Digite a opção desejada:\n"+
	"[1]: Realizar Login\n"
	"[2]: Encerrar.\n"
	"--------------------------------"
    }

   public abstract void selecionaOpcao(int opt){
	switch(opt){
	    case 1:
		//pergunta login
		//pergunta senha
		//se der certo temos que guardar o usuario e ir para o proximo estado proximoEstadoMenu(proximo)
		// se não der certo proximoEstadoMenu(this)
	   break;
 	   case 2:
		proximoEstadoMenu(new FinalizaEstadoMenu());
	   default:
		proximoEstadoMenu(this);
	}
    }

}
