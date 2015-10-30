package ctec.stateprojectattempttwo.controller;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.CheckBox;
import android.view.View;
import android.content.Intent;

public class StateActivity extends Activity
{
    private Button nextScreenButton;
    private EditText nameText;
    private EditText ageText;
    private CheckBox isTiredBox;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state);

        nextScreenButton = (Button) findViewById(R.id.SubmitButton);
        nameText = (EditText) findViewById(R.id.nameBox);
        ageText = (EditText) findViewById(R.id.ageBox);
        isTiredBox = (CheckBox) findViewById(R.id.isTiredBox);

        setupListeners();
    }

    private void setupListeners()
    {
        nextScreenButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View clickView)
            {
                Intent changeScreen = new Intent(clickView.getContext(), BackPageActivity.class);
                startActivityForResult(changeScreen, 0);
            }
        });
    }
}
