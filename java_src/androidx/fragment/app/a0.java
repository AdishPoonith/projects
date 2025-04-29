package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a0 implements f0.d {

    /* renamed from: j  reason: collision with root package name */
    private androidx.lifecycle.j f2152j = null;

    /* renamed from: k  reason: collision with root package name */
    private f0.c f2153k = null;

    @Override // androidx.lifecycle.i
    public androidx.lifecycle.e a() {
        c();
        return this.f2152j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(e.a aVar) {
        this.f2152j.h(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (this.f2152j == null) {
            this.f2152j = new androidx.lifecycle.j(this);
            this.f2153k = f0.c.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.f2152j != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Bundle bundle) {
        this.f2153k.d(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Bundle bundle) {
        this.f2153k.e(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(e.b bVar) {
        this.f2152j.n(bVar);
    }

    @Override // f0.d
    public androidx.savedstate.a j() {
        return this.f2153k.b();
    }
}
