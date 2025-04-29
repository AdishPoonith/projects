package s1;

import android.content.Context;
import android.net.wifi.WifiManager;
/* loaded from: classes.dex */
final class f4 {

    /* renamed from: a  reason: collision with root package name */
    private final WifiManager f17217a;

    /* renamed from: b  reason: collision with root package name */
    private WifiManager.WifiLock f17218b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f17219c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f17220d;

    public f4(Context context) {
        this.f17217a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    private void c() {
        WifiManager.WifiLock wifiLock = this.f17218b;
        if (wifiLock == null) {
            return;
        }
        if (this.f17219c && this.f17220d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f17218b == null) {
            WifiManager wifiManager = this.f17217a;
            if (wifiManager == null) {
                p3.r.i("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
            this.f17218b = createWifiLock;
            createWifiLock.setReferenceCounted(false);
        }
        this.f17219c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f17220d = z10;
        c();
    }
}
