package samples.ada.supermarket;

public interface ValidadorIdentificacao
{
	void validarIdentificador();

	default String fazAlgo(){
		return "fazendo algo";
	}
}
