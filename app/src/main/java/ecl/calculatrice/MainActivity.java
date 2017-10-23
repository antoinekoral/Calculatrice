package ecl.calculatrice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcul(View view) {

        RadioGroup rG = (RadioGroup) findViewById(R.id.radioGroup);
        int choix = rG.getCheckedRadioButtonId();

        EditText editText1 = (EditText) findViewById(R.id.nombre1);
        String str_nombre1 = editText1.getText().toString();
        int nombre1;
        //System.out.println("STR_nombre1 : " + str_nombre1.isEmpty());
        if (str_nombre1.isEmpty())
            nombre1 = 0;
        else {
            nombre1 = parseInt(str_nombre1);
        }


        EditText editText2 = (EditText) findViewById(R.id.nombre2);
        String str_nombre2 = editText2.getText().toString();
        int nombre2;
        if (str_nombre2.isEmpty())
            nombre2 = 0;
        else {
            nombre2 = parseInt(str_nombre2);
        }

        int resultat = 0;
        String erreur = "ERROR";
        boolean error = false;

        System.out.println("Nombre1 : " + nombre1);
        System.out.println("Nombre2 : " + nombre2);
        System.out.println("Choix : " + choix);

        if (choix == 2131427425)
            resultat = nombre1 + nombre2;
        if (choix == 2131427426)
            resultat = nombre1 - nombre2;
        if (choix == 2131427427)
            resultat = nombre1 * nombre2;
        if (choix == 2131427428)
            if (nombre2 == 0) {
                error = true;
                erreur = "Division par 0";
            }
            else {
                resultat = nombre1 / nombre2;
            }

        TextView tV = (TextView) findViewById(R.id.resultat);
        if (error)
            tV.setText(erreur);
        else
            tV.setText(String.valueOf(resultat));

        //System.out.println(choix);
    }


}
