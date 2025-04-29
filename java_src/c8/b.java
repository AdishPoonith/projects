package c8;

import android.app.Activity;
import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private Activity f3454a;

    private final boolean a() {
        Activity activity = this.f3454a;
        l.b(activity);
        return (activity.getWindow().getAttributes().flags & 128) != 0;
    }

    public final defpackage.b b() {
        if (this.f3454a != null) {
            return new defpackage.b(Boolean.valueOf(a()));
        }
        throw new a();
    }

    public final void c(Activity activity) {
        this.f3454a = activity;
    }

    public final void d(d message) {
        l.e(message, "message");
        Activity activity = this.f3454a;
        if (activity == null) {
            throw new a();
        }
        l.b(activity);
        boolean a10 = a();
        Boolean a11 = message.a();
        l.b(a11);
        if (a11.booleanValue()) {
            if (a10) {
                return;
            }
            activity.getWindow().addFlags(128);
        } else if (a10) {
            activity.getWindow().clearFlags(128);
        }
    }
}
