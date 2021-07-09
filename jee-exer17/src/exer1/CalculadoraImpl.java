package exer1;

import javax.jws.WebService;

@WebService(endpointInterface = "exer1.Calculadora")
public class CalculadoraImpl implements Calculadora {

	@Override
	public Long somar(long v1, long v2) {
		System.out.println("Executou o WS");
		return v1 + v2;
	}

	@Override
	public Long multiplicar(long v1, long v2) {
		return null;
	}

	@Override
	public Long dividir(long v1, long v2) {
		return null;
	}

	@Override
	public Long subtrair(long v1, long v2) {
		return null;
	}
}
