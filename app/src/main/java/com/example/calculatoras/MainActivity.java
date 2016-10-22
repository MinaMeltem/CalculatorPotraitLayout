package com.example.calculatoras;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.content.res.Configuration;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mariuszgromada.math.mxparser.Expression;

import java.text.DecimalFormat;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, div, multi, add, subt, del, dot,
            equal, openP, closeP, sine, cos, ln, tan, log, sqrt, fact, exp, pow, percentage , pi,
            e ,inv, ans, rad, deg;

    private TextView textView;
    private String operationInputs = "";
    private String lastAnswer = "";
    private boolean inverseOperationsOn = false;
    private boolean isRadiant = true;
    private boolean isDegree = false;
    private double x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.portrait_layout);

        // Display on Calculator
        textView = (TextView) findViewById(R.id.text_result);

        // Init buttons
        b0 = (Button) findViewById(R.id.but_0);
        b1 = (Button) findViewById(R.id.but_1);
        b2 = (Button) findViewById(R.id.but_2);
        b3 = (Button) findViewById(R.id.but_3);
        b4 = (Button) findViewById(R.id.but_4);
        b5 = (Button) findViewById(R.id.but_5);
        b6 = (Button) findViewById(R.id.but_6);
        b7 = (Button) findViewById(R.id.but_7);
        b8 = (Button) findViewById(R.id.but_8);
        b9 = (Button) findViewById(R.id.but_9);
        add = (Button) findViewById(R.id.but_add);
        multi = (Button) findViewById(R.id.but_multi);
        div = (Button) findViewById(R.id.but_div);
        subt = (Button) findViewById(R.id.but_subt);
        dot = (Button) findViewById(R.id.but_dot);
        equal = (Button) findViewById(R.id.but_equal);
        del = (Button) findViewById(R.id.but_del);
        openP = (Button) findViewById(R.id.but_openparens);
        closeP = (Button) findViewById(R.id.but_closeparens);
        sine = (Button) findViewById(R.id.but_sine);
        cos = (Button) findViewById(R.id.but_cos);
        tan = (Button) findViewById(R.id.but_tan);
        ln = (Button) findViewById(R.id.but_ln);
        log = (Button) findViewById(R.id.but_log);
        sqrt = (Button) findViewById(R.id.but_sqrt);
        fact = (Button) findViewById(R.id.but_factorial);
        exp = (Button) findViewById(R.id.but_exp);
        pow = (Button) findViewById(R.id.but_pow);
        percentage = (Button) findViewById(R.id.but_percent);
        pi = (Button) findViewById(R.id.but_pi);
        e = (Button) findViewById(R.id.but_e);
        ans = (Button) findViewById(R.id.but_ans);
        inv = (Button) findViewById(R.id.but_inv);
        deg = (Button) findViewById(R.id.but_deg);
        rad = (Button) findViewById(R.id.but_rad);

        // Set click listeners for landscape-only buttons
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) { // check if orientation == landscape
            deg.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
//                    isRadiant = false;
//                    isDegree = true;
                    operationInputs += "deg(";
                    textView.setText(operationInputs);
                }
            });

            rad.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
//                    isRadiant = true;
//                    isDegree = false;
                    operationInputs += "rad(";
                    textView.setText(operationInputs);
                }
            });

            sine.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (sine.getText().toString().equalsIgnoreCase("sin^-1")) {
                        operationInputs += "arcsin(";
                        textView.setText(operationInputs);
                    } else {
                        operationInputs += "sin(";
                        textView.setText(operationInputs);
                    }
                }
            });

//            sine.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    if(isRadiant) {
//                        operationInputs += "sin(";
//
//                    }else if (isDegree) {
//                        operationInputs +="sin(rad(";
//                    }
//
//                    textView.setText(operationInputs);
//                }
//            });

            cos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (cos.getText().toString().equalsIgnoreCase("cos^-1")) {
                        operationInputs += "arccos(";
                        textView.setText(operationInputs);
                    } else {
                        operationInputs += "cos(";
                        textView.setText(operationInputs);
                    }
                }
            });

//            cos.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    if(isRadiant) {
//                        operationInputs += "cos(rad(";
//
//                    }else if (isDegree) {
//                        operationInputs += "cos(";
//                    }
//
//
//                    textView.setText(operationInputs);
//                }
//            });

            tan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (tan.getText().toString().equalsIgnoreCase("tan^-1")) {
                        operationInputs += "arctan(";
                        textView.setText(operationInputs);
                    } else {
                        operationInputs += "tan(";
                        textView.setText(operationInputs);
                    }
                }
            });

//            tan.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    if(isRadiant) {
//                        operationInputs += "tan(rad(";
//
//                    }else if (isDegree)
//                    {
//                        operationInputs += "tan(";
//                    }
//
//                    textView.setText(operationInputs);
//                }
//            });

            ln.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (ln.getText().toString().equalsIgnoreCase("e^x")) {
                        operationInputs += "e^";
                        textView.setText(operationInputs);
                    } else {
                        operationInputs += "ln(";
                        textView.setText(operationInputs);
                    }
                }
            });

            log.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (log.getText().toString().equalsIgnoreCase("10^x")) {
                        operationInputs += "10^";
                        textView.setText(operationInputs);
                    } else {
                        operationInputs += "log10(";
                        textView.setText(operationInputs);
                    }
                }
            });

            sqrt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (sqrt.getText().toString().equalsIgnoreCase("x^2")) {
                        operationInputs += "^2";
                        textView.setText(operationInputs);
                    } else {
                        operationInputs += "sqrt(";
                        textView.setText(operationInputs);
                    }
                }
            });

            fact.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    del.setText("DEL");
                    operationInputs += "!";
                    textView.setText(operationInputs);
                }
            });

            exp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText(operationInputs + "E");
                    operationInputs += "*10^";
                }
            });

            pow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (pow.getText().toString().equalsIgnoreCase("y√x")) {
                        operationInputs += "^(1/";
                        textView.setText(operationInputs);
                    } else {
                        operationInputs += "^";
                        textView.setText(operationInputs);
                    }
                }
            });

            percentage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText(operationInputs + "%");
                    operationInputs += "/100";
                }
            });

            pi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    operationInputs += "pi";
                    textView.setText(operationInputs);
                }
            });

            e.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    operationInputs += "e";
                    textView.setText(operationInputs);
                }
            });

            ans.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (ans.getText().toString().equalsIgnoreCase("rnd")) {
                        Random random = new Random(); // instantiate new random number
                        double randomNum = random.nextDouble(); // set randomNum to a random double
                        DecimalFormat df = new DecimalFormat("#.########"); // instantiate decimal formatter
                        String formattedDouble = df.format(randomNum); // formattedDouble = formatted randomNum (e.g., 0.62347129)
                        operationInputs += formattedDouble;
                        textView.setText(operationInputs);
                    } else {
                        textView.setText(operationInputs + "ANS");
                        operationInputs += lastAnswer;
                    }
                }
            });

            inv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // toggle Inverse Operations On/Off
                    if (!inverseOperationsOn) {
                        inverseOperationsOn = true;
                    } else if (inverseOperationsOn) {
                        inverseOperationsOn = false;
                    }

                    // if Inverse Operations are on, set text as the following:
                    if (inverseOperationsOn) {
                        sine.setText("sin^-1");
                        cos.setText("cos^-1");
                        tan.setText("tan^-1");
                        ln.setText("e^x");
                        log.setText("10^x");
                        sqrt.setText("x^2");
                        ans.setText("Rnd");
                        pow.setText("y√x");
                    } else { // if Inverse Operations are off, set text as the following:
                        sine.setText("sin");
                        cos.setText("cos");
                        tan.setText("tan");
                        ln.setText("ln");
                        log.setText("log");
                        sqrt.setText("√");
                        ans.setText("Ans");
                        pow.setText("x^y");
                    }
                }
            });

            openP.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    del.setText("DEL");
                    operationInputs += "(";
                    textView.setText(operationInputs);
                }
            });

            closeP.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    del.setText("DEL");
                    operationInputs += ")";
                    textView.setText(operationInputs);
                }
            });

        }

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                del.setText("DEL");
                operationInputs += "+";
                textView.setText(operationInputs);
            }
        });

        subt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                del.setText("DEL");
                operationInputs += "-";
                textView.setText(operationInputs);
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                del.setText("DEL");
                operationInputs += "*";
                textView.setText(operationInputs);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                del.setText("DEL");
                operationInputs += "/";
                textView.setText(operationInputs);
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                del.setText("DEL");
                operationInputs += ".";
                textView.setText(operationInputs);
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (del.getText().toString().equalsIgnoreCase("AC")) {
                    operationInputs = "";
                    textView.setText(operationInputs);
                }
                if (operationInputs.length() > 0) {
                    operationInputs = operationInputs.substring(0, operationInputs.length() - 1);
                    textView.setText(operationInputs);
                }
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                del.setText("DEL");
                operationInputs += "0";
                textView.setText(operationInputs);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                del.setText("DEL");
                operationInputs += "1";
                textView.setText(operationInputs);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                del.setText("DEL");
                operationInputs += "2";
                textView.setText(operationInputs);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                del.setText("DEL");
                operationInputs += "3";
                textView.setText(operationInputs);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                del.setText("DEL");
                operationInputs += "4";
                textView.setText(operationInputs);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                del.setText("DEL");
                operationInputs += "5";
                textView.setText(operationInputs);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                del.setText("DEL");
                operationInputs += "6";
                textView.setText(operationInputs);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                del.setText("DEL");
                operationInputs += "7";
                textView.setText(operationInputs);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                del.setText(getResources().getString(R.string.del_button_text));
                operationInputs += "8";
                textView.setText(operationInputs);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                del.setText(getResources().getString(R.string.del_button_text));
                operationInputs += "9";
                textView.setText(operationInputs);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                del.setText("AC");
                if(operationInputs.equals("")) { // if the string is empty and the user presses "=", then have the calculator show 0
                    operationInputs = "0";
                }
                Expression exp = new Expression(operationInputs);
                x = exp.calculate();

                String answer;
                if (x == ((int) x)) { // Check if the double value of number is equal to  its integer value, if it is
                    answer = "" + (int) x; // cast the integer to the string
                } else {
                    answer = "" + x; // if it's double number ( such as 3.45 ) then cast is to the string
                }
                textView.setText(answer);
                lastAnswer = answer;
                operationInputs = ""; // Commented out because it wasn't allowing user to continue operating on previous string
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;}

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.change_background:
                Intent intent1 = new Intent(MainActivity.this, backgroundselector.class);
                startActivity(intent1);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current game state
        savedInstanceState.putString("Last Answer", lastAnswer);
        savedInstanceState.putString("Operation Inputs", operationInputs);

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {

        lastAnswer = savedInstanceState.getString("Last Answer");
        operationInputs = savedInstanceState.getString("Operation Inputs");
        textView.setText(operationInputs);
        super.onRestoreInstanceState(savedInstanceState);
    }
}