
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

@Entity
@Table(name = "status")
public class Status implements Serializable{
    
    @Id
    @Column(name="stat_id")
    @GeneratedValue
    private Integer stat_id;
    
    @Column(name="status")
    private String status;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "status", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<AberturaDeOcorrencia> ocorrencias;

    public Integer getStat_id() {
        return stat_id;
    }

    public void setStat_id(Integer stat_id) {
        this.stat_id = stat_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<AberturaDeOcorrencia> getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(List<AberturaDeOcorrencia> ocorrencias) {
        this.ocorrencias = ocorrencias;
    }
    
    
    
   }
