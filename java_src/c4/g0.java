package c4;

import android.app.Activity;
import android.content.Intent;
/* loaded from: classes.dex */
final class g0 extends i0 {

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ Intent f3319j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ Activity f3320k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ int f3321l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(Intent intent, Activity activity, int i10) {
        this.f3319j = intent;
        this.f3320k = activity;
        this.f3321l = i10;
    }

    @Override // c4.i0
    public final void a() {
        Intent intent = this.f3319j;
        if (intent != null) {
            this.f3320k.startActivityForResult(intent, this.f3321l);
        }
    }
}
