package br.com.stockprime.core.domain.enums;

public enum Escolaridade {
	EF(1,"Ensino Fundamental"),
	EM(2, "Ensino Médio"),
	ES(3, "Ensino Superior");
	
	private int cod;
	private String descricao;
	
	private Escolaridade(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static Escolaridade toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for (Escolaridade x : Escolaridade.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("id invalido: " + cod);
	}

}
