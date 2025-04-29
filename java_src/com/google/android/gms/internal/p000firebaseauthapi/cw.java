package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import c4.s;
import h4.c;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.cw  reason: invalid package */
/* loaded from: classes.dex */
public final class cw implements o0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ v2 f4471a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ z1 f4472b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g f4473c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ j2 f4474d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ n0 f4475e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ rx f4476f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cw(rx rxVar, v2 v2Var, z1 z1Var, g gVar, j2 j2Var, n0 n0Var) {
        this.f4476f = rxVar;
        this.f4471a = v2Var;
        this.f4472b = z1Var;
        this.f4473c = gVar;
        this.f4474d = j2Var;
        this.f4475e = n0Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void zza(String str) {
        this.f4475e.zza(str);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        w2 w2Var = (w2) obj;
        if (this.f4471a.m("EMAIL")) {
            this.f4472b.g(null);
        } else {
            v2 v2Var = this.f4471a;
            if (v2Var.j() != null) {
                this.f4472b.g(v2Var.j());
            }
        }
        if (this.f4471a.m("DISPLAY_NAME")) {
            this.f4472b.f(null);
        } else {
            v2 v2Var2 = this.f4471a;
            if (v2Var2.i() != null) {
                this.f4472b.f(v2Var2.i());
            }
        }
        if (this.f4471a.m("PHOTO_URL")) {
            this.f4472b.j(null);
        } else {
            v2 v2Var3 = this.f4471a;
            if (v2Var3.l() != null) {
                this.f4472b.j(v2Var3.l());
            }
        }
        if (!TextUtils.isEmpty(this.f4471a.k())) {
            this.f4472b.i(c.c("redacted".getBytes()));
        }
        List e10 = w2Var.e();
        if (e10 == null) {
            e10 = new ArrayList();
        }
        this.f4472b.k(e10);
        g gVar = this.f4473c;
        j2 j2Var = this.f4474d;
        s.j(j2Var);
        s.j(w2Var);
        String c10 = w2Var.c();
        String d10 = w2Var.d();
        if (!TextUtils.isEmpty(c10) && !TextUtils.isEmpty(d10)) {
            j2Var = new j2(d10, c10, Long.valueOf(w2Var.a()), j2Var.G());
        }
        gVar.k(j2Var, this.f4472b);
    }
}
