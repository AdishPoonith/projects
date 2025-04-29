package v4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import u4.e;
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f19425a = "e0";

    /* renamed from: b  reason: collision with root package name */
    private static Context f19426b;

    /* renamed from: c  reason: collision with root package name */
    private static g0 f19427c;

    public static g0 a(Context context, e.a aVar) {
        g0 f0Var;
        c4.s.j(context);
        String str = f19425a;
        Log.d(str, "preferredRenderer: ".concat(String.valueOf(aVar)));
        g0 g0Var = f19427c;
        if (g0Var == null) {
            int f10 = b4.i.f(context, 13400000);
            if (f10 == 0) {
                Log.i(str, "Making Creator dynamically");
                try {
                    IBinder iBinder = (IBinder) d(((ClassLoader) c4.s.j(c(context, aVar).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
                    if (iBinder == null) {
                        f0Var = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                        f0Var = queryLocalInterface instanceof g0 ? (g0) queryLocalInterface : new f0(iBinder);
                    }
                    f19427c = f0Var;
                    try {
                        Context c10 = c(context, aVar);
                        c10.getClass();
                        f0Var.D1(k4.d.H2(c10.getResources()), b4.i.f2912f);
                        return f19427c;
                    } catch (RemoteException e10) {
                        throw new w4.t(e10);
                    }
                } catch (ClassNotFoundException unused) {
                    throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl");
                }
            }
            throw new b4.g(f10);
        }
        return g0Var;
    }

    private static Context b(Exception exc, Context context) {
        Log.e(f19425a, "Failed to load maps module, use pre-Chimera", exc);
        return b4.i.c(context);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:3|(6:5|(2:7|(1:9))(1:25)|10|11|12|13)|26|10|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
        if (r3.equals("com.google.android.gms.maps_dynamite") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
        android.util.Log.d(v4.e0.f19425a, "Attempting to load maps_dynamite again.");
        r2 = com.google.android.gms.dynamite.DynamiteModule.c(r2, com.google.android.gms.dynamite.DynamiteModule.f3972b, "com.google.android.gms.maps_dynamite").b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
        r2 = b(r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
        r2 = b(r1, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.Context c(android.content.Context r2, u4.e.a r3) {
        /*
            android.content.Context r0 = v4.e0.f19426b
            if (r0 != 0) goto L4d
            r2.getApplicationContext()
            java.lang.String r0 = "com.google.android.gms.maps_dynamite"
            if (r3 == 0) goto L1b
            int r3 = r3.ordinal()
            if (r3 == 0) goto L18
            r1 = 1
            if (r3 == r1) goto L15
            goto L1b
        L15:
            java.lang.String r3 = "com.google.android.gms.maps_core_dynamite"
            goto L1c
        L18:
            java.lang.String r3 = "com.google.android.gms.maps_legacy_dynamite"
            goto L1c
        L1b:
            r3 = r0
        L1c:
            com.google.android.gms.dynamite.DynamiteModule$b r1 = com.google.android.gms.dynamite.DynamiteModule.f3972b     // Catch: java.lang.Exception -> L27
            com.google.android.gms.dynamite.DynamiteModule r1 = com.google.android.gms.dynamite.DynamiteModule.c(r2, r1, r3)     // Catch: java.lang.Exception -> L27
            android.content.Context r2 = r1.b()     // Catch: java.lang.Exception -> L27
            goto L4a
        L27:
            r1 = move-exception
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L46
            java.lang.String r3 = v4.e0.f19425a     // Catch: java.lang.Exception -> L40
            java.lang.String r1 = "Attempting to load maps_dynamite again."
            android.util.Log.d(r3, r1)     // Catch: java.lang.Exception -> L40
            com.google.android.gms.dynamite.DynamiteModule$b r3 = com.google.android.gms.dynamite.DynamiteModule.f3972b     // Catch: java.lang.Exception -> L40
            com.google.android.gms.dynamite.DynamiteModule r3 = com.google.android.gms.dynamite.DynamiteModule.c(r2, r3, r0)     // Catch: java.lang.Exception -> L40
            android.content.Context r2 = r3.b()     // Catch: java.lang.Exception -> L40
            goto L4a
        L40:
            r3 = move-exception
            android.content.Context r2 = b(r3, r2)
            goto L4a
        L46:
            android.content.Context r2 = b(r1, r2)
        L4a:
            v4.e0.f19426b = r2
            return r2
        L4d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.e0.c(android.content.Context, u4.e$a):android.content.Context");
    }

    private static Object d(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException unused) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(cls.getName()));
        } catch (InstantiationException unused2) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls.getName()));
        }
    }
}
