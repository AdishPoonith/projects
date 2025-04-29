package w7;

import android.content.Context;
/* loaded from: classes.dex */
enum l {
    AES_CBC_PKCS7Padding(new n() { // from class: w7.j
        @Override // w7.n
        public final i a(Context context, a aVar) {
            return new h(context, aVar);
        }
    }, 1),
    AES_GCM_NoPadding(new n() { // from class: w7.k
        @Override // w7.n
        public final i a(Context context, a aVar) {
            return new o(context, aVar);
        }
    }, 23);
    

    /* renamed from: j  reason: collision with root package name */
    final n f20028j;

    /* renamed from: k  reason: collision with root package name */
    final int f20029k;

    l(n nVar, int i10) {
        this.f20028j = nVar;
        this.f20029k = i10;
    }
}
