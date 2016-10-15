package com.example.calculatoras;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mariuszgromada.math.mxparser.Expression;

public class MainActivity extends AppCompatActivity {
    private Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, div, multi, add, subt, del, dot,
            equal, openP, closeP, sine, cos, ln, tan, log, sqrt, fact, exp, pow, percentage , pi,
            e ,inv, ans, rad, deg;

    private TextView textView;
    private String operationInputs = "";
    private boolean toggleOn = false;
    private boolean isRadiant = true;
    private boolean isDegree = false;
    private double x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.potrait_layout);


        textView = (TextView) findViewById(R.id.text_result);

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
        inv = (Button) findViewById(R.id.but_inv);
        ans = (Button) findViewById(R.id.but_ans);
        deg = (Button) findViewById(R.id.but_deg);
        rad = (Button) findViewById(R.id.but_rad);




        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {


            deg.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    isRadiant =false;
                    isDegree = true;
                }
            });

            rad.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    isRadiant =true;
                    isDegree =false;
                }

                });

            sine.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(isRadiant) {
                        operationInputs += "sin(";

                    }else if (isDegree) {
                      operationInputs +="sin(rad(";
                    }

                    textView.setText(operationInputs);
                }
            });

            cos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(isRadiant) {
                        operationInputs += "cos(rad(";

                    }else if (isDegree) {
                        operationInputs += "cos(";
                    }


                    textView.setText(operationInputs);
                }
            });

            tan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(isRadiant) {
                        operationInputs += "tan(rad(";

                    }else if (isDegree)
                    {
                        operationInputs += "tan(";
                    }

                    textView.setText(operationInputs);
                }
            });



            ln.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    operationInputs += "ln(";
                    textView.setText(operationInputs);

                }
            });

            log.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    operationInputs += "log10";
                    textView.setText(operationInputs);

                }
            });

            sqrt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    operationInputs += "sqrt( ";
                    textView.setText(operationInputs);

                }
            });

            fact.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    operationInputs += "!";
                    textView.setText(operationInputs);

                }
            });

            exp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    del.setText("DEL");
                    operationInputs += "exp"; // find the syntax
                    textView.setText(operationInputs);

                }
            });


            pow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    operationInputs += "^"; // find the syntax
                    textView.setText(operationInputs);

                }
            });

            percentage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    operationInputs += "%"; // find the syntax
                    textView.setText(operationInputs);

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
                    operationInputs += "e * ";
                    textView.setText(operationInputs);

                }
            });
//
//            ans.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    operationInputs += "%"; // find the syntax
//                    textView.setText(operationInputs);
//                    textView.setTextSize(44);
//                }
//            });
//
        inv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!toggleOn) {
                    toggleOn = true;
                } else if (toggleOn) {
                    toggleOn = false;
                }
                if (toggleOn) {
                    sine.setText("sin^-1");
                    cos.setText("cos^-1");
                    tan.setText("tan^-1");
                    ln.setText("e^x");
                    log.setText("10^x");
                    sqrt.setText("x^2");
                    ans.setText("Rnd");
                    pow.setText("y√x");
                } else {
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
                if (del.getText().toString().equals("AC")) {
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
//

        b7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                del.setText("DEL");
                operationInputs += "7";
                textView.setText(operationInputs);

            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                del.setText("DEL");
                operationInputs += "8";
                textView.setText(operationInputs);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                del.setText("DEL");
                operationInputs += "9";
                textView.setText(operationInputs);
            }
        });




        equal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                del.setText("AC");
                Expression exp = new Expression(operationInputs);
                x = exp.calculate();

                String answer;
                if (x == ((int) x)) { // Check if the double value of number is equal to  its integer value, if it is
                    answer = "" + (int) x; // cast the integer to the string
                } else {
                    answer = "" + x; // if it's double number ( such as 3.45 ) then cast is to the string
                }

                textView.setText(answer);
                operationInputs = "";


            }
        });


    }
}




