package br.com.stockprime.core.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.com.stockprime.core.domain.enums.CepEstado;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
//@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
public class Endereco extends PersistentEntity{

	private static final long serialVersionUID = 1L;
	private String cep;
	private String rua;
	private Integer numero;
	
	@ManyToMany(mappedBy = "enderecos")
	private List<Pessoa> pessoas = new ArrayList<>();
	
	//TODO @Hiago pesquisar sobre tabela de cep dos correios, verifica se tem api.
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cep_localidade_id", nullable = false)
	private CepLocalidade cepLocalidade;

}
