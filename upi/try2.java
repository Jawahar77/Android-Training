package com.example.upi_001;
//nothing
import android.os.Bundle;
import android.annotation.SuppressLint;

import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import dev.shreyaspatil.easyupipayment.EasyUpiPayment;
import dev.shreyaspatil.easyupipayment.listener.PaymentStatusListener;
import dev.shreyaspatil.easyupipayment.model.PaymentApp;
import dev.shreyaspatil.easyupipayment.model.TransactionDetails;

public class try2 extends AppCompatActivity implements PaymentStatusListener{

    private Button payButton;
    private EditText fieldPayeeVpa;
    private EditText fieldPayeeName;
    private EditText fieldDescription;
    private EditText fieldAmount;
    private EasyUpiPayment easyUpiPayment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_try2);
        initViews();
        payButton.setOnClickListener(v -> pay());
    }

    private void initViews() {
        payButton = findViewById(R.id.bt11);
        fieldPayeeVpa = findViewById(R.id.ed11);
        fieldPayeeName = findViewById(R.id.ed12);
        fieldDescription = findViewById(R.id.ed14);
        fieldAmount = findViewById(R.id.ed13);
    }

    @SuppressLint("NonConstantResourceId")
    private void pay() {

        String payeeVpa = fieldPayeeVpa.getText().toString();
        String payeeName = fieldPayeeName.getText().toString();
        String transactionId = "TID" + System.currentTimeMillis();
        String amount = fieldAmount.getText().toString();
        String des=fieldDescription.getText().toString();

        PaymentApp paymentApp = PaymentApp.ALL;

        // START PAYMENT INITIALIZATION
        EasyUpiPayment.Builder builder = new EasyUpiPayment.Builder(this)
                .with(paymentApp)
                .setPayeeVpa(payeeVpa)
                .setPayeeName(payeeName)
                .setTransactionId(transactionId)
                .setTransactionRefId(transactionId)
                .setPayeeMerchantCode(transactionId)
                .setDescription(des)
                .setAmount(amount);
        // END INITIALIZATION

        try {
            // Build instance
            easyUpiPayment = builder.build();

            // Register Listener for Events
            easyUpiPayment.setPaymentStatusListener(this);

            // Start payment / transaction
            easyUpiPayment.startPayment();
        } catch (Exception exception) {
            Toast.makeText(this,exception.getMessage(),Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onTransactionCancelled() {
    }

    @Override
    public void onTransactionCompleted(TransactionDetails transactionDetails) {
    }
}
