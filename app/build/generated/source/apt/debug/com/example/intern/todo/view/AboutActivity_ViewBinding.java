// Generated code from Butter Knife. Do not modify!
package com.example.intern.todo.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.intern.todo.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AboutActivity_ViewBinding implements Unbinder {
  private AboutActivity target;

  @UiThread
  public AboutActivity_ViewBinding(AboutActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AboutActivity_ViewBinding(AboutActivity target, View source) {
    this.target = target;

    target.repoLink = Utils.findRequiredViewAsType(source, R.id.repo, "field 'repoLink'", TextView.class);
    target.insta = Utils.findRequiredViewAsType(source, R.id.insta, "field 'insta'", TextView.class);
    target.github = Utils.findRequiredViewAsType(source, R.id.github, "field 'github'", TextView.class);
    target.likedin = Utils.findRequiredViewAsType(source, R.id.linkedin, "field 'likedin'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AboutActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.repoLink = null;
    target.insta = null;
    target.github = null;
    target.likedin = null;
  }
}
