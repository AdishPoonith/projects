package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.dm  reason: invalid package */
/* loaded from: classes.dex */
public final class dm extends hj {

    /* renamed from: d  reason: collision with root package name */
    private static final ek f4507d = ek.b(new ck() { // from class: com.google.android.gms.internal.firebase-auth-api.zl
        @Override // com.google.android.gms.internal.p000firebaseauthapi.ck
        public final Object a(aa aaVar) {
            return new xm((yl) aaVar);
        }
    }, yl.class, rl.class);

    public dm() {
        super(vq.class, new bm(ta.class));
    }

    public static void l(boolean z10) {
        gb.i(new dm(), true);
        int i10 = om.f5145f;
        om.a(rj.b());
        qj.a().e(f4507d);
    }

    public static final void m(vq vqVar) {
        dv.c(vqVar.C(), 0);
        if (vqVar.I().k() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        o(vqVar.H());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ fj n(int i10, int i11, int i12, int i13) {
        xq D = yq.D();
        ar D2 = br.D();
        D2.s(i12);
        D2.r(i11);
        D.s((br) D2.j());
        D.r(i10);
        return new fj((yq) D.j(), i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(br brVar) {
        if (brVar.C() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int H = brVar.H() - 2;
        if (H == 1) {
            if (brVar.C() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (H == 2) {
            if (brVar.C() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (H == 3) {
            if (brVar.C() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (H == 4) {
            if (brVar.C() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (H != 5) {
            throw new GeneralSecurityException("unknown hash type");
        } else {
            if (brVar.C() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final gj a() {
        return new cm(this, yq.class);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final ur b() {
        return ur.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final /* synthetic */ w6 c(m4 m4Var) {
        return vq.G(m4Var, e5.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final /* bridge */ /* synthetic */ void e(w6 w6Var) {
        m((vq) w6Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final int f() {
        return 2;
    }
}
