package q4;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
/* loaded from: classes.dex */
final class y extends t4.u {

    /* renamed from: a  reason: collision with root package name */
    private final u f16222a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(u uVar) {
        this.f16222a = uVar;
    }

    @Override // t4.v
    public final void F2(LocationResult locationResult) {
        this.f16222a.zza().c(new v(this, locationResult));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final y H2(com.google.android.gms.common.api.internal.j jVar) {
        this.f16222a.a(jVar);
        return this;
    }

    @Override // t4.v
    public final void K0(LocationAvailability locationAvailability) {
        this.f16222a.zza().c(new w(this, locationAvailability));
    }

    @Override // t4.v
    public final void zzf() {
        this.f16222a.zza().c(new x(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzh() {
        this.f16222a.zza().a();
    }
}
