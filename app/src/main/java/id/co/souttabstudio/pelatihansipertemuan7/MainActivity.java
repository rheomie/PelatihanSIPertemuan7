package id.co.souttabstudio.pelatihansipertemuan7;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tombolLokasi(View view) {
        Uri gmmIntentUri = Uri.parse("google.navigation:q=N8 Coffee,&Jalan&Pelita&I&(Gang&A2L),&Labuhan&Ratu,&Kedaton,&Bandar&Lampung&City,&Lampung&35132");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.@:android.apps.maps");
        startActivity(mapIntent);

    }
}
