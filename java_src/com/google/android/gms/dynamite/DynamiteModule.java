package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import c4.q;
import c4.s;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public final class DynamiteModule {

    /* renamed from: h  reason: collision with root package name */
    private static Boolean f3978h = null;

    /* renamed from: i  reason: collision with root package name */
    private static String f3979i = null;

    /* renamed from: j  reason: collision with root package name */
    private static boolean f3980j = false;

    /* renamed from: k  reason: collision with root package name */
    private static int f3981k = -1;

    /* renamed from: l  reason: collision with root package name */
    private static Boolean f3982l;

    /* renamed from: q  reason: collision with root package name */
    private static m f3987q;

    /* renamed from: r  reason: collision with root package name */
    private static n f3988r;

    /* renamed from: a  reason: collision with root package name */
    private final Context f3989a;

    /* renamed from: m  reason: collision with root package name */
    private static final ThreadLocal f3983m = new ThreadLocal();

    /* renamed from: n  reason: collision with root package name */
    private static final ThreadLocal f3984n = new com.google.android.gms.dynamite.b();

    /* renamed from: o  reason: collision with root package name */
    private static final b.a f3985o = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final b f3972b = new d();

    /* renamed from: c  reason: collision with root package name */
    public static final b f3973c = new e();

    /* renamed from: d  reason: collision with root package name */
    public static final b f3974d = new f();

    /* renamed from: e  reason: collision with root package name */
    public static final b f3975e = new g();

    /* renamed from: f  reason: collision with root package name */
    public static final b f3976f = new h();

    /* renamed from: g  reason: collision with root package name */
    public static final b f3977g = new i();

    /* renamed from: p  reason: collision with root package name */
    public static final b f3986p = new j();

    @DynamiteApi
    /* loaded from: classes.dex */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* loaded from: classes.dex */
    public static class a extends Exception {
        /* synthetic */ a(String str, Throwable th, l4.d dVar) {
            super(str, th);
        }

        /* synthetic */ a(String str, l4.d dVar) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public interface b {

        /* loaded from: classes.dex */
        public interface a {
            int a(Context context, String str);

            int b(Context context, String str, boolean z10);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0088b {

            /* renamed from: a  reason: collision with root package name */
            public int f3990a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f3991b = 0;

            /* renamed from: c  reason: collision with root package name */
            public int f3992c = 0;
        }

        C0088b a(Context context, String str, a aVar);
    }

    private DynamiteModule(Context context) {
        s.j(context);
        this.f3989a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (q.b(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    @ResultIgnorabilityUnspecified
    public static DynamiteModule c(Context context, b bVar, String str) {
        int i10;
        k4.b J2;
        DynamiteModule dynamiteModule;
        n nVar;
        Boolean valueOf;
        k4.b M;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            ThreadLocal threadLocal = f3983m;
            k kVar = (k) threadLocal.get();
            k kVar2 = new k(null);
            threadLocal.set(kVar2);
            ThreadLocal threadLocal2 = f3984n;
            long longValue = ((Long) threadLocal2.get()).longValue();
            try {
                threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
                b.C0088b a10 = bVar.a(context, str, f3985o);
                int i11 = a10.f3990a;
                int i12 = a10.f3991b;
                Log.i("DynamiteModule", "Considering local module " + str + ":" + i11 + " and remote module " + str + ":" + i12);
                int i13 = a10.f3992c;
                if (i13 != 0) {
                    if (i13 == -1) {
                        if (a10.f3990a != 0) {
                            i13 = -1;
                        }
                    }
                    if (i13 != 1 || a10.f3991b != 0) {
                        if (i13 == -1) {
                            DynamiteModule f10 = f(applicationContext, str);
                            if (longValue == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(Long.valueOf(longValue));
                            }
                            Cursor cursor = kVar2.f3993a;
                            if (cursor != null) {
                                cursor.close();
                            }
                            threadLocal.set(kVar);
                            return f10;
                        } else if (i13 != 1) {
                            throw new a("VersionPolicy returned invalid code:" + i13, null);
                        } else {
                            try {
                                try {
                                    int i14 = a10.f3991b;
                                    try {
                                        try {
                                            try {
                                                synchronized (DynamiteModule.class) {
                                                    try {
                                                        if (i(context)) {
                                                            Boolean bool = f3978h;
                                                            if (bool != null) {
                                                                if (bool.booleanValue()) {
                                                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i14);
                                                                    synchronized (DynamiteModule.class) {
                                                                        try {
                                                                            nVar = f3988r;
                                                                        } catch (Throwable th) {
                                                                            th = th;
                                                                            while (true) {
                                                                                try {
                                                                                    break;
                                                                                } catch (Throwable th2) {
                                                                                    th = th2;
                                                                                }
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    }
                                                                    if (nVar == null) {
                                                                        throw new a("DynamiteLoaderV2 was not cached.", null);
                                                                    }
                                                                    k kVar3 = (k) threadLocal.get();
                                                                    if (kVar3 == null || kVar3.f3993a == null) {
                                                                        throw new a("No result cursor", null);
                                                                    }
                                                                    Context applicationContext2 = context.getApplicationContext();
                                                                    Cursor cursor2 = kVar3.f3993a;
                                                                    k4.d.H2(null);
                                                                    synchronized (DynamiteModule.class) {
                                                                        valueOf = Boolean.valueOf(f3981k >= 2);
                                                                    }
                                                                    if (valueOf.booleanValue()) {
                                                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                                        M = nVar.H2(k4.d.H2(applicationContext2), str, i14, k4.d.H2(cursor2));
                                                                    } else {
                                                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                                        M = nVar.M(k4.d.H2(applicationContext2), str, i14, k4.d.H2(cursor2));
                                                                    }
                                                                    Context context2 = (Context) k4.d.M(M);
                                                                    if (context2 == null) {
                                                                        throw new a("Failed to get module context", null);
                                                                    }
                                                                    dynamiteModule = new DynamiteModule(context2);
                                                                } else {
                                                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i14);
                                                                    m j10 = j(context);
                                                                    if (j10 == null) {
                                                                        throw new a("Failed to create IDynamiteLoader.", null);
                                                                    }
                                                                    int M2 = j10.M();
                                                                    if (M2 >= 3) {
                                                                        k kVar4 = (k) threadLocal.get();
                                                                        if (kVar4 == null) {
                                                                            throw new a("No cached result cursor holder", null);
                                                                        }
                                                                        J2 = j10.K2(k4.d.H2(context), str, i14, k4.d.H2(kVar4.f3993a));
                                                                    } else if (M2 == 2) {
                                                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                                        J2 = j10.L2(k4.d.H2(context), str, i14);
                                                                    } else {
                                                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                                        J2 = j10.J2(k4.d.H2(context), str, i14);
                                                                    }
                                                                    Object M3 = k4.d.M(J2);
                                                                    if (M3 == null) {
                                                                        throw new a("Failed to load remote module.", null);
                                                                    }
                                                                    dynamiteModule = new DynamiteModule((Context) M3);
                                                                }
                                                                if (longValue == 0) {
                                                                    threadLocal2.remove();
                                                                } else {
                                                                    threadLocal2.set(Long.valueOf(longValue));
                                                                }
                                                                Cursor cursor3 = kVar2.f3993a;
                                                                if (cursor3 != null) {
                                                                    cursor3.close();
                                                                }
                                                                threadLocal.set(kVar);
                                                                return dynamiteModule;
                                                            }
                                                            throw new a("Failed to determine which loading route to use.", null);
                                                        }
                                                        throw new a("Remote loading disabled", null);
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        throw th;
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                            }
                                        } catch (RemoteException e10) {
                                            e = e10;
                                            throw new a("Failed to load remote module.", e, null);
                                        } catch (a e11) {
                                            throw e11;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            h4.e.a(context, th);
                                            throw new a("Failed to load remote module.", th, null);
                                        }
                                    } catch (RemoteException e12) {
                                        e = e12;
                                        throw new a("Failed to load remote module.", e, null);
                                    } catch (a e13) {
                                        throw e13;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        h4.e.a(context, th);
                                        throw new a("Failed to load remote module.", th, null);
                                    }
                                } catch (a e14) {
                                    e = e14;
                                    String message = e.getMessage();
                                    Log.w("DynamiteModule", "Failed to load remote module: " + message);
                                    i10 = a10.f3990a;
                                    if (i10 == 0 && bVar.a(context, str, new l(i10, 0)).f3992c == -1) {
                                        return f(applicationContext, str);
                                    }
                                    throw new a("Remote load failed. No local fallback found.", e, null);
                                }
                            } catch (a e15) {
                                e = e15;
                                String message2 = e.getMessage();
                                Log.w("DynamiteModule", "Failed to load remote module: " + message2);
                                i10 = a10.f3990a;
                                if (i10 == 0) {
                                }
                                throw new a("Remote load failed. No local fallback found.", e, null);
                            }
                        }
                    }
                }
                int i15 = a10.f3990a;
                int i16 = a10.f3991b;
                throw new a("No acceptable module " + str + " found. Local version is " + i15 + " and remote version is " + i16 + ".", null);
            } finally {
                int i17 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                ThreadLocal threadLocal3 = f3984n;
                if (i17 == 0) {
                    threadLocal3.remove();
                } else {
                    threadLocal3.set(Long.valueOf(longValue));
                }
                Cursor cursor4 = kVar2.f3993a;
                if (cursor4 != null) {
                    cursor4.close();
                }
                f3983m.set(kVar);
            }
        }
        throw new a("null application Context", null);
    }

    public static int d(Context context, String str, boolean z10) {
        Field declaredField;
        Throwable th;
        RemoteException e10;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f3978h;
                Cursor cursor2 = null;
                int i10 = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e11) {
                        String obj = e11.toString();
                        Log.w("DynamiteModule", "Failed to load module via V2: " + obj);
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader != ClassLoader.getSystemClassLoader()) {
                            if (classLoader != null) {
                                try {
                                    g(classLoader);
                                } catch (a unused) {
                                }
                                bool = Boolean.TRUE;
                                f3978h = bool;
                            } else if (!i(context)) {
                                return 0;
                            } else {
                                if (!f3980j) {
                                    Boolean bool2 = Boolean.TRUE;
                                    if (!bool2.equals(null)) {
                                        try {
                                            int e12 = e(context, str, z10, true);
                                            String str2 = f3979i;
                                            if (str2 != null && !str2.isEmpty()) {
                                                ClassLoader a10 = l4.b.a();
                                                if (a10 == null) {
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        String str3 = f3979i;
                                                        s.j(str3);
                                                        a10 = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                    } else {
                                                        String str4 = f3979i;
                                                        s.j(str4);
                                                        a10 = new com.google.android.gms.dynamite.a(str4, ClassLoader.getSystemClassLoader());
                                                    }
                                                }
                                                g(a10);
                                                declaredField.set(null, a10);
                                                f3978h = bool2;
                                                return e12;
                                            }
                                            return e12;
                                        } catch (a unused2) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        }
                                    }
                                }
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                            }
                        }
                        bool = Boolean.FALSE;
                        f3978h = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return e(context, str, z10, false);
                    } catch (a e13) {
                        String message = e13.getMessage();
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + message);
                        return 0;
                    }
                }
                m j10 = j(context);
                if (j10 != null) {
                    try {
                        try {
                            int M = j10.M();
                            if (M >= 3) {
                                k kVar = (k) f3983m.get();
                                if (kVar == null || (cursor = kVar.f3993a) == null) {
                                    Cursor cursor3 = (Cursor) k4.d.M(j10.M2(k4.d.H2(context), str, z10, ((Long) f3984n.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i11 = cursor3.getInt(0);
                                                if (i11 <= 0 || !h(cursor3)) {
                                                    cursor2 = cursor3;
                                                }
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                i10 = i11;
                                            }
                                        } catch (RemoteException e14) {
                                            e10 = e14;
                                            cursor2 = cursor3;
                                            String message2 = e10.getMessage();
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + message2);
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            return i10;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                } else {
                                    i10 = cursor.getInt(0);
                                }
                            } else if (M == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i10 = j10.I2(k4.d.H2(context), str, z10);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i10 = j10.H2(k4.d.H2(context), str, z10);
                            }
                        } catch (RemoteException e15) {
                            e10 = e15;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                return i10;
            }
        } catch (Throwable th4) {
            h4.e.a(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
        r10.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int e(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule f(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    private static void g(ClassLoader classLoader) {
        n nVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                nVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                nVar = queryLocalInterface instanceof n ? (n) queryLocalInterface : new n(iBinder);
            }
            f3988r = nVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new a("Failed to instantiate dynamite loader", e10, null);
        }
    }

    private static boolean h(Cursor cursor) {
        k kVar = (k) f3983m.get();
        if (kVar == null || kVar.f3993a != null) {
            return false;
        }
        kVar.f3993a = cursor;
        return true;
    }

    private static boolean i(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f3982l)) {
            return true;
        }
        boolean z10 = false;
        if (f3982l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (b4.f.e().g(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z10 = true;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            f3982l = valueOf;
            z10 = valueOf.booleanValue();
            if (z10 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f3980j = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    private static m j(Context context) {
        m mVar;
        synchronized (DynamiteModule.class) {
            m mVar2 = f3987q;
            if (mVar2 != null) {
                return mVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    mVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    mVar = queryLocalInterface instanceof m ? (m) queryLocalInterface : new m(iBinder);
                }
                if (mVar != null) {
                    f3987q = mVar;
                    return mVar;
                }
            } catch (Exception e10) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
            return null;
        }
    }

    @ResultIgnorabilityUnspecified
    public Context b() {
        return this.f3989a;
    }
}
