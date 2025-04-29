package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.InputStream;
import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.js  reason: invalid package */
/* loaded from: classes.dex */
public final class js extends r5 implements x6 {
    private static final js zzb;
    private int zzd;
    private w5 zze = r5.g();

    static {
        js jsVar = new js();
        zzb = jsVar;
        r5.m(js.class, jsVar);
    }

    private js() {
    }

    public static fs E() {
        return (fs) zzb.v();
    }

    public static js H(InputStream inputStream, e5 e5Var) {
        return (js) r5.A(zzb, inputStream, e5Var);
    }

    public static js I(byte[] bArr, e5 e5Var) {
        return (js) r5.B(zzb, bArr, e5Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void L(js jsVar, is isVar) {
        isVar.getClass();
        w5 w5Var = jsVar.zze;
        if (!w5Var.zzc()) {
            jsVar.zze = r5.h(w5Var);
        }
        jsVar.zze.add(isVar);
    }

    public final int C() {
        return this.zze.size();
    }

    public final int D() {
        return this.zzd;
    }

    public final is F(int i10) {
        return (is) this.zze.get(i10);
    }

    public final List J() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.r5
    public final Object t(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new fs(null);
                }
                return new js();
            }
            return r5.j(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", is.class});
        }
        return (byte) 1;
    }
}
