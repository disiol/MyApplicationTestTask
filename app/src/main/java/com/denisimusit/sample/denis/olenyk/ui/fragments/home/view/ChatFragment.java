package com.denisimusit.sample.denis.olenyk.ui.fragments.home.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;


import com.denisimusit.sample.denis.olenyk.R;
import com.denisimusit.sample.denis.olenyk.databinding.ChatFragmentBinding;
import com.denisimusit.sample.denis.olenyk.modell.MapModel;
import com.denisimusit.sample.denis.olenyk.ui.base.BaseBindingFragment;
import com.denisimusit.sample.denis.olenyk.ui.fragments.home.presenter.HomePresenter;
import com.denisimusit.sample.denis.olenyk.ui.holdersAndAdapters.MapAdapter;

import java.util.ArrayList;
import java.util.List;

public class ChatFragment extends BaseBindingFragment<HomePresenter, ChatFragmentBinding> implements HomeView {

    private List<MapModel> regionsList = new ArrayList<>();
    //Объявим RecyclerView
    RecyclerView rvMain;
    //И его адаптер
    MapAdapter mapAdapter;




    @Override
    public int getLayoutResId() {
        return R.layout.chat_fragment;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getNameMaps();

        //Привяжем его к элементу
        rvMain = view.findViewById(R.id.home_RecyclerView);
        //Создадим адаптер
        mapAdapter = new MapAdapter(regionsList);
        //Применим наш адаптер к RecyclerView
        rvMain.setAdapter(mapAdapter);
        //И установим LayoutManager
        rvMain.setLayoutManager(new LinearLayoutManager(getActivity()));



//        getNameMaps();
//        startDownloadMap();
    }

    @Override
    public void startDownloadMap() {

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void showError(Throwable throwable) {

    }

    public List<MapModel> getNameMaps() {

        //TODO  распарсить из файла http://blog.harrix.org/article/2966#h2_4
        MapModel denmark = new MapModel("denmark", "yes");
        regionsList.add(denmark);
        MapModel germany = new MapModel("germany", "yes");
        regionsList.add(germany);
        MapModel france = new MapModel("france", "yes");
        regionsList.add(france);

        MapModel paysDeLaLoire = new MapModel("pays-de-la-loire");
        regionsList.add(paysDeLaLoire);

        return regionsList;
    }


}



