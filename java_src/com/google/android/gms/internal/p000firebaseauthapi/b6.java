package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.b6  reason: invalid package */
/* loaded from: classes.dex */
public class b6 {

    /* renamed from: c  reason: collision with root package name */
    private static final e5 f4382c = e5.f4529b;

    /* renamed from: a  reason: collision with root package name */
    protected volatile w6 f4383a;

    /* renamed from: b  reason: collision with root package name */
    private volatile m4 f4384b;

    public final int a() {
        if (this.f4384b != null) {
            return ((j4) this.f4384b).f4803n.length;
        }
        if (this.f4383a != null) {
            return this.f4383a.zzs();
        }
        return 0;
    }

    public final m4 b() {
        if (this.f4384b != null) {
            return this.f4384b;
        }
        synchronized (this) {
            if (this.f4384b != null) {
                return this.f4384b;
            }
            this.f4384b = this.f4383a == null ? m4.f4993k : this.f4383a.zzo();
            return this.f4384b;
        }
    }

    protected final void c(w6 w6Var) {
        if (this.f4383a != null) {
            return;
        }
        synchronized (this) {
            if (this.f4383a == null) {
                try {
                    this.f4383a = w6Var;
                    this.f4384b = m4.f4993k;
                } catch (z5 unused) {
                    this.f4383a = w6Var;
                    this.f4384b = m4.f4993k;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b6) {
            b6 b6Var = (b6) obj;
            w6 w6Var = this.f4383a;
            w6 w6Var2 = b6Var.f4383a;
            if (w6Var == null && w6Var2 == null) {
                return b().equals(b6Var.b());
            }
            if (w6Var == null || w6Var2 == null) {
                if (w6Var != null) {
                    b6Var.c(w6Var.f());
                    return w6Var.equals(b6Var.f4383a);
                }
                c(w6Var2.f());
                return this.f4383a.equals(w6Var2);
            }
            return w6Var.equals(w6Var2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }
}
