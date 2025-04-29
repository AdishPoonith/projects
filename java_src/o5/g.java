package o5;

import java.util.concurrent.atomic.AtomicReference;
import r5.b;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    private static final g f14647b = new g();

    /* renamed from: c  reason: collision with root package name */
    private static final b f14648c = new b();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<r5.b> f14649a = new AtomicReference<>();

    /* loaded from: classes.dex */
    private static class b implements r5.b {
        private b() {
        }

        @Override // r5.b
        public b.a a(r5.c cVar, String str, String str2) {
            return f.f14645a;
        }
    }

    public static g b() {
        return f14647b;
    }

    public r5.b a() {
        r5.b bVar = this.f14649a.get();
        return bVar == null ? f14648c : bVar;
    }
}
