package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.util.Log;
import c4.c;
import com.google.android.gms.common.api.a;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n0 implements c.InterfaceC0076c, g1 {

    /* renamed from: a  reason: collision with root package name */
    private final a.f f3886a;

    /* renamed from: b  reason: collision with root package name */
    private final b f3887b;

    /* renamed from: c  reason: collision with root package name */
    private c4.k f3888c = null;

    /* renamed from: d  reason: collision with root package name */
    private Set f3889d = null;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3890e = false;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ f f3891f;

    public n0(f fVar, a.f fVar2, b bVar) {
        this.f3891f = fVar;
        this.f3886a = fVar2;
        this.f3887b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        c4.k kVar;
        if (!this.f3890e || (kVar = this.f3888c) == null) {
            return;
        }
        this.f3886a.c(kVar, this.f3889d);
    }

    @Override // c4.c.InterfaceC0076c
    public final void a(b4.b bVar) {
        Handler handler;
        handler = this.f3891f.f3830y;
        handler.post(new m0(this, bVar));
    }

    @Override // com.google.android.gms.common.api.internal.g1
    public final void b(c4.k kVar, Set set) {
        if (kVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            c(new b4.b(4));
            return;
        }
        this.f3888c = kVar;
        this.f3889d = set;
        h();
    }

    @Override // com.google.android.gms.common.api.internal.g1
    public final void c(b4.b bVar) {
        Map map;
        map = this.f3891f.f3826u;
        j0 j0Var = (j0) map.get(this.f3887b);
        if (j0Var != null) {
            j0Var.H(bVar);
        }
    }
}
