package sg.edu.rp.c346.id19045346.demoboxlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<BoxColour> boxColour;


    public CustomAdapter(Context context, int resource, ArrayList<BoxColour> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        boxColour = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        ImageView ivBox = rowView.findViewById(R.id.imageViewColourbox);

        // Obtain the Android Version information based on the position
        BoxColour currentColour = boxColour.get(position);

        // Set values to the TextView to display the corresponding information
        switch (currentColour.getColour()) {
            case "blue":
                ivBox.setImageResource(R.drawable.blue_box);
                break;
            case "orange":
                ivBox.setImageResource(R.drawable.orange_box);
                break;
            case "brown":
                ivBox.setImageResource(R.drawable.brown_box);
                break;
        }

        return rowView;
    }
}
