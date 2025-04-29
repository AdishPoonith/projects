package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ul  reason: invalid package */
/* loaded from: classes.dex */
public final class ul implements cb {

    /* renamed from: a  reason: collision with root package name */
    private static final ul f5463a = new ul();

    private ul() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b() {
        gb.j(f5463a);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.cb
    public final /* bridge */ /* synthetic */ Object a(bb bbVar) {
        if (bbVar.a() != null) {
            for (List<xa> list : bbVar.d()) {
                for (xa xaVar : list) {
                    xaVar.d();
                }
            }
            return new tl(bbVar, null);
        }
        throw new GeneralSecurityException("no primary in primitive set");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.cb
    public final Class zza() {
        return rl.class;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.cb
    public final Class zzb() {
        return rl.class;
    }
}
