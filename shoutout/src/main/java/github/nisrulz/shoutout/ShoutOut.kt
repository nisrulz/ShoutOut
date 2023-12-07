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
package github.nisrulz.shoutout

import android.util.Log

/**
 * ShoutOut Singleton class
 */
object ShoutOut {
    private var TAG: String = "ShoutOut 📣"
    private var priority: Int = Log.INFO
    private var debug = false

    /**
     * Log string messages to Logcat
     * @param String Text to print in Logcat
     */
    fun log(message: String = ""): ShoutOut {
        if (debug) {
            Log.println(priority, TAG, message)
        }
        return this
    }

    /**
     * Log exception stacktrace messages to Logcat
     * @param Exception Causing Exception to print in Logcat
     */
    fun withCause(cause: Exception) {
        if (debug) {
            Log.println(Log.ERROR, TAG, Log.getStackTraceString(cause))
        }
    }

    /**
     * Set Tag for Logcat messages
     * @param String Tag
     */
    fun setTag(tag: String) {
        TAG = tag
    }

    /**
     * Set debuggable flag for logs
     * @param Boolean debug
     */
    fun setDebuggable(value: Boolean) {
        debug = value
    }
}
