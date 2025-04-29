package com.google.android.gms.common.api.internal;

import android.os.Bundle;
/* loaded from: classes.dex */
final class b2 implements Runnable {

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f3797j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ String f3798k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ c2 f3799l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b2(c2 c2Var, LifecycleCallback lifecycleCallback, String str) {
        this.f3799l = c2Var;
        this.f3797j = lifecycleCallback;
        this.f3798k = str;
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
        c2 c2Var = this.f3799l;
        i10 = c2Var.f3808k0;
        if (i10 > 0) {
            LifecycleCallback lifecycleCallback = this.f3797j;
            bundle = c2Var.f3809l0;
            if (bundle != null) {
                bundle3 = c2Var.f3809l0;
                bundle2 = bundle3.getBundle(this.f3798k);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
        i11 = this.f3799l.f3808k0;
        if (i11 >= 2) {
            this.f3797j.onStart();
        }
        i12 = this.f3799l.f3808k0;
        if (i12 >= 3) {
            this.f3797j.onResume();
        }
        i13 = this.f3799l.f3808k0;
        if (i13 >= 4) {
            this.f3797j.onStop();
        }
        i14 = this.f3799l.f3808k0;
        if (i14 >= 5) {
            this.f3797j.onDestroy();
        }
    }
}
