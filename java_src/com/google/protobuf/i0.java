package com.google.protobuf;
/* loaded from: classes.dex */
public class i0 {

    /* renamed from: e  reason: collision with root package name */
    private static final q f7155e = q.b();

    /* renamed from: a  reason: collision with root package name */
    private i f7156a;

    /* renamed from: b  reason: collision with root package name */
    private q f7157b;

    /* renamed from: c  reason: collision with root package name */
    protected volatile v0 f7158c;

    /* renamed from: d  reason: collision with root package name */
    private volatile i f7159d;

    protected void a(v0 v0Var) {
        i iVar;
        if (this.f7158c != null) {
            return;
        }
        synchronized (this) {
            if (this.f7158c != null) {
                return;
            }
            try {
                if (this.f7156a != null) {
                    this.f7158c = v0Var.i().a(this.f7156a, this.f7157b);
                    iVar = this.f7156a;
                } else {
                    this.f7158c = v0Var;
                    iVar = i.f7143k;
                }
                this.f7159d = iVar;
            } catch (e0 unused) {
                this.f7158c = v0Var;
                this.f7159d = i.f7143k;
            }
        }
    }

    public int b() {
        if (this.f7159d != null) {
            return this.f7159d.size();
        }
        i iVar = this.f7156a;
        if (iVar != null) {
            return iVar.size();
        }
        if (this.f7158c != null) {
            return this.f7158c.a();
        }
        return 0;
    }

    public v0 c(v0 v0Var) {
        a(v0Var);
        return this.f7158c;
    }

    public v0 d(v0 v0Var) {
        v0 v0Var2 = this.f7158c;
        this.f7156a = null;
        this.f7159d = null;
        this.f7158c = v0Var;
        return v0Var2;
    }

    public i e() {
        if (this.f7159d != null) {
            return this.f7159d;
        }
        i iVar = this.f7156a;
        if (iVar != null) {
            return iVar;
        }
        synchronized (this) {
            if (this.f7159d != null) {
                return this.f7159d;
            }
            this.f7159d = this.f7158c == null ? i.f7143k : this.f7158c.h();
            return this.f7159d;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            v0 v0Var = this.f7158c;
            v0 v0Var2 = i0Var.f7158c;
            return (v0Var == null && v0Var2 == null) ? e().equals(i0Var.e()) : (v0Var == null || v0Var2 == null) ? v0Var != null ? v0Var.equals(i0Var.c(v0Var.c())) : c(v0Var2.c()).equals(v0Var2) : v0Var.equals(v0Var2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }
}
