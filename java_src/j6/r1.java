package j6;
/* loaded from: classes.dex */
public class r1 {

    /* renamed from: a  reason: collision with root package name */
    private final q1 f12319a;

    /* renamed from: b  reason: collision with root package name */
    private final m6.r f12320b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f12321c;

    private r1(q1 q1Var, m6.r rVar, boolean z10) {
        this.f12319a = q1Var;
        this.f12320b = rVar;
        this.f12321c = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ r1(q1 q1Var, m6.r rVar, boolean z10, p1 p1Var) {
        this(q1Var, rVar, z10);
    }

    private void k() {
        if (this.f12320b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f12320b.q(); i10++) {
            l(this.f12320b.n(i10));
        }
    }

    private void l(String str) {
        if (str.isEmpty()) {
            throw f("Document fields must not be empty");
        }
        if (j() && str.startsWith("__") && str.endsWith("__")) {
            throw f("Document fields cannot begin and end with \"__\"");
        }
    }

    public void a(m6.r rVar) {
        this.f12319a.b(rVar);
    }

    public void b(m6.r rVar, n6.p pVar) {
        this.f12319a.c(rVar, pVar);
    }

    public r1 c(int i10) {
        return new r1(this.f12319a, null, true);
    }

    public r1 d(String str) {
        m6.r rVar = this.f12320b;
        r1 r1Var = new r1(this.f12319a, rVar == null ? null : rVar.b(str), false);
        r1Var.l(str);
        return r1Var;
    }

    public r1 e(m6.r rVar) {
        m6.r rVar2 = this.f12320b;
        r1 r1Var = new r1(this.f12319a, rVar2 == null ? null : rVar2.g(rVar), false);
        r1Var.k();
        return r1Var;
    }

    public RuntimeException f(String str) {
        String str2;
        m6.r rVar = this.f12320b;
        if (rVar == null || rVar.o()) {
            str2 = "";
        } else {
            str2 = " (found in field " + this.f12320b.toString() + ")";
        }
        return new IllegalArgumentException("Invalid data. " + str + str2);
    }

    public u1 g() {
        return q1.a(this.f12319a);
    }

    public m6.r h() {
        return this.f12320b;
    }

    public boolean i() {
        return this.f12321c;
    }

    public boolean j() {
        int i10 = p1.f12298a[q1.a(this.f12319a).ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        if (i10 == 4 || i10 == 5) {
            return false;
        }
        throw q6.b.a("Unexpected case for UserDataSource: %s", q1.a(this.f12319a).name());
    }
}
