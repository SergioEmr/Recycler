package sergio_emr.recyclercoursera;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import sergio_emr.recyclercoursera.adapter.ContactoAdaptador;
import sergio_emr.recyclercoursera.modelo.Contacto;

/**
 * Created by sergio on 28/06/2016.
 */
public class RecyclerViewFragment extends Fragment{

    ArrayList<Contacto> contactos;
    private RecyclerView listaContactos;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_recyclerview, container, false);
        listaContactos = (RecyclerView) root.findViewById(R.id.recyclerView_Home);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        listaContactos.setLayoutManager(linearLayoutManager);
        inicializarListaContactos();
        inicializarAdaptador();
        return root;
    }

    public void inicializarListaContactos(){
        contactos = new ArrayList<>();
        contactos.add(new Contacto("Sergio Morales", "3349023", R.drawable.iceberg,6));
        contactos.add(new Contacto("Uriel Cruz", "23459802", R.drawable.atardecer,8));
        contactos.add(new Contacto("Abraham Martinez", "3243804", R.drawable.montanias,10));
    }

    public void inicializarAdaptador(){
        ContactoAdaptador adaptador = new ContactoAdaptador(contactos);
        listaContactos.setAdapter(adaptador);
    }
}
