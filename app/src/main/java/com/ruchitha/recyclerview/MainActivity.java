package com.ruchitha.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView rv;
int[] images={R.drawable.alpha,R.drawable.beta,R.drawable.cupcake,R.drawable.donut,
        R.drawable.eclair,R.drawable.froyo,R.drawable.gingerbread,R.drawable.honeycomb,
        R.drawable.icecreamsandwich, R.drawable.jellybean,R.drawable.kitkat,
        R.drawable.lollipop,R.drawable.marshmallow,R.drawable.nougat,
        R.drawable.oreo,R.drawable.pie,R.drawable.q,R.drawable.r};
String[] versions={"Alpha","Beta","CupCake","Donut","Eclair","Froyo","GingerBread",
        "HoneyComb","IceCreamSandwich", "JellyBean","KitKat","Lollipop","Marshmallow",
        "Nougat","Oreo","Pie","Q","R"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.recycler);
        rv.setAdapter(new MyDataAdapter(this,images,versions));
        rv.setLayoutManager(new GridLayoutManager(this,2));
    }
}