// Generated code from Butter Knife. Do not modify!
package com.example.intern.todo.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.intern.todo.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TaskAdapter$TaskAdapterViewHolder_ViewBinding implements Unbinder {
  private TaskAdapter.TaskAdapterViewHolder target;

  @UiThread
  public TaskAdapter$TaskAdapterViewHolder_ViewBinding(TaskAdapter.TaskAdapterViewHolder target,
      View source) {
    this.target = target;

    target.descriptionTextView = Utils.findRequiredViewAsType(source, R.id.description, "field 'descriptionTextView'", TextView.class);
    target.dateTextView = Utils.findRequiredViewAsType(source, R.id.date, "field 'dateTextView'", TextView.class);
    target.overdueTextView = Utils.findRequiredViewAsType(source, R.id.overdue, "field 'overdueTextView'", TextView.class);
    target.categoryImageView = Utils.findRequiredViewAsType(source, R.id.category_image_view, "field 'categoryImageView'", ImageView.class);
    target.bellIcon = Utils.findRequiredViewAsType(source, R.id.bell, "field 'bellIcon'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TaskAdapter.TaskAdapterViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.descriptionTextView = null;
    target.dateTextView = null;
    target.overdueTextView = null;
    target.categoryImageView = null;
    target.bellIcon = null;
  }
}
