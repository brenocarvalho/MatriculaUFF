package Menus;

import Dominio.SistemaFachada;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Breno W. Carvalho, C. Bruno Garcia, Ian Villar, Rafael Grillo
 */

public abstract class EstadoMenuAbstrato {
    private String msg;
    private Menu menu;
	private SistemaFachada sistema;
	private Scanner in;

    public String getInput(){ return this.in;}

    public String getMsg(){ return this.msg;}
    public void setMsg(String msg){ this.msg = msg;}

    public SistemaFachada getSistema(){ return this.sistema;}
    public void setMsg(SistemaFachada sistema){ this.sistema = sistema;}
    
    public void mostraOpcoes(){
		System.out.println(this.msg);
   }

   public abstract boolean selecionaOpcao(int opt);

   public void proximoEstadoMenu(EstadoMenuAbstrato estado){
       this.menu.setProxEstado(estado);
   }
}
