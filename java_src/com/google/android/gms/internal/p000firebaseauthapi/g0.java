package com.google.android.gms.internal.p000firebaseauthapi;

import a6.l;
import a6.r;
import c4.s;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.h;
import com.google.firebase.auth.o0;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.g0  reason: invalid package */
/* loaded from: classes.dex */
public final class g0 implements f {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j0 f4601a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(j0 j0Var) {
        this.f4601a = j0Var;
    }

    private final void n(h0 h0Var) {
        this.f4601a.f4780i.execute(new f0(this, h0Var));
    }

    private final void o(Status status, h hVar, String str, String str2) {
        j0.j(this.f4601a, status);
        j0 j0Var = this.f4601a;
        j0Var.f4787p = hVar;
        j0Var.f4788q = str;
        j0Var.f4789r = str2;
        r rVar = j0Var.f4777f;
        if (rVar != null) {
            rVar.z(status);
        }
        this.f4601a.k(status);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f
    public final void a(String str) {
        int i10 = this.f4601a.f4772a;
        s.m(i10 == 8, "Unexpected response type " + i10);
        this.f4601a.f4786o = str;
        n(new a0(this, str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f
    public final void b(i2 i2Var) {
        j0 j0Var = this.f4601a;
        j0Var.f4791t = i2Var;
        j0.i(j0Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f
    public final void c(j2 j2Var, z1 z1Var) {
        int i10 = this.f4601a.f4772a;
        s.m(i10 == 2, "Unexpected response type: " + i10);
        j0 j0Var = this.f4601a;
        j0Var.f4781j = j2Var;
        j0Var.f4782k = z1Var;
        j0.i(j0Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f
    public final void d(f2 f2Var) {
        j0 j0Var = this.f4601a;
        j0Var.f4792u = f2Var;
        j0.i(j0Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f
    public final void e(wv wvVar) {
        j0 j0Var = this.f4601a;
        j0Var.f4790s = wvVar;
        j0Var.k(l.a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f
    public final void f(s2 s2Var) {
        int i10 = this.f4601a.f4772a;
        s.m(i10 == 4, "Unexpected response type " + i10);
        j0 j0Var = this.f4601a;
        j0Var.f4784m = s2Var;
        j0.i(j0Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f
    public final void g(Status status, o0 o0Var) {
        int i10 = this.f4601a.f4772a;
        s.m(i10 == 2, "Unexpected response type " + i10);
        o(status, o0Var, null, null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f
    public final void h(n1 n1Var) {
        int i10 = this.f4601a.f4772a;
        s.m(i10 == 3, "Unexpected response type " + i10);
        j0 j0Var = this.f4601a;
        j0Var.f4783l = n1Var;
        j0.i(j0Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f
    public final void i(j2 j2Var) {
        int i10 = this.f4601a.f4772a;
        s.m(i10 == 1, "Unexpected response type: " + i10);
        j0 j0Var = this.f4601a;
        j0Var.f4781j = j2Var;
        j0.i(j0Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f
    public final void j(String str) {
        int i10 = this.f4601a.f4772a;
        s.m(i10 == 7, "Unexpected response type " + i10);
        j0 j0Var = this.f4601a;
        j0Var.f4785n = str;
        j0.i(j0Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f
    public final void k(vv vvVar) {
        o(vvVar.a(), vvVar.b(), vvVar.c(), vvVar.d());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f
    public final void l(o0 o0Var) {
        int i10 = this.f4601a.f4772a;
        s.m(i10 == 8, "Unexpected response type " + i10);
        this.f4601a.f4793v = true;
        n(new b0(this, o0Var));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f
    public final void m(Status status) {
        String D = status.D();
        if (D != null) {
            if (D.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (D.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (D.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (D.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (D.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (D.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (D.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (D.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (D.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (D.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        j0 j0Var = this.f4601a;
        if (j0Var.f4772a == 8) {
            j0Var.f4793v = true;
            n(new e0(this, status));
            return;
        }
        j0.j(j0Var, status);
        this.f4601a.k(status);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f
    public final void zza(String str) {
        int i10 = this.f4601a.f4772a;
        s.m(i10 == 8, "Unexpected response type " + i10);
        j0 j0Var = this.f4601a;
        j0Var.f4786o = str;
        j0Var.f4793v = true;
        n(new d0(this, str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f
    public final void zzd() {
        int i10 = this.f4601a.f4772a;
        s.m(i10 == 5, "Unexpected response type " + i10);
        j0.i(this.f4601a);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f
    public final void zzm() {
        int i10 = this.f4601a.f4772a;
        s.m(i10 == 6, "Unexpected response type " + i10);
        j0.i(this.f4601a);
    }
}
