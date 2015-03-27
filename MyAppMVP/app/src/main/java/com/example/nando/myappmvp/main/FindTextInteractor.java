package com.example.nando.myappmvp.main;

import com.example.nando.myappmvp.Listener.OnMainFinishedListener;

/**
 * Created by nando on 3/26/15.
 */
public interface FindTextInteractor {

    public void compareMessage(String message, OnMainFinishedListener listener);
}
