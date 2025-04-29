package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ri  reason: invalid package */
/* loaded from: classes.dex */
public final class ri implements qa {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences.Editor f5293a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5294b;

    public ri(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.f5294b = str;
        Context applicationContext = context.getApplicationContext();
        this.f5293a = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).edit();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.qa
    public final void a(js jsVar) {
        if (!this.f5293a.putString(this.f5294b, uu.a(jsVar.a())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.qa
    public final void b(qq qqVar) {
        if (!this.f5293a.putString(this.f5294b, uu.a(qqVar.a())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
