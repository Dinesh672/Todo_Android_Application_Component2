// Generated code from Butter Knife. Do not modify!
package com.example.intern.todo.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.intern.todo.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AddTaskActivity_ViewBinding implements Unbinder {
  private AddTaskActivity target;

  @UiThread
  public AddTaskActivity_ViewBinding(AddTaskActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AddTaskActivity_ViewBinding(AddTaskActivity target, View source) {
    this.target = target;

    target.fabButton = Utils.findRequiredViewAsType(source, R.id.fab, "field 'fabButton'", FloatingActionButton.class);
    target.taskEditText = Utils.findRequiredViewAsType(source, R.id.task, "field 'taskEditText'", EditText.class);
    target.categorySpinner = Utils.findRequiredViewAsType(source, R.id.spinner_category, "field 'categorySpinner'", Spinner.class);
    target.notificationSpinner = Utils.findRequiredViewAsType(source, R.id.spinner_notification, "field 'notificationSpinner'", Spinner.class);
    target.dueDateEditText = Utils.findRequiredViewAsType(source, R.id.date, "field 'dueDateEditText'", EditText.class);
    target.dueTimeEditText = Utils.findRequiredViewAsType(source, R.id.time, "field 'dueTimeEditText'", EditText.class);
    target.dateIcon = Utils.findRequiredViewAsType(source, R.id.dateButton, "field 'dateIcon'", ImageView.class);
    target.timeIcon = Utils.findRequiredViewAsType(source, R.id.timeButton, "field 'timeIcon'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AddTaskActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.fabButton = null;
    target.taskEditText = null;
    target.categorySpinner = null;
    target.notificationSpinner = null;
    target.dueDateEditText = null;
    target.dueTimeEditText = null;
    target.dateIcon = null;
    target.timeIcon = null;
  }
}
