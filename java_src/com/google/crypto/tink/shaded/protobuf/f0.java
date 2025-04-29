package com.google.crypto.tink.shaded.protobuf;
/* loaded from: classes.dex */
public class f0 {

    /* renamed from: e  reason: collision with root package name */
    private static final q f6175e = q.b();

    /* renamed from: a  reason: collision with root package name */
    private i f6176a;

    /* renamed from: b  reason: collision with root package name */
    private q f6177b;

    /* renamed from: c  reason: collision with root package name */
    protected volatile s0 f6178c;

    /* renamed from: d  reason: collision with root package name */
    private volatile i f6179d;

    protected void a(s0 s0Var) {
        i iVar;
        if (this.f6178c != null) {
            return;
        }
        synchronized (this) {
            if (this.f6178c != null) {
                return;
            }
            try {
                if (this.f6176a != null) {
                    this.f6178c = s0Var.i().a(this.f6176a, this.f6177b);
                    iVar = this.f6176a;
                } else {
                    this.f6178c = s0Var;
                    iVar = i.f6190k;
                }
                this.f6179d = iVar;
            } catch (c0 unused) {
                this.f6178c = s0Var;
                this.f6179d = i.f6190k;
            }
        }
    }

    public int b() {
        if (this.f6179d != null) {
            return this.f6179d.size();
        }
        i iVar = this.f6176a;
        if (iVar != null) {
            return iVar.size();
        }
        if (this.f6178c != null) {
            return this.f6178c.a();
        }
        return 0;
    }

    public s0 c(s0 s0Var) {
        a(s0Var);
        return this.f6178c;
    }

    public s0 d(s0 s0Var) {
        s0 s0Var2 = this.f6178c;
        this.f6176a = null;
        this.f6179d = null;
        this.f6178c = s0Var;
        return s0Var2;
    }

    public i e() {
        if (this.f6179d != null) {
            return this.f6179d;
        }
        i iVar = this.f6176a;
        if (iVar != null) {
            return iVar;
        }
        synchronized (this) {
            if (this.f6179d != null) {
                return this.f6179d;
            }
            this.f6179d = this.f6178c == null ? i.f6190k : this.f6178c.h();
            return this.f6179d;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            s0 s0Var = this.f6178c;
            s0 s0Var2 = f0Var.f6178c;
            return (s0Var == null && s0Var2 == null) ? e().equals(f0Var.e()) : (s0Var == null || s0Var2 == null) ? s0Var != null ? s0Var.equals(f0Var.c(s0Var.c())) : c(s0Var2.c()).equals(s0Var2) : s0Var.equals(s0Var2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }
}
