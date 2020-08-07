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
public class Secretaria extends Funcionario{

    public Secretaria() {
        super();
    }

    public Secretaria(Double salario, Integer ramal, String nome, String documento) {
        super(salario, ramal, nome, documento);
    }

    
    @Override
    public void exibeDados() {
        System.out.println("Dados da Secretária:\n");
        System.out.println("Nome: " + nome
                + "\nDocumento: " + documento);
    }
    
}
