import acm.graphics.*;
import acm.program.GraphicsProgram;


public class Ejercicio1 extends GraphicsProgram{


	public void run(){
		//cambio el tamaño de la ventana
		setSize(800,600);
		//llamo al metodo que dibuja la piramide
		pintaPiramide();
	}

	public void pintaPiramide(){
		int numLadrillosBase = 14;
		int anchoLadrillo = 30;
		int altoLadrillo = 12;
		int ancho = getWidth();
		int alto = getHeight();
		int basePiramide = numLadrillosBase * anchoLadrillo;
		
		//querido yo del martes
		//solo te queda lo mas facil darle la vuelta
		//Att tu yo del viernes
		for (int j=0; j< numLadrillosBase; j++){
			for (int i=0; i< numLadrillosBase-j; i++){
				GRect ladrillo = new GRect (anchoLadrillo, altoLadrillo);
				add(ladrillo,
						ancho/2 - basePiramide/2 + anchoLadrillo*j/2 + anchoLadrillo * i,
						alto - altoLadrillo - altoLadrillo * j);
			}
		}
	}

}
