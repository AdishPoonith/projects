package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
/* loaded from: classes.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f1757a = new b();

    private b() {
    }

    public static final void a(Bundle bundle, String key, IBinder iBinder) {
        kotlin.jvm.internal.l.e(bundle, "bundle");
        kotlin.jvm.internal.l.e(key, "key");
        bundle.putBinder(key, iBinder);
    }
}
