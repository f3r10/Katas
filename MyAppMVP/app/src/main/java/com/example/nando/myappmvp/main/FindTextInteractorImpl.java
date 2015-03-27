package com.example.nando.myappmvp.main;

import android.os.Handler;

import com.example.nando.myappmvp.Listener.OnMainFinishedListener;

/**
 * Created by nando on 3/26/15.
 */
public class FindTextInteractorImpl implements FindTextInteractor {


    @Override
    public void compareMessage(final String message, final OnMainFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                boolean error = false;
                String msg = message;
                if (msg.isEmpty()){
                    error = true;
                    listener.onMessageError();
                }
                if (!error){
                    listener.onFinised(msg);
                }
            }
        }, 2000);
    }
}
