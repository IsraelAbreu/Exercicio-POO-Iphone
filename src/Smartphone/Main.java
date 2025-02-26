package Smartphone;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		//Aparelho telefonico
		Iphone iphone = new Iphone();
		iphone.atender();
		iphone.ligar("(85)98933-4870");
		//Reprodutor Musical
		iphone.selecionarMusica("https://www.youtube.com/watch?v=1-MJcO-vCts");
		iphone.tocar();
		iphone.pausar();
		//Navegador de Internet
		iphone.exibirPagina("https://www.freecodecamp.org/portuguese/news/interfaces-em-java-explicadas-com-exemplos/");
		iphone.atualizarPagina();	}

}
