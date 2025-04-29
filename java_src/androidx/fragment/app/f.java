package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.os.e;
import androidx.fragment.app.x;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f2265a;

        a(Fragment fragment) {
            this.f2265a = fragment;
        }

        @Override // androidx.core.os.e.b
        public void a() {
            if (this.f2265a.r() != null) {
                View r10 = this.f2265a.r();
                this.f2265a.v1(null);
                r10.clearAnimation();
            }
            this.f2265a.w1(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f2266a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f2267b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ x.g f2268c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.e f2269d;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f2267b.r() != null) {
                    b.this.f2267b.v1(null);
                    b bVar = b.this;
                    bVar.f2268c.a(bVar.f2267b, bVar.f2269d);
                }
            }
        }

        b(ViewGroup viewGroup, Fragment fragment, x.g gVar, androidx.core.os.e eVar) {
            this.f2266a = viewGroup;
            this.f2267b = fragment;
            this.f2268c = gVar;
            this.f2269d = eVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f2266a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f2271a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f2272b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f2273c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ x.g f2274d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.e f2275e;

        c(ViewGroup viewGroup, View view, Fragment fragment, x.g gVar, androidx.core.os.e eVar) {
            this.f2271a = viewGroup;
            this.f2272b = view;
            this.f2273c = fragment;
            this.f2274d = gVar;
            this.f2275e = eVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2271a.endViewTransition(this.f2272b);
            Animator s10 = this.f2273c.s();
            this.f2273c.w1(null);
            if (s10 == null || this.f2271a.indexOfChild(this.f2272b) >= 0) {
                return;
            }
            this.f2274d.a(this.f2273c, this.f2275e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f2276a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f2277b;

        d(Animator animator) {
            this.f2276a = null;
            this.f2277b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        d(Animation animation) {
            this.f2276a = animation;
            this.f2277b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e extends AnimationSet implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        private final ViewGroup f2278j;

        /* renamed from: k  reason: collision with root package name */
        private final View f2279k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f2280l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f2281m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f2282n;

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f2282n = true;
            this.f2278j = viewGroup;
            this.f2279k = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation) {
            this.f2282n = true;
            if (this.f2280l) {
                return !this.f2281m;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f2280l = true;
                androidx.core.view.r.a(this.f2278j, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f2282n = true;
            if (this.f2280l) {
                return !this.f2281m;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f2280l = true;
                androidx.core.view.r.a(this.f2278j, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2280l || !this.f2282n) {
                this.f2278j.endViewTransition(this.f2279k);
                this.f2281m = true;
                return;
            }
            this.f2282n = false;
            this.f2278j.post(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Fragment fragment, d dVar, x.g gVar) {
        View view = fragment.Q;
        ViewGroup viewGroup = fragment.P;
        viewGroup.startViewTransition(view);
        androidx.core.os.e eVar = new androidx.core.os.e();
        eVar.c(new a(fragment));
        gVar.b(fragment, eVar);
        if (dVar.f2276a != null) {
            e eVar2 = new e(dVar.f2276a, viewGroup, view);
            fragment.v1(fragment.Q);
            eVar2.setAnimationListener(new b(viewGroup, fragment, gVar, eVar));
            fragment.Q.startAnimation(eVar2);
            return;
        }
        Animator animator = dVar.f2277b;
        fragment.w1(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, eVar));
        animator.setTarget(fragment.Q);
        animator.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d b(Context context, Fragment fragment, boolean z10) {
        int E = fragment.E();
        int D = fragment.D();
        boolean z11 = false;
        fragment.A1(0);
        ViewGroup viewGroup = fragment.P;
        if (viewGroup != null) {
            int i10 = a0.b.visible_removing_fragment_view_tag;
            if (viewGroup.getTag(i10) != null) {
                fragment.P.setTag(i10, null);
            }
        }
        ViewGroup viewGroup2 = fragment.P;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation o02 = fragment.o0(E, z10, D);
            if (o02 != null) {
                return new d(o02);
            }
            Animator p02 = fragment.p0(E, z10, D);
            if (p02 != null) {
                return new d(p02);
            }
            if (D == 0 && E != 0) {
                D = c(E, z10);
            }
            if (D != 0) {
                boolean equals = "anim".equals(context.getResources().getResourceTypeName(D));
                if (equals) {
                    try {
                        Animation loadAnimation = AnimationUtils.loadAnimation(context, D);
                        if (loadAnimation != null) {
                            return new d(loadAnimation);
                        }
                        z11 = true;
                    } catch (Resources.NotFoundException e10) {
                        throw e10;
                    } catch (RuntimeException unused) {
                    }
                }
                if (!z11) {
                    try {
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, D);
                        if (loadAnimator != null) {
                            return new d(loadAnimator);
                        }
                    } catch (RuntimeException e11) {
                        if (equals) {
                            throw e11;
                        }
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, D);
                        if (loadAnimation2 != null) {
                            return new d(loadAnimation2);
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    private static int c(int i10, boolean z10) {
        if (i10 == 4097) {
            return z10 ? a0.a.fragment_open_enter : a0.a.fragment_open_exit;
        } else if (i10 == 4099) {
            return z10 ? a0.a.fragment_fade_enter : a0.a.fragment_fade_exit;
        } else if (i10 != 8194) {
            return -1;
        } else {
            return z10 ? a0.a.fragment_close_enter : a0.a.fragment_close_exit;
        }
    }
}
