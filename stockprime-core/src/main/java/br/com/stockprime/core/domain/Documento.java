package br.com.stockprime.core.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.stockprime.core.domain.enums.TipoDocumento;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
public class Documento extends PersistentEntity{
	private static final long serialVersionUID = 1L;
	private Integer tipoDocumento;
	private String documento;
	@ManyToOne
	@JoinColumn(name = "pessoa_id")
	private Pessoa pessoa;
	
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento.getCod();
	}
	
	public TipoDocumento getTipoDocumento() {
		return TipoDocumento.toEnum(tipoDocumento);
	}
}
