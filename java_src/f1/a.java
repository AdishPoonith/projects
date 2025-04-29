package f1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final C0137a f8366f = new C0137a(null);

    /* renamed from: g  reason: collision with root package name */
    private static final String f8367g = a.class.getCanonicalName();

    /* renamed from: h  reason: collision with root package name */
    public static a f8368h;

    /* renamed from: a  reason: collision with root package name */
    private String f8369a;

    /* renamed from: b  reason: collision with root package name */
    private long f8370b;

    /* renamed from: c  reason: collision with root package name */
    private String f8371c;

    /* renamed from: d  reason: collision with root package name */
    private String f8372d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f8373e;

    /* renamed from: f1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0137a {
        private C0137a() {
        }

        public /* synthetic */ C0137a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private final a a(a aVar) {
            aVar.f8370b = System.currentTimeMillis();
            a.f8368h = aVar;
            return aVar;
        }

        private final a b(Context context) {
            a c10 = c(context);
            if (c10 == null) {
                a d10 = d(context);
                return d10 == null ? new a() : d10;
            }
            return c10;
        }

        private final a c(Context context) {
            Object O;
            try {
                if (g(context)) {
                    l0 l0Var = l0.f8470a;
                    boolean z10 = false;
                    Method H = l0.H("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class);
                    if (H == null || (O = l0.O(null, H, context)) == null) {
                        return null;
                    }
                    Method G = l0.G(O.getClass(), "getId", new Class[0]);
                    Method G2 = l0.G(O.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                    if (G != null && G2 != null) {
                        a aVar = new a();
                        aVar.f8369a = (String) l0.O(O, G, new Object[0]);
                        Boolean bool = (Boolean) l0.O(O, G2, new Object[0]);
                        if (bool != null) {
                            z10 = bool.booleanValue();
                        }
                        aVar.f8373e = z10;
                        return aVar;
                    }
                    return null;
                }
                return null;
            } catch (Exception e10) {
                l0 l0Var2 = l0.f8470a;
                l0.d0("android_id", e10);
                return null;
            }
        }

        private final a d(Context context) {
            if (g(context)) {
                c cVar = new c();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    try {
                        if (context.bindService(intent, cVar, 1)) {
                            b bVar = new b(cVar.a());
                            a aVar = new a();
                            aVar.f8369a = bVar.p();
                            aVar.f8373e = bVar.x();
                            return aVar;
                        }
                    } catch (Exception e10) {
                        l0 l0Var = l0.f8470a;
                        l0.d0("android_id", e10);
                    } finally {
                        context.unbindService(cVar);
                    }
                } catch (SecurityException unused) {
                }
                return null;
            }
            return null;
        }

        private final String f(Context context) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return packageManager.getInstallerPackageName(context.getPackageName());
        }

        private final boolean g(Context context) {
            l0 l0Var = l0.f8470a;
            Method H = l0.H("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (H == null) {
                return false;
            }
            Object O = l0.O(null, H, context);
            return (O instanceof Integer) && kotlin.jvm.internal.l.a(O, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0080 A[Catch: all -> 0x00f1, Exception -> 0x00f3, TryCatch #4 {Exception -> 0x00f3, all -> 0x00f1, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:10:0x0033, B:12:0x004e, B:15:0x005f, B:21:0x007a, B:23:0x0080, B:25:0x0085, B:27:0x008a, B:17:0x0067, B:49:0x00e9, B:50:0x00f0), top: B:69:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0085 A[Catch: all -> 0x00f1, Exception -> 0x00f3, TryCatch #4 {Exception -> 0x00f3, all -> 0x00f1, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:10:0x0033, B:12:0x004e, B:15:0x005f, B:21:0x007a, B:23:0x0080, B:25:0x0085, B:27:0x008a, B:17:0x0067, B:49:0x00e9, B:50:0x00f0), top: B:69:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008a A[Catch: all -> 0x00f1, Exception -> 0x00f3, TRY_LEAVE, TryCatch #4 {Exception -> 0x00f3, all -> 0x00f1, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:10:0x0033, B:12:0x004e, B:15:0x005f, B:21:0x007a, B:23:0x0080, B:25:0x0085, B:27:0x008a, B:17:0x0067, B:49:0x00e9, B:50:0x00f0), top: B:69:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0110  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final f1.a e(android.content.Context r13) {
            /*
                Method dump skipped, instructions count: 276
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: f1.a.C0137a.e(android.content.Context):f1.a");
        }

        public final boolean h(Context context) {
            kotlin.jvm.internal.l.e(context, "context");
            a e10 = e(context);
            return e10 != null && e10.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements IInterface {

        /* renamed from: b  reason: collision with root package name */
        public static final C0138a f8374b = new C0138a(null);

        /* renamed from: a  reason: collision with root package name */
        private final IBinder f8375a;

        /* renamed from: f1.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0138a {
            private C0138a() {
            }

            public /* synthetic */ C0138a(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public b(IBinder binder) {
            kotlin.jvm.internal.l.e(binder, "binder");
            this.f8375a = binder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f8375a;
        }

        public final String p() {
            Parcel obtain = Parcel.obtain();
            kotlin.jvm.internal.l.d(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            kotlin.jvm.internal.l.d(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f8375a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public final boolean x() {
            Parcel obtain = Parcel.obtain();
            kotlin.jvm.internal.l.d(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            kotlin.jvm.internal.l.d(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.f8375a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c implements ServiceConnection {

        /* renamed from: j  reason: collision with root package name */
        private final AtomicBoolean f8376j = new AtomicBoolean(false);

        /* renamed from: k  reason: collision with root package name */
        private final BlockingQueue<IBinder> f8377k = new LinkedBlockingDeque();

        public final IBinder a() {
            if (!this.f8376j.compareAndSet(true, true)) {
                IBinder take = this.f8377k.take();
                kotlin.jvm.internal.l.d(take, "queue.take()");
                return take;
            }
            throw new IllegalStateException("Binder already consumed".toString());
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f8377k.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public final String h() {
        p0.f0 f0Var = p0.f0.f14852a;
        if (p0.f0.F() && p0.f0.k()) {
            return this.f8369a;
        }
        return null;
    }

    public final String i() {
        return this.f8372d;
    }

    public final String j() {
        return this.f8371c;
    }

    public final boolean k() {
        return this.f8373e;
    }
}
