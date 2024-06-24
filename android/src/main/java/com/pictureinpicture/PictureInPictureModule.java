package com.pictureinpicture;

import androidx.annotation.NonNull;
import android.app.PictureInPictureParams;
import android.os.Build;
import android.util.Rational;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = PictureInPictureModule.NAME)
public class PictureInPictureModule extends ReactContextBaseJavaModule {
  public static final String NAME = "PictureInPicture";
  private Rational aspectRatio;

  public PictureInPictureModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  @NonNull
  public String getName() {
    return NAME;
  }


  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @ReactMethod
  public void multiply(double a, double b, Promise promise) {
    promise.resolve(a * b);
  }

  @ReactMethod
  public void activeMode(int width, int height){
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
      aspectRatio = new Rational(width, height);
      PictureInPictureParams params = new PictureInPictureParams.Builder()
        .setAspectRatio(this.aspectRatio)
        .build();
      getCurrentActivity().enterPictureInPictureMode(params);
    }
  }
}

