package w4;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e0 implements b0 {

    /* renamed from: b  reason: collision with root package name */
    private final r4.n f19865b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a0 f19866c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(a0 a0Var) {
        r4.n nVar;
        this.f19866c = a0Var;
        nVar = a0Var.f19847j;
        this.f19865b = nVar;
    }

    @Override // w4.b0
    public final y a(int i10, int i11, int i12) {
        try {
            return this.f19865b.C0(i10, i11, i12);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
