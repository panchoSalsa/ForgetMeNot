package com.raywenderlich.todolist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class TaskDescriptionActivity extends AppCompatActivity {

    public static final String EXTRA_TASK_DESCRIPTION = "task";

    private EditText mDescriptionView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_description);

        mDescriptionView = (EditText) findViewById(R.id.descriptionText);
    }

    public void doneClicked(View view) {

    }

}
