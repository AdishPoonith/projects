package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
class u0 extends m0 {

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Context> f1342b;

    public u0(Context context, Resources resources) {
        super(resources);
        this.f1342b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.m0, android.content.res.Resources
    public Drawable getDrawable(int i10) {
        Drawable drawable = super.getDrawable(i10);
        Context context = this.f1342b.get();
        if (drawable != null && context != null) {
            l0.h().x(context, i10, drawable);
        }
        return drawable;
    }
}
