package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
import java.util.Set;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.m9  reason: invalid package */
/* loaded from: classes.dex */
public final class m9 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 += next != null ? next.hashCode() : 0;
        }
        return i10;
    }
}
