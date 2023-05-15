// Generated by view binder compiler. Do not edit!
package com.example.sportmatch.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.sportmatch.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityNeweventBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final AutoCompleteTextView autocompleteLoc;

  @NonNull
  public final AutoCompleteTextView autocompletePlayers;

  @NonNull
  public final AutoCompleteTextView autocompleteSport;

  @NonNull
  public final BottomNavigationView bottomNavigationView;

  @NonNull
  public final Button buttonCEvent;

  @NonNull
  public final ImageView mapImage;

  @NonNull
  public final TextInputLayout newEventDate;

  @NonNull
  public final TextInputEditText newEventDateEdt;

  @NonNull
  public final TextInputLayout newEventDesc;

  @NonNull
  public final TextInputEditText newEventDescEdt;

  @NonNull
  public final TextInputLayout newEventLoc;

  @NonNull
  public final TextInputLayout newEventName;

  @NonNull
  public final TextInputEditText newEventNameEdt;

  @NonNull
  public final TextInputLayout newEventPlayers;

  @NonNull
  public final TextInputLayout newEventSport;

  @NonNull
  public final TextInputLayout newEventTime;

  @NonNull
  public final TextInputEditText newEventTimeEdt;

  @NonNull
  public final TextView textDateTime;

  @NonNull
  public final TextView title;

  private ActivityNeweventBinding(@NonNull RelativeLayout rootView,
      @NonNull AutoCompleteTextView autocompleteLoc,
      @NonNull AutoCompleteTextView autocompletePlayers,
      @NonNull AutoCompleteTextView autocompleteSport,
      @NonNull BottomNavigationView bottomNavigationView, @NonNull Button buttonCEvent,
      @NonNull ImageView mapImage, @NonNull TextInputLayout newEventDate,
      @NonNull TextInputEditText newEventDateEdt, @NonNull TextInputLayout newEventDesc,
      @NonNull TextInputEditText newEventDescEdt, @NonNull TextInputLayout newEventLoc,
      @NonNull TextInputLayout newEventName, @NonNull TextInputEditText newEventNameEdt,
      @NonNull TextInputLayout newEventPlayers, @NonNull TextInputLayout newEventSport,
      @NonNull TextInputLayout newEventTime, @NonNull TextInputEditText newEventTimeEdt,
      @NonNull TextView textDateTime, @NonNull TextView title) {
    this.rootView = rootView;
    this.autocompleteLoc = autocompleteLoc;
    this.autocompletePlayers = autocompletePlayers;
    this.autocompleteSport = autocompleteSport;
    this.bottomNavigationView = bottomNavigationView;
    this.buttonCEvent = buttonCEvent;
    this.mapImage = mapImage;
    this.newEventDate = newEventDate;
    this.newEventDateEdt = newEventDateEdt;
    this.newEventDesc = newEventDesc;
    this.newEventDescEdt = newEventDescEdt;
    this.newEventLoc = newEventLoc;
    this.newEventName = newEventName;
    this.newEventNameEdt = newEventNameEdt;
    this.newEventPlayers = newEventPlayers;
    this.newEventSport = newEventSport;
    this.newEventTime = newEventTime;
    this.newEventTimeEdt = newEventTimeEdt;
    this.textDateTime = textDateTime;
    this.title = title;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityNeweventBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityNeweventBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_newevent, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityNeweventBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.autocomplete_loc;
      AutoCompleteTextView autocompleteLoc = ViewBindings.findChildViewById(rootView, id);
      if (autocompleteLoc == null) {
        break missingId;
      }

      id = R.id.autocomplete_players;
      AutoCompleteTextView autocompletePlayers = ViewBindings.findChildViewById(rootView, id);
      if (autocompletePlayers == null) {
        break missingId;
      }

      id = R.id.autocomplete_sport;
      AutoCompleteTextView autocompleteSport = ViewBindings.findChildViewById(rootView, id);
      if (autocompleteSport == null) {
        break missingId;
      }

      id = R.id.bottomNavigationView;
      BottomNavigationView bottomNavigationView = ViewBindings.findChildViewById(rootView, id);
      if (bottomNavigationView == null) {
        break missingId;
      }

      id = R.id.buttonCEvent;
      Button buttonCEvent = ViewBindings.findChildViewById(rootView, id);
      if (buttonCEvent == null) {
        break missingId;
      }

      id = R.id.mapImage;
      ImageView mapImage = ViewBindings.findChildViewById(rootView, id);
      if (mapImage == null) {
        break missingId;
      }

      id = R.id.newEventDate;
      TextInputLayout newEventDate = ViewBindings.findChildViewById(rootView, id);
      if (newEventDate == null) {
        break missingId;
      }

      id = R.id.newEventDateEdt;
      TextInputEditText newEventDateEdt = ViewBindings.findChildViewById(rootView, id);
      if (newEventDateEdt == null) {
        break missingId;
      }

      id = R.id.newEventDesc;
      TextInputLayout newEventDesc = ViewBindings.findChildViewById(rootView, id);
      if (newEventDesc == null) {
        break missingId;
      }

      id = R.id.newEventDescEdt;
      TextInputEditText newEventDescEdt = ViewBindings.findChildViewById(rootView, id);
      if (newEventDescEdt == null) {
        break missingId;
      }

      id = R.id.newEventLoc;
      TextInputLayout newEventLoc = ViewBindings.findChildViewById(rootView, id);
      if (newEventLoc == null) {
        break missingId;
      }

      id = R.id.newEventName;
      TextInputLayout newEventName = ViewBindings.findChildViewById(rootView, id);
      if (newEventName == null) {
        break missingId;
      }

      id = R.id.newEventNameEdt;
      TextInputEditText newEventNameEdt = ViewBindings.findChildViewById(rootView, id);
      if (newEventNameEdt == null) {
        break missingId;
      }

      id = R.id.newEventPlayers;
      TextInputLayout newEventPlayers = ViewBindings.findChildViewById(rootView, id);
      if (newEventPlayers == null) {
        break missingId;
      }

      id = R.id.newEventSport;
      TextInputLayout newEventSport = ViewBindings.findChildViewById(rootView, id);
      if (newEventSport == null) {
        break missingId;
      }

      id = R.id.newEventTime;
      TextInputLayout newEventTime = ViewBindings.findChildViewById(rootView, id);
      if (newEventTime == null) {
        break missingId;
      }

      id = R.id.newEventTimeEdt;
      TextInputEditText newEventTimeEdt = ViewBindings.findChildViewById(rootView, id);
      if (newEventTimeEdt == null) {
        break missingId;
      }

      id = R.id.textDateTime;
      TextView textDateTime = ViewBindings.findChildViewById(rootView, id);
      if (textDateTime == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new ActivityNeweventBinding((RelativeLayout) rootView, autocompleteLoc,
          autocompletePlayers, autocompleteSport, bottomNavigationView, buttonCEvent, mapImage,
          newEventDate, newEventDateEdt, newEventDesc, newEventDescEdt, newEventLoc, newEventName,
          newEventNameEdt, newEventPlayers, newEventSport, newEventTime, newEventTimeEdt,
          textDateTime, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
