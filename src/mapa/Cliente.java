/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapa;

/**
 *
 * @author almeida
 */
public class Cliente extends Pessoa {

    private String usuario;
    private String senha;

    public Cliente() {
        super();
        this.usuario="";
        this.senha="";
    }

    public Cliente(String usuario, String senha, String nome, String documento) {
        super(nome, documento);
        this.setUsuario(usuario);
        this.setSenha(senha);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean verificaSenha(String senha){
        if(senha==this.senha){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void exibeDados() {
        System.out.println("Dados do Cliente:\n");
        System.out.println("Nome: " + nome
                + "\nDocumento: " + documento);
    }

}
