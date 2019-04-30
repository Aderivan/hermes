package br.com.apsinformatica.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.PrimeFaces;

import br.com.apsinformatica.domain.Usuario;
import br.com.apsinformatica.dao.UsuarioDao;
import br.com.apsinformatica.infra.JSFUtil;

@ManagedBean(name = "MBUsuario")
@ViewScoped
public class UsuarioBean implements Serializable {

    private Usuario usuario;
    private List<Usuario> usuarios;
    private List<Usuario> usuariosPesq;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Usuario> getUsuariosPesq() {
        return usuariosPesq;
    }

    public void setUsuariosPesq(List<Usuario> usuariosPesq) {
        this.usuariosPesq = usuariosPesq;
    }

    @PostConstruct
    public void init() {
        pesquisar();
    }

    public void pesquisar() {
        UsuarioDao usuarioDao = new UsuarioDao();
        this.usuarios = usuarioDao.getListar();
    }

    public void inserir() {
        usuario = new Usuario();
    }

    public void gravar() {
        UsuarioDao usuarioDao = new UsuarioDao();
        if (usuario.getUserid() == 0) {
            usuarioDao.inserir(usuario);
        } else {
            usuarioDao.atualizar(usuario);
        }
        pesquisar();
        JSFUtil.addMsgSucesso("Registro atualizado com sucesso!");
    }

    public void executarInativar() {
        UsuarioDao usuarioDao = new UsuarioDao();
        usuario.setBooFlagativo(usuario.getBooFlagativo() ? false : true);
        usuarioDao.atualizar(usuario);
        pesquisar();
        JSFUtil.addMsgSucesso("Registro inativado com sucesso!");
    }

}
