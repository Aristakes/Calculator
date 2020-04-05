package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView numberTextView;
    private Button  n0Button, doteButton, equalsButton, n1Button, n2Button, n3Button, plusButton,
            n4Button, n5Button, n6Button, minusButton, n7Button, n8Button, n9Button, multiplyButton,
            acButton, minusplusButton, procentButton, divisionButton;

    private double firstNumber = 0, secondNumber = 0;
    private boolean plusButtonMath = false , equalsButtonMath = false, minusButtonMath = false,
            multiplyButtonMath = false, procentButtonMath = false, divisionButtonMath = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        numberTextView = findViewById(R.id.numberTextView);

        n0Button = findViewById(R.id.n0Button);
        n1Button = findViewById(R.id.n1Button);
        n2Button = findViewById(R.id.n2Button);
        n3Button = findViewById(R.id.n3Button);
        n4Button = findViewById(R.id.n4Button);
        n5Button = findViewById(R.id.n5Button);
        n6Button = findViewById(R.id.n6Button);
        n7Button = findViewById(R.id.n7Button);
        n8Button = findViewById(R.id.n8Button);
        n9Button = findViewById(R.id.n9Button);

        doteButton = findViewById(R.id.doteButton);// +
        equalsButton = findViewById(R.id.equalsButton);// +
        plusButton = findViewById(R.id.plusButton);// +
        minusButton = findViewById(R.id.minusButton);// +
        multiplyButton = findViewById(R.id.multiplyButton);// +
        acButton = findViewById(R.id.acButton);// +
        minusplusButton = findViewById(R.id.minusplusButton);// -
        procentButton = findViewById(R.id.procentButton);// +
        divisionButton = findViewById(R.id.divisionButton);// +


        n0Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numberTextView.append("0");

            }
        });

        n1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numberTextView.append("1");

            }
        });

        n2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numberTextView.append("2");

            }
        });

        n3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numberTextView.append("3");

            }
        });

        n4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numberTextView.append("4");

            }
        });

        n5Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numberTextView.append("5");

            }
        });

        n6Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numberTextView.append("6");

            }
        });

        n7Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numberTextView.append("7");

            }
        });

        n8Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numberTextView.append("8");

            }
        });

        n9Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numberTextView.append("9");

            }
        });



        doteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numberTextView.append(".");

            }
        });


        acButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numberTextView.setText("");

            }
        });



        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plusButtonMath = true;
                firstNumber = Double.parseDouble(numberTextView.getText().toString());
                numberTextView.setText("");
            }
        });


        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                minusButtonMath = true;
                firstNumber = Double.parseDouble(numberTextView.getText().toString());
                numberTextView.setText("");
            }
        });



        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multiplyButtonMath = true;
                firstNumber = Double.parseDouble(numberTextView.getText().toString());
                numberTextView.setText("");
            }
        });


        procentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                procentButtonMath = true;
                firstNumber = Double.parseDouble(numberTextView.getText().toString());
                numberTextView.setText("");
            }
        });


        divisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                divisionButtonMath = true;
                firstNumber = Double.parseDouble(numberTextView.getText().toString());
                numberTextView.setText("");
            }
        });





        equalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                equalsButtonMath = true;
                secondNumber = Double.parseDouble(numberTextView.getText().toString());
                numberTextView.setText("");

                if (plusButtonMath == true && equalsButtonMath == true) {
                    firstNumber = firstNumber + secondNumber;
                    numberTextView.setText(firstNumber+"");
                    plusButtonMath = false;
                }


                if (minusButtonMath == true && equalsButtonMath == true) {
                    firstNumber = firstNumber - secondNumber;
                    numberTextView.setText(firstNumber+"");
                    minusButtonMath = false;
                }

                if (multiplyButtonMath == true && equalsButtonMath == true) {
                    firstNumber = firstNumber * secondNumber;
                    numberTextView.setText(firstNumber+"");
                    multiplyButtonMath = false;
                }

                if (procentButtonMath == true && equalsButtonMath == true) {
                    firstNumber = firstNumber   * (secondNumber / 100);
                    numberTextView.setText(firstNumber+"");
                    procentButtonMath = false;
                }

                if (divisionButtonMath == true && equalsButtonMath == true) {
                    if (firstNumber == 0 && secondNumber == 0) {
                        numberTextView.setText("Uncertainty");
                    }
                    firstNumber = firstNumber / secondNumber;
                    numberTextView.setText(firstNumber+"");
                    divisionButtonMath = false;
                }


            }
        });





    }//end here onCreate

}//end here class
