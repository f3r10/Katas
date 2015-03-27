package com.example.nando.myappmvp.main;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.nando.myappmvp.Listener.MainFragmentListener;
import com.example.nando.myappmvp.R;
import com.example.nando.myappmvp.Listener.BlankFragmentListener;
import com.example.nando.myappmvp.fragment.BlankFragment;
import com.example.nando.myappmvp.fragment.BlankFragment2;


public class MainActivity extends ActionBarActivity implements MainFragmentListener,MainView, View.OnClickListener  {
    public BlankFragmentListener mListenerFragment;
    private EditText editText;
    private ProgressBar progressBar;
    private BlankFragment blankFragment;
    private BlankFragment2 blankFragment2;
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Componets
        editText = (EditText)findViewById(R.id.idEditText);
        progressBar = (ProgressBar)findViewById(R.id.idProgessBar);
        findViewById(R.id.idButton).setOnClickListener(this);
        findViewById(R.id.idButtonChange).setOnClickListener(this);

        //Presenter
        presenter = new MainPresenterImpl(this);

        //Fragments
        blankFragment = new BlankFragment();
        blankFragment2 = new BlankFragment2();
        insertInitialFragment();

    }

    private void insertInitialFragment(){

        getSupportFragmentManager().beginTransaction().add(R.id.idFrame, blankFragment).commit();
    }

    @Override
    public void passDataToActivity(String someValue) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case (R.id.idButton):
                presenter.onValidateMessage(editText.getText().toString());
                break;
            case (R.id.idButtonChange):
                replaceFragment();
                break;
        }


    }

    @Override
    public void setMessages(String message) {
        mListenerFragment.onMessagePass(message);
    }

    @Override
    public void showMessageError() {
        Toast.makeText(this, "Debe introducir un mensaje", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void clenSearchBox() {
        editText.setText("");
    }



    private void replaceFragment(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (blankFragment.isVisible()){
            Log.d("TEST", "Es visible e 1");
            transaction.replace(R.id.idFrame, blankFragment2);

        }else {
            transaction.replace(R.id.idFrame, blankFragment);
        }
        transaction.commit();
    }
}
