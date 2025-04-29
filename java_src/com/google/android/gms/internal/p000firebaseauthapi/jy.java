package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.jy  reason: invalid package */
/* loaded from: classes.dex */
abstract class jy extends qb {

    /* renamed from: l  reason: collision with root package name */
    final CharSequence f4836l;

    /* renamed from: m  reason: collision with root package name */
    final wh f4837m;

    /* renamed from: n  reason: collision with root package name */
    int f4838n = 0;

    /* renamed from: o  reason: collision with root package name */
    int f4839o;

    /* JADX INFO: Access modifiers changed from: protected */
    public jy(c0 c0Var, CharSequence charSequence) {
        wh whVar;
        whVar = c0Var.f4416a;
        this.f4837m = whVar;
        this.f4839o = Integer.MAX_VALUE;
        this.f4836l = charSequence;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.qb
    protected final /* bridge */ /* synthetic */ Object a() {
        int d10;
        int i10 = this.f4838n;
        while (true) {
            int i11 = this.f4838n;
            if (i11 == -1) {
                c();
                return null;
            }
            int e10 = e(i11);
            if (e10 == -1) {
                e10 = this.f4836l.length();
                this.f4838n = -1;
                d10 = -1;
            } else {
                d10 = d(e10);
                this.f4838n = d10;
            }
            if (d10 != i10) {
                if (i10 < e10) {
                    this.f4836l.charAt(i10);
                }
                if (i10 < e10) {
                    this.f4836l.charAt(e10 - 1);
                }
                int i12 = this.f4839o;
                if (i12 == 1) {
                    e10 = this.f4836l.length();
                    this.f4838n = -1;
                    if (e10 > i10) {
                        this.f4836l.charAt(e10 - 1);
                    }
                } else {
                    this.f4839o = i12 - 1;
                }
                return this.f4836l.subSequence(i10, e10).toString();
            }
            int i13 = d10 + 1;
            this.f4838n = i13;
            if (i13 > this.f4836l.length()) {
                this.f4838n = -1;
            }
        }
    }

    abstract int d(int i10);

    abstract int e(int i10);
}
