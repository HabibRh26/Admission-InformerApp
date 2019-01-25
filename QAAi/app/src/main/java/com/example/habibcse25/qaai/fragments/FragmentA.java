package com.example.habibcse25.qaai.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.habibcse25.qaai.R;


/**
 * Created by HabibCse25 on 8/4/2018.
 */

public class FragmentA extends Fragment implements AdapterView.OnItemClickListener {
    ListView listView;
    Communicator comm;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.public_frag_a,container,false);
        listView = view.findViewById(R.id.list_item);
        ArrayAdapter adapter =  ArrayAdapter.createFromResource(getActivity(),R.array.public_univ_list,android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        comm = (Communicator) getActivity();

        return view;
    }

   /* @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        listView = getActivity().findViewById(R.id.list_item);
        ArrayAdapter adapter =  ArrayAdapter.createFromResource(getActivity(),R.array.public_univ_list,android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        comm = (Communicator) getActivity();

    }*/

    public void setCommunicator(Communicator comm){
        this.comm= comm;
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

        comm.respond(position);
    }
    public interface Communicator{
        public void respond(int position);

    }
}
