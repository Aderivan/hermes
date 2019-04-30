package br.com.apsinformatica.bean;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

import org.primefaces.PrimeFaces;

import br.com.apsinformatica.dao.UsuarioDao;
import br.com.apsinformatica.domain.Login;
import br.com.apsinformatica.infra.JSFUtil;
import br.com.apsinformatica.infra.Session;

@ManagedBean(name = "MBLogin")
public class LoginBean {

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login(ActionEvent event) throws InterruptedException, IOException {
        try {

            if (username.trim().isEmpty()) {
                throw new Exception("Usuário não foi preenchido!");
            }

            if (password.trim().isEmpty()) {
                throw new Exception("Senha não informada!");
            }

            UsuarioDao dao = new UsuarioDao();
            Login l = dao.getAutenticarUsuario(username, password);
            if (l.getUsuario() == null || l.getUsuario().isEmpty()) {
                throw new Exception("Usuário ou senha invalidos!");
            }
            JSFUtil.addMsgSucesso("Bom vindo " + l.getUsuario());
            Session.instance().setUsuario(l);
            JSFUtil.redirecionar("index.xhtml");
        } catch (Exception e) {
            JSFUtil.addMsgError(e.getMessage());
        }
    }

}
