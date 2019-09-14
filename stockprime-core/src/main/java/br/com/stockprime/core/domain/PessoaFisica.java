package br.com.stockprime.core.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.stockprime.core.domain.enums.Escolaridade;
import br.com.stockprime.core.domain.enums.EstadoCivil;
import br.com.stockprime.core.domain.enums.GrupoSanguineo;
import br.com.stockprime.core.domain.enums.Sexo;
import br.com.stockprime.core.domain.enums.TipoDeficiencia;
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
public class PessoaFisica extends Pessoa {
	private static final long serialVersionUID = 1L;
	
    private Date dataNascimento;

    private String numeroCpf;

    private Integer sexo;
    
    private String possuiDeficiencia;
    
    private Integer tipoDeficiencia;

    private Integer estadoCivil;

    private Integer grupoSanguineo;
    
    private Integer escolaridade;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profissao_id")
    private Profissao profissao;

    //TODO @Hiago pesquisar sobre tabela de cep dos correios, verifica se tem api.
    private CepLocalidade cepLocalidade;
    
    public void setSexo(Sexo sexo) {
    	this.sexo = sexo.getCod();
    }
    
    public Sexo getSexo() {
    	return Sexo.toEnum(sexo);
    }
    
    public void setTipoDeficiencia(TipoDeficiencia tipoDeficiencia) {
    	this.sexo = tipoDeficiencia.getCod();
    }
    
    public TipoDeficiencia getTipoDeficiencia() {
    	return TipoDeficiencia.toEnum(tipoDeficiencia);
    }
    
    public void setEstadoCivil(EstadoCivil estadoCivil) {
    	this.estadoCivil = estadoCivil.getCod();
    }
    
    public EstadoCivil getEstadoCivil() {
    	return EstadoCivil.toEnum(estadoCivil);
    }
    
    public void setGrupoSanguineo(GrupoSanguineo grupoSanguineo) {
    	this.grupoSanguineo = grupoSanguineo.getCod();
    }
    
    public GrupoSanguineo getGrupoSanguineo() {
    	return GrupoSanguineo.toEnum(grupoSanguineo);
    }
    
    public void setEscolaridade(GrupoSanguineo escolaridade) {
    	this.escolaridade = escolaridade.getCod();
    }
    
    public Escolaridade getEscolaridade() {
    	return Escolaridade.toEnum(escolaridade);
    }
}
