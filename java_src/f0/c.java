package f0;

import android.os.Bundle;
import androidx.lifecycle.e;
import androidx.savedstate.Recreator;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f8362d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final d f8363a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.savedstate.a f8364b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8365c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final c a(d owner) {
            l.e(owner, "owner");
            return new c(owner, null);
        }
    }

    private c(d dVar) {
        this.f8363a = dVar;
        this.f8364b = new androidx.savedstate.a();
    }

    public /* synthetic */ c(d dVar, g gVar) {
        this(dVar);
    }

    public static final c a(d dVar) {
        return f8362d.a(dVar);
    }

    public final androidx.savedstate.a b() {
        return this.f8364b;
    }

    public final void c() {
        androidx.lifecycle.e a10 = this.f8363a.a();
        if (!(a10.b() == e.b.INITIALIZED)) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        a10.a(new Recreator(this.f8363a));
        this.f8364b.e(a10);
        this.f8365c = true;
    }

    public final void d(Bundle bundle) {
        if (!this.f8365c) {
            c();
        }
        androidx.lifecycle.e a10 = this.f8363a.a();
        if (!a10.b().g(e.b.STARTED)) {
            this.f8364b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + a10.b()).toString());
    }

    public final void e(Bundle outBundle) {
        l.e(outBundle, "outBundle");
        this.f8364b.g(outBundle);
    }
}
