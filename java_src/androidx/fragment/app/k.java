package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
/* loaded from: classes.dex */
public abstract class k<E> extends g {

    /* renamed from: j  reason: collision with root package name */
    private final Activity f2288j;

    /* renamed from: k  reason: collision with root package name */
    private final Context f2289k;

    /* renamed from: l  reason: collision with root package name */
    private final Handler f2290l;

    /* renamed from: m  reason: collision with root package name */
    private final int f2291m;

    /* renamed from: n  reason: collision with root package name */
    final n f2292n;

    k(Activity activity, Context context, Handler handler, int i10) {
        this.f2292n = new o();
        this.f2288j = activity;
        this.f2289k = (Context) androidx.core.util.d.d(context, "context == null");
        this.f2290l = (Handler) androidx.core.util.d.d(handler, "handler == null");
        this.f2291m = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(e eVar) {
        this(eVar, eVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.g
    public View d(int i10) {
        return null;
    }

    @Override // androidx.fragment.app.g
    public boolean e() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Activity f() {
        return this.f2288j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context g() {
        return this.f2289k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Handler h() {
        return this.f2290l;
    }

    public abstract E k();

    public LayoutInflater l() {
        return LayoutInflater.from(this.f2289k);
    }

    public boolean n(Fragment fragment) {
        return true;
    }

    public void o(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        androidx.core.content.a.i(this.f2289k, intent, bundle);
    }

    public void q() {
    }
}
