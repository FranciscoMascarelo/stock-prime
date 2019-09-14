package br.com.stockprime.core.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.com.stockprime.core.domain.enums.CepEstado;
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
public class CepLocalidade extends PersistentEntity{
	 
	private static final long serialVersionUID = 1L;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cep_estado_id", nullable = false)
	private CepEstado cepEstado;

    private String nomeLocalidade;

    private String cepLocalidade;

    private Integer codigoIbge;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cepLocalidade")
    private Set<Endereco> endereco = new HashSet<Endereco>();
    
//    private Set<CepBairro> cepBairros = new HashSet<CepBairro>(0);
//    
//    private Set<GgLogradouro> ggLogradouros = new HashSet<GgLogradouro>(0);

}
