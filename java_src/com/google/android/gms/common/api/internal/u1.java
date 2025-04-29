package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u1 implements Runnable {

    /* renamed from: j  reason: collision with root package name */
    private final s1 f3942j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ v1 f3943k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u1(v1 v1Var, s1 s1Var) {
        this.f3943k = v1Var;
        this.f3942j = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3943k.f3945j) {
            b4.b b10 = this.f3942j.b();
            if (b10.E()) {
                v1 v1Var = this.f3943k;
                v1Var.mLifecycleFragment.startActivityForResult(GoogleApiActivity.a(v1Var.getActivity(), (PendingIntent) c4.s.j(b10.D()), this.f3942j.a(), false), 1);
                return;
            }
            v1 v1Var2 = this.f3943k;
            if (v1Var2.f3948m.a(v1Var2.getActivity(), b10.B(), null) != null) {
                v1 v1Var3 = this.f3943k;
                v1Var3.f3948m.v(v1Var3.getActivity(), this.f3943k.mLifecycleFragment, b10.B(), 2, this.f3943k);
            } else if (b10.B() != 18) {
                this.f3943k.a(b10, this.f3942j.a());
            } else {
                v1 v1Var4 = this.f3943k;
                Dialog q10 = v1Var4.f3948m.q(v1Var4.getActivity(), this.f3943k);
                v1 v1Var5 = this.f3943k;
                v1Var5.f3948m.r(v1Var5.getActivity().getApplicationContext(), new t1(this, q10));
            }
        }
    }
}
