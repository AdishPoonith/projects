package io.flutter.embedding.android;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
@Deprecated
/* loaded from: classes.dex */
public final class b implements x {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f10137a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageView.ScaleType f10138b;

    /* renamed from: c  reason: collision with root package name */
    private final long f10139c;

    /* renamed from: d  reason: collision with root package name */
    private C0163b f10140d;

    /* loaded from: classes.dex */
    class a implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f10141a;

        a(Runnable runnable) {
            this.f10141a = runnable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f10141a.run();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f10141a.run();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: io.flutter.embedding.android.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0163b extends ImageView {
        public C0163b(Context context) {
            this(context, null, 0);
        }

        public C0163b(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
        }

        public void a(Drawable drawable, ImageView.ScaleType scaleType) {
            setScaleType(scaleType);
            setImageDrawable(drawable);
        }

        public void setSplashDrawable(Drawable drawable) {
            a(drawable, ImageView.ScaleType.FIT_XY);
        }
    }

    public b(Drawable drawable) {
        this(drawable, ImageView.ScaleType.FIT_XY, 500L);
    }

    public b(Drawable drawable, ImageView.ScaleType scaleType, long j10) {
        this.f10137a = drawable;
        this.f10138b = scaleType;
        this.f10139c = j10;
    }

    @Override // io.flutter.embedding.android.x
    public void a(Runnable runnable) {
        C0163b c0163b = this.f10140d;
        if (c0163b == null) {
            runnable.run();
        } else {
            c0163b.animate().alpha(0.0f).setDuration(this.f10139c).setListener(new a(runnable));
        }
    }

    @Override // io.flutter.embedding.android.x
    public /* synthetic */ boolean b() {
        return w.a(this);
    }

    @Override // io.flutter.embedding.android.x
    public View c(Context context, Bundle bundle) {
        C0163b c0163b = new C0163b(context);
        this.f10140d = c0163b;
        c0163b.a(this.f10137a, this.f10138b);
        return this.f10140d;
    }

    @Override // io.flutter.embedding.android.x
    public /* synthetic */ Bundle d() {
        return w.b(this);
    }
}
