package q;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final Object f15881a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final a.b f15882b;

    /* renamed from: c  reason: collision with root package name */
    private final a.a f15883c;

    /* renamed from: d  reason: collision with root package name */
    private final ComponentName f15884d;

    /* renamed from: e  reason: collision with root package name */
    private final PendingIntent f15885e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(a.b bVar, a.a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.f15882b = bVar;
        this.f15883c = aVar;
        this.f15884d = componentName;
        this.f15885e = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f15885e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IBinder c() {
        return this.f15883c.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ComponentName d() {
        return this.f15884d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PendingIntent e() {
        return this.f15885e;
    }

    public boolean f(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f15882b.I0(this.f15883c, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
