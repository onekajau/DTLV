package dtlv.com.dtlv_application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Test9 extends Activity{

    private ImageButton btest9_folder1 = null;
    private ImageButton btest9_folder2 = null;
    private boolean quotation_text2 = false;
    private ImageButton btest9_validate2 = null;
    private ImageButton btest9_refuse2 = null;
    private ImageButton btest9_folder3 = null;
    private boolean quotation_text3 = false;
    private ImageButton btest9_validate3 = null;
    private ImageButton btest9_refuse3 = null;
    private ImageButton btest9_folder4 = null;
    private boolean quotation_text4 = false;
    private ImageButton btest9_validate4 = null;
    private ImageButton btest9_refuse4 = null;
    private ImageButton btest9_folder5 = null;
    private boolean quotation_text5 = false;
    private ImageButton btest9_validate5 = null;
    private ImageButton btest9_refuse5 = null;
    private ImageButton btest9_next = null;

    private int ptsT9 = 0;
    private GestionPoint gestPts;

    public Test9(){
        gestPts = Menu.gestPts;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test9);
        btest9_folder1 = (ImageButton) findViewById(R.id.test9_text1_bfolder);
        btest9_folder2 = (ImageButton) findViewById(R.id.test9_text2_bfolder);
        btest9_folder2.setEnabled(false);
        btest9_folder2.setClickable(false);
        btest9_folder2.setImageResource(R.drawable.folder_grey);
        btest9_validate2 = (ImageButton) findViewById(R.id.test9_text2_bvalid);
        btest9_validate2.setEnabled(false);
        btest9_validate2.setClickable(false);
        btest9_validate2.setImageResource(R.drawable.validate_grey);
        btest9_refuse2 = (ImageButton) findViewById(R.id.test9_text2_brefuse);
        btest9_refuse2.setEnabled(false);
        btest9_refuse2.setClickable(false);
        btest9_refuse2.setImageResource(R.drawable.refuse_grey);
        btest9_folder3 = (ImageButton) findViewById(R.id.test9_text3_bfolder);
        btest9_folder3.setEnabled(false);
        btest9_folder3.setClickable(false);
        btest9_folder3.setImageResource(R.drawable.folder_grey);
        btest9_validate3 = (ImageButton) findViewById(R.id.test9_text3_bvalid);
        btest9_validate3.setEnabled(false);
        btest9_validate3.setClickable(false);
        btest9_validate3.setImageResource(R.drawable.validate_grey);
        btest9_refuse3 = (ImageButton) findViewById(R.id.test9_text3_brefuse);
        btest9_refuse3.setEnabled(false);
        btest9_refuse3.setClickable(false);
        btest9_refuse3.setImageResource(R.drawable.refuse_grey);
        btest9_folder4 = (ImageButton) findViewById(R.id.test9_text4_bfolder);
        btest9_folder4.setEnabled(false);
        btest9_folder4.setClickable(false);
        btest9_folder4.setImageResource(R.drawable.folder_grey);
        btest9_validate4 = (ImageButton) findViewById(R.id.test9_text4_bvalid);
        btest9_validate4.setEnabled(false);
        btest9_validate4.setClickable(false);
        btest9_validate4.setImageResource(R.drawable.validate_grey);
        btest9_refuse4 = (ImageButton) findViewById(R.id.test9_text4_brefuse);
        btest9_refuse4.setEnabled(false);
        btest9_refuse4.setClickable(false);
        btest9_refuse4.setImageResource(R.drawable.refuse_grey);
        btest9_folder5 = (ImageButton) findViewById(R.id.test9_text5_bfolder);
        btest9_folder5.setEnabled(false);
        btest9_folder5.setClickable(false);
        btest9_folder5.setImageResource(R.drawable.folder_grey);
        btest9_validate5 = (ImageButton) findViewById(R.id.test9_text5_bvalid);
        btest9_validate5.setEnabled(false);
        btest9_validate5.setClickable(false);
        btest9_validate5.setImageResource(R.drawable.validate_grey);
        btest9_refuse5 = (ImageButton) findViewById(R.id.test9_text5_brefuse);
        btest9_refuse5.setEnabled(false);
        btest9_refuse5.setClickable(false);
        btest9_refuse5.setImageResource(R.drawable.refuse_grey);
        btest9_next = (ImageButton) findViewById(R.id.test9_bnext);
        btest9_next.setEnabled(false);
        btest9_next.setClickable(false);
        btest9_next.setImageResource(R.drawable.next_grey);


        //Text 1
        btest9_folder1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on débloque les le test suivant
                btest9_folder2.setEnabled(true);
                btest9_folder2.setClickable(true);
                btest9_folder2.setImageResource(R.drawable.folder);
            }
        });

        //Text 2
        btest9_folder2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on débloque les boutons valider et refuser
                btest9_validate2.setEnabled(true);
                btest9_validate2.setClickable(true);
                btest9_validate2.setImageResource(R.drawable.validate);
                btest9_refuse2.setEnabled(true);
                btest9_refuse2.setClickable(true);
                btest9_refuse2.setImageResource(R.drawable.refuse);
                btest9_folder3.setEnabled(true);
                btest9_folder3.setClickable(true);
                btest9_folder3.setImageResource(R.drawable.folder);
            }
        });
        btest9_validate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btest9_validate2.setImageResource(R.drawable.validate);
                btest9_refuse2.setImageResource(R.drawable.refuse_grey);
                quotation_text2 = true;
                //On incremente les points
                ptsT9++;
                //Check if all pictures are cote to unlock the button to the next test
                if (quotation_text2 == true && quotation_text3 == true &&
                        quotation_text4 == true && quotation_text5 == true) {
                    btest9_next.setEnabled(true);
                    btest9_next.setClickable(true);
                    btest9_next.setImageResource(R.drawable.next);
                }
            }
        });
        btest9_refuse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btest9_validate2.setImageResource(R.drawable.validate_grey);
                btest9_refuse2.setImageResource(R.drawable.refuse);
                quotation_text2 = true;
                //Check if all pictures are cote to unlock the button to the next test
                if(quotation_text2 == true && quotation_text3 == true &&
                        quotation_text4 == true && quotation_text5 == true)
                {
                    btest9_next.setEnabled(true);
                    btest9_next.setClickable(true);
                    btest9_next.setImageResource(R.drawable.next);
                }
            }
        });

        //Text 3
        btest9_folder3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on débloque les boutons valider et refuser
                btest9_validate3.setEnabled(true);
                btest9_validate3.setClickable(true);
                btest9_validate3.setImageResource(R.drawable.validate);
                btest9_refuse3.setEnabled(true);
                btest9_refuse3.setClickable(true);
                btest9_refuse3.setImageResource(R.drawable.refuse);
                btest9_folder4.setEnabled(true);
                btest9_folder4.setClickable(true);
                btest9_folder4.setImageResource(R.drawable.folder);
            }
        });
        btest9_validate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btest9_validate3.setImageResource(R.drawable.validate);
                btest9_refuse3.setImageResource(R.drawable.refuse_grey);
                quotation_text3 = true;
                //On incremente les points
                ptsT9++;
                //Check if all pictures are cote to unlock the button to the next test
                if(quotation_text2 == true && quotation_text3 == true &&
                        quotation_text4 == true && quotation_text5 == true)
                {
                    btest9_next.setEnabled(true);
                    btest9_next.setClickable(true);
                    btest9_next.setImageResource(R.drawable.next);
                }
            }
        });
        btest9_refuse3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btest9_validate3.setImageResource(R.drawable.validate_grey);
                btest9_refuse3.setImageResource(R.drawable.refuse);
                quotation_text3 = true;
                //Check if all pictures are cote to unlock the button to the next test
                if(quotation_text2 == true && quotation_text3 == true &&
                        quotation_text4 == true && quotation_text5 == true)
                {
                    btest9_next.setEnabled(true);
                    btest9_next.setClickable(true);
                    btest9_next.setImageResource(R.drawable.next);
                }
            }
        });

        //Text 4
        btest9_folder4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on débloque les boutons valider et refuser
                btest9_validate4.setEnabled(true);
                btest9_validate4.setClickable(true);
                btest9_validate4.setImageResource(R.drawable.validate);
                btest9_refuse4.setEnabled(true);
                btest9_refuse4.setClickable(true);
                btest9_refuse4.setImageResource(R.drawable.refuse);
                btest9_folder5.setEnabled(true);
                btest9_folder5.setClickable(true);
                btest9_folder5.setImageResource(R.drawable.folder);
            }
        });
        btest9_validate4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btest9_validate4.setImageResource(R.drawable.validate);
                btest9_refuse4.setImageResource(R.drawable.refuse_grey);
                quotation_text4 = true;
                //On incremente les points
                ptsT9++;
                //Check if all pictures are cote to unlock the button to the next test
                if(quotation_text2 == true && quotation_text3 == true &&
                        quotation_text4 == true && quotation_text5 == true)
                {
                    btest9_next.setEnabled(true);
                    btest9_next.setClickable(true);
                    btest9_next.setImageResource(R.drawable.next);
                }
            }
        });
        btest9_refuse4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btest9_validate4.setImageResource(R.drawable.validate_grey);
                btest9_refuse4.setImageResource(R.drawable.refuse);
                quotation_text4 = true;
                //Check if all pictures are cote to unlock the button to the next test
                if(quotation_text2 == true && quotation_text3 == true &&
                        quotation_text4 == true && quotation_text5 == true)
                {
                    btest9_next.setEnabled(true);
                    btest9_next.setClickable(true);
                    btest9_next.setImageResource(R.drawable.next);
                }
            }
        });

        //Text 5
        btest9_folder5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on débloque les boutons valider et refuser
                btest9_validate5.setEnabled(true);
                btest9_validate5.setClickable(true);
                btest9_validate5.setImageResource(R.drawable.validate);
                btest9_refuse5.setEnabled(true);
                btest9_refuse5.setClickable(true);
                btest9_refuse5.setImageResource(R.drawable.refuse);
            }
        });
        btest9_validate5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btest9_validate5.setImageResource(R.drawable.validate);
                btest9_refuse5.setImageResource(R.drawable.refuse_grey);
                quotation_text5 = true;
                //On incremente les points
                ptsT9++;
                //Check if all pictures are cote to unlock the button to the next test
                if(quotation_text2 == true && quotation_text3 == true &&
                        quotation_text4 == true && quotation_text5 == true)
                {
                    btest9_next.setEnabled(true);
                    btest9_next.setClickable(true);
                    btest9_next.setImageResource(R.drawable.next);
                }
            }
        });
        btest9_refuse5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btest9_validate5.setImageResource(R.drawable.validate_grey);
                btest9_refuse5.setImageResource(R.drawable.refuse);
                quotation_text5 = true;
                //Check if all pictures are cote to unlock the button to the next test
                if(quotation_text2 == true && quotation_text3 == true &&
                        quotation_text4 == true && quotation_text5 == true)
                {
                    btest9_next.setEnabled(true);
                    btest9_next.setClickable(true);
                    btest9_next.setImageResource(R.drawable.next);
                }
            }
        });

        btest9_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on passe au test suivant et on envoit le score a la gestion des points
                gestPts.setT1(ptsT9);
                Intent itest9 = new Intent(Test9.this, Test10.class);
                startActivity(itest9);
            }
        });

    }

    /**
     * Obtain the point manager
     * @param gestPtsF
     */
    public void giveGestPts(GestionPoint gestPtsF){
        this.gestPts = gestPtsF;
    }
}
