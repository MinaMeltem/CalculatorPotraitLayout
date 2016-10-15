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
import static com.example.calculatoras.R.id.origin_btn;
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
                intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent1);
                break;
            case narnia_btn:
                    Intent intent11 = new Intent(backgroundselector.this, narnia.class);
                intent11.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent11);
                break;
            case cityview_btn:
                    Intent intent2 = new Intent(backgroundselector.this, cityView.class);
                intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent2);
                break;
            case galaxy_btn:
                    Intent intent3 = new Intent(backgroundselector.this, galaxy.class);
                intent3.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent3);
                break;
            case headlesshorseman_btn:
                    Intent intent4 = new Intent(backgroundselector.this, headlessHoarseman.class);
                intent4.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent4);
                break;
            case homeontherange_btn:
                    Intent intent5 = new Intent(backgroundselector.this, homeontherange.class);
                intent5.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent5);
                break;
            case lonelyroad_btn:
                     Intent intent6 = new Intent(backgroundselector.this, lonelyroad.class);
                intent6.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent6);
                break;
            case santasjourney_btn:
                    Intent intent7 = new Intent(backgroundselector.this, santasjourney.class);
                intent7.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent7);
                break;
            case sunflower_btn:
                    Intent intent8 = new Intent(backgroundselector.this, sunflowerfields.class);
                intent8.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent8);
                break;
            case underwater_btn:
                    Intent intent9 = new Intent(backgroundselector.this, underwater.class);
                intent9.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent9);
                break;
            case waters_btn:
                    Intent intent10 = new Intent(backgroundselector.this, waterdrop.class);
                intent10.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent10);
                break;
            case route66_btn:
                Intent intent14 = new Intent(backgroundselector.this, Route66.class);
                intent14.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent14);
                break;
            case origin_btn:
                Intent intent13 = new Intent (backgroundselector.this, MainActivity.class);
                intent13.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent13);
            default:
                System.out.println("Nice Try");
        }
    }
}
