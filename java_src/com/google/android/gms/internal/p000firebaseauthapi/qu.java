package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.Provider;
import javax.crypto.Mac;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.qu  reason: invalid package */
/* loaded from: classes.dex */
public final class qu implements tu {
    @Override // com.google.android.gms.internal.p000firebaseauthapi.tu
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
