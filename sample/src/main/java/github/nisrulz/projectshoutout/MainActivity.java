/*
 * Copyright (C) 2016 Nishant Srivastava
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package github.nisrulz.projectshoutout;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;
import github.nisrulz.shoutout.ShoutOut;

public class MainActivity extends AppCompatActivity {

    private ShoutOut shoutOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        shoutOut = ShoutOut.withTag(true, ">> ShoutOut");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Check your Logcat for logs", Toast.LENGTH_SHORT).show();

                // Debug Logs
                shoutOut.log("This is Debug information here in LOGCAT");
                // Error Logs
                shoutOut.withCause(new RuntimeException("Hello! I am Runtime exception"));

                // Chained for message with exception stacktrace
                shoutOut.log(
                        "This is Debug information here that is chained for adding a message to exception stacktrace in LOGCAT")
                        .withCause(new RuntimeException("Hello! I am Runtime exception"));
            }
        });
    }
}
