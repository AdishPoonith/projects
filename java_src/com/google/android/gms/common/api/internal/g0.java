package com.google.android.gms.common.api.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g0 implements Runnable {

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ int f3835j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ j0 f3836k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(j0 j0Var, int i10) {
        this.f3836k = j0Var;
        this.f3835j = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3836k.h(this.f3835j);
    }
}
