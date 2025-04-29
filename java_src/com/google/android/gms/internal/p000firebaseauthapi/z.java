package com.google.android.gms.internal.p000firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.i;
import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.z  reason: invalid package */
/* loaded from: classes.dex */
final class z extends LifecycleCallback {

    /* renamed from: a  reason: collision with root package name */
    private final List f5735a;

    private z(i iVar, List list) {
        super(iVar);
        this.mLifecycleFragment.b("PhoneAuthActivityStopCallback", this);
        this.f5735a = list;
    }

    public static void a(Activity activity, List list) {
        i fragment = LifecycleCallback.getFragment(activity);
        if (((z) fragment.c("PhoneAuthActivityStopCallback", z.class)) == null) {
            new z(fragment, list);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        synchronized (this.f5735a) {
            this.f5735a.clear();
        }
    }
}
