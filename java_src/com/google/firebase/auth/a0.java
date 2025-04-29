package com.google.firebase.auth;

import android.app.Activity;
import android.net.Uri;
import com.google.android.gms.tasks.Task;
import java.util.List;
/* loaded from: classes.dex */
public abstract class a0 extends d4.a implements y0 {
    public Task<Void> B() {
        return FirebaseAuth.getInstance(W()).g0(this);
    }

    public Task<c0> C(boolean z10) {
        return FirebaseAuth.getInstance(W()).k0(this, z10);
    }

    public abstract b0 D();

    public abstract h0 E();

    public abstract List<? extends y0> F();

    public abstract String G();

    public abstract boolean H();

    public Task<i> I(h hVar) {
        c4.s.j(hVar);
        return FirebaseAuth.getInstance(W()).n0(this, hVar);
    }

    public Task<i> J(h hVar) {
        c4.s.j(hVar);
        return FirebaseAuth.getInstance(W()).o0(this, hVar);
    }

    public Task<Void> K() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(W());
        return firebaseAuth.p0(this, new c1(firebaseAuth));
    }

    public Task<Void> L() {
        return FirebaseAuth.getInstance(W()).k0(this, false).continueWithTask(new g1(this));
    }

    public Task<Void> M(e eVar) {
        return FirebaseAuth.getInstance(W()).k0(this, false).continueWithTask(new h1(this, eVar));
    }

    public Task<i> N(Activity activity, n nVar) {
        c4.s.j(activity);
        c4.s.j(nVar);
        return FirebaseAuth.getInstance(W()).s0(activity, nVar, this);
    }

    public Task<i> O(Activity activity, n nVar) {
        c4.s.j(activity);
        c4.s.j(nVar);
        return FirebaseAuth.getInstance(W()).t0(activity, nVar, this);
    }

    public Task<i> P(String str) {
        c4.s.f(str);
        return FirebaseAuth.getInstance(W()).v0(this, str);
    }

    public Task<Void> Q(String str) {
        c4.s.f(str);
        return FirebaseAuth.getInstance(W()).w0(this, str);
    }

    public Task<Void> R(String str) {
        c4.s.f(str);
        return FirebaseAuth.getInstance(W()).x0(this, str);
    }

    public Task<Void> S(o0 o0Var) {
        return FirebaseAuth.getInstance(W()).y0(this, o0Var);
    }

    public Task<Void> T(z0 z0Var) {
        c4.s.j(z0Var);
        return FirebaseAuth.getInstance(W()).z0(this, z0Var);
    }

    public Task<Void> U(String str) {
        return V(str, null);
    }

    public Task<Void> V(String str, e eVar) {
        return FirebaseAuth.getInstance(W()).k0(this, false).continueWithTask(new i1(this, str, eVar));
    }

    public abstract w5.f W();

    public abstract a0 X();

    public abstract a0 Y(List list);

    public abstract com.google.android.gms.internal.p000firebaseauthapi.j2 Z();

    public abstract String a();

    public abstract String a0();

    public abstract String b0();

    public abstract Uri c();

    public abstract List c0();

    public abstract void d0(com.google.android.gms.internal.p000firebaseauthapi.j2 j2Var);

    public abstract void e0(List list);

    public abstract String j();

    public abstract String s();

    public abstract String x();
}
