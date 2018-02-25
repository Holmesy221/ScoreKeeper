package holmes.holmesy.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     // Global Vars.

    int teamA = 0;
    int teamB = 0;

    //Methods to display the relevant scores in the respected Txt Views.

    public void displayTeamA(int score){
        TextView scoreView = (TextView)findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }


    public void displayTeamB (int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }



    // Methods for adding 3 points

    public void scoreTeamA3Points(View view){

        teamA = teamA +1;
        displayTeamA(teamA);

    }

    public void scoreTeamB3Points (View view){

        teamB = teamB +1;
        displayTeamB(teamB);


    }


    // methods for adding 5 points


    public void scoreTeam5Points (View view ){

        teamA = teamA + 5;
        displayTeamA(teamA);

    }


    public void scoreTeamB5Points (View view){

        teamB = teamB + 5;
        displayTeamB(teamB);



    }





    // method to reset

    public void scoreReset(View view ){
        teamA = 0;
        teamB = 0;

        displayTeamA(teamA);
        displayTeamB(teamB);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
