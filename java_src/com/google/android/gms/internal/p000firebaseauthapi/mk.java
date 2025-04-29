package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.mk  reason: invalid package */
/* loaded from: classes.dex */
public final class mk implements ok {

    /* renamed from: a  reason: collision with root package name */
    private final String f5022a;

    /* renamed from: b  reason: collision with root package name */
    private final gv f5023b;

    /* renamed from: c  reason: collision with root package name */
    private final m4 f5024c;

    /* renamed from: d  reason: collision with root package name */
    private final ur f5025d;

    /* renamed from: e  reason: collision with root package name */
    private final ct f5026e;

    /* renamed from: f  reason: collision with root package name */
    private final Integer f5027f;

    private mk(String str, m4 m4Var, ur urVar, ct ctVar, Integer num) {
        this.f5022a = str;
        this.f5023b = xk.b(str);
        this.f5024c = m4Var;
        this.f5025d = urVar;
        this.f5026e = ctVar;
        this.f5027f = num;
    }

    public static mk a(String str, m4 m4Var, ur urVar, ct ctVar, Integer num) {
        if (ctVar == ct.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new mk(str, m4Var, urVar, ctVar, num);
    }

    public final ur b() {
        return this.f5025d;
    }

    public final ct c() {
        return this.f5026e;
    }

    public final m4 d() {
        return this.f5024c;
    }

    public final Integer e() {
        return this.f5027f;
    }

    public final String f() {
        return this.f5022a;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ok
    public final gv zzd() {
        return this.f5023b;
    }
}
