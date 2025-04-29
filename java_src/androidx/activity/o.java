package androidx.activity;

import android.view.View;
/* loaded from: classes.dex */
public final class o {
    public static final void a(View view, l onBackPressedDispatcherOwner) {
        kotlin.jvm.internal.l.e(view, "<this>");
        kotlin.jvm.internal.l.e(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(m.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner);
    }
}
