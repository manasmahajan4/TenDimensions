package adnyey.tendimentions;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {
Button OneD, TwoD, ThreeD, FourD, FiveD, SixD, SevenD, EightD, NineD, TenD, ElevenD,About;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OneD=(Button)findViewById(R.id.button);
        TwoD=(Button)findViewById(R.id.button2);
        ThreeD=(Button)findViewById(R.id.button3);
        FourD=(Button)findViewById(R.id.button4);
        FiveD=(Button)findViewById(R.id.button5);
        SixD=(Button)findViewById(R.id.button6);
        SevenD=(Button)findViewById(R.id.button7);
        EightD=(Button)findViewById(R.id.button8);
        NineD=(Button)findViewById(R.id.button9);
        TenD=(Button)findViewById(R.id.button10);
        ElevenD=(Button)findViewById(R.id.button11);
        About=(Button)findViewById(R.id.button12);


        OneD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Class firstD=Class.forName("adnyey.tendimentions.FirstD");
                    Intent i1d=new Intent(MainActivity.this, firstD);
                    startActivity(i1d);
                }
                catch(ClassNotFoundException e){
                    e.printStackTrace();
                }
            }
        });
        TwoD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Class secondD=Class.forName("adnyey.tendimentions.SecondD");
                    Intent i2d=new Intent(MainActivity.this, secondD);
                    startActivity(i2d);
                }
                catch(ClassNotFoundException e){
                    e.printStackTrace();
                }
            }
        });
        ThreeD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Class secondD=Class.forName("adnyey.tendimentions.ThirdD");
                    Intent i2d=new Intent(MainActivity.this, secondD);
                    startActivity(i2d);
                }
                catch(ClassNotFoundException e){
                    e.printStackTrace();
                }
            }
        });
        FourD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Class secondD=Class.forName("adnyey.tendimentions.FourthD");
                    Intent i2d=new Intent(MainActivity.this, secondD);
                    startActivity(i2d);
                }
                catch(ClassNotFoundException e){
                    e.printStackTrace();
                }
            }
        });
        FiveD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Class secondD=Class.forName("adnyey.tendimentions.FifthD");
                    Intent i2d=new Intent(MainActivity.this, secondD);
                    startActivity(i2d);
                }
                catch(ClassNotFoundException e){
                    e.printStackTrace();
                }
            }
        });
        SixD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Class secondD=Class.forName("adnyey.tendimentions.SixthD");
                    Intent i2d=new Intent(MainActivity.this, secondD);
                    startActivity(i2d);
                }
                catch(ClassNotFoundException e){
                    e.printStackTrace();
                }
            }
        });
        SevenD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Class secondD=Class.forName("adnyey.tendimentions.SeventhD");
                    Intent i2d=new Intent(MainActivity.this, secondD);
                    startActivity(i2d);
                }
                catch(ClassNotFoundException e){
                    e.printStackTrace();
                }
            }
        });
        EightD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Class secondD=Class.forName("adnyey.tendimentions.EighthD");
                    Intent i2d=new Intent(MainActivity.this, secondD);
                    startActivity(i2d);
                }
                catch(ClassNotFoundException e){
                    e.printStackTrace();
                }
            }
        });
        NineD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Class secondD=Class.forName("adnyey.tendimentions.NinethD");
                    Intent i2d=new Intent(MainActivity.this, secondD);
                    startActivity(i2d);
                }
                catch(ClassNotFoundException e){
                    e.printStackTrace();
                }
            }
        });
        TenD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Class secondD=Class.forName("adnyey.tendimentions.TenthD");
                    Intent i2d=new Intent(MainActivity.this, secondD);
                    startActivity(i2d);
                }
                catch(ClassNotFoundException e){
                    e.printStackTrace();
                }
            }
        });
        ElevenD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Class secondD=Class.forName("adnyey.tendimentions.EleventhD");
                    Intent i2d=new Intent(MainActivity.this, secondD);
                    startActivity(i2d);
                }
                catch(ClassNotFoundException e){
                    e.printStackTrace();
                }
            }
        });
        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Class secondD=Class.forName("adnyey.tendimentions.About");
                    Intent i2d=new Intent(MainActivity.this, secondD);
                    startActivity(i2d);
                }
                catch(ClassNotFoundException e){
                    e.printStackTrace();
                }
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
