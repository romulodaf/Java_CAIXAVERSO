package javaOO.supermarket;

public interface ValidadorIdentificacao
{
	void validarIdentificador();

	default String fazAlgo(){
		return "fazendo algo";
	}
}
