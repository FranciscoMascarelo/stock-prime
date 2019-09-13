package br.com.stockprime.core.domain.enums;

public enum TipoDocumento {
	CPF(1,"CPF"),
	CNPJ(2, "CNPJ"),
	RG(3, "RG"),
	CARTEIRA_TRABALHO(4, "Carteira de Trabalho"),
	CNH(5,"CNH");
	
	private int cod;
	private String descricao;
	
	private TipoDocumento(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static TipoDocumento toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for (TipoDocumento x : TipoDocumento.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("id invalido: " + cod);
	}

}
