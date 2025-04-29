package s1;

import android.content.Context;
import android.os.PowerManager;
/* loaded from: classes.dex */
final class e4 {

    /* renamed from: a  reason: collision with root package name */
    private final PowerManager f17197a;

    /* renamed from: b  reason: collision with root package name */
    private PowerManager.WakeLock f17198b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f17199c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f17200d;

    public e4(Context context) {
        this.f17197a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    private void c() {
        PowerManager.WakeLock wakeLock = this.f17198b;
        if (wakeLock == null) {
            return;
        }
        if (this.f17199c && this.f17200d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f17198b == null) {
            PowerManager powerManager = this.f17197a;
            if (powerManager == null) {
                p3.r.i("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            this.f17198b = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        this.f17199c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f17200d = z10;
        c();
    }
}
