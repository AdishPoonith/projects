package q3;

import android.view.Surface;
/* loaded from: classes.dex */
public class g extends j2.m {

    /* renamed from: l  reason: collision with root package name */
    public final int f16059l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f16060m;

    public g(Throwable th, j2.n nVar, Surface surface) {
        super(th, nVar);
        this.f16059l = System.identityHashCode(surface);
        this.f16060m = surface == null || surface.isValid();
    }
}
