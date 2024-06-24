
# dr-old-react-native-pip

is a package that allows you to enable Picture-in-Picture (PiP) mode in React Native applications. PiP mode is a feature that allows video apps to play in a small window that floats on top of other apps, giving users a better multitasking experience.




## How to Install

Install dependencies

```bash
  npm install dr-old-react-native-pip
```

```bash
  yard add dr-old-react-native-pip
```


## Setup to Android

To enable Picture-in-Picture mode in your Android app, you need to update AndroidManifest.xml.

    1. Open AndroidManifest.xml in your React Native project.
    2. Add the following attributes inside your main <activity> tag:

```bash
<activity
    ...
    android:resizeableActivity="true"
    android:supportsPictureInPicture="true"
    android:configChanges="orientation|keyboardHidden|keyboard|screenSize|locale|layoutDirection|fontScale|screenLayout|density|smallestScreenSize|uiMode"
    ...
</activity>

```
## How to use

Using `pipMode` is a function that allows you to activate Picture-in-Picture mode with a specified aspect ratio.

Import First, import the `pipMode` function from the `dr-old-react-native-pip` package.

```javascript
import { pipMode } from 'dr-old-react-native-pip';
```

Call `pipMode` with `width` and `height` parameters representing the aspect ratio.

```javascript
pipMode(3, 4);  // Example with aspect ratio 3:4
pipMode(16, 9); // Example with aspect ratio 16:9
```

Here is an example of using `pipMode` inside a React Native component:

```javascript
import * as React from 'react';

import { StyleSheet, View, Text, Button } from 'react-native';
import { pipMode } from 'dr-old-react-native-pip';

export default function App() {
  return (
    <View style={styles.container}>
      <Button title="Enter PIP Mode" onPress={() => pipMode(3, 4)} />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  box: {
    width: 60,
    height: 60,
    marginVertical: 20,
  },
});

```

# dr-old-react-native-pip
# dr-old-react-native-pip
