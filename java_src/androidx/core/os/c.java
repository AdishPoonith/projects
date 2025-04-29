package androidx.core.os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
/* loaded from: classes.dex */
final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f1758a = new c();

    private c() {
    }

    public static final void a(Bundle bundle, String key, Size size) {
        kotlin.jvm.internal.l.e(bundle, "bundle");
        kotlin.jvm.internal.l.e(key, "key");
        bundle.putSize(key, size);
    }

    public static final void b(Bundle bundle, String key, SizeF sizeF) {
        kotlin.jvm.internal.l.e(bundle, "bundle");
        kotlin.jvm.internal.l.e(key, "key");
        bundle.putSizeF(key, sizeF);
    }
}
