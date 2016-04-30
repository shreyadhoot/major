package com.majorproject.indorinamkeens.SignUp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.design.widget.TextInputLayout;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.majorproject.indorinamkeens.Dashboard.DashboardActivity;
import com.majorproject.indorinamkeens.R;

import io.codetail.animation.arcanimator.ArcAnimator;
import io.codetail.animation.arcanimator.Side;

public class CustomerSignUpActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private EditText inputName, inputMobile, inputAddress;
    private TextInputLayout inputLayoutName, inputLayoutMobile, inputLayoutAddress;
    private FloatingActionButton btnSignUp;
    CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_sign_up);
        final Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {

            @Override
            public void run() {
                coordinatorLayout.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.SlideInUp)
                        .duration(2000)
                        .playOn(coordinatorLayout);
            }
        }, 100);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        inputLayoutName = (TextInputLayout) findViewById(R.id.input_layout_name);
        inputLayoutAddress = (TextInputLayout) findViewById(R.id.input_layout_address);
        inputLayoutMobile = (TextInputLayout) findViewById(R.id.input_layout_mobile);
        inputName = (EditText) findViewById(R.id.input_name);
        inputAddress = (EditText) findViewById(R.id.input_address);
        inputMobile = (EditText) findViewById(R.id.input_mobile);
        btnSignUp = (FloatingActionButton) findViewById(R.id.btn_signup);
        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinatorLayout);

        inputName.addTextChangedListener(new MyTextWatcher(inputName));
        inputMobile.addTextChangedListener(new MyTextWatcher(inputMobile));


        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPref = getSharedPreferences("NamkeensPreferenceData", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("Name", inputName.getText().toString());
                editor.putBoolean("IsRegistered", true);
                editor.commit();

        submitForm();
            }
        });
    }

    /**
     * Validating form
     */
    private void submitForm() {
        if (!validateName()) {
            return;
        }

        if (!validateMobile()) {
            return;
        }

        if (!validateAddress()) {
            return;
        }

        Toast.makeText(CustomerSignUpActivity.this,"Successfully Registered.", Toast.LENGTH_LONG ).show();
        Intent in = new Intent(CustomerSignUpActivity.this, DashboardActivity.class);
        startActivity(in);
        finish();
    }

    private boolean validateName() {
        if (inputName.getText().toString().trim().isEmpty()) {
            YoYo.with(Techniques.Tada)
                    .duration(1000)
                    .playOn(inputName);
            inputLayoutName.setError(getString(R.string.err_msg_name));
            requestFocus(inputName);
            return false;
        } else {
            inputLayoutName.setErrorEnabled(false);
        }

        return true;
    }

    private boolean validateMobile() {
        String mobile = inputMobile.getText().toString().trim();

        if (mobile.isEmpty() || !isValidMobile(mobile)||mobile.length()!=10) {
            YoYo.with(Techniques.Tada)
                    .duration(1000)
                    .playOn(inputMobile);
            inputLayoutMobile.setError(getString(R.string.err_msg_mobile));
            requestFocus(inputMobile);
            return false;
        } else {
            inputLayoutMobile.setErrorEnabled(false);
        }

        return true;
    }

    private boolean validateAddress() {
        String address = inputAddress.getText().toString().trim();

        if (address.isEmpty()) {
            YoYo.with(Techniques.Tada)
                    .duration(1000)
                    .playOn(inputAddress);
            inputLayoutAddress.setError(getString(R.string.err_msg_address));
            requestFocus(inputAddress);
            return false;
        } else {
            inputLayoutAddress.setErrorEnabled(false);
        }

        return true;
    }


    private static boolean isValidMobile(String mobile) {
        return !TextUtils.isEmpty(mobile);
    }

    private void requestFocus(View view) {
        if (view.requestFocus()) {
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        }
    }

    private class MyTextWatcher implements TextWatcher {

        private View view;

        private MyTextWatcher(View view) {
            this.view = view;
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        public void afterTextChanged(Editable editable) {
            switch (view.getId()) {
                case R.id.input_name:
                    validateName();
                    break;

                case R.id.input_address:
                    validateAddress();
                    break;
            }
        }
    }
}