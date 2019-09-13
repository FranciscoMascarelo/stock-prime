package br.com.stockprime.core.domain;

import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@MappedSuperclass
public class PessoaAbstract extends PersistentEntity{
	private static final long serialVersionUID = 1L;
	private String name;
	
}
