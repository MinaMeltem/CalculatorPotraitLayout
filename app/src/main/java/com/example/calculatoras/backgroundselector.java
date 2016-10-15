package com.example.calculatoras;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static com.example.calculatoras.R.id.autumn_btn;
import static com.example.calculatoras.R.id.cityview_btn;
import static com.example.calculatoras.R.id.galaxy_btn;
import static com.example.calculatoras.R.id.headlesshorseman_btn;
import static com.example.calculatoras.R.id.homeontherange_btn;
import static com.example.calculatoras.R.id.lonelyroad_btn;
import static com.example.calculatoras.R.id.narnia_btn;
import static com.example.calculatoras.R.id.route66_btn;
import static com.example.calculatoras.R.id.santasjourney_btn;
import static com.example.calculatoras.R.id.sunflower_btn;
import static com.example.calculatoras.R.id.underwater_btn;
import static com.example.calculatoras.R.id.waters_btn;

public class backgroundselector extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.backgroundselector);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case autumn_btn:
                    Intent intent1 = new Intent(backgroundselector.this, autumn.class);
                    startActivity(intent1);
                break;
            case narnia_btn:
                    Intent intent11 = new Intent(backgroundselector.this, narnia.class);
                    startActivity(intent11);
                break;
            case cityview_btn:
                    Intent intent2 = new Intent(backgroundselector.this, cityView.class);
                    startActivity(intent2);
                break;
            case galaxy_btn:
                    Intent intent3 = new Intent(backgroundselector.this, galaxy.class);
                    startActivity(intent3);
                break;
            case headlesshorseman_btn:
                    Intent intent4 = new Intent(backgroundselector.this, headlessHoarseman.class);
                    startActivity(intent4);
                break;
            case homeontherange_btn:
                    Intent intent5 = new Intent(backgroundselector.this, homeontherange.class);
                    startActivity(intent5);
                break;

            case lonelyroad_btn:
                     Intent intent6 = new Intent(backgroundselector.this, lonelyroad.class);
                    startActivity(intent6);
                break;
            case santasjourney_btn:
                    Intent intent7 = new Intent(backgroundselector.this, santasjourney.class);
                    startActivity(intent7);
                break;
            case sunflower_btn:
                    Intent intent8 = new Intent(backgroundselector.this, sunflowerfields.class);
                    startActivity(intent8);
                break;
            case underwater_btn:
                    Intent intent9 = new Intent(backgroundselector.this, underwater.class);
                    startActivity(intent9);
                break;
            case waters_btn:
                    Intent intent10 = new Intent(backgroundselector.this, waterdrop.class);
                    startActivity(intent10);
                break;
            case route66_btn:
                Intent intent12 = new Intent(backgroundselector.this, Route66.class);
                startActivity(intent12);
                break;
            default:
                System.out.println("Nice Try");
        }
    }
}
