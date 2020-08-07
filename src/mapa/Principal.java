/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapa;

/**
 * Unicesumar
 * Analise e Desenvolvimento de Sistemas
 * Progamação 1
 * Profº André Noel
 * @author almeida
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //inicializando os objetos
        Presidente p = new Presidente(15000.0, 101, "Asdrubal Leôncio Correa", "123456");
        Secretaria s1 = new Secretaria(5000.0, 102, "Fátima", "1123456");
        Secretaria s2 = new Secretaria(5000.0, 103, "Ana", "1223456");
        Vendedor v1 = new Vendedor(0.0, 3000.0, 104, "João", "1233456");
        Vendedor v2 = new Vendedor(0.0, 3000.0, 105, "Vanessa", "1234456");
        Vendedor v3 = new Vendedor(0.0, 3000.0, 106, "Carlos", "1234556");
        Cliente c1 = new Cliente("001", "1234", "Marcos", "11111111");
        Cliente c2 = new Cliente("002", "4321", "Joana", "00000000");
        Cliente c3 = new Cliente("003", "2345", "Elisa", "55555555");
        Cliente c4 = new Cliente("004", "123456", "Lucas", "12345678");

        //Definindo as comissões dos vendedores
        v1.setComissao(250.0);
        v2.setComissao(500.0);
        v3.setComissao(1000.0);

        //salario anual de Asdrubal e Ana
        System.out.println("O Salário Anual do Presidente Asdrubal é: R$ " + p.calculaSalarioAnual());
        System.out.println("\nO Salário Anual da Secretária Ana é: R$ " + s2.calculaSalarioAnual());
        
        //verificando a senha do cliente lucas
        if(c4.getSenha()=="123456"){
            System.out.println("\nA senha de Lucas é \"123456\"");
        }
        else if (c4.getSenha()=="segredo"){
            System.out.println("\nA senha de Lucas é \"segredo\"");
        }
        else if (c4.getSenha()=="teste"){
            System.out.println("\nA senha de Lucas é \"teste\"");
        }
        else{
            System.out.println("\nA senha de Lucas está errada");
        }
        
        //exibindo dados de todos os envolvidos
        System.out.println("\n------------------------------------\n");
        p.exibeDados();
        System.out.println("\n------------------------------------\n");
        s1.exibeDados();
        System.out.println("\n------------------------------------\n");
        s2.exibeDados();
        System.out.println("\n------------------------------------\n");
        v1.exibeDados();
        System.out.println("\n------------------------------------\n");
        v2.exibeDados();
        System.out.println("\n------------------------------------\n");
        v3.exibeDados();
        System.out.println("\n------------------------------------\n");
        c1.exibeDados();
        System.out.println("\n------------------------------------\n");
        c2.exibeDados();
        System.out.println("\n------------------------------------\n");
        c3.exibeDados();
        System.out.println("\n------------------------------------\n");
        c4.exibeDados();
        
    }

}
