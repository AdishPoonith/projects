package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.a2;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.dw  reason: invalid package */
/* loaded from: classes.dex */
public final class dw implements o0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ n0 f4511a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f4512b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f4513c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Boolean f4514d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ a2 f4515e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ g f4516f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ j2 f4517g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dw(rx rxVar, n0 n0Var, String str, String str2, Boolean bool, a2 a2Var, g gVar, j2 j2Var) {
        this.f4511a = n0Var;
        this.f4512b = str;
        this.f4513c = str2;
        this.f4514d = bool;
        this.f4515e = a2Var;
        this.f4516f = gVar;
        this.f4517g = j2Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void zza(String str) {
        this.f4511a.zza(str);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List a10 = ((y1) obj).a();
        if (a10 == null || a10.isEmpty()) {
            this.f4511a.zza("No users.");
            return;
        }
        int i10 = 0;
        z1 z1Var = (z1) a10.get(0);
        p2 l10 = z1Var.l();
        List c10 = l10 != null ? l10.c() : null;
        if (c10 != null && !c10.isEmpty()) {
            if (!TextUtils.isEmpty(this.f4512b)) {
                while (i10 < c10.size()) {
                    if (!((o2) c10.get(i10)).f().equals(this.f4512b)) {
                        i10++;
                    }
                }
            }
            ((o2) c10.get(i10)).h(this.f4513c);
            break;
        }
        z1Var.h(this.f4514d.booleanValue());
        z1Var.e(this.f4515e);
        this.f4516f.k(this.f4517g, z1Var);
    }
}
