package w7;

import android.content.Context;
/* loaded from: classes.dex */
enum d {
    RSA_ECB_PKCS1Padding(new e() { // from class: w7.b
        @Override // w7.e
        public final a a(Context context) {
            return new f(context);
        }
    }, 1),
    RSA_ECB_OAEPwithSHA_256andMGF1Padding(new e() { // from class: w7.c
        @Override // w7.e
        public final a a(Context context) {
            return new g(context);
        }
    }, 23);
    

    /* renamed from: j  reason: collision with root package name */
    final e f20016j;

    /* renamed from: k  reason: collision with root package name */
    final int f20017k;

    d(e eVar, int i10) {
        this.f20016j = eVar;
        this.f20017k = i10;
    }
}
