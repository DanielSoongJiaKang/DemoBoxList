package sg.edu.rp.c346.id19045346.demoboxlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ListView lvColour;
    ArrayList<BoxColour> alBoxColour;
    CustomAdapter caBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvColour = findViewById(R.id.listViewColourBox);
        alBoxColour = new ArrayList<>();
        BoxColour box1 = new BoxColour("blue");
        BoxColour box2 = new BoxColour("brown");
        BoxColour box3 = new BoxColour("orange");
        alBoxColour.addAll(Arrays.asList(box1,box2,box3));

        caBox = new CustomAdapter(this,R.layout.row,alBoxColour);
        lvColour.setAdapter(caBox);

    }
}
