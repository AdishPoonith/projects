package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.RemoteException;
import c4.s;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.o0;
import f4.a;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.g  reason: invalid package */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final f f4599a;

    /* renamed from: b  reason: collision with root package name */
    private final a f4600b;

    public g(f fVar, a aVar) {
        this.f4599a = (f) s.j(fVar);
        this.f4600b = (a) s.j(aVar);
    }

    public g(g gVar) {
        this(gVar.f4599a, gVar.f4600b);
    }

    public final void a(String str) {
        try {
            this.f4599a.zza(str);
        } catch (RemoteException e10) {
            this.f4600b.b("RemoteException when sending auto retrieval timeout response.", e10, new Object[0]);
        }
    }

    public void b(String str) {
        try {
            this.f4599a.a(str);
        } catch (RemoteException e10) {
            this.f4600b.b("RemoteException when sending send verification code response.", e10, new Object[0]);
        }
    }

    public final void c(n1 n1Var) {
        try {
            this.f4599a.h(n1Var);
        } catch (RemoteException e10) {
            this.f4600b.b("RemoteException when sending create auth uri response.", e10, new Object[0]);
        }
    }

    public final void d() {
        try {
            this.f4599a.zzd();
        } catch (RemoteException e10) {
            this.f4600b.b("RemoteException when sending delete account response.", e10, new Object[0]);
        }
    }

    public final void e(vv vvVar) {
        try {
            this.f4599a.k(vvVar);
        } catch (RemoteException e10) {
            this.f4600b.b("RemoteException when sending failure result with credential", e10, new Object[0]);
        }
    }

    public final void f(wv wvVar) {
        try {
            this.f4599a.e(wvVar);
        } catch (RemoteException e10) {
            this.f4600b.b("RemoteException when sending failure result for mfa", e10, new Object[0]);
        }
    }

    public final void g(Status status, o0 o0Var) {
        try {
            this.f4599a.g(status, o0Var);
        } catch (RemoteException e10) {
            this.f4600b.b("RemoteException when sending failure result.", e10, new Object[0]);
        }
    }

    public void h(Status status) {
        try {
            this.f4599a.m(status);
        } catch (RemoteException e10) {
            this.f4600b.b("RemoteException when sending failure result.", e10, new Object[0]);
        }
    }

    public final void i(f2 f2Var) {
        try {
            this.f4599a.d(f2Var);
        } catch (RemoteException e10) {
            this.f4600b.b("RemoteException when sending Play Integrity Producer project response.", e10, new Object[0]);
        }
    }

    public final void j(i2 i2Var) {
        try {
            this.f4599a.b(i2Var);
        } catch (RemoteException e10) {
            this.f4600b.b("RemoteException when sending get recaptcha config response.", e10, new Object[0]);
        }
    }

    public final void k(j2 j2Var, z1 z1Var) {
        try {
            this.f4599a.c(j2Var, z1Var);
        } catch (RemoteException e10) {
            this.f4600b.b("RemoteException when sending get token and account info user response", e10, new Object[0]);
        }
    }

    public final void l(s2 s2Var) {
        try {
            this.f4599a.f(s2Var);
        } catch (RemoteException e10) {
            this.f4600b.b("RemoteException when sending password reset response.", e10, new Object[0]);
        }
    }

    public final void m() {
        try {
            this.f4599a.zzm();
        } catch (RemoteException e10) {
            this.f4600b.b("RemoteException when sending email verification response.", e10, new Object[0]);
        }
    }

    public final void n(String str) {
        try {
            this.f4599a.j(str);
        } catch (RemoteException e10) {
            this.f4600b.b("RemoteException when sending set account info response.", e10, new Object[0]);
        }
    }

    public final void o(j2 j2Var) {
        try {
            this.f4599a.i(j2Var);
        } catch (RemoteException e10) {
            this.f4600b.b("RemoteException when sending token result.", e10, new Object[0]);
        }
    }

    public final void p(o0 o0Var) {
        try {
            this.f4599a.l(o0Var);
        } catch (RemoteException e10) {
            this.f4600b.b("RemoteException when sending verification completed response.", e10, new Object[0]);
        }
    }
}
