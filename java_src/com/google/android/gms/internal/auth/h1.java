package com.google.android.gms.internal.auth;

import java.util.Comparator;
/* loaded from: classes.dex */
final class h1 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        q1 q1Var = (q1) obj;
        q1 q1Var2 = (q1) obj2;
        g1 g1Var = new g1(q1Var);
        g1 g1Var2 = new g1(q1Var2);
        while (g1Var.hasNext() && g1Var2.hasNext()) {
            int compareTo = Integer.valueOf(g1Var.zza() & 255).compareTo(Integer.valueOf(g1Var2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(q1Var.k()).compareTo(Integer.valueOf(q1Var2.k()));
    }
}
