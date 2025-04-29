package a6;

import com.google.android.gms.common.api.internal.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w0 implements c.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ x0 f316a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w0(x0 x0Var) {
        this.f316a = x0Var;
    }

    @Override // com.google.android.gms.common.api.internal.c.a
    public final void a(boolean z10) {
        boolean g10;
        p pVar;
        if (z10) {
            this.f316a.f333c = true;
            this.f316a.c();
            return;
        }
        this.f316a.f333c = false;
        g10 = this.f316a.g();
        if (g10) {
            pVar = this.f316a.f332b;
            pVar.c();
        }
    }
}
