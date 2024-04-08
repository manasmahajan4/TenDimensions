package adnyey.tendimentions;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class EleventhD extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_11d);
    }

    public void goToll (View view) {
        goToUrl ( "http://en.wikipedia.org/wiki/Leech_lattice");
    }
    public void goToSugra (View view) {
        goToUrl ( "http://en.wikipedia.org/wiki/Supergravity");
    }
    public void goToSST (View view) {
        goToUrl ( "http://en.wikipedia.org/wiki/Superstring_theory");
    }
    public void goToMT (View view) {
        goToUrl ( "http://en.wikipedia.org/wiki/M-theory");
    }
    public void goToKKT (View view) {
        goToUrl ( "http://en.wikipedia.org/wiki/Kaluza-Klein_theory");
    }
    public void goToTOE (View view) {
        goToUrl ( "http://en.wikipedia.org/wiki/Theory_of_everything");
    }
    public void goToSVT (View view) {
        goToUrl ( "http://en.wikipedia.org/wiki/Superfluid_vacuum_theory");
    }
    public void goToST (View view) {
        goToUrl ( "http://en.wikipedia.org/wiki/String_theory");
    }
    public void goToCOD (View view) {
        goToUrl ( "http://en.wikipedia.org/wiki/Curse_of_dimensionality");
    }
    public void goToCYM (View view) {
        goToUrl ( "http://en.wikipedia.org/wiki/Calabi-Yau_manifold");
    }
    public void goToTENV (View view) {
        goToUrl ( "https://www.youtube.com/watch?v=gg85IH3vghA");
    }
    public void goToDR (View view) {
        goToUrl ( "https://www.youtube.com/watch?v=-x4P65EKjt0");
    }



    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
