package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.t4  reason: invalid package */
/* loaded from: classes.dex */
public final class t4 implements i7 {

    /* renamed from: a  reason: collision with root package name */
    private final s4 f5371a;

    /* renamed from: b  reason: collision with root package name */
    private int f5372b;

    /* renamed from: c  reason: collision with root package name */
    private int f5373c;

    /* renamed from: d  reason: collision with root package name */
    private int f5374d = 0;

    private t4(s4 s4Var) {
        byte[] bArr = x5.f5628d;
        this.f5371a = s4Var;
        s4Var.f5328c = this;
    }

    private final void f(Object obj, j7 j7Var, e5 e5Var) {
        int i10 = this.f5373c;
        this.f5373c = ((this.f5372b >>> 3) << 3) | 4;
        try {
            j7Var.c(obj, this, e5Var);
            if (this.f5372b == this.f5373c) {
                return;
            }
            throw z5.g();
        } finally {
            this.f5373c = i10;
        }
    }

    private final void g(Object obj, j7 j7Var, e5 e5Var) {
        s4 s4Var;
        int r10 = this.f5371a.r();
        s4 s4Var2 = this.f5371a;
        if (s4Var2.f5326a >= s4Var2.f5327b) {
            throw new z5("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int k10 = s4Var2.k(r10);
        this.f5371a.f5326a++;
        j7Var.c(obj, this, e5Var);
        this.f5371a.A(0);
        s4Var.f5326a--;
        this.f5371a.a(k10);
    }

    private final void h(int i10) {
        if (this.f5371a.j() != i10) {
            throw z5.j();
        }
    }

    private final void i(int i10) {
        if ((this.f5372b & 7) != i10) {
            throw z5.a();
        }
    }

    private static final void j(int i10) {
        if ((i10 & 3) != 0) {
            throw z5.g();
        }
    }

    private static final void k(int i10) {
        if ((i10 & 7) != 0) {
            throw z5.g();
        }
    }

    public static t4 l(s4 s4Var) {
        t4 t4Var = s4Var.f5328c;
        return t4Var != null ? t4Var : new t4(s4Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final void a(Object obj, j7 j7Var, e5 e5Var) {
        i(3);
        f(obj, j7Var, e5Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final void b(List list, j7 j7Var, e5 e5Var) {
        int q10;
        int i10 = this.f5372b;
        if ((i10 & 7) != 2) {
            throw z5.a();
        }
        do {
            Object zze = j7Var.zze();
            g(zze, j7Var, e5Var);
            j7Var.zzf(zze);
            list.add(zze);
            if (this.f5371a.b() || this.f5374d != 0) {
                return;
            }
            q10 = this.f5371a.q();
        } while (q10 == i10);
        this.f5374d = q10;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final void c(Object obj, j7 j7Var, e5 e5Var) {
        i(2);
        g(obj, j7Var, e5Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    @Deprecated
    public final void d(List list, j7 j7Var, e5 e5Var) {
        int q10;
        int i10 = this.f5372b;
        if ((i10 & 7) != 3) {
            throw z5.a();
        }
        do {
            Object zze = j7Var.zze();
            f(zze, j7Var, e5Var);
            j7Var.zzf(zze);
            list.add(zze);
            if (this.f5371a.b() || this.f5374d != 0) {
                return;
            }
            q10 = this.f5371a.q();
        } while (q10 == i10);
        this.f5374d = q10;
    }

    public final void e(List list, boolean z10) {
        int q10;
        int q11;
        if ((this.f5372b & 7) != 2) {
            throw z5.a();
        }
        if (!(list instanceof d6) || z10) {
            do {
                list.add(z10 ? zzs() : zzr());
                if (this.f5371a.b()) {
                    return;
                }
                q10 = this.f5371a.q();
            } while (q10 == this.f5372b);
            this.f5374d = q10;
            return;
        }
        d6 d6Var = (d6) list;
        do {
            d6Var.n(zzp());
            if (this.f5371a.b()) {
                return;
            }
            q11 = this.f5371a.q();
        } while (q11 == this.f5372b);
        this.f5374d = q11;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final void zzA(List list) {
        int q10;
        int q11;
        if (!(list instanceof l6)) {
            int i10 = this.f5372b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(this.f5371a.s()));
                    if (this.f5371a.b()) {
                        return;
                    }
                    q10 = this.f5371a.q();
                } while (q10 == this.f5372b);
                this.f5374d = q10;
                return;
            } else if (i10 != 2) {
                throw z5.a();
            } else {
                int r10 = this.f5371a.r();
                k(r10);
                int j10 = this.f5371a.j() + r10;
                do {
                    list.add(Long.valueOf(this.f5371a.s()));
                } while (this.f5371a.j() < j10);
                return;
            }
        }
        l6 l6Var = (l6) list;
        int i11 = this.f5372b & 7;
        if (i11 == 1) {
            do {
                l6Var.k(this.f5371a.s());
                if (this.f5371a.b()) {
                    return;
                }
                q11 = this.f5371a.q();
            } while (q11 == this.f5372b);
            this.f5374d = q11;
        } else if (i11 != 2) {
            throw z5.a();
        } else {
            int r11 = this.f5371a.r();
            k(r11);
            int j11 = this.f5371a.j() + r11;
            do {
                l6Var.k(this.f5371a.s());
            } while (this.f5371a.j() < j11);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final void zzB(List list) {
        int q10;
        int q11;
        if (!(list instanceof m5)) {
            int i10 = this.f5372b & 7;
            if (i10 == 2) {
                int r10 = this.f5371a.r();
                j(r10);
                int j10 = this.f5371a.j() + r10;
                do {
                    list.add(Float.valueOf(this.f5371a.i()));
                } while (this.f5371a.j() < j10);
                return;
            } else if (i10 != 5) {
                throw z5.a();
            } else {
                do {
                    list.add(Float.valueOf(this.f5371a.i()));
                    if (this.f5371a.b()) {
                        return;
                    }
                    q10 = this.f5371a.q();
                } while (q10 == this.f5372b);
                this.f5374d = q10;
                return;
            }
        }
        m5 m5Var = (m5) list;
        int i11 = this.f5372b & 7;
        if (i11 == 2) {
            int r11 = this.f5371a.r();
            j(r11);
            int j11 = this.f5371a.j() + r11;
            do {
                m5Var.e(this.f5371a.i());
            } while (this.f5371a.j() < j11);
        } else if (i11 != 5) {
            throw z5.a();
        } else {
            do {
                m5Var.e(this.f5371a.i());
                if (this.f5371a.b()) {
                    return;
                }
                q11 = this.f5371a.q();
            } while (q11 == this.f5372b);
            this.f5374d = q11;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final void zzD(List list) {
        int q10;
        int q11;
        if (!(list instanceof s5)) {
            int i10 = this.f5372b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5371a.n()));
                    if (this.f5371a.b()) {
                        return;
                    }
                    q10 = this.f5371a.q();
                } while (q10 == this.f5372b);
                this.f5374d = q10;
                return;
            } else if (i10 != 2) {
                throw z5.a();
            } else {
                int j10 = this.f5371a.j() + this.f5371a.r();
                do {
                    list.add(Integer.valueOf(this.f5371a.n()));
                } while (this.f5371a.j() < j10);
                h(j10);
                return;
            }
        }
        s5 s5Var = (s5) list;
        int i11 = this.f5372b & 7;
        if (i11 == 0) {
            do {
                s5Var.k(this.f5371a.n());
                if (this.f5371a.b()) {
                    return;
                }
                q11 = this.f5371a.q();
            } while (q11 == this.f5372b);
            this.f5374d = q11;
        } else if (i11 != 2) {
            throw z5.a();
        } else {
            int j11 = this.f5371a.j() + this.f5371a.r();
            do {
                s5Var.k(this.f5371a.n());
            } while (this.f5371a.j() < j11);
            h(j11);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final void zzE(List list) {
        int q10;
        int q11;
        if (!(list instanceof l6)) {
            int i10 = this.f5372b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.f5371a.t()));
                    if (this.f5371a.b()) {
                        return;
                    }
                    q10 = this.f5371a.q();
                } while (q10 == this.f5372b);
                this.f5374d = q10;
                return;
            } else if (i10 != 2) {
                throw z5.a();
            } else {
                int j10 = this.f5371a.j() + this.f5371a.r();
                do {
                    list.add(Long.valueOf(this.f5371a.t()));
                } while (this.f5371a.j() < j10);
                h(j10);
                return;
            }
        }
        l6 l6Var = (l6) list;
        int i11 = this.f5372b & 7;
        if (i11 == 0) {
            do {
                l6Var.k(this.f5371a.t());
                if (this.f5371a.b()) {
                    return;
                }
                q11 = this.f5371a.q();
            } while (q11 == this.f5372b);
            this.f5374d = q11;
        } else if (i11 != 2) {
            throw z5.a();
        } else {
            int j11 = this.f5371a.j() + this.f5371a.r();
            do {
                l6Var.k(this.f5371a.t());
            } while (this.f5371a.j() < j11);
            h(j11);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final void zzG(List list) {
        int q10;
        int q11;
        if (!(list instanceof s5)) {
            int i10 = this.f5372b & 7;
            if (i10 == 2) {
                int r10 = this.f5371a.r();
                j(r10);
                int j10 = this.f5371a.j() + r10;
                do {
                    list.add(Integer.valueOf(this.f5371a.o()));
                } while (this.f5371a.j() < j10);
                return;
            } else if (i10 != 5) {
                throw z5.a();
            } else {
                do {
                    list.add(Integer.valueOf(this.f5371a.o()));
                    if (this.f5371a.b()) {
                        return;
                    }
                    q10 = this.f5371a.q();
                } while (q10 == this.f5372b);
                this.f5374d = q10;
                return;
            }
        }
        s5 s5Var = (s5) list;
        int i11 = this.f5372b & 7;
        if (i11 == 2) {
            int r11 = this.f5371a.r();
            j(r11);
            int j11 = this.f5371a.j() + r11;
            do {
                s5Var.k(this.f5371a.o());
            } while (this.f5371a.j() < j11);
        } else if (i11 != 5) {
            throw z5.a();
        } else {
            do {
                s5Var.k(this.f5371a.o());
                if (this.f5371a.b()) {
                    return;
                }
                q11 = this.f5371a.q();
            } while (q11 == this.f5372b);
            this.f5374d = q11;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final void zzH(List list) {
        int q10;
        int q11;
        if (!(list instanceof l6)) {
            int i10 = this.f5372b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(this.f5371a.u()));
                    if (this.f5371a.b()) {
                        return;
                    }
                    q10 = this.f5371a.q();
                } while (q10 == this.f5372b);
                this.f5374d = q10;
                return;
            } else if (i10 != 2) {
                throw z5.a();
            } else {
                int r10 = this.f5371a.r();
                k(r10);
                int j10 = this.f5371a.j() + r10;
                do {
                    list.add(Long.valueOf(this.f5371a.u()));
                } while (this.f5371a.j() < j10);
                return;
            }
        }
        l6 l6Var = (l6) list;
        int i11 = this.f5372b & 7;
        if (i11 == 1) {
            do {
                l6Var.k(this.f5371a.u());
                if (this.f5371a.b()) {
                    return;
                }
                q11 = this.f5371a.q();
            } while (q11 == this.f5372b);
            this.f5374d = q11;
        } else if (i11 != 2) {
            throw z5.a();
        } else {
            int r11 = this.f5371a.r();
            k(r11);
            int j11 = this.f5371a.j() + r11;
            do {
                l6Var.k(this.f5371a.u());
            } while (this.f5371a.j() < j11);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final void zzI(List list) {
        int q10;
        int q11;
        if (!(list instanceof s5)) {
            int i10 = this.f5372b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5371a.p()));
                    if (this.f5371a.b()) {
                        return;
                    }
                    q10 = this.f5371a.q();
                } while (q10 == this.f5372b);
                this.f5374d = q10;
                return;
            } else if (i10 != 2) {
                throw z5.a();
            } else {
                int j10 = this.f5371a.j() + this.f5371a.r();
                do {
                    list.add(Integer.valueOf(this.f5371a.p()));
                } while (this.f5371a.j() < j10);
                h(j10);
                return;
            }
        }
        s5 s5Var = (s5) list;
        int i11 = this.f5372b & 7;
        if (i11 == 0) {
            do {
                s5Var.k(this.f5371a.p());
                if (this.f5371a.b()) {
                    return;
                }
                q11 = this.f5371a.q();
            } while (q11 == this.f5372b);
            this.f5374d = q11;
        } else if (i11 != 2) {
            throw z5.a();
        } else {
            int j11 = this.f5371a.j() + this.f5371a.r();
            do {
                s5Var.k(this.f5371a.p());
            } while (this.f5371a.j() < j11);
            h(j11);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final void zzJ(List list) {
        int q10;
        int q11;
        if (!(list instanceof l6)) {
            int i10 = this.f5372b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.f5371a.v()));
                    if (this.f5371a.b()) {
                        return;
                    }
                    q10 = this.f5371a.q();
                } while (q10 == this.f5372b);
                this.f5374d = q10;
                return;
            } else if (i10 != 2) {
                throw z5.a();
            } else {
                int j10 = this.f5371a.j() + this.f5371a.r();
                do {
                    list.add(Long.valueOf(this.f5371a.v()));
                } while (this.f5371a.j() < j10);
                h(j10);
                return;
            }
        }
        l6 l6Var = (l6) list;
        int i11 = this.f5372b & 7;
        if (i11 == 0) {
            do {
                l6Var.k(this.f5371a.v());
                if (this.f5371a.b()) {
                    return;
                }
                q11 = this.f5371a.q();
            } while (q11 == this.f5372b);
            this.f5374d = q11;
        } else if (i11 != 2) {
            throw z5.a();
        } else {
            int j11 = this.f5371a.j() + this.f5371a.r();
            do {
                l6Var.k(this.f5371a.v());
            } while (this.f5371a.j() < j11);
            h(j11);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final void zzL(List list) {
        int q10;
        int q11;
        if (!(list instanceof s5)) {
            int i10 = this.f5372b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5371a.r()));
                    if (this.f5371a.b()) {
                        return;
                    }
                    q10 = this.f5371a.q();
                } while (q10 == this.f5372b);
                this.f5374d = q10;
                return;
            } else if (i10 != 2) {
                throw z5.a();
            } else {
                int j10 = this.f5371a.j() + this.f5371a.r();
                do {
                    list.add(Integer.valueOf(this.f5371a.r()));
                } while (this.f5371a.j() < j10);
                h(j10);
                return;
            }
        }
        s5 s5Var = (s5) list;
        int i11 = this.f5372b & 7;
        if (i11 == 0) {
            do {
                s5Var.k(this.f5371a.r());
                if (this.f5371a.b()) {
                    return;
                }
                q11 = this.f5371a.q();
            } while (q11 == this.f5372b);
            this.f5374d = q11;
        } else if (i11 != 2) {
            throw z5.a();
        } else {
            int j11 = this.f5371a.j() + this.f5371a.r();
            do {
                s5Var.k(this.f5371a.r());
            } while (this.f5371a.j() < j11);
            h(j11);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final void zzM(List list) {
        int q10;
        int q11;
        if (!(list instanceof l6)) {
            int i10 = this.f5372b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.f5371a.w()));
                    if (this.f5371a.b()) {
                        return;
                    }
                    q10 = this.f5371a.q();
                } while (q10 == this.f5372b);
                this.f5374d = q10;
                return;
            } else if (i10 != 2) {
                throw z5.a();
            } else {
                int j10 = this.f5371a.j() + this.f5371a.r();
                do {
                    list.add(Long.valueOf(this.f5371a.w()));
                } while (this.f5371a.j() < j10);
                h(j10);
                return;
            }
        }
        l6 l6Var = (l6) list;
        int i11 = this.f5372b & 7;
        if (i11 == 0) {
            do {
                l6Var.k(this.f5371a.w());
                if (this.f5371a.b()) {
                    return;
                }
                q11 = this.f5371a.q();
            } while (q11 == this.f5372b);
            this.f5374d = q11;
        } else if (i11 != 2) {
            throw z5.a();
        } else {
            int j11 = this.f5371a.j() + this.f5371a.r();
            do {
                l6Var.k(this.f5371a.w());
            } while (this.f5371a.j() < j11);
            h(j11);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final boolean zzN() {
        i(0);
        return this.f5371a.c();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final boolean zzO() {
        int i10;
        if (this.f5371a.b() || (i10 = this.f5372b) == this.f5373c) {
            return false;
        }
        return this.f5371a.d(i10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final double zza() {
        i(1);
        return this.f5371a.h();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final float zzb() {
        i(5);
        return this.f5371a.i();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final int zzc() {
        int i10 = this.f5374d;
        if (i10 != 0) {
            this.f5372b = i10;
            this.f5374d = 0;
        } else {
            i10 = this.f5371a.q();
            this.f5372b = i10;
        }
        if (i10 == 0 || i10 == this.f5373c) {
            return Integer.MAX_VALUE;
        }
        return i10 >>> 3;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final int zzd() {
        return this.f5372b;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final int zze() {
        i(0);
        return this.f5371a.l();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final int zzf() {
        i(5);
        return this.f5371a.m();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final int zzg() {
        i(0);
        return this.f5371a.n();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final int zzh() {
        i(5);
        return this.f5371a.o();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final int zzi() {
        i(0);
        return this.f5371a.p();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final int zzj() {
        i(0);
        return this.f5371a.r();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final long zzk() {
        i(1);
        return this.f5371a.s();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final long zzl() {
        i(0);
        return this.f5371a.t();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final long zzm() {
        i(1);
        return this.f5371a.u();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final long zzn() {
        i(0);
        return this.f5371a.v();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final long zzo() {
        i(0);
        return this.f5371a.w();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final m4 zzp() {
        i(2);
        return this.f5371a.x();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final String zzr() {
        i(2);
        return this.f5371a.y();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final String zzs() {
        i(2);
        return this.f5371a.z();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final void zzv(List list) {
        int q10;
        int q11;
        if (!(list instanceof a4)) {
            int i10 = this.f5372b & 7;
            if (i10 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f5371a.c()));
                    if (this.f5371a.b()) {
                        return;
                    }
                    q10 = this.f5371a.q();
                } while (q10 == this.f5372b);
                this.f5374d = q10;
                return;
            } else if (i10 != 2) {
                throw z5.a();
            } else {
                int j10 = this.f5371a.j() + this.f5371a.r();
                do {
                    list.add(Boolean.valueOf(this.f5371a.c()));
                } while (this.f5371a.j() < j10);
                h(j10);
                return;
            }
        }
        a4 a4Var = (a4) list;
        int i11 = this.f5372b & 7;
        if (i11 == 0) {
            do {
                a4Var.e(this.f5371a.c());
                if (this.f5371a.b()) {
                    return;
                }
                q11 = this.f5371a.q();
            } while (q11 == this.f5372b);
            this.f5374d = q11;
        } else if (i11 != 2) {
            throw z5.a();
        } else {
            int j11 = this.f5371a.j() + this.f5371a.r();
            do {
                a4Var.e(this.f5371a.c());
            } while (this.f5371a.j() < j11);
            h(j11);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final void zzw(List list) {
        int q10;
        if ((this.f5372b & 7) != 2) {
            throw z5.a();
        }
        do {
            list.add(zzp());
            if (this.f5371a.b()) {
                return;
            }
            q10 = this.f5371a.q();
        } while (q10 == this.f5372b);
        this.f5374d = q10;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final void zzx(List list) {
        int q10;
        int q11;
        if (!(list instanceof b5)) {
            int i10 = this.f5372b & 7;
            if (i10 == 1) {
                do {
                    list.add(Double.valueOf(this.f5371a.h()));
                    if (this.f5371a.b()) {
                        return;
                    }
                    q10 = this.f5371a.q();
                } while (q10 == this.f5372b);
                this.f5374d = q10;
                return;
            } else if (i10 != 2) {
                throw z5.a();
            } else {
                int r10 = this.f5371a.r();
                k(r10);
                int j10 = this.f5371a.j() + r10;
                do {
                    list.add(Double.valueOf(this.f5371a.h()));
                } while (this.f5371a.j() < j10);
                return;
            }
        }
        b5 b5Var = (b5) list;
        int i11 = this.f5372b & 7;
        if (i11 == 1) {
            do {
                b5Var.e(this.f5371a.h());
                if (this.f5371a.b()) {
                    return;
                }
                q11 = this.f5371a.q();
            } while (q11 == this.f5372b);
            this.f5374d = q11;
        } else if (i11 != 2) {
            throw z5.a();
        } else {
            int r11 = this.f5371a.r();
            k(r11);
            int j11 = this.f5371a.j() + r11;
            do {
                b5Var.e(this.f5371a.h());
            } while (this.f5371a.j() < j11);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final void zzy(List list) {
        int q10;
        int q11;
        if (!(list instanceof s5)) {
            int i10 = this.f5372b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5371a.l()));
                    if (this.f5371a.b()) {
                        return;
                    }
                    q10 = this.f5371a.q();
                } while (q10 == this.f5372b);
                this.f5374d = q10;
                return;
            } else if (i10 != 2) {
                throw z5.a();
            } else {
                int j10 = this.f5371a.j() + this.f5371a.r();
                do {
                    list.add(Integer.valueOf(this.f5371a.l()));
                } while (this.f5371a.j() < j10);
                h(j10);
                return;
            }
        }
        s5 s5Var = (s5) list;
        int i11 = this.f5372b & 7;
        if (i11 == 0) {
            do {
                s5Var.k(this.f5371a.l());
                if (this.f5371a.b()) {
                    return;
                }
                q11 = this.f5371a.q();
            } while (q11 == this.f5372b);
            this.f5374d = q11;
        } else if (i11 != 2) {
            throw z5.a();
        } else {
            int j11 = this.f5371a.j() + this.f5371a.r();
            do {
                s5Var.k(this.f5371a.l());
            } while (this.f5371a.j() < j11);
            h(j11);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i7
    public final void zzz(List list) {
        int q10;
        int q11;
        if (!(list instanceof s5)) {
            int i10 = this.f5372b & 7;
            if (i10 == 2) {
                int r10 = this.f5371a.r();
                j(r10);
                int j10 = this.f5371a.j() + r10;
                do {
                    list.add(Integer.valueOf(this.f5371a.m()));
                } while (this.f5371a.j() < j10);
                return;
            } else if (i10 != 5) {
                throw z5.a();
            } else {
                do {
                    list.add(Integer.valueOf(this.f5371a.m()));
                    if (this.f5371a.b()) {
                        return;
                    }
                    q10 = this.f5371a.q();
                } while (q10 == this.f5372b);
                this.f5374d = q10;
                return;
            }
        }
        s5 s5Var = (s5) list;
        int i11 = this.f5372b & 7;
        if (i11 == 2) {
            int r11 = this.f5371a.r();
            j(r11);
            int j11 = this.f5371a.j() + r11;
            do {
                s5Var.k(this.f5371a.m());
            } while (this.f5371a.j() < j11);
        } else if (i11 != 5) {
            throw z5.a();
        } else {
            do {
                s5Var.k(this.f5371a.m());
                if (this.f5371a.b()) {
                    return;
                }
                q11 = this.f5371a.q();
            } while (q11 == this.f5372b);
            this.f5374d = q11;
        }
    }
}
