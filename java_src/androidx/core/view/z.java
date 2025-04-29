package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<View> f1949a;

    /* renamed from: b  reason: collision with root package name */
    Runnable f1950b = null;

    /* renamed from: c  reason: collision with root package name */
    Runnable f1951c = null;

    /* renamed from: d  reason: collision with root package name */
    int f1952d = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a0 f1953a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1954b;

        a(a0 a0Var, View view) {
            this.f1953a = a0Var;
            this.f1954b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1953a.a(this.f1954b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1953a.b(this.f1954b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f1953a.c(this.f1954b);
        }
    }

    /* loaded from: classes.dex */
    static class b {
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(View view) {
        this.f1949a = new WeakReference<>(view);
    }

    private void i(View view, a0 a0Var) {
        if (a0Var != null) {
            view.animate().setListener(new a(a0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public z b(float f10) {
        View view = this.f1949a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void c() {
        View view = this.f1949a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = this.f1949a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public z f(long j10) {
        View view = this.f1949a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public z g(Interpolator interpolator) {
        View view = this.f1949a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public z h(a0 a0Var) {
        View view = this.f1949a.get();
        if (view != null) {
            i(view, a0Var);
        }
        return this;
    }

    public z j(long j10) {
        View view = this.f1949a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public z k(final c0 c0Var) {
        final View view = this.f1949a.get();
        if (view != null) {
            b.a(view.animate(), c0Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.y
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    c0.this.a(view);
                }
            } : null);
        }
        return this;
    }

    public void l() {
        View view = this.f1949a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public z m(float f10) {
        View view = this.f1949a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
