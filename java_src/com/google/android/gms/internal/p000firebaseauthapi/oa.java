package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.oa  reason: invalid package */
/* loaded from: classes.dex */
public final class oa {

    /* renamed from: a  reason: collision with root package name */
    private final fs f5126a;

    private oa(fs fsVar) {
        this.f5126a = fsVar;
    }

    public static oa e() {
        return new oa(js.E());
    }

    public static oa f(na naVar) {
        return new oa((fs) naVar.c().w());
    }

    private final synchronized int g() {
        int a10;
        do {
            a10 = xk.a();
        } while (j(a10));
        return a10;
    }

    private final synchronized is h(vr vrVar, ct ctVar) {
        hs E;
        int g10 = g();
        if (ctVar == ct.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        E = is.E();
        E.r(vrVar);
        E.s(g10);
        E.u(3);
        E.t(ctVar);
        return (is) E.j();
    }

    private final synchronized is i(as asVar) {
        return h(gb.b(asVar), asVar.F());
    }

    private final synchronized boolean j(int i10) {
        boolean z10;
        Iterator it = this.f5126a.v().iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            } else if (((is) it.next()).C() == i10) {
                z10 = true;
                break;
            }
        }
        return z10;
    }

    public final synchronized int a(as asVar, boolean z10) {
        is i10;
        i10 = i(asVar);
        this.f5126a.s(i10);
        return i10.C();
    }

    public final synchronized na b() {
        return na.a((js) this.f5126a.j());
    }

    public final synchronized oa c(ja jaVar) {
        a(jaVar.a(), false);
        return this;
    }

    public final synchronized oa d(int i10) {
        for (int i11 = 0; i11 < this.f5126a.r(); i11++) {
            is u10 = this.f5126a.u(i11);
            if (u10.C() == i10) {
                if (u10.L() != 3) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i10);
                } else {
                    this.f5126a.t(i10);
                }
            }
        }
        throw new GeneralSecurityException("key not found: " + i10);
        return this;
    }
}
