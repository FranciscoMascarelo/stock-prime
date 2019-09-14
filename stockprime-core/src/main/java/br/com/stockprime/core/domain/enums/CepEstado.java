package br.com.stockprime.core.domain.enums;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.com.stockprime.core.domain.CepLocalidade;
import br.com.stockprime.core.domain.CepPais;
import br.com.stockprime.core.domain.PersistentEntity;
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
public class CepEstado extends PersistentEntity{
	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cep_pais_id", nullable = false)
	private CepPais cepPais;

    private String nomeEstado;

    private String siglaEstado;

    private Integer codigoIbge;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cepEstado")
    private Set<CepLocalidade> cepLocalidades = new HashSet<CepLocalidade>();

}
