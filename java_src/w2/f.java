package w2;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import o3.h0;
import o3.o0;
import s1.n1;
/* loaded from: classes.dex */
public abstract class f implements h0.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f19792a = u2.n.a();

    /* renamed from: b  reason: collision with root package name */
    public final o3.p f19793b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19794c;

    /* renamed from: d  reason: collision with root package name */
    public final n1 f19795d;

    /* renamed from: e  reason: collision with root package name */
    public final int f19796e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f19797f;

    /* renamed from: g  reason: collision with root package name */
    public final long f19798g;

    /* renamed from: h  reason: collision with root package name */
    public final long f19799h;

    /* renamed from: i  reason: collision with root package name */
    protected final o0 f19800i;

    public f(o3.l lVar, o3.p pVar, int i10, n1 n1Var, int i11, Object obj, long j10, long j11) {
        this.f19800i = new o0(lVar);
        this.f19793b = (o3.p) p3.a.e(pVar);
        this.f19794c = i10;
        this.f19795d = n1Var;
        this.f19796e = i11;
        this.f19797f = obj;
        this.f19798g = j10;
        this.f19799h = j11;
    }

    public final long a() {
        return this.f19800i.q();
    }

    public final long d() {
        return this.f19799h - this.f19798g;
    }

    public final Map<String, List<String>> e() {
        return this.f19800i.s();
    }

    public final Uri f() {
        return this.f19800i.r();
    }
}
