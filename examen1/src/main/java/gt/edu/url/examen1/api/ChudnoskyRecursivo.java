package gt.edu.url.examen1.api;

public class ChudnoskyRecursivo implements Chudnovsky {

	@Override

	public double calcularPi(int cantidadDigitos) {
		
		double Chudnovsky;
		int n = cantidadDigitos; 
		Chudnovsky = (numerador(n)) / (denominador(n));
		return Chudnovsky; 
	}
	
	public long factorial (int kDigitos) {
		
		if(kDigitos==0)
			return 1;
		else 
			return kDigitos* factorial(kDigitos-1);
	}
	
	public double numerador(int kDigitos) {
		
		double numerador; 
		numerador = (6*factorial(kDigitos))*((545140134*kDigitos + 13591409));
		return numerador;
	}
	public double denominador (int kDigitos) {
		
		double denominador;
		double numero = -640320;
		denominador = ((3*factorial(kDigitos))*Math.pow((factorial(kDigitos)),3)*Math.pow(3*numero, kDigitos))  ; 
		return denominador;
	}
}