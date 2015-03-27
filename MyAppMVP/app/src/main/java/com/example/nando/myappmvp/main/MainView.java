package com.example.nando.myappmvp.main;

/**
 * Created by nando on 3/26/15.
 */
public interface MainView {

    public void setMessages(String message);

    public void showMessageError();

    public void showProgress();

    public void hideProgress();

    public void clenSearchBox();
}
