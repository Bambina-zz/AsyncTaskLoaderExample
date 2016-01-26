package com.example.bambi.asynctaskloaderexample;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by Bambi on 2016/01/26.
 */
public class MenuFragment extends ListFragment {
    String[] listItems = new String[] {"item1","item2"};
    String[] itemDetails = new String[] {"detail1","detail2"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_menu, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, listItems);
        setListAdapter(adapter);
        return view;
    }
}
