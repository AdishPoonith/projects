package la;
/* loaded from: classes.dex */
public abstract class b2 extends b0 implements c1, q1 {

    /* renamed from: m  reason: collision with root package name */
    public c2 f13582m;

    public final c2 B() {
        c2 c2Var = this.f13582m;
        if (c2Var != null) {
            return c2Var;
        }
        kotlin.jvm.internal.l.p("job");
        return null;
    }

    public final void C(c2 c2Var) {
        this.f13582m = c2Var;
    }

    @Override // la.q1
    public boolean a() {
        return true;
    }

    @Override // la.c1
    public void b() {
        B().D0(this);
    }

    @Override // la.q1
    public h2 g() {
        return null;
    }

    @Override // kotlinx.coroutines.internal.o
    public String toString() {
        return o0.a(this) + '@' + o0.b(this) + "[job@" + o0.b(B()) + ']';
    }
}
