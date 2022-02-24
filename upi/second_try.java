package com.example.upi_payment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import dev.shreyaspatil.easyupipayment.listener.PaymentStatusListener;
import dev.shreyaspatil.easyupipayment.model.PaymentApp;
import dev.shreyaspatil.easyupipayment.model.TransactionDetails;

public class second_try extends AppCompatActivity implements PaymentStatusListener {

    private EditText upiId;
    private EditText name;
    private EditText desc;
    private EditText amont;
    private Button bn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_try);

        upiId=findViewById(R.id.ed1);
        name=findViewById(R.id.ed2);
        desc=findViewById(R.id.ed3);
        amont=findViewById(R.id.ed4);
        bn=findViewById(R.id.bt1);

        String a=upiId.getText().toString();
        String b=name.getText().toString();
        String c=desc.getText().toString();
        String d=amont.getText().toString();

        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                PaymentApp paymentApp = PaymentApp.ALL;
            }
        });

    }

    @Override
    public void onTransactionCancelled() {

    }

    @Override
    public void onTransactionCompleted(TransactionDetails transactionDetails) {

    }
}