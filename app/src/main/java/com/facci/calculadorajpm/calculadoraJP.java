package com.facci.calculadorajpm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class calculadoraJP extends AppCompatActivity implements OnClickListener {

    String Operacion;
    Double[] Numero=new Double[20];
    Double Resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_jp);

        Button bonton =(Button)findViewById(R.id.btn0);
        bonton.setOnClickListener(this);

        Button bonton1 =(Button)findViewById(R.id.btn1);
        bonton1.setOnClickListener(this);

        Button bonton2 =(Button)findViewById(R.id.btn2);
        bonton2.setOnClickListener(this);

        Button bonton3 =(Button)findViewById(R.id.btn3);
        bonton3.setOnClickListener(this);

        Button bonton4 =(Button)findViewById(R.id.btn4);
        bonton4.setOnClickListener(this);

        Button bonton5 =(Button)findViewById(R.id.btn5);
        bonton5.setOnClickListener(this);

        Button bonton6 =(Button)findViewById(R.id.btn6);
        bonton6.setOnClickListener(this);

        Button bonton7 =(Button)findViewById(R.id.btn7);
        bonton7.setOnClickListener(this);

        Button bonton8 =(Button)findViewById(R.id.btn8);
        bonton8.setOnClickListener(this);

        Button bonton9 =(Button)findViewById(R.id.btn9);
        bonton9.setOnClickListener(this);

        Button bonton10 =(Button)findViewById(R.id.btnMas);
        bonton10.setOnClickListener(this);

        Button bonton11 =(Button)findViewById(R.id.btnMenos);
        bonton11.setOnClickListener(this);

        Button bonton12 =(Button)findViewById(R.id.btnMult);
        bonton12.setOnClickListener(this);

        Button bonton13 =(Button)findViewById(R.id.btnDiv);
        bonton13.setOnClickListener(this);

        //Button bonton14 =(Button)findViewById(R.id.btnAcer);
        //bonton14.setOnClickListener(this);

        Button bonton15 =(Button)findViewById(R.id.btnIgual);
        bonton15.setOnClickListener(this);

        Button bonton16 =(Button)findViewById(R.id.btnborrar);
        bonton16.setOnClickListener(this);

        Button btnInvocarActividad=(Button) findViewById(R.id.btnAcer);
        btnInvocarActividad.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent= new Intent(calculadoraJP.this,AcercaJPM.class);
                startActivity(intent);
            }
        });


    }


    @Override
    public void onClick(View v) {
        TextView Caja =(TextView)findViewById(R.id.caja);
        int Botones=v.getId();
        String n = Caja.getText().toString();
        /*try {
            if (Botones==R.id.btn0){
                Caja.setText(n+"0");
            }
            if (Botones==R.id.btn1){
                Caja.setText(n+"1");
            }
            if (Botones==R.id.btn2){
                Caja.setText(n+"2");
            }
            if (Botones==R.id.btn3){
                Caja.setText(n+"3");
            }
            if (Botones==R.id.btn4){
                Caja.setText(n+"4");
            }
            if (Botones==R.id.btn5){
                Caja.setText(n+"5");
            }
            if (Botones==R.id.btn6){
                Caja.setText(n+"6");
            }
            if (Botones==R.id.btn7){
                Caja.setText(n+"7");
            }
            if (Botones==R.id.btn8){
                Caja.setText(n+"8");
            }
            if (Botones==R.id.btn9){
                Caja.setText(n+"9");
            }
            if (Botones==R.id.btnMas){
                Suma=true;
                Numero[0]=Double.parseDouble(n);
                Caja.setText("");
            }
            else if (Botones==R.id.btnMenos){
                Resta=true;
                Numero[0]=Double.parseDouble(n);
                Caja.setText("");
            }
            else if (Botones==R.id.btnMult){
                Multi=true;
                Numero[0]=Double.parseDouble(n);
                Caja.setText("");
            }
            else if (Botones==R.id.btnDiv){
                Divi=true;
                Numero[0]=Double.parseDouble(n);
                Caja.setText("");
            }
            else if (Botones==R.id.btnIgual){
                Caja.setText("");
                Numero[1]=Double.parseDouble(n);

                if (Suma=true){
                    Resultado=Numero[0]+Numero[1];
                    Caja.setText(String.valueOf(Resultado));

                } else if(Resta=true){
                    Resultado=Numero[0]-Numero[1];
                    Caja.setText(String.valueOf(Resultado));

                }else if (Multi=true){
                    Resultado=Numero[0]*Numero[1];
                    Caja.setText(String.valueOf(Resultado));

                }else if (Divi=true){
                    Resultado=Numero[0]/Numero[1];
                    Caja.setText(String.valueOf(Resultado));

                }
                Suma=false;
                Resta=false;
                Multi=false;
                Divi=false;
            }
            if (Botones==R.id.btnborrar){
                Caja.setText("");
            }
            if (Botones==R.id.btnAcer){
                Caja.setText("");
            }
        }catch (Exception e){
            Caja.setText("Error algo anda mal");
        }*/


        try {
            switch (Botones){
                case R.id.btn0:
                    Caja.setText(n+"0");
                    break;
                case R.id.btn1:
                    Caja.setText(n+"1");
                    break;
                case R.id.btn2:
                    Caja.setText(n+"2");
                    break;
                case R.id.btn3:
                    Caja.setText(n+"3");
                    break;
                case R.id.btn4:
                    Caja.setText(n+"4");
                    break;
                case R.id.btn5:
                    Caja.setText(n+"5");
                    break;
                case R.id.btn6:
                    Caja.setText(n+"6");
                    break;
                case R.id.btn7:
                    Caja.setText(n+"7");
                    break;
                case R.id.btn8:
                    Caja.setText(n+"8");
                    break;
                case R.id.btn9:
                    Caja.setText(n+"9");
                    break;
                case R.id.btnMas:
                    Operacion="Suma";
                    Numero[0]=Double.parseDouble(n);
                    Caja.setText("");
                    break;
                case R.id.btnMenos:
                    Operacion="Resta";
                    Numero[0]=Double.parseDouble(n);
                    Caja.setText("");
                    break;
                case R.id.btnMult:
                    Operacion="Multi";
                    Numero[0]=Double.parseDouble(n);
                    Caja.setText("");
                    break;
                case R.id.btnDiv:
                    Operacion="Division";
                    Numero[0]=Double.parseDouble(n);
                    Caja.setText("");
                    break;
                case R.id.btnAcer:
                    Caja.setText("");
                    break;
                case R.id.btnIgual:
                    Caja.setText("");
                    Numero[1]=Double.parseDouble(n);

                    if (Operacion=="Suma"){
                        Resultado=Numero[0]+Numero[1];
                        Caja.setText(String.valueOf(Resultado));
                    }
                    else{if(Operacion=="Resta"){
                        Resultado=Numero[0]-Numero[1];
                        Caja.setText(String.valueOf(Resultado));

                    } else{
                        if (Operacion=="Multi"){
                            Resultado=Numero[0]*Numero[1];
                            Caja.setText(String.valueOf(Resultado));

                        }else{
                            if (Operacion=="Division"){
                                Resultado=Numero[0]/Numero[1];
                                Caja.setText(String.valueOf(Resultado));

                                }
                            }

                        }
                    }

                    break;
                case R.id.btnborrar:
                    Caja.setText("");
                    break;
            }
        }catch (Exception e){
            Caja.setText("error al ejecutar");
        }

    }
}
