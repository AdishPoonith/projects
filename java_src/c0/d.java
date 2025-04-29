package c0;

import c0.a;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public final class d extends a {
    public d() {
        this(null, 1, null);
    }

    public d(a initialExtras) {
        l.e(initialExtras, "initialExtras");
        a().putAll(initialExtras.a());
    }

    public /* synthetic */ d(a aVar, int i10, g gVar) {
        this((i10 & 1) != 0 ? a.C0073a.f3128b : aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void b(a.b<T> key, T t10) {
        l.e(key, "key");
        a().put(key, t10);
    }
}
