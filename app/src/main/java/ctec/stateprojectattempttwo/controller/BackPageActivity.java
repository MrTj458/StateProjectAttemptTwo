package ctec.stateprojectattempttwo.controller;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class BackPageActivity extends Activity
{
    private TextView userText;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_page);

        userText = (TextView) findViewById(R.id.userText);
        backButton = (Button) findViewById(R.id.backButton);

        setupListeners();
    }

    private void setupListeners()
    {
        backButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View clickView)
            {
                Intent returnIntent = new Intent();

            }
        });
    }
}
