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
public class Presidente extends Funcionario {

    public Presidente(Double salario, Integer ramal, String nome, String documento) {
        super(salario, ramal, nome, documento);
    }

    public Presidente() {
        super();
    }

    @Override
    public void exibeDados() {
        System.out.println("Dados do Presidente:\n");
        System.out.println("Nome: " + nome
                + "\nDocumento: " + documento);
    }

}
