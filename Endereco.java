package poo;

 public class Endereco {

private String rua;
private String bairro;
private String cep;
private Cidade cidade;
private int numero;

public Endereco(String rua, String bairro, String cep, Cidade cidade, int numero) {
	this.rua = rua;
	this.bairro = bairro;
	this.cep = cep;
	this.cidade = cidade;
	this.numero = numero;
}
public String getRua() {
  	 return rua;
   }
   public void setRua (String rua) {
  	 this.rua = rua;
   }
   public String getBairro() {
      return bairro;
   }
   public void setBairro(String bairro) {
      this.bairro = bairro;
   }
   public Cidade getCidade() {
	      return cidade;
   }
   public void setCidade(Cidade cidade) {
	      this.cidade = cidade;
   }
   public int getNumero() {
      return numero;
   }
   public void setNumero(int numero) {
	      this.numero = numero;
   }

	}


