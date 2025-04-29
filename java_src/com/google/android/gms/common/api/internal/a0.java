package com.google.android.gms.common.api.internal;

import android.app.Activity;
/* loaded from: classes.dex */
public final class a0 extends v1 {

    /* renamed from: n  reason: collision with root package name */
    private final s.b f3783n;

    /* renamed from: o  reason: collision with root package name */
    private final f f3784o;

    a0(i iVar, f fVar, b4.e eVar) {
        super(iVar, eVar);
        this.f3783n = new s.b();
        this.f3784o = fVar;
        this.mLifecycleFragment.b("ConnectionlessLifecycleHelper", this);
    }

    public static void j(Activity activity, f fVar, b bVar) {
        i fragment = LifecycleCallback.getFragment(activity);
        a0 a0Var = (a0) fragment.c("ConnectionlessLifecycleHelper", a0.class);
        if (a0Var == null) {
            a0Var = new a0(fragment, fVar, b4.e.m());
        }
        c4.s.k(bVar, "ApiKey cannot be null");
        a0Var.f3783n.add(bVar);
        fVar.d(a0Var);
    }

    private final void k() {
        if (this.f3783n.isEmpty()) {
            return;
        }
        this.f3784o.d(this);
    }

    @Override // com.google.android.gms.common.api.internal.v1
    protected final void b(b4.b bVar, int i10) {
        this.f3784o.J(bVar, i10);
    }

    @Override // com.google.android.gms.common.api.internal.v1
    protected final void c() {
        this.f3784o.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final s.b i() {
        return this.f3783n;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onResume() {
        super.onResume();
        k();
    }

    @Override // com.google.android.gms.common.api.internal.v1, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        k();
    }

    @Override // com.google.android.gms.common.api.internal.v1, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        this.f3784o.e(this);
    }
}
