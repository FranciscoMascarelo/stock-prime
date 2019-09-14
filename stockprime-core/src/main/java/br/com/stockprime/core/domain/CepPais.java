package br.com.stockprime.core.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
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
public class CepPais extends PersistentEntity{
	
	private static final long serialVersionUID = 1L;

	private String nomePais;

    private String nacionalidadePais;

    private String isoPais3;

    private String isoPais;

    private Integer numeroPais;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cepPais")
    private Set<CepEstado> cepEstados = new HashSet<CepEstado>();

}
