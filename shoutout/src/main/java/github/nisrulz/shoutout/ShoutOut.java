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
  private static boolean debug;
  private static ShoutOut shoutOut;
  private final String TAG;
  private final int priority;

  private ShoutOut(String TAG, int priority) {
    this.TAG = TAG;
    this.priority = priority;
  }

  public static ShoutOut withTag(boolean debuggable, String tag) {
    debug = debuggable;
    if (shoutOut == null) {
      shoutOut = new ShoutOut(tag, Log.INFO);
    }
    return shoutOut;
  }

  public static ShoutOut withTagAndPriority(boolean debuggable, String tag, int priority) {
    debug = debuggable;
    if (shoutOut == null) {
      shoutOut = new ShoutOut(tag, priority);
    }
    return shoutOut;
  }

  public ShoutOut log(String message) {
    if (debug) {
      Log.println(priority, TAG, message);
    }

    return this;
  }

  public void withCause(Exception cause) {
    if (debug) {
      Log.println(Log.ERROR, TAG, Log.getStackTraceString(cause));
    }
  }
}
