package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.d8  reason: invalid package */
/* loaded from: classes.dex */
abstract class d8 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int a(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int b(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object c(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object d(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object e(Object obj, Object obj2);

    abstract Object f();

    abstract Object g(Object obj);

    abstract void h(Object obj, int i10, int i11);

    abstract void i(Object obj, int i10, long j10);

    abstract void j(Object obj, int i10, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void k(Object obj, int i10, m4 m4Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void l(Object obj, int i10, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void m(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void n(Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void o(Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean p(Object obj, i7 i7Var) {
        int zzd = i7Var.zzd();
        int i10 = zzd >>> 3;
        int i11 = zzd & 7;
        if (i11 == 0) {
            l(obj, i10, i7Var.zzl());
            return true;
        } else if (i11 == 1) {
            i(obj, i10, i7Var.zzk());
            return true;
        } else if (i11 == 2) {
            k(obj, i10, i7Var.zzp());
            return true;
        } else if (i11 != 3) {
            if (i11 != 4) {
                if (i11 == 5) {
                    h(obj, i10, i7Var.zzf());
                    return true;
                }
                throw z5.a();
            }
            return false;
        } else {
            Object f10 = f();
            int i12 = i10 << 3;
            while (i7Var.zzc() != Integer.MAX_VALUE && p(f10, i7Var)) {
            }
            if ((4 | i12) == i7Var.zzd()) {
                g(f10);
                j(obj, i10, f10);
                return true;
            }
            throw z5.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean q(i7 i7Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void r(Object obj, a5 a5Var);
}
