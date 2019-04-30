package br.com.apsinformatica.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "softwares_clientes")
public class InstituicaoSoftware implements java.io.Serializable {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	@Column(name = "cliente_id")
	private Integer instituicaoid;
	@Column(name = "software_id")
	private Integer softwareid;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@PrimaryKeyJoinColumn(name = "cliente_id", referencedColumnName = "inst_cod")
	private Instituicao instituicao;	

	@ManyToOne
	@PrimaryKeyJoinColumn(name = "soft_cod", referencedColumnName = "software_id")
	private Software software;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getInstituicaoid() {
		return instituicaoid;
	}

	public void setInstituicaoid(Integer instituicaoid) {
		this.instituicaoid = instituicaoid;
	}

	public Instituicao getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

	public Software getSoftware() {
		return software;
	}

	public void setSoftware(Software software) {
		this.software = software;
	}

	public Integer getSoftwareid() {
		return softwareid;
	}

	public void setSoftwareid(Integer softwareid) {
		this.softwareid = softwareid;
	}

}
