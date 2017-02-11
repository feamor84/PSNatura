package pl.bartekpawlowski.psnatura;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // SET CUSTOM FONT PATH
        // Set the font path
        String fontPath = "fonts/NexaRustHandmade-Extended-Free-webfont.ttf";
        // Get proper TextView
        TextView heading = (TextView) findViewById(R.id.Heading);
        // Load fotn as a TypeFace Object
        Typeface typeFace = Typeface.createFromAsset(getAssets(), fontPath);
        // Set fontface to heading TextView
        heading.setTypeface(typeFace);

        // SET ADDRESS TEXTVIEW CLICKABLE
        TextView address = (TextView) findViewById(R.id.Address);
        address.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
