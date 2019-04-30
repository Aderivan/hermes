package br.com.apsinformatica.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {
	@Id
	@Column(name="user_id")
	@GeneratedValue
	private Integer userid;
	@Column(name="login")
	private String login;
	@Column(name="nome")
	private String nome;
	@Column(name="password")
	private String password;
//	@Column(name="data_inc", nullable = true)
//	@Temporal(TemporalType.TIMESTAMP)
//	private Date datainc;
//	@Column(name="data_admis", nullable = true)
//	@Temporal(TemporalType.TIMESTAMP)
//	private Date dataadmis;
	@Column(name="email")
	private String email;
	@Column(name="fone")
	private String fone;
	@Column(name="nivel")
	private String nivel;
	@Column(name="AREA")
	private String area;
	@Column(name="user_admin")
	private Integer useradmin;
	@Column(name="naoenchamdo")
	private String naoenchamdo;
	@Column(name="equipe")
	private String equipe;
//	@Column(name="dtenvio",nullable = true)
//	@Temporal(TemporalType.TIMESTAMP)
//	private Date dtenvio;
	@Column(name="flagativo")
	private Integer flagativo;
	
        @OneToMany(fetch = FetchType.LAZY, mappedBy = "operador", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
        private List<AberturaDeOcorrencia> ocorrencias;
        
        @OneToMany(fetch = FetchType.LAZY, mappedBy = "abertopor", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
        private List<AberturaDeOcorrencia> ocorrencia;
	/**
	 * Campos N�o persistentes
	 */
	@Transient
	private boolean booFlagativo;
	@Transient
	private boolean booUseradmin;
		
	public Usuario() {
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	public Date getDatainc() {
//		return datainc;
//	}
//
//	public void setDatainc(Date datainc) {
//		this.datainc = datainc;
//	}
//
//	public Date getDataadmis() {
//		return dataadmis;
//	}
//
//	public void setDataadmis(Date dataadmis) {
//		this.dataadmis = dataadmis;
//	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Integer getUseradmin() {
		return useradmin;
	}

	public void setUseradmin(Integer useradmin) {
		this.useradmin = useradmin;
	}

	public String getNaoenchamdo() {
		return naoenchamdo;
	}

	public void setNaoenchamdo(String naoenchamdo) {
		this.naoenchamdo = naoenchamdo;
	}

	public String getEquipe() {
		return equipe;
	}

	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}

//	public Date getDtenvio() {
//		return dtenvio;
//	}
//
//	public void setDtenvio(Date dtenvio) {
//		this.dtenvio = dtenvio;
//	}

	public Integer getFlagativo() {
		return flagativo;
	}

	public void setFlagativo(Integer flagativo) {
		this.flagativo = flagativo;
	}

	public boolean getBooFlagativo() {
		booFlagativo = this.flagativo != null && this.flagativo == 1;
		return booFlagativo;
	}

	public void setBooFlagativo(boolean booFlagativo) {
		this.booFlagativo = booFlagativo;
		this.flagativo = (this.booFlagativo ? 1 : 0); 
	}

	public boolean getBooUseradmin() {
		booUseradmin = this.useradmin != null && this.useradmin == 1;
		return booUseradmin;
	}

	public void setBooUseradmin(boolean booUseradmin) {
		this.booUseradmin = booUseradmin;
		this.useradmin = (this.booUseradmin ? 1 : 0); 		
	}	

    public List<AberturaDeOcorrencia> getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(List<AberturaDeOcorrencia> ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    public List<AberturaDeOcorrencia> getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(List<AberturaDeOcorrencia> ocorrencia) {
        this.ocorrencia = ocorrencia;
    }
	
        
}
