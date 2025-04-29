package j4;

import android.content.Context;
/* loaded from: classes.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    private static final c f12110b = new c();

    /* renamed from: a  reason: collision with root package name */
    private b f12111a = null;

    public static b a(Context context) {
        return f12110b.b(context);
    }

    public final synchronized b b(Context context) {
        if (this.f12111a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f12111a = new b(context);
        }
        return this.f12111a;
    }
}
