package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import da.p;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.l;
import la.k0;
import s9.o;
import s9.u;
import t9.x;
import v9.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbb extends l implements p {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzbc zzb;
    final /* synthetic */ String zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbb(String[] strArr, zzbc zzbcVar, String str, d dVar) {
        super(2, dVar);
        this.zza = strArr;
        this.zzb = zzbcVar;
        this.zzc = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzbb(this.zza, this.zzb, this.zzc, dVar);
    }

    @Override // da.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbb) create((k0) obj, (d) obj2)).invokeSuspend(u.f17878a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WebView webView;
        String z10;
        w9.d.c();
        o.b(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("\"" + str + "\"");
        }
        webView = this.zzb.zza;
        String str2 = this.zzc;
        z10 = x.z(arrayList, ",", null, null, 0, null, null, 62, null);
        webView.evaluateJavascript(str2 + "(" + z10 + ")", null);
        return u.f17878a;
    }
}
