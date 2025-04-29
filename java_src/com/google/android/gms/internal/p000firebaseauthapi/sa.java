package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.sa  reason: invalid package */
/* loaded from: classes.dex */
public final class sa {

    /* renamed from: a  reason: collision with root package name */
    private static final CopyOnWriteArrayList f5338a = new CopyOnWriteArrayList();

    public static ra a(String str) {
        Iterator it = f5338a.iterator();
        while (it.hasNext()) {
            ra raVar = (ra) it.next();
            if (raVar.a(str)) {
                return raVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
