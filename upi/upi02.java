package com.example.upi_001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import dev.shreyaspatil.easyupipayment.EasyUpiPayment;
import dev.shreyaspatil.easyupipayment.exception.AppNotFoundException;
import dev.shreyaspatil.easyupipayment.listener.PaymentStatusListener;
import dev.shreyaspatil.easyupipayment.model.PaymentApp;
import dev.shreyaspatil.easyupipayment.model.TransactionDetails;

public class upi02 extends AppCompatActivity implements PaymentStatusListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upi02);

        Button bn=findViewById(R.id.bt1);

        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                calme();
            }
        });

    }

    private void calme() {

        EditText upiId=findViewById(R.id.ed1);
       EditText name=findViewById(R.id.ed2);
        EditText amount=findViewById(R.id.ed3);
        EditText descrpt=findViewById(R.id.ed4);


        String a=upiId.getText().toString();
        String b=name.getText().toString();
        String c=amount.getText().toString();
        String d=descrpt.getText().toString();


        PaymentApp paymentApp = PaymentApp.ALL;
        EasyUpiPayment.Builder builder;
        builder = new EasyUpiPayment.Builder(this)
                .setPayeeVpa(a)
                .setPayeeName(b)
                .setPayeeMerchantCode("12345")
                .setTransactionId("T2020090212345")
                .setTransactionRefId("T2020090212345")
                .setDescription(d)
                .setAmount(c);
        try {
            EasyUpiPayment easyUpiPayment = builder.build();
            easyUpiPayment = builder.build();

            // Register Listener for Events
            easyUpiPayment.setPaymentStatusListener(this);

            // Start payment / transaction
            easyUpiPayment.startPayment();
        } catch (AppNotFoundException e) {
            e.printStackTrace();
        }
        }




    @Override
    public void onTransactionCancelled() {

    }

    @Override
    public void onTransactionCompleted(TransactionDetails transactionDetails) {

    }
}