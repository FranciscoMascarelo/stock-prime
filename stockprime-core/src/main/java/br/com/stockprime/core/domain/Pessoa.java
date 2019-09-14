package br.com.stockprime.core.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa extends PersistentEntity{
	private static final long serialVersionUID = 1L;
	private String name;
	//faz com que omite a busca de pessoas pois ja foi serializado do lado de enderecos
	@JsonIgnore
	@ManyToMany
	//Cria tabela auxiliar para fazer ligação de muitos para muitos entre pessoa e endereço
	@JoinTable(name = "pessoa_endereco",
		joinColumns = @JoinColumn(name = "pessoa_id"),
		inverseJoinColumns = @JoinColumn(name = "endereco_id" )
	)
	private List<Endereco> enderecos = new ArrayList<>();
	
	@OneToMany(mappedBy = "pessoa")
	private List<Contato> contatos = new ArrayList<>();
	
	@OneToMany(mappedBy = "pessoa")
	private List<Documento> Documentos = new ArrayList<>();

}
