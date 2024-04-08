package adnyey.tendimentions;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class FourthD extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_4d);


    }
    public void goToSo (View view) {
        goToUrl ( "http://upload.wikimedia.org/wikipedia/commons/5/55/Tesseract.gif");
    }
    public void goToSu (View view) {
        goToUrl ( "http://upload.wikimedia.org/wikipedia/commons/6/6f/Clifford-torus.gif");
    }


    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
