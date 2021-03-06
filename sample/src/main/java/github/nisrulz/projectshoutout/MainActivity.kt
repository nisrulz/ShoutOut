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
package github.nisrulz.projectshoutout

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import github.nisrulz.shoutout.ShoutOut
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val shoutOut: ShoutOut = ShoutOut.withTag(true, ">> ShoutOut")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupUI()
    }

    private fun setupUI() {
        setSupportActionBar(toolbar as? Toolbar)
        fab.setOnClickListener {
            Toast.makeText(this@MainActivity, "Check your Logcat for logs", Toast.LENGTH_SHORT).show()
            logInfo()
        }
    }

    private fun logInfo() {
        // Debug Logs
        shoutOut.log("This is Debug information here in LOGCAT")
        // Error Logs
        shoutOut.withCause(RuntimeException("Hello! I am Runtime exception"))

        // Chained for message with exception stacktrace
        shoutOut.log(
                "This is Debug information here that is chained for adding a message to exception stacktrace in LOGCAT")
                .withCause(RuntimeException("Hello! I am Runtime exception"))
    }
}