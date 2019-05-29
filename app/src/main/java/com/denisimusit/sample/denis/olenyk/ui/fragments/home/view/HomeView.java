package com.denisimusit.sample.denis.olenyk.ui.fragments.home.view;

import com.denisimusit.sample.denis.olenyk.ui.base.BaseView;

public interface HomeView extends BaseView {

    void startDownloadMap();

    void showProgress();

    void hideProgress();

    void showMessage(String message);

    void showError(Throwable throwable);
}
