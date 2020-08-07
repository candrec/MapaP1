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
public abstract class Pessoa {
    protected String nome;
    protected String documento;
    
    public abstract void exibeDados();
    
    public Pessoa(){
        this.setNome("");
        this.setDocumento("");
    }

    public Pessoa(String nome, String documento) {
        this.setNome(nome);
        this.setDocumento(documento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
