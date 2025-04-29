package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.iu  reason: invalid package */
/* loaded from: classes.dex */
final class iu extends jy {

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ jv f4766p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu(jv jvVar, c0 c0Var, CharSequence charSequence) {
        super(c0Var, charSequence);
        this.f4766p = jvVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.jy
    final int d(int i10) {
        return i10 + 1;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.jy
    final int e(int i10) {
        wh whVar = this.f4766p.f4833a;
        CharSequence charSequence = this.f4836l;
        int length = charSequence.length();
        ht.b(i10, length, "index");
        while (i10 < length) {
            if (whVar.a(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
