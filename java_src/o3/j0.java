package o3;

import android.net.Uri;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import o3.h0;
import o3.p;
/* loaded from: classes.dex */
public final class j0<T> implements h0.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f14474a;

    /* renamed from: b  reason: collision with root package name */
    public final p f14475b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14476c;

    /* renamed from: d  reason: collision with root package name */
    private final o0 f14477d;

    /* renamed from: e  reason: collision with root package name */
    private final a<? extends T> f14478e;

    /* renamed from: f  reason: collision with root package name */
    private volatile T f14479f;

    /* loaded from: classes.dex */
    public interface a<T> {
        T a(Uri uri, InputStream inputStream);
    }

    public j0(l lVar, Uri uri, int i10, a<? extends T> aVar) {
        this(lVar, new p.b().i(uri).b(1).a(), i10, aVar);
    }

    public j0(l lVar, p pVar, int i10, a<? extends T> aVar) {
        this.f14477d = new o0(lVar);
        this.f14475b = pVar;
        this.f14476c = i10;
        this.f14478e = aVar;
        this.f14474a = u2.n.a();
    }

    public long a() {
        return this.f14477d.q();
    }

    @Override // o3.h0.e
    public final void b() {
        this.f14477d.t();
        n nVar = new n(this.f14477d, this.f14475b);
        try {
            nVar.b();
            this.f14479f = this.f14478e.a((Uri) p3.a.e(this.f14477d.j()), nVar);
        } finally {
            p3.n0.n(nVar);
        }
    }

    @Override // o3.h0.e
    public final void c() {
    }

    public Map<String, List<String>> d() {
        return this.f14477d.s();
    }

    public final T e() {
        return this.f14479f;
    }

    public Uri f() {
        return this.f14477d.r();
    }
}
