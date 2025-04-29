package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;
/* loaded from: classes.dex */
public final class r implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: j  reason: collision with root package name */
    private final View f1922j;

    /* renamed from: k  reason: collision with root package name */
    private ViewTreeObserver f1923k;

    /* renamed from: l  reason: collision with root package name */
    private final Runnable f1924l;

    private r(View view, Runnable runnable) {
        this.f1922j = view;
        this.f1923k = view.getViewTreeObserver();
        this.f1924l = runnable;
    }

    public static r a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        r rVar = new r(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(rVar);
        view.addOnAttachStateChangeListener(rVar);
        return rVar;
    }

    public void b() {
        (this.f1923k.isAlive() ? this.f1923k : this.f1922j.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f1922j.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f1924l.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f1923k = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
