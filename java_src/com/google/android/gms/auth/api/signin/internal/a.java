package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import androidx.loader.app.a;
import com.google.android.gms.common.api.f;
import d0.b;
import z3.g;
import z3.z;
/* loaded from: classes.dex */
final class a implements a.InterfaceC0044a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SignInHubActivity f3728a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ a(SignInHubActivity signInHubActivity, z zVar) {
        this.f3728a = signInHubActivity;
    }

    @Override // androidx.loader.app.a.InterfaceC0044a
    public final /* bridge */ /* synthetic */ void a(b bVar, Object obj) {
        Void r32 = (Void) obj;
        SignInHubActivity signInHubActivity = this.f3728a;
        signInHubActivity.setResult(SignInHubActivity.O(signInHubActivity), SignInHubActivity.P(signInHubActivity));
        this.f3728a.finish();
    }

    @Override // androidx.loader.app.a.InterfaceC0044a
    public final void b(b bVar) {
    }

    @Override // androidx.loader.app.a.InterfaceC0044a
    public final b c(int i10, Bundle bundle) {
        return new g(this.f3728a, f.c());
    }
}
