package com.example.rishan.rishan.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.rishan.rishan.Model.Inquiry;
import com.example.rishan.rishan.Model.User;
import com.example.rishan.rishan.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Rishan on 5/16/2018.
 */

public class InquiryAdapter extends ArrayAdapter<Inquiry> {


    public InquiryAdapter(@NonNull Context context,  List<Inquiry> objects) {
        super(context, R.layout.custom_review, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Inquiry i=new Inquiry();
        i=getItem(position);
        LayoutInflater layoutInflater=LayoutInflater.from(getContext());
        View view=layoutInflater.inflate(R.layout.custom_review, parent, false);

        ImageView inquiryImage=view.findViewById(R.id.inquiryImage);
        TextView inquiryText=view.findViewById(R.id.inquiryText);
        TextView inquirySender=view.findViewById(R.id.inquirySender);
        TextView inquiryTime=view.findViewById(R.id.inquiryTime);

         User u=i.getUser();

        inquiryText.setText(i.getReview());
        inquirySender.setText(u.getUsername());
        inquiryTime.setText(i.getDate());

        //use shared preferences to set image view photo to comment

        Picasso.get()
                .load(u.getProfileimg())
                .placeholder(R.drawable.ic_launcher)
                .into(inquiryImage);

return view;






    }
}
