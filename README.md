<h1 align="center">ShoutOut&nbsp;<a href="https://twitter.com/intent/tweet?text=Checkout%20ShoutOut%3A%20Android%20library%20for%20simplified%20logging&url=https://github.com/nisrulz/ShoutOut&via=nisrulz&hashtags=AndroidDev,android,library,OpenSource">
        <img src="https://img.shields.io/twitter/url/http/shields.io.svg?style=social"/>
    </a></h1>

<div align="center">
  <strong>Android library for simplified logging</strong>
</div>
<br/>
<div align="center">
    <!-- Bintray -->
    <a href="https://bintray.com/nisrulz/maven/com.github.nisrulz%3Ashoutout/_latestVersion">
        <img src="https://api.bintray.com/packages/nisrulz/maven/com.github.nisrulz%3Ashoutout/images/download.svg"/>
    </a>
    <!-- API -->
    <a href="https://android-arsenal.com/api?level=9">
        <img src="https://img.shields.io/badge/API-9%2B-orange.svg?style=flat"/>
    </a>
    <!-- Android Arsenal -->
    <a href="https://android-arsenal.com/details/1/4955#">
        <img src="https://img.shields.io/badge/Android%20Arsenal-ShoutOut-brightgreen.svg?style=flat"/>
    </a>
    <!-- GitHub stars -->
    <a href="https://github.com/nisrulz/ShoutOut">
        <img src="https://img.shields.io/github/stars/nisrulz/ShoutOut.svg?style=social&label=Star"/>
    </a>
    <!-- GitHub forks -->
    <a href="https://github.com/nisrulz/ShoutOut/fork">
        <img src="hhttps://img.shields.io/github/forks/nisrulz/ShoutOut.svg?style=social&label=Fork"/>
    </a>
    <!-- GitHub watchers -->
    <a href="https://github.com/nisrulz/ShoutOut">
        <img src="https://img.shields.io/github/watchers/nisrulz/ShoutOut.svg?style=social&label=Watch"/>
    </a>
    <!-- Say Thanks! -->
    <a href="https://saythanks.io/to/nisrulz">
        <img src="https://img.shields.io/badge/Say%20Thanks-!-1EAEDB.svg"/>
    </a>
    <a href="https://www.paypal.me/nisrulz/5">
        <img src="https://img.shields.io/badge/$-donate-ff69b4.svg?maxAge=2592000&amp;style=flat">
    </a>
    <br/>
     <!-- GitHub followers -->
    <a href="https://github.com/nisrulz/ShoutOut">
        <img src="https://img.shields.io/github/followers/nisrulz.svg?style=social&label=Follow%20@nisrulz"/>
    </a>
    <!-- Twitter Follow -->
    <a href="https://twitter.com/nisrulz">
        <img src="https://img.shields.io/twitter/follow/nisrulz.svg?style=social"/>
    </a>
</div>

<div align="center">
  <sub>Built with ❤︎ by
  <a href="https://twitter.com/nisrulz">Nishant Srivastava</a> and
  <a href="https://github.com/nisrulz/ShoutOut/graphs/contributors">
    contributors
  </a>
</div>
<br/>
<br/>

# Including in your project
ShoutOut is available in the Jcenter, so getting it as simple as adding it as a dependency
```gradle
compile 'com.github.nisrulz:shoutout:{latest version}'
```
where `{latest version}` corresponds to published version in [ ![Download](https://api.bintray.com/packages/nisrulz/maven/com.github.nisrulz%3Ashoutout/images/download.svg) ](https://bintray.com/nisrulz/maven/com.github.nisrulz%3Ashoutout/_latestVersion)

# Usage
+ First create and init shoutout;
    ```java
    ShoutOut shoutOut;
    // Init the ShoutOut Lib
    shoutOut = ShoutOut.withTag(debuggable, TAG);

    // or you can also init as below to specify a priority
    shoutOut = ShoutOut.withTagAndPriority(debuggable,TAG, priority);
    ```
    where `priority` can be `Log.DEBUG`, `Log.ERROR`, `Log.ASSERT`, `Log.WTF` or `Log.INFO`

+ Now log data as below
    ```java
    // Debug Logs
    shoutOut.log("This is Debug information here in LOGCAT");

    // Error Logs
    shoutOut.withCause(new RuntimeException("Hello! I am Runtime exception"));
    ```

+ You can chain an extra debug log to exception log
    ```java
    shoutOut.log("This is Debug information here that is chained for adding a message to exception stacktrace in LOGCAT")
            .withCause(new RuntimeException("Hello! I am Runtime exception"));
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
[Nishant Srivastava](https://github.com/nisrulz/nisrulz.github.io) ([@nisrulz](https://www.twitter.com/nisrulz))

> If you appreciate my work, please consider buying me a cup of :coffee:
>  + [PayPal](https://www.paypal.me/nisrulz/5)
>  + Bitcoin Address: 13PjuJcfVW2Ad81fawqwLtku4bZLv1AxCL

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

<img src="http://forthebadge.com/images/badges/built-for-android.svg" />