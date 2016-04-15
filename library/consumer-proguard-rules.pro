# Consumer Proguard Rules

-assumenosideeffects class android.util.Log {
    public static boolean isLoggable(java.lang.String, int);
    public static int v(...);
    public static int i(...);
    public static int w(...);
    public static int d(...);
    public static int e(...);
}

-assumenosideeffects class github.nisrulz.shoutout.ShoutOut {
    public static void log(...);
    public static void log(java.lang.String,java.lang.Throwable);
}