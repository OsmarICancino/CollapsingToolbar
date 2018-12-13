package com.dalvikmx.collapsingtoolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.dalvikmx.collapsingtoolbar.filings.Camembert;
import com.dalvikmx.collapsingtoolbar.filings.Cheddar;
import com.dalvikmx.collapsingtoolbar.filings.Cheese;
import com.dalvikmx.collapsingtoolbar.filings.Feta;
import com.dalvikmx.collapsingtoolbar.filings.Gorgonzola;
import com.dalvikmx.collapsingtoolbar.filings.Mahones;
import com.dalvikmx.collapsingtoolbar.filings.Manchego;
import com.dalvikmx.collapsingtoolbar.filings.Mozzarella;
import com.dalvikmx.collapsingtoolbar.filings.Parmesano;
import com.dalvikmx.collapsingtoolbar.filings.Roquefort;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
    }

    private void initData() {
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        DataAdapter adapter = new DataAdapter(createCheeses());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        //recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new ItemDivider(this, R.drawable.item_divider));
        recyclerView.setHasFixedSize(true);
    }

    private ArrayList<Cheese> createCheeses() {
        ArrayList<Cheese> cheeses = new ArrayList<>();
        cheeses.add(new Camembert());
        cheeses.add(new Camembert());
        cheeses.add(new Cheddar());
        cheeses.add(new Feta());
        cheeses.add(new Gorgonzola());
        cheeses.add(new Mahones());
        cheeses.add(new Manchego());
        cheeses.add(new Mozzarella());
        cheeses.add(new Parmesano());
        cheeses.add(new Roquefort());

        return cheeses;
    }
}
