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

package github.nisrulz.shoutout;

import android.util.Log;

public class ShoutOut {
    private static boolean DEBUGGABLE = false;
    private static String LOGTAG = "ShoutOut";

    private static String sideLimiterLeft = "-------------------------------------- ShoutOut : ";
    private static String sideLimiterRight = "--------------------------------------\n\n\n";
    private static String label = "DEBUG Log ";

    public static void init(String newLOGTAG, boolean debuggable) {
        LOGTAG = newLOGTAG;
        DEBUGGABLE = debuggable;
    }

    public static void log(String logdata) {
        if (DEBUGGABLE) {
            label = "Debug Log ";
            Log.d(LOGTAG, sideLimiterLeft + label + sideLimiterRight);
            Log.d(LOGTAG, logdata);
        }
    }

    public static void log(String logdata, Throwable ex) {
        if (DEBUGGABLE) {
            label = "Error Log ";
            Log.e(LOGTAG, sideLimiterLeft + label + sideLimiterRight);

            Log.e(LOGTAG, logdata);

            label = "StackTrace START ";
            Log.e(LOGTAG, sideLimiterLeft + label + sideLimiterRight);

            ex.printStackTrace();

            label = "StackTrace END ";
            Log.e(LOGTAG, sideLimiterLeft + label + sideLimiterRight);
        }

    }

}
