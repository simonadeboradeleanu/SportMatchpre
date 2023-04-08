// Generated by view binder compiler. Do not edit!
package com.example.sportmatch.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.sportmatch.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonCreateEvent;

  @NonNull
  public final Button buttonLogin;

  @NonNull
  public final Button buttonMenu;

  @NonNull
  public final Button buttonRegister;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button buttonCreateEvent,
      @NonNull Button buttonLogin, @NonNull Button buttonMenu, @NonNull Button buttonRegister) {
    this.rootView = rootView;
    this.buttonCreateEvent = buttonCreateEvent;
    this.buttonLogin = buttonLogin;
    this.buttonMenu = buttonMenu;
    this.buttonRegister = buttonRegister;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_createEvent;
      Button buttonCreateEvent = ViewBindings.findChildViewById(rootView, id);
      if (buttonCreateEvent == null) {
        break missingId;
      }

      id = R.id.button_login;
      Button buttonLogin = ViewBindings.findChildViewById(rootView, id);
      if (buttonLogin == null) {
        break missingId;
      }

      id = R.id.buttonMenu;
      Button buttonMenu = ViewBindings.findChildViewById(rootView, id);
      if (buttonMenu == null) {
        break missingId;
      }

      id = R.id.button_register;
      Button buttonRegister = ViewBindings.findChildViewById(rootView, id);
      if (buttonRegister == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, buttonCreateEvent, buttonLogin,
          buttonMenu, buttonRegister);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
