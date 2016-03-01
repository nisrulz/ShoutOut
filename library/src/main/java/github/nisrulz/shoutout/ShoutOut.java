/*
 *  Copyright (c) 2016***REMOVED***
 *
 *  DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
***REMOVED***
***REMOVED***
 *
 *  All Rights Reserved
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
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
