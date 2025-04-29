package x7;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.k;
import androidx.core.app.n;
import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f20259a;

    /* renamed from: b  reason: collision with root package name */
    private final String f20260b;

    /* renamed from: c  reason: collision with root package name */
    private final int f20261c;

    /* renamed from: d  reason: collision with root package name */
    private f f20262d;

    /* renamed from: e  reason: collision with root package name */
    private k.d f20263e;

    public a(Context context, String channelId, int i10) {
        l.e(context, "context");
        l.e(channelId, "channelId");
        this.f20259a = context;
        this.f20260b = channelId;
        this.f20261c = i10;
        this.f20262d = new f(null, null, null, null, null, null, false, 127, null);
        k.d n10 = new k.d(context, channelId).n(1);
        l.d(n10, "setPriority(...)");
        this.f20263e = n10;
        e(this.f20262d, false);
    }

    private final PendingIntent b() {
        Intent intent;
        Intent launchIntentForPackage = this.f20259a.getPackageManager().getLaunchIntentForPackage(this.f20259a.getPackageName());
        Intent flags = (launchIntentForPackage == null || (intent = launchIntentForPackage.setPackage(null)) == null) ? null : intent.setFlags(270532608);
        if (flags != null) {
            return PendingIntent.getActivity(this.f20259a, 0, flags, 0);
        }
        return null;
    }

    private final int c(String str) {
        return this.f20259a.getResources().getIdentifier(str, "drawable", this.f20259a.getPackageName());
    }

    private final void d(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            n c10 = n.c(this.f20259a);
            l.d(c10, "from(...)");
            NotificationChannel notificationChannel = new NotificationChannel(this.f20260b, str, 0);
            notificationChannel.setLockscreenVisibility(0);
            c10.b(notificationChannel);
        }
    }

    private final void e(f fVar, boolean z10) {
        boolean z11;
        k.d g10;
        k.d dVar;
        PendingIntent pendingIntent;
        int c10 = c(fVar.d());
        if (c10 == 0) {
            c10 = c("navigation_empty_icon");
        }
        k.d q10 = this.f20263e.k(fVar.g()).o(c10).j(fVar.f()).q(fVar.c());
        l.d(q10, "setSubText(...)");
        this.f20263e = q10;
        if (fVar.b() != null) {
            g10 = this.f20263e.g(fVar.b().intValue());
            z11 = true;
        } else {
            z11 = false;
            g10 = this.f20263e.g(0);
        }
        k.d h10 = g10.h(z11);
        l.b(h10);
        this.f20263e = h10;
        if (fVar.e()) {
            dVar = this.f20263e;
            pendingIntent = b();
        } else {
            dVar = this.f20263e;
            pendingIntent = null;
        }
        k.d i10 = dVar.i(pendingIntent);
        l.b(i10);
        this.f20263e = i10;
        if (z10) {
            n c11 = n.c(this.f20259a);
            l.d(c11, "from(...)");
            c11.e(this.f20261c, this.f20263e.b());
        }
    }

    public final Notification a() {
        d(this.f20262d.a());
        Notification b10 = this.f20263e.b();
        l.d(b10, "build(...)");
        return b10;
    }

    public final void f(f options, boolean z10) {
        l.e(options, "options");
        if (!l.a(options.a(), this.f20262d.a())) {
            d(options.a());
        }
        e(options, z10);
        this.f20262d = options;
    }
}
