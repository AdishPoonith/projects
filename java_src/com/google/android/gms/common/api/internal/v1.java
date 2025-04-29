package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public abstract class v1 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: j  reason: collision with root package name */
    protected volatile boolean f3945j;

    /* renamed from: k  reason: collision with root package name */
    protected final AtomicReference f3946k;

    /* renamed from: l  reason: collision with root package name */
    private final Handler f3947l;

    /* renamed from: m  reason: collision with root package name */
    protected final b4.e f3948m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v1(i iVar, b4.e eVar) {
        super(iVar);
        this.f3946k = new AtomicReference(null);
        this.f3947l = new o4.j(Looper.getMainLooper());
        this.f3948m = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(b4.b bVar, int i10) {
        this.f3946k.set(null);
        b(bVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        this.f3946k.set(null);
        c();
    }

    private static final int e(s1 s1Var) {
        if (s1Var == null) {
            return -1;
        }
        return s1Var.a();
    }

    protected abstract void b(b4.b bVar, int i10);

    protected abstract void c();

    public final void h(b4.b bVar, int i10) {
        s1 s1Var = new s1(bVar, i10);
        AtomicReference atomicReference = this.f3946k;
        while (!atomicReference.compareAndSet(null, s1Var)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        this.f3947l.post(new u1(this, s1Var));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onActivityResult(int i10, int i11, Intent intent) {
        s1 s1Var = (s1) this.f3946k.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int f10 = this.f3948m.f(getActivity());
                if (f10 == 0) {
                    d();
                    return;
                } else if (s1Var == null) {
                    return;
                } else {
                    if (s1Var.b().B() == 18 && f10 == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            d();
            return;
        } else if (i11 == 0) {
            if (s1Var == null) {
                return;
            }
            a(new b4.b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, s1Var.b().toString()), e(s1Var));
            return;
        }
        if (s1Var != null) {
            a(s1Var.b(), s1Var.a());
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        a(new b4.b(13, null), e((s1) this.f3946k.get()));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f3946k.set(bundle.getBoolean("resolving_error", false) ? new s1(new b4.b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        s1 s1Var = (s1) this.f3946k.get();
        if (s1Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", s1Var.a());
        bundle.putInt("failed_status", s1Var.b().B());
        bundle.putParcelable("failed_resolution", s1Var.b().D());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStart() {
        super.onStart();
        this.f3945j = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStop() {
        super.onStop();
        this.f3945j = false;
    }
}
