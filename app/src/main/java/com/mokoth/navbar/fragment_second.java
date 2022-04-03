package com.mokoth.navbar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment_second#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_second extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    RecyclerView recyclerView;

    // Using ArrayList to store images data
    FitnessModel[] fitnessModelArrayList = new FitnessModel[] {
       new FitnessModel("C#", R.drawable.img_1),
       new FitnessModel("JAVA", R.drawable.img_2),
       new FitnessModel("C++", R.drawable.img_3),
       new FitnessModel("Python", R.drawable.img_4),
       new FitnessModel("Javascript", R.drawable.img_5),
       new FitnessModel("DSA", R.drawable.img_6)  };

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragment_second() {
        // Required empty public constructor
    }

    public static fragment_second newInstance(String param1, String param2) {
        fragment_second fragment = new fragment_second();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Getting reference of recyclerView
        recyclerView = (RecyclerView) getView().findViewById(R.id.recyclerView);
        FitnessAdapter adapter = new FitnessAdapter(fitnessModelArrayList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_second, container, false);
    }
}