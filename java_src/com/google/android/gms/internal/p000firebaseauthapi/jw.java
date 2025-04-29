package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.jw  reason: invalid package */
/* loaded from: classes.dex */
final class jw extends jy {

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ yj f4834p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw(jx jxVar, c0 c0Var, CharSequence charSequence, yj yjVar) {
        super(c0Var, charSequence);
        this.f4834p = yjVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.jy
    public final int d(int i10) {
        return ((bn) this.f4834p).f4404a.end();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.jy
    public final int e(int i10) {
        if (((bn) this.f4834p).f4404a.find(i10)) {
            return ((bn) this.f4834p).f4404a.start();
        }
        return -1;
    }
}
