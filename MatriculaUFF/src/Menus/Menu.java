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

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Menu {
	private EstadoMenuAbstrato atual;
	private EstadoMenuAbstrato proximo;
	private SistemaFachada sistema;
	private Scanner in;

	public Menu(SistemaFachada sistema){
		in = new Scanner(System.in);
	}

    public EstadoMenuAbstrato getProxEstado(EstadoMenuAbstrato estado){ return this.proximo;}
    public void setProxEstado(EstadoMenuAbstrato estado){ this.proximo = estado;}

    public EstadoMenuAbstrato getEstadoAtual(EstadoMenuAbstrato estado){ return this.atual;}
    public void setEstadoAtual(EstadoMenuAbstrato estado){ this.atual = estado;}

	public void executa(){
		while(true){
			this.atual.mostraOpcoes();
			System.out.println("\n\nDigite a opção desejada: \n\n");
			int opt = in.nextInt();
			if(!this.atual.selecionaOpcao(opt)){
				System.out.println("\n\nOpção inválida.\n\n");
			};
			atual = proximo;
		}
	}
}
