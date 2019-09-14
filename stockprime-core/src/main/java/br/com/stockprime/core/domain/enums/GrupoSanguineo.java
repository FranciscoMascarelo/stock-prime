package br.com.stockprime.core.domain.enums;

public enum GrupoSanguineo {
	A(1,"A"),
	AB(2,"AB");
	
	private int cod;
	private String descricao;
	
	private GrupoSanguineo(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static GrupoSanguineo toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for (GrupoSanguineo x : GrupoSanguineo.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("id invalido: " + cod);
	}
}
