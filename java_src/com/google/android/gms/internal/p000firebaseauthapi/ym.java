package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ym  reason: invalid package */
/* loaded from: classes.dex */
public final class ym {

    /* renamed from: a  reason: collision with root package name */
    private HashMap f5719a = new HashMap();

    public final an a() {
        if (this.f5719a != null) {
            an anVar = new an(Collections.unmodifiableMap(this.f5719a), null);
            this.f5719a = null;
            return anVar;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
