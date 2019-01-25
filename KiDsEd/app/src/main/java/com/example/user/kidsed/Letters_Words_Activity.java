package com.example.user.kidsed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.user.kidsed.adapter.CustomAdapter_letters;
import com.example.user.kidsed.model.LettersImageGrid;

import java.util.ArrayList;

public class Letters_Words_Activity extends AppCompatActivity {
    GridView gridView;
    ArrayList<LettersImageGrid> lettersImageGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letters__words);

        gridView = findViewById(R.id.gridView);
        lettersImageGrid = new ArrayList<>();

        CustomAdapter_letters adapter_letters = new CustomAdapter_letters(this,lettersImageGrid);

        gridView.setAdapter(adapter_letters);
        setData();

    }
    private void setData() {

        LettersImageGrid letter_A = new LettersImageGrid(R.drawable.a,"",R.raw.a);
        LettersImageGrid letter_B = new LettersImageGrid(R.drawable.b,"",R.raw.b);
        LettersImageGrid letter_C = new LettersImageGrid(R.drawable.c,"",R.raw.c);
        LettersImageGrid letter_D = new LettersImageGrid(R.drawable.d,"",R.raw.d);
        LettersImageGrid letter_E = new LettersImageGrid(R.drawable.e,"",R.raw.e);
        LettersImageGrid letter_F = new LettersImageGrid(R.drawable.f,"",R.raw.f);
        LettersImageGrid letter_G = new LettersImageGrid(R.drawable.g,"",R.raw.g);
        LettersImageGrid letter_H = new LettersImageGrid(R.drawable.h,"",R.raw.h);
        LettersImageGrid letter_I = new LettersImageGrid(R.drawable.i,"",R.raw.i);
        LettersImageGrid letter_J = new LettersImageGrid(R.drawable.j,"",R.raw.j);
        LettersImageGrid letter_K = new LettersImageGrid(R.drawable.k,"",R.raw.k);
        LettersImageGrid letter_L = new LettersImageGrid(R.drawable.l,"",R.raw.l);
        LettersImageGrid letter_M = new LettersImageGrid(R.drawable.m,"",R.raw.m);
        LettersImageGrid letter_N = new LettersImageGrid(R.drawable.n,"",R.raw.n);
        LettersImageGrid letter_O = new LettersImageGrid(R.drawable.o,"",R.raw.o);
        LettersImageGrid letter_P = new LettersImageGrid(R.drawable.p,"",R.raw.p);
        LettersImageGrid letter_Q = new LettersImageGrid(R.drawable.q,"",R.raw.q);
        LettersImageGrid letter_R = new LettersImageGrid(R.drawable.r,"",R.raw.r);
        LettersImageGrid letter_S = new LettersImageGrid(R.drawable.s,"",R.raw.s);
        LettersImageGrid letter_T = new LettersImageGrid(R.drawable.t,"",R.raw.t);
        LettersImageGrid letter_U = new LettersImageGrid(R.drawable.u,"",R.raw.u);
        LettersImageGrid letter_V = new LettersImageGrid(R.drawable.v,"",R.raw.v);
        LettersImageGrid letter_W = new LettersImageGrid(R.drawable.w,"",R.raw.w);
        LettersImageGrid letter_X = new LettersImageGrid(R.drawable.x,"",R.raw.x);
        LettersImageGrid letter_Y = new LettersImageGrid(R.drawable.y,"",R.raw.y);
        LettersImageGrid letter_Z = new LettersImageGrid(R.drawable.y,"",R.raw.z);

        lettersImageGrid.add(letter_A);
        lettersImageGrid.add(letter_B);
        lettersImageGrid.add(letter_C);
        lettersImageGrid.add(letter_D);
        lettersImageGrid.add(letter_E);
        lettersImageGrid.add(letter_F);
        lettersImageGrid.add(letter_G);
        lettersImageGrid.add(letter_H);
        lettersImageGrid.add(letter_I);
        lettersImageGrid.add(letter_J);
        lettersImageGrid.add(letter_K);
        lettersImageGrid.add(letter_L);
        lettersImageGrid.add(letter_M);
        lettersImageGrid.add(letter_N);
        lettersImageGrid.add(letter_O);
        lettersImageGrid.add(letter_P);
        lettersImageGrid.add(letter_Q);
        lettersImageGrid.add(letter_R);
        lettersImageGrid.add(letter_S);
        lettersImageGrid.add(letter_T);
        lettersImageGrid.add(letter_U);
        lettersImageGrid.add(letter_V);
        lettersImageGrid.add(letter_W);
        lettersImageGrid.add(letter_X);
        lettersImageGrid.add(letter_Y);
        lettersImageGrid.add(letter_Z);

    }
}
