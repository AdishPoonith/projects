package kotlinx.coroutines.internal;

import la.r2;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public final v9.g f12890a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f12891b;

    /* renamed from: c  reason: collision with root package name */
    private final r2<Object>[] f12892c;

    /* renamed from: d  reason: collision with root package name */
    private int f12893d;

    public i0(v9.g gVar, int i10) {
        this.f12890a = gVar;
        this.f12891b = new Object[i10];
        this.f12892c = new r2[i10];
    }

    public final void a(r2<?> r2Var, Object obj) {
        Object[] objArr = this.f12891b;
        int i10 = this.f12893d;
        objArr[i10] = obj;
        r2<Object>[] r2VarArr = this.f12892c;
        this.f12893d = i10 + 1;
        r2VarArr[i10] = r2Var;
    }

    public final void b(v9.g gVar) {
        int length = this.f12892c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            r2<Object> r2Var = this.f12892c[length];
            kotlin.jvm.internal.l.b(r2Var);
            r2Var.l(gVar, this.f12891b[length]);
            if (i10 < 0) {
                return;
            }
            length = i10;
        }
    }
}
