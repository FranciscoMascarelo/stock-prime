package br.com.stockprime.core.domain.enums;

public enum EstadoCivil {
	SOLTEIRO(1,"Solteiro"),
	CASADO(2, "Casado"),
	DIVORCIADO(3, "Divorciado"),
	VIUVO(4, "Viuvo"),
	UNIAOESTAVEL(5,"União Estavel");
	
	private int cod;
	private String descricao;
	
	private EstadoCivil(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static EstadoCivil toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for (EstadoCivil x : EstadoCivil.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("id invalido: " + cod);
	}

}
