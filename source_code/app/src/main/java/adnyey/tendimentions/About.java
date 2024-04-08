package adnyey.tendimentions;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class About extends ActionBarActivity {
    Button src;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        src=(Button)findViewById(R.id.source);
        src.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Class firstD=Class.forName("adnyey.tendimentions.Source");
                    Intent i1d=new Intent(About.this, firstD);
                    startActivity(i1d);
                }
                catch(ClassNotFoundException e){
                    e.printStackTrace();
                }
            }
        });
    }
    public void goToplus (View view) {
        goToUrl ( "https://plus.google.com/u/0/+ManasMahajan");
    }
    public void goTofb (View view) {
        goToUrl ( "https://www.facebook.com/Adnyey");
    }
    public void goToxda (View view) {
        goToUrl ( "http://forum.xda-developers.com/member.php?u=5003071");
    }
    public void goToinsta (View view) {
        goToUrl ( "https://instagram.com/adnyey/");
    }
    public void goToTwitter (View view) {
        goToUrl ( "https://twitter.com/adnyey");
    }



    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }


}
