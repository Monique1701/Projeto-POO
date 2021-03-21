package sistema_de_agencia;

import java.sql.Date;

public class Transacao {
	private int numeroConta;
	private int numeroTransacao;
	private float quantia;
	private Date data;
	private String nomeTransacao;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Transacao [numeroConta=" + numeroConta + ", numeroTransacao=" + numeroTransacao + ", quantia=" + quantia
				+ ", data=" + data + ", nomeTransacao=" + nomeTransacao + "]";
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public int getNumeroTransacao() {
		return numeroTransacao;
	}
	public void setNumeroTransacao(int numeroTransacao) {
		this.numeroTransacao = numeroTransacao;
	}
	public float getQuantia() {
		return quantia;
	}
	public void setQuantia(float quantia) {
		this.quantia = quantia;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getNomeTransacao() {
		return nomeTransacao;
	}
	public void setNomeTransacao(String nomeTransacao) {
		this.nomeTransacao = nomeTransacao;
	}
	
	
	
	
	
	
	
	
	
	
	

}
