package com.google.android.gms.common.api.internal;

import android.app.Activity;
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final Object f3837a;

    public h(Activity activity) {
        c4.s.k(activity, "Activity must not be null");
        this.f3837a = activity;
    }

    public final Activity a() {
        return (Activity) this.f3837a;
    }

    public final androidx.fragment.app.e b() {
        return (androidx.fragment.app.e) this.f3837a;
    }

    public final boolean c() {
        return this.f3837a instanceof Activity;
    }

    public final boolean d() {
        return this.f3837a instanceof androidx.fragment.app.e;
    }
}
