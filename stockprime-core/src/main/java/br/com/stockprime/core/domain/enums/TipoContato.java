package br.com.stockprime.core.domain.enums;

public enum TipoContato {
	TELEFONE_FIXO(1,"Telefone Fixo"),
	CELULAR(2, "Telefone Celular"),
	EMAIL(3,"Email");
	
	private int cod;
	private String descricao;
	
	private TipoContato(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static TipoContato toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for (TipoContato x : TipoContato.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("id invalido: " + cod);
	}
}
