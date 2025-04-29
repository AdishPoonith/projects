package n3;

import p3.n0;
import s1.d4;
import s1.o3;
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f14154a;

    /* renamed from: b  reason: collision with root package name */
    public final o3[] f14155b;

    /* renamed from: c  reason: collision with root package name */
    public final t[] f14156c;

    /* renamed from: d  reason: collision with root package name */
    public final d4 f14157d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f14158e;

    public d0(o3[] o3VarArr, t[] tVarArr, d4 d4Var, Object obj) {
        this.f14155b = o3VarArr;
        this.f14156c = (t[]) tVarArr.clone();
        this.f14157d = d4Var;
        this.f14158e = obj;
        this.f14154a = o3VarArr.length;
    }

    public boolean a(d0 d0Var) {
        if (d0Var == null || d0Var.f14156c.length != this.f14156c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f14156c.length; i10++) {
            if (!b(d0Var, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(d0 d0Var, int i10) {
        return d0Var != null && n0.c(this.f14155b[i10], d0Var.f14155b[i10]) && n0.c(this.f14156c[i10], d0Var.f14156c[i10]);
    }

    public boolean c(int i10) {
        return this.f14155b[i10] != null;
    }
}
