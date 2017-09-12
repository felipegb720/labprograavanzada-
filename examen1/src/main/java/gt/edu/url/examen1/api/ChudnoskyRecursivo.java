package gt.edu.url.examen1.api;

public class ChudnoskyRecursivo implements Chudnovsky {

	@Override

	public double calcularPi(int Digitos) {
		
		double Chudnovsky;
		int NUM = Digitos; 
		Chudnovsky = (numerador(NUM)) / (denominador(NUM));
		return Chudnovsky; 
	}
	
	public long factorial (int Digitos) {
		
		if(Digitos==0)
			return 1;
		else 
			return Digitos* factorial(Digitos-1);
	}
	
	public double numerador(int Digitos) {
		
		double numerador; 
		numerador = (6*factorial(Digitos))*((545140134*Digitos + 13591409));
		return numerador;
	}
	public double denominador (int Digitos) {
		
		double denominador;
		double numero = -640320;
		denominador = ((3*factorial(Digitos))*Math.pow((factorial(Digitos)),3)*Math.pow(3*numero, Digitos))  ; 
		return denominador;
	}
}