// Generated code from Butter Knife. Do not modify!
package com.example.intern.todo.reminder;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.intern.todo.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AlarmReceiverActivity_ViewBinding implements Unbinder {
  private AlarmReceiverActivity target;

  @UiThread
  public AlarmReceiverActivity_ViewBinding(AlarmReceiverActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AlarmReceiverActivity_ViewBinding(AlarmReceiverActivity target, View source) {
    this.target = target;

    target.stopAlarm = Utils.findRequiredViewAsType(source, R.id.stopAlarm, "field 'stopAlarm'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AlarmReceiverActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.stopAlarm = null;
  }
}
