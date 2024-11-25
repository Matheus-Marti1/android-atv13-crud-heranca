package br.edu.fateczl.atv13crudsqliteheranca;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LivroFragment extends Fragment {

    private View view;
    private EditText etCodigoLivro, etNomeLivro, etQtdPaginasLivro, etEdicaoLivro, etIsbn;
    private Button btnBuscarLivro, btnInserirLivro, btnExcluirLivro, btnModificarLivro, btnListarLivro;
    private TextView tvListarLivro;

    public LivroFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_livro, container, false);
        etCodigoLivro = view.findViewById(R.id.etCodigoLivro);
        etNomeLivro = view.findViewById(R.id.etNomeLivro);
        etQtdPaginasLivro = view.findViewById(R.id.etQtdPaginasLivro);
        etEdicaoLivro = view.findViewById(R.id.etEdicaoLivro);
        etIsbn = view.findViewById(R.id.etIsbn);
        btnBuscarLivro = view.findViewById(R.id.btnBuscarLivro);
        btnInserirLivro = view.findViewById(R.id.btnInserirLivro);
        btnExcluirLivro = view.findViewById(R.id.btnExcluirLivro);
        btnModificarLivro = view.findViewById(R.id.btnModificarLivro);
        btnListarLivro = view.findViewById(R.id.btnListarLivro);
        tvListarLivro = view.findViewById(R.id.tvListarLivro);
        return view;
    }
}