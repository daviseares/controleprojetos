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
public abstract class Projeto {

    private int id;
    private String nome;
    private String dataInicio;
    private String dataFim;
    private float custoExecucao;
    private ArrayList<Alocacao> alocados;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public float getCustoExecucao() {
        return custoExecucao;
    }

    public void setCustoExecucao(float custoExecucao) {
        this.custoExecucao = custoExecucao;
    }

}
