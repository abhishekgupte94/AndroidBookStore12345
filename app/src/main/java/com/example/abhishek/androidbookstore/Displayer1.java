package com.example.abhishek.androidbookstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Displayer1 extends AppCompatActivity {
Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displayer1);
        ImageView imageView = (ImageView) findViewById(R.id.imageView3);
        TextView tw1  = (TextView)findViewById(R.id.textView10);

        if(getIntent()!=null){
            int image  = getIntent().getExtras().getInt("MY_IMAGE");
            imageView.setImageResource(image);
            switch(image){
                case 2131165284:
                    tw1.setText("Harry Potter and the Philosopher's Stone: \n"+"This is the tale of Harry Potter," +
                            " an ordinary 11-year-old boy serving as a sort of slave for his aunt and uncle who learns that he is " +
                            "actually a wizard and has been invited to attend the Hogwarts School for Witchcraft and Wizardry. " +
                            "Harry is snatched away from his mundane existence by Rubeus Hagrid, the grounds keeper for Hogwarts, " +
                            "and quickly thrown into a world completely foreign to both him and the viewer. Famous for an incident " +
                            "that happened at his birth, Harry makes friends easily at his new school. He soon finds, however, that " +
                            "the wizarding world is far more dangerous for him than he would have imagined, and he quickly " +
                            "learns that not all wizards are ones to be trusted.");
                            break;
                case  2131165285:
                     tw1.setText("Harry Potter and the Chamber of Secrets: \n"+"Forced to spend his " +
                             "summer holidays with his muggle relations, Harry Potter gets a real shock " +
                             "when he gets a surprise visitor: Dobby the house-elf, who warns Harry Potter " +
                             "against returning to Hogwarts, for terrible things are going to happen. Harry " +
                             "decides to ignore Dobby's warning and continues with his pre-arranged schedule. " +
                             "But at Hogwarts, strange and terrible things are indeed happening: Harry is " +
                             "suddenly hearing mysterious voices from inside the walls, muggle-born students " +
                             "are being attacked, and a message scrawled on the wall in blood puts everyone on his/her guard - "
                             + "The Chamber Of Secrets Has Been Opened. Enemies Of The Heir, Beware");
                     break;

                case 2131165286:
                    tw1.setText("Harry Potter and the Prisoner of Azkaban: \n"+"The book " +
                            "follows Harry Potter, a young wizard, in his third year at " +
                            "Hogwarts School of Witchcraft and Wizardry. Along with friends Ronald " +
                            "Weasley and Hermione Granger, Harry investigates Sirius Black, " +
                            "an escaped prisoner from Azkaban " +
                            "who they believe is one of Lord Voldemort's old allies.");
                    break;
                case  2131165287:
                    tw1.setText("Harry Potter and the Goblet of FIre \n "+"Harry's fourth summer and the following year at Hogwarts are" +
                            " marked by the Quidditch World Cup and the Triwizard Tournament, in which student representatives from three " +
                            "different wizarding schools compete in a series of increasingly challenging contests. However, Voldemort's Death " +
                            "Eaters are gaining strength and even creating the Dark Mark giving evidence that the Dark Lord is ready to rise " +
                            "again. In the unsuspecting lives of the young wizard and witches at Hogwarts the competitors are selected by the" +
                            " goblet of fire, which this year makes a very surprising announcement: Hogwarts will have two representatives in " +
                            "the tournament, including Harry Potter! Will Harry be able to rise to the challenge for the Tri Wizard Tournament" +
                            " while keeping up with school " +
                            "or will the challenges along with Voldemort's rebirth be too much for the young hero?");
                    break;
                case 2131165288:
                    tw1.setText("Harry Potter and the Order of the Phoenix \n"+"Harry Potter is spending another " +
                            "tedious summer with his dreadful Aunt Petunia and Uncle Vernon when a group of evil spirits " +
                            "called “dementors” stage an unexpected attack on Harry and his cousin Dudley. After using magic to defend " +
                            "himself, Harry is visited by a group of wizards and whisked off to number twelve, Grimmauld Place, London. " +
                            "Number twelve is the home of Harry’s godfather, Sirius Black, and the headquarters of the Order of the Phoenix. " +
                            "The Order is a group of wizards, led by Hogwarts headmaster Albus Dumbledore, dedicated to fighting evil Lord " +
                            "Voldemort and his followers. The Order is forced to operate in secrecy, outside of the jurisdiction of the " +
                            "Ministry of Magic, which is headed by the dense and corrupt Cornelius Fudge. " +
                            "Fudge refuses to believe that Lord Voldemort has returned.");
                    break;
                case 2131165289:
                    tw1.setText("Harry Potter and the Half Blood Prince\n"+"In the sixth year at Hogwarts School of " +
                            "Witchcraft, and in both wizard and muggle worlds Lord Voldemort and his henchmen are increasingly " +
                            "active. With vacancies to fill at Hogwarts, Professor Dumbledore persuades Horace Slughorn, back from retirement " +
                            "to become the potions teacher, while Professor Snape receives long awaited news. Harry Potter, together with " +
                            "Dumbledore, must" +
                            " face treacherous tasks to defeat his evil nemesis.");
                    break;
                case 2131165290:
                    tw1.setText("Harry Potter and the Deathly Hallows \n"+"Following Dumbledore's death, Harry is moved to a safe location and during this event Mad-Eye is killed. Ron and Hermione decide to join Harry in his quest to destroy the Horcruxes.\n" +
                            "\n" +
                            "Some of the clues that Dumbledore left them included: a Golden Snitch for Harry, a Deluminator for Ron, and a book of fairy tales for Hermione.");
                    break;





            }
        }
       back = (Button)findViewById(R.id.buttonback);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {

                goBack();
            }

        });
    }
    public void goBack(){

        Intent intent = new Intent(this,HomePage.class);
        startActivity(intent);
    }

}
