package gt.edu.url.examen1.api;

public class ReporteroClass implements Reportero {

	@Override
	public String calcularGanador(int a, int b) {
		
		
	   
		int A = a;
		int B = b;
		String Ganador;
		
		
		if((A%B>2)&&(B%A>2)) {
			
			Ganador = "INGRESO INVALIDO";	
		}
		
		if((A == B)){
		 
			Ganador = "EL PARTIDO TODAVIA NO HA TERMINADO";	
		}
		if((A+B)<9){
			
			if(A%B ==2) {	 
				Ganador = "EL GANADOR ES EL JUGADOR A";		
			}else {		
				Ganador = "EL GANADOR ES EL JUGADOR B";
			}
		}
		
		return Ganador;
	}

	@Override
	public String calcularCampeon() {
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String recordarGanador(int juego) {
		
		// TODO Auto-generated method stub
		
		return null;
	}

}
