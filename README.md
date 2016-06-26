# ShoutOut    


### Specs
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.nisrulz/shoutout/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.nisrulz/shoutout) [![](https://jitpack.io/v/nisrulz/ShoutOut.svg)](https://jitpack.io/#nisrulz/ShoutOut) [![API](https://img.shields.io/badge/API-9%2B-orange.svg?style=flat)](https://android-arsenal.com/api?level=9)

### Show some :heart:
[![GitHub stars](https://img.shields.io/github/stars/nisrulz/ShoutOut.svg?style=social&label=Star)](https://github.com/nisrulz/ShoutOut) [![GitHub forks](https://img.shields.io/github/forks/nisrulz/ShoutOut.svg?style=social&label=Fork)](https://github.com/nisrulz/ShoutOut/fork) [![GitHub watchers](https://img.shields.io/github/watchers/nisrulz/ShoutOut.svg?style=social&label=Watch)](https://github.com/nisrulz/ShoutOut) [![GitHub followers](https://img.shields.io/github/followers/nisrulz.svg?style=social&label=Follow)](https://github.com/nisrulz/ShoutOut)  
[![Twitter Follow](https://img.shields.io/twitter/follow/nisrulz.svg?style=social)](https://twitter.com/nisrulz) 


Android wrapper for logging information.

> I used to copy-paste this logger class in all my projects so decided to use it like a library. Star it if you find it useful.



#Integration
ShoutOut is available
- via **MavenCentral**, so getting it as simple as adding it as a dependency
```gradle
compile 'com.github.nisrulz:shoutout:1.0.2'
```

OR

- via **Jitpack**

  + **Step 1 :** Add it in your root build.gradle at the end of repositories:
  ```gradle
  allprojects {
  		repositories {
  			...
  			maven { url "https://jitpack.io" }
  		}
  	}
  ```
  + **Step 2 :** Add the dependency
  ```gradle
  compile 'com.github.nisrulz:ShoutOut:1.0.2'
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


# Pull Requests
I welcome and encourage all pull requests. It usually will take me within 24-48 hours to respond to any issue or request. Here are some basic rules to follow to ensure timely addition of your request:
  1. Match coding style (braces, spacing, etc.) This is best achieved using `CMD`+`Option`+`L` (Reformat code) on Mac (not sure for Windows) with Android Studio defaults.
  2. If its a feature, bugfix, or anything please only change code to what you specify.
  3. Please keep PR titles easy to read and descriptive of changes, this will make them easier to merge :)
  4. Pull requests _must_ be made against `develop` branch. Any other branch (unless specified by the maintainers) will get rejected.
  5. Check for existing [issues](https://github.com/nisrulz/ShoutOut/issues) first, before filing an issue.  
  6. Have fun!

### Created & Maintained By
[Nishant Srivastava](https://github.com/nisrulz) ([@nisrulz](https://www.twitter.com/nisrulz))


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
