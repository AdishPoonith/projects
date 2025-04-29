package com.google.android.gms.common.api.internal;

import android.os.Bundle;
/* loaded from: classes.dex */
final class z1 implements Runnable {

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f3966j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ String f3967k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ a2 f3968l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z1(a2 a2Var, LifecycleCallback lifecycleCallback, String str) {
        this.f3968l = a2Var;
        this.f3966j = lifecycleCallback;
        this.f3967k = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        a2 a2Var = this.f3968l;
        i10 = a2Var.f3788k;
        if (i10 > 0) {
            LifecycleCallback lifecycleCallback = this.f3966j;
            bundle = a2Var.f3789l;
            if (bundle != null) {
                bundle3 = a2Var.f3789l;
                bundle2 = bundle3.getBundle(this.f3967k);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
        i11 = this.f3968l.f3788k;
        if (i11 >= 2) {
            this.f3966j.onStart();
        }
        i12 = this.f3968l.f3788k;
        if (i12 >= 3) {
            this.f3966j.onResume();
        }
        i13 = this.f3968l.f3788k;
        if (i13 >= 4) {
            this.f3966j.onStop();
        }
        i14 = this.f3968l.f3788k;
        if (i14 >= 5) {
            this.f3966j.onDestroy();
        }
    }
}
