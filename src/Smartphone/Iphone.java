package Smartphone;

import AparelhoTelefone.AparelhoDeTelefone;
import NavegadorInternet.NavegadorDeInternet;
import ReprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoDeTelefone, NavegadorDeInternet, ReprodutorMusical {

	@Override
	public void ligar(String numero) {
		// TODO Auto-generated method stub
		System.out.printf("Ligando para %s\n", numero);
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("Ligação atendida");
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("Correio de voz iniciado");
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Tocando Música");
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("Pause Música");
	}

	@Override
	public void selecionarMusica(String url) {
		// TODO Auto-generated method stub
		System.out.printf("Música Selecionada: %s\n", url);
	}

	@Override
	public void exibirPagina(String url) {
		// TODO Auto-generated method stub
		System.out.println("Página do navegador exibida");
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("Nova aba adiconada ao navegador");
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("Atualizando página");
	}
	
	

}
