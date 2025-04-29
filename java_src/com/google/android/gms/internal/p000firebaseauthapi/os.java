package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.os  reason: invalid package */
/* loaded from: classes.dex */
public final class os extends r5 implements x6 {
    private static final os zzb;
    private int zzd;
    private w5 zze = r5.g();

    static {
        os osVar = new os();
        zzb = osVar;
        r5.m(os.class, osVar);
    }

    private os() {
    }

    public static ls C() {
        return (ls) zzb.v();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void G(os osVar, ns nsVar) {
        nsVar.getClass();
        w5 w5Var = osVar.zze;
        if (!w5Var.zzc()) {
            osVar.zze = r5.h(w5Var);
        }
        osVar.zze.add(nsVar);
    }

    public final ns D(int i10) {
        return (ns) this.zze.get(0);
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
                    return new ls(null);
                }
                return new os();
            }
            return r5.j(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", ns.class});
        }
        return (byte) 1;
    }
}
