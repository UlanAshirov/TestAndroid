package com.joma.testandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.joma.testandroid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MyMath math = new MyMath();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mathLogikListener();
    }

    private void mathLogikListener() {
        binding.btnAdd.setOnClickListener(view -> {
            Integer num1 = Integer.valueOf(binding.etTextNum1.getText().toString());
            Integer num2 = Integer.valueOf(binding.etTextNum2.getText().toString());
            binding.tvResult.setText(String.valueOf(math.add(num1, num2)));
            binding.tvResult.setVisibility(View.VISIBLE);
        });
        binding.btnSub.setOnClickListener(view -> {
            Integer num1 = Integer.valueOf(binding.etTextNum1.getText().toString());
            Integer num2 = Integer.valueOf(binding.etTextNum2.getText().toString());
            binding.tvResult.setText(String.valueOf(math.sub(num1, num2)));
            binding.tvResult.setVisibility(View.VISIBLE);
        });
        binding.btnMult.setOnClickListener(view -> {
            Integer num1 = Integer.valueOf(binding.etTextNum1.getText().toString());
            Integer num2 = Integer.valueOf(binding.etTextNum2.getText().toString());
            binding.tvResult.setText(String.valueOf(math.mult(num1, num2)));
            binding.tvResult.setVisibility(View.VISIBLE);
        });
        binding.btnDiv.setOnClickListener(view -> {
            Integer num1 = Integer.valueOf(binding.etTextNum1.getText().toString());
            Integer num2 = Integer.valueOf(binding.etTextNum2.getText().toString());
            binding.tvResult.setText(String.valueOf(math.div(num1, num2)));
            if (Integer.parseInt(binding.tvResult.getText().toString()) % 2 == 0) {
                binding.tvResult.setVisibility(View.VISIBLE);
            } else {
                Toast.makeText(this, "Тип int не подходит для данной операции", Toast.LENGTH_SHORT).show();
            }
        });
    }
}