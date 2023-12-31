package domain;

import java.sql.Date;

public class Funcionario extends BasePessoa {
    
    private String contaCorrente;
    private String registro;
    private String cracha;
    
    public String getContaCorrente() {
        return contaCorrente;
    }
    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public String getCracha() {
        return cracha;
    }
    public void setCracha(String cracha) {
        this.cracha = cracha;
    }
    
    public Funcionario(
        int codigo, 
        String nome, 
        String email, 
        String telefone, 
        Date dataNascimento, 
        String usuario,
        String senha, 
        String contaCorrente, 
        String registro, 
        String cracha
        ) 
    {
        super(codigo, nome, email, telefone, dataNascimento, usuario, senha);
        this.contaCorrente = contaCorrente;
        this.registro = registro;
        this.cracha = cracha;
    }

    

}
