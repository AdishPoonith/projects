package io.flutter.embedding.android;

import android.app.Activity;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.WindowLayoutInfo;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class z {

    /* renamed from: a  reason: collision with root package name */
    final WindowInfoTrackerCallbackAdapter f10282a;

    public z(WindowInfoTrackerCallbackAdapter windowInfoTrackerCallbackAdapter) {
        this.f10282a = windowInfoTrackerCallbackAdapter;
    }

    public void a(Activity activity, Executor executor, androidx.core.util.a<WindowLayoutInfo> aVar) {
        this.f10282a.addWindowLayoutInfoListener(activity, executor, aVar);
    }

    public void b(androidx.core.util.a<WindowLayoutInfo> aVar) {
        this.f10282a.removeWindowLayoutInfoListener(aVar);
    }
}
