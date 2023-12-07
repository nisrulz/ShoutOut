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
import github.nisrulz.projectshoutout.databinding.ActivityMainBinding
import github.nisrulz.shoutout.ShoutOut

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ShoutOut.setDebuggable(true)
        ShoutOut.setTag(" Logs to Look At 👀")

        binding = ActivityMainBinding.inflate(layoutInflater)
        with(binding) {
            setContentView(root)
            setupUI(this)
        }

    }

    private fun setupUI(binding: ActivityMainBinding) {
        with(binding) {
            btn.setOnClickListener {
                Toast.makeText(
                    this@MainActivity,
                    "Check your Logcat for logs",
                    Toast.LENGTH_SHORT
                ).show()
                logInfo()
            }
        }
    }

    private fun logInfo() {
        // Debug Logs
        ShoutOut.log("This is Debug information here in LOGCAT")
        // Error Logs
        ShoutOut.withCause(RuntimeException("Hello! I am Runtime exception"))

        // Chained for message with exception stacktrace
        ShoutOut
            .log(
                "This is Debug information here that is chained for adding a " +
                        "message to exception stacktrace in LOGCAT"
            )
            .withCause(RuntimeException("Hello! I am Runtime exception"))
    }
}