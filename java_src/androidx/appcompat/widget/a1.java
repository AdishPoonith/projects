package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class a1 extends Resources {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f1119b = false;

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Context> f1120a;

    public a1(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1120a = new WeakReference<>(context);
    }

    public static boolean a() {
        return f1119b;
    }

    public static boolean b() {
        a();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Drawable c(int i10) {
        return super.getDrawable(i10);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) {
        Context context = this.f1120a.get();
        return context != null ? l0.h().t(context, this, i10) : super.getDrawable(i10);
    }
}
