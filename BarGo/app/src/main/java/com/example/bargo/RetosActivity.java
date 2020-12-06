package com.example.bargo;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RetosActivity extends AppCompatActivity {
    private ListView retosListView;
    private ArrayList<String> challengeNameList;
    private ArrayList<Boolean> challengeCompletedList;
    private ArrayList<Integer> totalProgressList;
    private ArrayList<Integer> progressList;
    private ArrayList<Integer> pointsList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_retos);
        retosListView = findViewById(R.id.challengeList);

        challengeNameList = RetosInfo.getInstance().getChallengeName();
        challengeCompletedList = RetosInfo.getInstance().getChallengeCompleted();
        totalProgressList = RetosInfo.getInstance().getTotalProgress();
        progressList = RetosInfo.getInstance().getProgress();
        pointsList = RetosInfo.getInstance().getPoints();

        AdapterChallengesList adapterChallengesList = new AdapterChallengesList();
        retosListView.setAdapter(adapterChallengesList);
    }

    class AdapterChallengesList extends BaseAdapter{

        @Override
        public int getCount() { return challengeNameList.size(); }

        @Override
        public Object getItem(int position) { return null; }

        @Override
        public long getItemId(int position) { return 0; }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.layout_retos_item, null);

            TextView challengeName = view.findViewById(R.id.challengeNameTxt);
            TextView challengePoints = view.findViewById(R.id.challengePointsTxt);

            challengeName.setText(challengeNameList.get(position));
            if(challengeCompletedList.get(position)){
                //challengePoints.setText(getString(R.string.yaObtenido));
            }

            return view;
        }
    }
}
