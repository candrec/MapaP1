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
public class Vendedor extends Funcionario{
    
    private double comissao;

    public Vendedor() {
        super();
        this.comissao=0.0;
    }

    public Vendedor(double comissao, Double salario, Integer ramal, String nome, String documento) {
        super(salario, ramal, nome, documento);
        this.setComissao(comissao);
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    
    @Override
    public void exibeDados() {
        System.out.println("Dados do Vendedor:\n");
        System.out.println("Nome: " + nome
                + "\nDocumento: " + documento);
    }
    
    public double salarioMesComComissao(){
        return comissao+salario;
    }
}
