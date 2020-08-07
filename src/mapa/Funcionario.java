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
public abstract class Funcionario extends Pessoa {

    protected Double salario;
    protected Integer ramal;

    public Funcionario() {
        super();
        this.salario=0.0;
        this.ramal=0;
    }

    public Funcionario(Double salario, Integer ramal, String nome, String documento) {
        super(nome, documento);
        this.setSalario(salario);
        this.setRamal(ramal);
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getRamal() {
        return ramal;
    }

    public void setRamal(Integer ramal) {
        this.ramal = ramal;
    }
    
    public double calculaSalarioAnual (){
        return this.salario*13;
    }
    
}
