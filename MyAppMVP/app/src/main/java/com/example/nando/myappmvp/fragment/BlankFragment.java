package com.example.nando.myappmvp.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nando.myappmvp.Listener.BlankFragmentListener;
import com.example.nando.myappmvp.R;
import com.example.nando.myappmvp.Listener.MainFragmentListener;
import com.example.nando.myappmvp.main.MainActivity;


public class BlankFragment extends Fragment implements BlankFragmentListener {

    public Context context;
    MainFragmentListener mMainListener;
    private TextView textView;

    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            Log.d("TEST","Mira si hay algo en el bundle" );
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        textView = (TextView)view.findViewById(R.id.idTextFragment);
        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        context = getActivity();
        try {
            mMainListener = (MainFragmentListener) context;
            ((MainActivity)context).mListenerFragment = this;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mMainListener = null;
    }

    @Override
    public void onMessagePass(String message) {
        textView.setText(message);
    }


}
