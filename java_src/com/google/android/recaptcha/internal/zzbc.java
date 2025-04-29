package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import la.i;
import la.k0;
/* loaded from: classes.dex */
public final class zzbc {
    private final WebView zza;
    private final k0 zzb;

    public zzbc(WebView webView, k0 k0Var) {
        this.zza = webView;
        this.zzb = k0Var;
    }

    public final void zzb(String str, String... strArr) {
        i.d(this.zzb, null, null, new zzbb(strArr, this, str, null), 3, null);
    }
}
