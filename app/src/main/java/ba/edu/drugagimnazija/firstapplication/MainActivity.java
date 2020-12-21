package ba.edu.drugagimnazija.firstapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.WallpaperManager;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Button promjeniPozadinu;
    private WallpaperManager wpmgr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        promjeniPozadinu=findViewById(R.id.button);

        promjeniPozadinu.setOnClickListener(new View.OnClickListener(){

            @SuppressLint("ResourceType")
            @Override

            public void onClick(View v) {
                wpmgr = WallpaperManager.getInstance(MainActivity.this);

                try {
                    wpmgr.setResource(R.drawable.back);
                } catch (IOException e) {

                }






            }
        });
    }

}