package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.Provider;
import javax.crypto.KeyAgreement;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.nu  reason: invalid package */
/* loaded from: classes.dex */
public final class nu implements tu {
    @Override // com.google.android.gms.internal.p000firebaseauthapi.tu
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
