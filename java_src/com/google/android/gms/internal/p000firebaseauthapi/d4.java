package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Comparator;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.d4  reason: invalid package */
/* loaded from: classes.dex */
final class d4 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        m4 m4Var = (m4) obj;
        m4 m4Var2 = (m4) obj2;
        c4 c4Var = new c4(m4Var);
        c4 c4Var2 = new c4(m4Var2);
        while (c4Var.hasNext() && c4Var2.hasNext()) {
            int compareTo = Integer.valueOf(c4Var.zza() & 255).compareTo(Integer.valueOf(c4Var2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(m4Var.k()).compareTo(Integer.valueOf(m4Var2.k()));
    }
}
