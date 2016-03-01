# ShoutOut 

Android wrapper for logging information.

> I used to copy-paste this logger file in all my projects so decided to use it like a library. Star it if you find it useful.



#Integration
- ShoutOut is available in the MavenCentral, so getting it as simple as adding it as a dependency
```gradle
compile 'com.github.nisrulz:shoutout:1.0.0'
```

#Usage
+ First init shoutout, probably in your application class
```java
    // Init the ShoutOut Lib
    ShoutOut.init(getClass().getSimpleName(), true);
```

where the params are _**TAG**_ and _**debuggable**_ flag

+ Now log data as below
```java
    // Debug Logs
    ShoutOut.log("This is Debug information here in LOGCAT");

    // Error Logs
    ShoutOut.log("This is Error information here in LOGCAT",exception));
```


License
=======

    Copyright 2016 Nishant Srivastava

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
