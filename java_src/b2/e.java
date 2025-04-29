package b2;

import p3.a0;
import s1.u2;
import x1.e0;
/* loaded from: classes.dex */
abstract class e {

    /* renamed from: a  reason: collision with root package name */
    protected final e0 f2883a;

    /* loaded from: classes.dex */
    public static final class a extends u2 {
        public a(String str) {
            super(str, null, false, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e(e0 e0Var) {
        this.f2883a = e0Var;
    }

    public final boolean a(a0 a0Var, long j10) {
        return b(a0Var) && c(a0Var, j10);
    }

    protected abstract boolean b(a0 a0Var);

    protected abstract boolean c(a0 a0Var, long j10);
}
