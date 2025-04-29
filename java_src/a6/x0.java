package a6;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.internal.p000firebaseauthapi.j2;
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    private volatile int f331a;

    /* renamed from: b  reason: collision with root package name */
    private final p f332b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f333c;

    public x0(w5.f fVar) {
        Context m10 = fVar.m();
        p pVar = new p(fVar);
        this.f333c = false;
        this.f331a = 0;
        this.f332b = pVar;
        com.google.android.gms.common.api.internal.c.c((Application) m10.getApplicationContext());
        com.google.android.gms.common.api.internal.c.b().a(new w0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g() {
        return this.f331a > 0 && !this.f333c;
    }

    public final void c() {
        this.f332b.b();
    }

    public final void d(int i10) {
        if (i10 > 0 && this.f331a == 0) {
            this.f331a = i10;
            if (g()) {
                this.f332b.c();
            }
        } else if (i10 == 0 && this.f331a != 0) {
            this.f332b.b();
        }
        this.f331a = i10;
    }

    public final void e(j2 j2Var) {
        if (j2Var == null) {
            return;
        }
        long B = j2Var.B();
        if (B <= 0) {
            B = 3600;
        }
        p pVar = this.f332b;
        pVar.f272b = j2Var.C() + (B * 1000);
        pVar.f273c = -1L;
        if (g()) {
            this.f332b.c();
        }
    }
}
