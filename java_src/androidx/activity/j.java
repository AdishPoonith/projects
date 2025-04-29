package androidx.activity;

import java.util.concurrent.CopyOnWriteArrayList;
import s9.u;
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    private boolean f525a;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList<a> f526b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private da.a<u> f527c;

    public j(boolean z10) {
        this.f525a = z10;
    }

    public final void a(a cancellable) {
        kotlin.jvm.internal.l.e(cancellable, "cancellable");
        this.f526b.add(cancellable);
    }

    public abstract void b();

    public final boolean c() {
        return this.f525a;
    }

    public final void d() {
        for (a aVar : this.f526b) {
            aVar.cancel();
        }
    }

    public final void e(a cancellable) {
        kotlin.jvm.internal.l.e(cancellable, "cancellable");
        this.f526b.remove(cancellable);
    }

    public final void f(boolean z10) {
        this.f525a = z10;
        da.a<u> aVar = this.f527c;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void g(da.a<u> aVar) {
        this.f527c = aVar;
    }
}
