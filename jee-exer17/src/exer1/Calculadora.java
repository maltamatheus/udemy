package exer1;

import javax.jws.WebService;

//A interface define o contrato WSDL do Webservice
@WebService
public interface Calculadora {
	Long somar(long v1, long v2);
	
	Long multiplicar(long v1, long v2);
	
	Long dividir(long v1, long v2);
	
	Long subtrair(long v1, long v2);
}
