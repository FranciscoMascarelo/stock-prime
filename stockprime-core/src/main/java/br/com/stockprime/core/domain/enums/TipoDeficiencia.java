package br.com.stockprime.core.domain.enums;

public enum TipoDeficiencia {
	FISICA(1,"Fisica"),
	MENTAL(2, "Mental");
	
	
	private int cod;
	private String descricao;
	
	private TipoDeficiencia(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static TipoDeficiencia toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for (TipoDeficiencia x : TipoDeficiencia.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("id invalido: " + cod);
	}

}
