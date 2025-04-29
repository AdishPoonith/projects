package io.grpc.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: f  reason: collision with root package name */
    static final b f11443f = new a();

    /* renamed from: a  reason: collision with root package name */
    private final l2 f11444a;

    /* renamed from: b  reason: collision with root package name */
    private final e1 f11445b = f1.a();

    /* renamed from: c  reason: collision with root package name */
    private final e1 f11446c = f1.a();

    /* renamed from: d  reason: collision with root package name */
    private final e1 f11447d = f1.a();

    /* renamed from: e  reason: collision with root package name */
    private volatile long f11448e;

    /* loaded from: classes.dex */
    class a implements b {
        a() {
        }

        @Override // io.grpc.internal.m.b
        public m a() {
            return new m(l2.f11442a);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        m a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(l2 l2Var) {
        this.f11444a = l2Var;
    }

    public void a(boolean z10) {
        (z10 ? this.f11446c : this.f11447d).a(1L);
    }

    public void b() {
        this.f11445b.a(1L);
        this.f11448e = this.f11444a.a();
    }
}
