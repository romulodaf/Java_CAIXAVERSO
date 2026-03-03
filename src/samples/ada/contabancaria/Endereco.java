package samples.ada.contabancaria;

public record Endereco (String rua, String numero, String cep, String cidade, String estado){
	public void imprimir(){
		System.out.printf("Rua %s; cep: %s %n",rua, cep);
	}
}
