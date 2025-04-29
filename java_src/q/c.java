package q;

import a.a;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final a.b f15862a;

    /* renamed from: b  reason: collision with root package name */
    private final ComponentName f15863b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f15864c;

    /* loaded from: classes.dex */
    class a extends e {

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Context f15865k;

        a(Context context) {
            this.f15865k = context;
        }

        @Override // q.e
        public final void a(ComponentName componentName, c cVar) {
            cVar.f(0L);
            this.f15865k.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends a.AbstractBinderC0000a {

        /* renamed from: a  reason: collision with root package name */
        private Handler f15866a = new Handler(Looper.getMainLooper());

        b(q.b bVar) {
        }

        @Override // a.a
        public void F0(String str, Bundle bundle) {
        }

        @Override // a.a
        public void V1(String str, Bundle bundle) {
        }

        @Override // a.a
        public void c2(Bundle bundle) {
        }

        @Override // a.a
        public void e1(int i10, Bundle bundle) {
        }

        @Override // a.a
        public void m2(int i10, Uri uri, boolean z10, Bundle bundle) {
        }

        @Override // a.a
        public Bundle y1(String str, Bundle bundle) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(a.b bVar, ComponentName componentName, Context context) {
        this.f15862a = bVar;
        this.f15863b = componentName;
        this.f15864c = context;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    public static boolean b(Context context, String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return a(applicationContext, str, new a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    private a.AbstractBinderC0000a c(q.b bVar) {
        return new b(bVar);
    }

    private f e(q.b bVar, PendingIntent pendingIntent) {
        boolean H1;
        a.AbstractBinderC0000a c10 = c(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                H1 = this.f15862a.z2(c10, bundle);
            } else {
                H1 = this.f15862a.H1(c10);
            }
            if (H1) {
                return new f(this.f15862a, c10, this.f15863b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public f d(q.b bVar) {
        return e(bVar, null);
    }

    public boolean f(long j10) {
        try {
            return this.f15862a.e2(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
