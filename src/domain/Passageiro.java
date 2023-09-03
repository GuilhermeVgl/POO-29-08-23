package domain;

import java.sql.Date;

public class Passageiro extends BasePessoa {
    
    private String numeroCartao;
    private String documento;
    private String registro;

    public String getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public Passageiro(
        int codigo, 
        String nome, 
        String email, 
        String telefone, 
        Date dataNascimento, 
        String usuario,
        String senha, 
        String numeroCartao, 
        String documento, 
        String registro
        ) 
    {
        super(codigo, nome, email, telefone, dataNascimento, usuario, senha);
        this.numeroCartao = numeroCartao;
        this.documento = documento;
        this.registro = registro;
    }
    
    

}
