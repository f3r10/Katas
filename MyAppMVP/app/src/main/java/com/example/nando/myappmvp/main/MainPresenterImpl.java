package com.example.nando.myappmvp.main;

import com.example.nando.myappmvp.Listener.OnMainFinishedListener;

/**
 * Created by nando on 3/26/15.
 */
public class MainPresenterImpl implements MainPresenter, OnMainFinishedListener {

    private MainView mainView;
    private FindTextInteractor findTextInteractor;

    public MainPresenterImpl(MainView mainView){
        this.mainView = mainView;
        findTextInteractor = new FindTextInteractorImpl();
    }


    @Override
    public void onValidateMessage(String messages) {
        mainView.showProgress();
        findTextInteractor.compareMessage(messages, this);
    }

    @Override
    public void onFinised(String messages) {
        mainView.hideProgress();
        mainView.clenSearchBox();
        mainView.setMessages(messages);
    }

    @Override
    public void onMessageError() {
        mainView.hideProgress();
        mainView.showMessageError();
    }
}
