/*
 *@author:<Matheus Augusto Marti>
 */

package br.edu.fateczl.atv13crudsqliteheranca;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class InicioFragment extends Fragment {

    public InicioFragment() {
        super();
    }

    private View view;
    private TextView tvInicio;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_inicio, container, false);
        tvInicio = view.findViewById(R.id.tvInicio);
        tvInicio.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        return view;
    }
}