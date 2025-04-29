package q4;

import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j implements com.google.android.gms.common.api.internal.q, u {

    /* renamed from: a  reason: collision with root package name */
    private final i f16191a;

    /* renamed from: b  reason: collision with root package name */
    private com.google.android.gms.common.api.internal.j f16192b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f16193c = true;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k f16194d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(k kVar, com.google.android.gms.common.api.internal.j jVar, i iVar) {
        this.f16194d = kVar;
        this.f16192b = jVar;
        this.f16191a = iVar;
    }

    @Override // q4.u
    public final synchronized void a(com.google.android.gms.common.api.internal.j jVar) {
        com.google.android.gms.common.api.internal.j jVar2 = this.f16192b;
        if (jVar2 != jVar) {
            jVar2.a();
            this.f16192b = jVar;
        }
    }

    @Override // com.google.android.gms.common.api.internal.q
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        j.a b10;
        boolean z10;
        a0 a0Var = (a0) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        synchronized (this) {
            b10 = this.f16192b.b();
            z10 = this.f16193c;
            this.f16192b.a();
        }
        if (b10 == null) {
            taskCompletionSource.setResult(Boolean.FALSE);
        } else {
            this.f16191a.a(a0Var, b10, z10, taskCompletionSource);
        }
    }

    @Override // q4.u
    public final synchronized com.google.android.gms.common.api.internal.j zza() {
        return this.f16192b;
    }

    @Override // q4.u
    public final void zzb() {
        j.a<?> b10;
        synchronized (this) {
            this.f16193c = false;
            b10 = this.f16192b.b();
        }
        if (b10 != null) {
            this.f16194d.m(b10, 2441);
        }
    }
}
