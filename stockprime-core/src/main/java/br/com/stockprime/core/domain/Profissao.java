package br.com.stockprime.core.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

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
public class Profissao extends PersistentEntity{
	
	private static final long serialVersionUID = 1L;

	private String nomeProfissao;

    private String descricaoProfissao;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "profissao")
    private Set<PessoaFisica> ggPessoaFisicas = new HashSet<PessoaFisica>();
    

}
