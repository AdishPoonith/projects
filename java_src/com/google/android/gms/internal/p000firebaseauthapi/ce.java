package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ce  reason: invalid package */
/* loaded from: classes.dex */
public final class ce extends hj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ce() {
        super(ap.class, new ae(s9.class));
    }

    public static void k(boolean z10) {
        if (m()) {
            gb.i(new ce(), true);
            int i10 = me.f5011f;
            me.a(rj.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ fj l(int i10, int i11) {
        cp D = ep.D();
        D.r(i10);
        return new fj((ep) D.j(), i11);
    }

    private static boolean m() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final gj a() {
        return new be(this, ep.class);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final ur b() {
        return ur.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final /* synthetic */ w6 c(m4 m4Var) {
        return ap.F(m4Var, e5.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final /* bridge */ /* synthetic */ void e(w6 w6Var) {
        ap apVar = (ap) w6Var;
        dv.c(apVar.C(), 0);
        dv.b(apVar.G().k());
    }
}
