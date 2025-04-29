package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class c2 extends Fragment implements i {

    /* renamed from: m0  reason: collision with root package name */
    private static final WeakHashMap f3806m0 = new WeakHashMap();

    /* renamed from: j0  reason: collision with root package name */
    private final Map f3807j0 = Collections.synchronizedMap(new s.a());

    /* renamed from: k0  reason: collision with root package name */
    private int f3808k0 = 0;

    /* renamed from: l0  reason: collision with root package name */
    private Bundle f3809l0;

    public static c2 K1(androidx.fragment.app.e eVar) {
        c2 c2Var;
        WeakHashMap weakHashMap = f3806m0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(eVar);
        if (weakReference == null || (c2Var = (c2) weakReference.get()) == null) {
            try {
                c2 c2Var2 = (c2) eVar.F().j0("SupportLifecycleFragmentImpl");
                if (c2Var2 == null || c2Var2.c0()) {
                    c2Var2 = new c2();
                    eVar.F().m().d(c2Var2, "SupportLifecycleFragmentImpl").g();
                }
                weakHashMap.put(eVar, new WeakReference(c2Var2));
                return c2Var2;
            } catch (ClassCastException e10) {
                throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
            }
        }
        return c2Var;
    }

    @Override // androidx.fragment.app.Fragment
    public final void I0() {
        super.I0();
        this.f3808k0 = 3;
        for (LifecycleCallback lifecycleCallback : this.f3807j0.values()) {
            lifecycleCallback.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void J0(Bundle bundle) {
        super.J0(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f3807j0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void K0() {
        super.K0();
        this.f3808k0 = 2;
        for (LifecycleCallback lifecycleCallback : this.f3807j0.values()) {
            lifecycleCallback.onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void L0() {
        super.L0();
        this.f3808k0 = 4;
        for (LifecycleCallback lifecycleCallback : this.f3807j0.values()) {
            lifecycleCallback.onStop();
        }
    }

    @Override // com.google.android.gms.common.api.internal.i
    public final void b(String str, LifecycleCallback lifecycleCallback) {
        if (this.f3807j0.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f3807j0.put(str, lifecycleCallback);
        if (this.f3808k0 > 0) {
            new p4.e(Looper.getMainLooper()).post(new b2(this, lifecycleCallback, str));
        }
    }

    @Override // com.google.android.gms.common.api.internal.i
    public final <T extends LifecycleCallback> T c(String str, Class<T> cls) {
        return cls.cast(this.f3807j0.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.i
    public final /* synthetic */ Activity d() {
        return n();
    }

    @Override // androidx.fragment.app.Fragment
    public final void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f3807j0.values()) {
            lifecycleCallback.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void i0(int i10, int i11, Intent intent) {
        super.i0(i10, i11, intent);
        for (LifecycleCallback lifecycleCallback : this.f3807j0.values()) {
            lifecycleCallback.onActivityResult(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void n0(Bundle bundle) {
        super.n0(bundle);
        this.f3808k0 = 1;
        this.f3809l0 = bundle;
        for (Map.Entry entry : this.f3807j0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void s0() {
        super.s0();
        this.f3808k0 = 5;
        for (LifecycleCallback lifecycleCallback : this.f3807j0.values()) {
            lifecycleCallback.onDestroy();
        }
    }
}
