/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex08.projetos;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class Departamento {

    private String nome;
    private int id;
    private Funcionario gerente;
    private String dataComeco;
    private Projeto projeto;    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Funcionario getGerente() {
        return gerente;
    }

    public void setGerente(Funcionario gerente) {
        this.gerente = gerente;
    }

    public String getDataComeco() {
        return dataComeco;
    }

    public void setDataComeco(String dataComeco) {
        this.dataComeco = dataComeco;
    }

}
