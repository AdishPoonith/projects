package j0;

import android.content.Intent;
import p0.n;
import p0.p;
import p0.s;
import p1.g0;
import r8.k;
import r8.m;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b implements p<g0>, m {

    /* renamed from: j  reason: collision with root package name */
    private final n f11957j;

    /* renamed from: k  reason: collision with root package name */
    private k.d f11958k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(n nVar) {
        this.f11957j = nVar;
    }

    @Override // p0.p
    public void a() {
        d("CANCELLED", "User has cancelled login with facebook");
    }

    @Override // r8.m
    public boolean b(int i10, int i11, Intent intent) {
        return this.f11957j.b(i10, i11, intent);
    }

    @Override // p0.p
    public void c(s sVar) {
        d("FAILED", sVar.getMessage());
    }

    void d(String str, String str2) {
        k.d dVar = this.f11958k;
        if (dVar != null) {
            dVar.b(str, str2, null);
            this.f11958k = null;
        }
    }

    void e(Object obj) {
        k.d dVar = this.f11958k;
        if (dVar != null) {
            dVar.a(obj);
            this.f11958k = null;
        }
    }

    @Override // p0.p
    /* renamed from: f */
    public void onSuccess(g0 g0Var) {
        e(a.b(g0Var.a()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g(k.d dVar) {
        if (this.f11958k != null) {
            dVar.b("OPERATION_IN_PROGRESS", "The method login was called while another Facebook operation was in progress.", null);
            return false;
        }
        this.f11958k = dVar;
        return true;
    }
}
