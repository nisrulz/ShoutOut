# Usage

## Set Configurations

### Debuggable

```kt
ShoutOut.setDebuggable(true)
```

`setDebuggable` accepts Boolean argument, with default set to `false`

### Tag

```kt
ShoutOut.setTag(" Logs to Look At 👀")
```

`setTag` accepts String argument, with default set to `ShoutOut 📣`

## Logging

### Simple log

```kt
ShoutOut.log("This is Debug information here in LOGCAT")
```

`log` accepts String argument, with default set to `""` i.e empty String

### Error log

```kt
ShoutOut.withCause(RuntimeException("Hello! I am Runtime exception"))
```

`withCause` accepts Exception argument.

### Simple log chained with Error log

```kt
ShoutOut
    .log(
        "This is Debug information here that is chained for adding a " +
                "message to exception stacktrace in LOGCAT"
    )
    .withCause(RuntimeException("Hello! I am Runtime exception"))
```

