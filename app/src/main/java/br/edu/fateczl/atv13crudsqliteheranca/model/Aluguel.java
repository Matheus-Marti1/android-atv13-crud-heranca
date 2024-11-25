/*
 *@author:<Matheus Augusto Marti>
 */

package br.edu.fateczl.atv13crudsqliteheranca.model;

import androidx.annotation.NonNull;

import java.time.LocalDate;

public class Aluguel {
    private Aluno aluno;
    private Exemplar exemplar;
    private LocalDate dataRetirada;
    private LocalDate dataDevolucao;

    public Aluguel() {
        super();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    public LocalDate getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(LocalDate dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @NonNull
    @Override
    public String toString() {
        return "Aluguel - Aluno: " + aluno + " - Exemplar: " + exemplar +
                " - Data de Retirada: " + dataRetirada +
                " - Data de Devolução: " + dataDevolucao;
    }
}
