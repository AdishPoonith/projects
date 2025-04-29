package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: j  reason: collision with root package name */
    private static int f657j = -100;

    /* renamed from: k  reason: collision with root package name */
    private static final s.b<WeakReference<d>> f658k = new s.b<>();

    /* renamed from: l  reason: collision with root package name */
    private static final Object f659l = new Object();

    public static d e(Activity activity, g.a aVar) {
        return new e(activity, aVar);
    }

    public static d f(Dialog dialog, g.a aVar) {
        return new e(dialog, aVar);
    }

    public static int h() {
        return f657j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void n(d dVar) {
        synchronized (f659l) {
            x(dVar);
            f658k.add(new WeakReference<>(dVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void o(d dVar) {
        synchronized (f659l) {
            x(dVar);
        }
    }

    private static void x(d dVar) {
        synchronized (f659l) {
            Iterator<WeakReference<d>> it = f658k.iterator();
            while (it.hasNext()) {
                d dVar2 = it.next().get();
                if (dVar2 == dVar || dVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void A(View view);

    public abstract void B(View view, ViewGroup.LayoutParams layoutParams);

    public void C(int i10) {
    }

    public abstract void D(CharSequence charSequence);

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public void d(Context context) {
    }

    public abstract <T extends View> T g(int i10);

    public int i() {
        return -100;
    }

    public abstract MenuInflater j();

    public abstract a k();

    public abstract void l();

    public abstract void m();

    public abstract void p(Configuration configuration);

    public abstract void q(Bundle bundle);

    public abstract void r();

    public abstract void s(Bundle bundle);

    public abstract void t();

    public abstract void u(Bundle bundle);

    public abstract void v();

    public abstract void w();

    public abstract boolean y(int i10);

    public abstract void z(int i10);
}
