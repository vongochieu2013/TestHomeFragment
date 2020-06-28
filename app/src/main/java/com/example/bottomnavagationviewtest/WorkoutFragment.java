package com.example.bottomnavagationviewtest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class WorkoutFragment extends Fragment {

    private CardView firstNewspapers;
    private CardView secondNewspapers;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_workout, container, false);
        firstNewspapers = root.findViewById(R.id.first_newspaper);
        secondNewspapers = root.findViewById(R.id.second_newspaper);
        firstNewspapers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.medicalnewstoday.com/articles/324093#what-is-a-balanced-diet"));
                startActivity(browser);
            }
        });


        secondNewspapers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://health.usnews.com/wellness/food/articles/what-makes-a-healthy-diet"));
                startActivity(browser);
            }
        });

        return root;
    }

}
