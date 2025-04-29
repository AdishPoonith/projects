package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.xu  reason: invalid package */
/* loaded from: classes.dex */
public final class xu extends ThreadLocal {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ yu f5678a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xu(yu yuVar) {
        this.f5678a = yuVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: a */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            lu luVar = lu.f4964c;
            str = this.f5678a.f5725b;
            Mac mac = (Mac) luVar.a(str);
            key = this.f5678a.f5726c;
            mac.init(key);
            return mac;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
