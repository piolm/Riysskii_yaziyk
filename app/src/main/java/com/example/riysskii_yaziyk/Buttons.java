package com.example.riysskii_yaziyk;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class Buttons extends Fragment {

    public Buttons() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View i = inflater.inflate(R.layout.fragment_buttons, container, false);
        RecyclerView rView = i.findViewById(R.id.recycler);
        ArrayList<RulesAdapter.RuleBurh> ruleBurhArrayList = new ArrayList<>();
        ruleBurhArrayList.add(new RulesAdapter.RuleBurh("Предлог “во”", "С перечислениями нам приходится встречаться довольно часто в любых видах устной и письменной речи. Они используются для того, чтобы сделать высказывание более четким, логичным, структурированным. Для оформления перечисления как раз и используются наречия, образованные от порядковых числительных: первый, второй, третий, четвертый."));
        ruleBurhArrayList.add(new RulesAdapter.RuleBurh("Глагол", "Глагол – часть речи, которая обозначает действие. Отвечает на вопросы ЧТО ДЕЛАТЬ? ЧТО СДЕЛАТЬ и тд. Глагол изменяется по числам, лицам, родам, временам. У него можно определить спряжение. Начальная форма глагола – инфинитив – отвечает на вопросы ЧТО ДЕЛАТЬ? ЧТО СДЕЛАТЬ?"));
        ruleBurhArrayList.add(new RulesAdapter.RuleBurh("Наречие",  "Наречие - это неизменяемая часть речи. Она отвечает на следующие вопросы: ГДЕ? КОГДА? КУДА? ОТКУДА? ПОЧЕМУ? ЗАЧЕМ? КАК?"));
        RulesAdapter rulesAdapter = new RulesAdapter(i.getContext(), ruleBurhArrayList);
        rView.setAdapter(rulesAdapter);
        return i;
    }
}