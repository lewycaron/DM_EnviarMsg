package br.com.up.enviadormsg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText textNumber;
    private TextInputEditText textMessage;
    private Button btnSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textNumber = findViewById(R.id.text_Telefone);
        textMessage = findViewById(R.id.text_Mensagem);
        btnSend = findViewById(R.id.btn_enviar);

        btnSend.setOnClickListener(view -> {

            String telefone = textNumber.getText().toString();
            String mensagem = textMessage.getText().toString();

            Uri webpage = Uri.parse("https://wa.me/"+ telefone +"?text="+ mensagem);
            Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
            startActivity(webIntent);

        });
    }
}