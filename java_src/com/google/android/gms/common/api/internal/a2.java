package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class a2 extends Fragment implements i {

    /* renamed from: m  reason: collision with root package name */
    private static final WeakHashMap f3786m = new WeakHashMap();

    /* renamed from: j  reason: collision with root package name */
    private final Map f3787j = Collections.synchronizedMap(new s.a());

    /* renamed from: k  reason: collision with root package name */
    private int f3788k = 0;

    /* renamed from: l  reason: collision with root package name */
    private Bundle f3789l;

    public static a2 f(Activity activity) {
        a2 a2Var;
        WeakHashMap weakHashMap = f3786m;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference == null || (a2Var = (a2) weakReference.get()) == null) {
            try {
                a2 a2Var2 = (a2) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (a2Var2 == null || a2Var2.isRemoving()) {
                    a2Var2 = new a2();
                    activity.getFragmentManager().beginTransaction().add(a2Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(a2Var2));
                return a2Var2;
            } catch (ClassCastException e10) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
            }
        }
        return a2Var;
    }

    @Override // com.google.android.gms.common.api.internal.i
    public final void b(String str, LifecycleCallback lifecycleCallback) {
        if (this.f3787j.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f3787j.put(str, lifecycleCallback);
        if (this.f3788k > 0) {
            new p4.e(Looper.getMainLooper()).post(new z1(this, lifecycleCallback, str));
        }
    }

    @Override // com.google.android.gms.common.api.internal.i
    public final <T extends LifecycleCallback> T c(String str, Class<T> cls) {
        return cls.cast(this.f3787j.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.i
    public final Activity d() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f3787j.values()) {
            lifecycleCallback.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        for (LifecycleCallback lifecycleCallback : this.f3787j.values()) {
            lifecycleCallback.onActivityResult(i10, i11, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3788k = 1;
        this.f3789l = bundle;
        for (Map.Entry entry : this.f3787j.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f3788k = 5;
        for (LifecycleCallback lifecycleCallback : this.f3787j.values()) {
            lifecycleCallback.onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f3788k = 3;
        for (LifecycleCallback lifecycleCallback : this.f3787j.values()) {
            lifecycleCallback.onResume();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f3787j.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f3788k = 2;
        for (LifecycleCallback lifecycleCallback : this.f3787j.values()) {
            lifecycleCallback.onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f3788k = 4;
        for (LifecycleCallback lifecycleCallback : this.f3787j.values()) {
            lifecycleCallback.onStop();
        }
    }
}
