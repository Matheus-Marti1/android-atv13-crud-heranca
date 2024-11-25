/*
 *@author:<Matheus Augusto Marti>
 */

package br.edu.fateczl.atv13crudsqliteheranca.model;

import androidx.annotation.NonNull;

public class Revista extends Exemplar {
    private String ISSN;

    public Revista() {
        super();
    }

    public String getISSN() {
        return ISSN;
    }

    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString() + " - Revista - ISSN: " + ISSN;
    }
}
