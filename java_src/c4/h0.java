package c4;

import android.content.Intent;
/* loaded from: classes.dex */
final class h0 extends i0 {

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ Intent f3324j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.internal.i f3325k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(Intent intent, com.google.android.gms.common.api.internal.i iVar, int i10) {
        this.f3324j = intent;
        this.f3325k = iVar;
    }

    @Override // c4.i0
    public final void a() {
        Intent intent = this.f3324j;
        if (intent != null) {
            this.f3325k.startActivityForResult(intent, 2);
        }
    }
}
