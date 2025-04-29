package com.google.android.gms.internal.p000firebaseauthapi;

import a6.r;
import android.app.Activity;
import c4.s;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.a0;
import com.google.firebase.auth.h;
import com.google.firebase.auth.q0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import w5.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.j0  reason: invalid package */
/* loaded from: classes.dex */
public abstract class j0 implements l0 {

    /* renamed from: a  reason: collision with root package name */
    protected final int f4772a;

    /* renamed from: c  reason: collision with root package name */
    protected f f4774c;

    /* renamed from: d  reason: collision with root package name */
    protected a0 f4775d;

    /* renamed from: e  reason: collision with root package name */
    protected Object f4776e;

    /* renamed from: f  reason: collision with root package name */
    protected r f4777f;

    /* renamed from: g  reason: collision with root package name */
    protected y f4778g;

    /* renamed from: i  reason: collision with root package name */
    protected Executor f4780i;

    /* renamed from: j  reason: collision with root package name */
    protected j2 f4781j;

    /* renamed from: k  reason: collision with root package name */
    protected z1 f4782k;

    /* renamed from: l  reason: collision with root package name */
    protected n1 f4783l;

    /* renamed from: m  reason: collision with root package name */
    protected s2 f4784m;

    /* renamed from: n  reason: collision with root package name */
    protected String f4785n;

    /* renamed from: o  reason: collision with root package name */
    protected String f4786o;

    /* renamed from: p  reason: collision with root package name */
    protected h f4787p;

    /* renamed from: q  reason: collision with root package name */
    protected String f4788q;

    /* renamed from: r  reason: collision with root package name */
    protected String f4789r;

    /* renamed from: s  reason: collision with root package name */
    protected wv f4790s;

    /* renamed from: t  reason: collision with root package name */
    protected i2 f4791t;

    /* renamed from: u  reason: collision with root package name */
    protected f2 f4792u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f4793v;

    /* renamed from: w  reason: collision with root package name */
    Object f4794w;

    /* renamed from: x  reason: collision with root package name */
    Status f4795x;

    /* renamed from: b  reason: collision with root package name */
    final g0 f4773b = new g0(this);

    /* renamed from: h  reason: collision with root package name */
    protected final List f4779h = new ArrayList();

    public j0(int i10) {
        this.f4772a = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void i(j0 j0Var) {
        j0Var.b();
        s.m(j0Var.f4793v, "no success or failure set on method implementation");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void j(j0 j0Var, Status status) {
        r rVar = j0Var.f4777f;
        if (rVar != null) {
            rVar.z(status);
        }
    }

    public abstract void b();

    public final j0 c(Object obj) {
        this.f4776e = s.k(obj, "external callback cannot be null");
        return this;
    }

    public final j0 d(r rVar) {
        this.f4777f = (r) s.k(rVar, "external failure callback cannot be null");
        return this;
    }

    public final j0 e(f fVar) {
        this.f4774c = (f) s.k(fVar, "firebaseApp cannot be null");
        return this;
    }

    public final j0 f(a0 a0Var) {
        this.f4775d = (a0) s.k(a0Var, "firebaseUser cannot be null");
        return this;
    }

    public final j0 g(q0.b bVar, Activity activity, Executor executor, String str) {
        q0.b a10 = x0.a(str, bVar, this);
        synchronized (this.f4779h) {
            this.f4779h.add((q0.b) s.j(a10));
        }
        if (activity != null) {
            z.a(activity, this.f4779h);
        }
        this.f4780i = (Executor) s.j(executor);
        return this;
    }

    public final void k(Status status) {
        this.f4793v = true;
        this.f4795x = status;
        this.f4778g.a(null, status);
    }

    public final void l(Object obj) {
        this.f4793v = true;
        this.f4794w = obj;
        this.f4778g.a(obj, null);
    }
}
