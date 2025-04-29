package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.a;
import java.util.Map;
/* loaded from: classes.dex */
final class m0 implements Runnable {

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ b4.b f3882j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ n0 f3883k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(n0 n0Var, b4.b bVar) {
        this.f3883k = n0Var;
        this.f3882j = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        b bVar;
        a.f fVar;
        a.f fVar2;
        a.f fVar3;
        a.f fVar4;
        n0 n0Var = this.f3883k;
        map = n0Var.f3891f.f3826u;
        bVar = n0Var.f3887b;
        j0 j0Var = (j0) map.get(bVar);
        if (j0Var == null) {
            return;
        }
        if (!this.f3882j.F()) {
            j0Var.G(this.f3882j, null);
            return;
        }
        this.f3883k.f3890e = true;
        fVar = this.f3883k.f3886a;
        if (fVar.o()) {
            this.f3883k.h();
            return;
        }
        try {
            n0 n0Var2 = this.f3883k;
            fVar3 = n0Var2.f3886a;
            fVar4 = n0Var2.f3886a;
            fVar3.c(null, fVar4.e());
        } catch (SecurityException e10) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
            fVar2 = this.f3883k.f3886a;
            fVar2.f("Failed to get service from broker.");
            j0Var.G(new b4.b(10), null);
        }
    }
}
