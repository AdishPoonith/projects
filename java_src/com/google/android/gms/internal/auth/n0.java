package com.google.android.gms.internal.auth;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: h  reason: collision with root package name */
    private static volatile l0 f4180h;

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f4184l = 0;

    /* renamed from: a  reason: collision with root package name */
    final j0 f4185a;

    /* renamed from: b  reason: collision with root package name */
    final String f4186b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f4187c;

    /* renamed from: d  reason: collision with root package name */
    private volatile int f4188d = -1;

    /* renamed from: e  reason: collision with root package name */
    private volatile Object f4189e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f4190f;

    /* renamed from: g  reason: collision with root package name */
    private static final Object f4179g = new Object();

    /* renamed from: i  reason: collision with root package name */
    private static final AtomicReference f4181i = new AtomicReference();

    /* renamed from: j  reason: collision with root package name */
    private static final p0 f4182j = new p0(new Object() { // from class: com.google.android.gms.internal.auth.e0
    }, null);

    /* renamed from: k  reason: collision with root package name */
    private static final AtomicInteger f4183k = new AtomicInteger();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ n0(j0 j0Var, String str, Object obj, boolean z10, m0 m0Var) {
        if (j0Var.f4118b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f4185a = j0Var;
        this.f4186b = str;
        this.f4187c = obj;
        this.f4190f = true;
    }

    public static void d() {
        f4183k.incrementAndGet();
    }

    public static void e(final Context context) {
        if (f4180h == null) {
            Object obj = f4179g;
            synchronized (obj) {
                if (f4180h == null) {
                    synchronized (obj) {
                        l0 l0Var = f4180h;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (l0Var == null || l0Var.a() != context) {
                            q.d();
                            o0.c();
                            y.e();
                            f4180h = new n(context, y0.a(new u0() { // from class: com.google.android.gms.internal.auth.d0
                                @Override // com.google.android.gms.internal.auth.u0
                                public final Object zza() {
                                    Context context2 = context;
                                    int i10 = n0.f4184l;
                                    return z.a(context2);
                                }
                            }));
                            f4183k.incrementAndGet();
                        }
                    }
                }
            }
        }
    }

    abstract Object a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:37:0x0099 A[Catch: all -> 0x00d3, TryCatch #0 {, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0029, B:16:0x0037, B:20:0x0060, B:22:0x006a, B:38:0x009b, B:40:0x00ab, B:42:0x00bf, B:43:0x00c2, B:44:0x00c6, B:26:0x0073, B:28:0x0079, B:32:0x008b, B:34:0x0091, B:37:0x0099, B:31:0x0089, B:18:0x0050, B:45:0x00cb, B:46:0x00d0, B:47:0x00d1), top: B:54:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b() {
        /*
            r6 = this;
            boolean r0 = r6.f4190f
            if (r0 != 0) goto Lb
            java.lang.String r0 = r6.f4186b
            java.lang.String r1 = "flagName must not be null"
            java.util.Objects.requireNonNull(r0, r1)
        Lb:
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.auth.n0.f4183k
            int r0 = r0.get()
            int r1 = r6.f4188d
            if (r1 >= r0) goto Ld6
            monitor-enter(r6)
            int r1 = r6.f4188d     // Catch: java.lang.Throwable -> Ld3
            if (r1 >= r0) goto Ld1
            com.google.android.gms.internal.auth.l0 r1 = com.google.android.gms.internal.auth.n0.f4180h     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r2 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto Lcb
            com.google.android.gms.internal.auth.j0 r2 = r6.f4185a     // Catch: java.lang.Throwable -> Ld3
            boolean r3 = r2.f4122f     // Catch: java.lang.Throwable -> Ld3
            android.net.Uri r2 = r2.f4118b     // Catch: java.lang.Throwable -> Ld3
            r3 = 0
            if (r2 == 0) goto L50
            android.content.Context r2 = r1.a()     // Catch: java.lang.Throwable -> Ld3
            com.google.android.gms.internal.auth.j0 r4 = r6.f4185a     // Catch: java.lang.Throwable -> Ld3
            android.net.Uri r4 = r4.f4118b     // Catch: java.lang.Throwable -> Ld3
            boolean r2 = com.google.android.gms.internal.auth.a0.a(r2, r4)     // Catch: java.lang.Throwable -> Ld3
            if (r2 == 0) goto L4e
            com.google.android.gms.internal.auth.j0 r2 = r6.f4185a     // Catch: java.lang.Throwable -> Ld3
            boolean r2 = r2.f4124h     // Catch: java.lang.Throwable -> Ld3
            android.content.Context r2 = r1.a()     // Catch: java.lang.Throwable -> Ld3
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> Ld3
            com.google.android.gms.internal.auth.j0 r4 = r6.f4185a     // Catch: java.lang.Throwable -> Ld3
            android.net.Uri r4 = r4.f4118b     // Catch: java.lang.Throwable -> Ld3
            com.google.android.gms.internal.auth.c0 r5 = new java.lang.Runnable() { // from class: com.google.android.gms.internal.auth.c0
                static {
                    /*
                        com.google.android.gms.internal.auth.c0 r0 = new com.google.android.gms.internal.auth.c0
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:com.google.android.gms.internal.auth.c0) com.google.android.gms.internal.auth.c0.j com.google.android.gms.internal.auth.c0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.c0.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.c0.<init>():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    /*
                        r0 = this;
                        com.google.android.gms.internal.auth.n0.d()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.c0.run():void");
                }
            }     // Catch: java.lang.Throwable -> Ld3
            com.google.android.gms.internal.auth.q r2 = com.google.android.gms.internal.auth.q.b(r2, r4, r5)     // Catch: java.lang.Throwable -> Ld3
            goto L5e
        L4e:
            r2 = r3
            goto L5e
        L50:
            android.content.Context r2 = r1.a()     // Catch: java.lang.Throwable -> Ld3
            com.google.android.gms.internal.auth.j0 r4 = r6.f4185a     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r4 = r4.f4117a     // Catch: java.lang.Throwable -> Ld3
            com.google.android.gms.internal.auth.c0 r4 = com.google.android.gms.internal.auth.c0.f4027j     // Catch: java.lang.Throwable -> Ld3
            com.google.android.gms.internal.auth.o0 r2 = com.google.android.gms.internal.auth.o0.b(r2, r3, r4)     // Catch: java.lang.Throwable -> Ld3
        L5e:
            if (r2 == 0) goto L6f
            java.lang.String r4 = r6.c()     // Catch: java.lang.Throwable -> Ld3
            java.lang.Object r2 = r2.a(r4)     // Catch: java.lang.Throwable -> Ld3
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r6.a(r2)     // Catch: java.lang.Throwable -> Ld3
            goto L70
        L6f:
            r2 = r3
        L70:
            if (r2 == 0) goto L73
            goto L9b
        L73:
            com.google.android.gms.internal.auth.j0 r2 = r6.f4185a     // Catch: java.lang.Throwable -> Ld3
            boolean r2 = r2.f4121e     // Catch: java.lang.Throwable -> Ld3
            if (r2 != 0) goto L96
            android.content.Context r2 = r1.a()     // Catch: java.lang.Throwable -> Ld3
            com.google.android.gms.internal.auth.y r2 = com.google.android.gms.internal.auth.y.b(r2)     // Catch: java.lang.Throwable -> Ld3
            com.google.android.gms.internal.auth.j0 r4 = r6.f4185a     // Catch: java.lang.Throwable -> Ld3
            boolean r4 = r4.f4121e     // Catch: java.lang.Throwable -> Ld3
            if (r4 == 0) goto L89
            r4 = r3
            goto L8b
        L89:
            java.lang.String r4 = r6.f4186b     // Catch: java.lang.Throwable -> Ld3
        L8b:
            java.lang.String r2 = r2.a(r4)     // Catch: java.lang.Throwable -> Ld3
            if (r2 == 0) goto L96
            java.lang.Object r2 = r6.a(r2)     // Catch: java.lang.Throwable -> Ld3
            goto L97
        L96:
            r2 = r3
        L97:
            if (r2 != 0) goto L9b
            java.lang.Object r2 = r6.f4187c     // Catch: java.lang.Throwable -> Ld3
        L9b:
            com.google.android.gms.internal.auth.u0 r1 = r1.b()     // Catch: java.lang.Throwable -> Ld3
            java.lang.Object r1 = r1.zza()     // Catch: java.lang.Throwable -> Ld3
            com.google.android.gms.internal.auth.s0 r1 = (com.google.android.gms.internal.auth.s0) r1     // Catch: java.lang.Throwable -> Ld3
            boolean r4 = r1.b()     // Catch: java.lang.Throwable -> Ld3
            if (r4 == 0) goto Lc6
            java.lang.Object r1 = r1.a()     // Catch: java.lang.Throwable -> Ld3
            com.google.android.gms.internal.auth.s r1 = (com.google.android.gms.internal.auth.s) r1     // Catch: java.lang.Throwable -> Ld3
            com.google.android.gms.internal.auth.j0 r2 = r6.f4185a     // Catch: java.lang.Throwable -> Ld3
            android.net.Uri r4 = r2.f4118b     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r2 = r2.f4120d     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r5 = r6.f4186b     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r1 = r1.a(r4, r3, r2, r5)     // Catch: java.lang.Throwable -> Ld3
            if (r1 != 0) goto Lc2
            java.lang.Object r2 = r6.f4187c     // Catch: java.lang.Throwable -> Ld3
            goto Lc6
        Lc2:
            java.lang.Object r2 = r6.a(r1)     // Catch: java.lang.Throwable -> Ld3
        Lc6:
            r6.f4189e = r2     // Catch: java.lang.Throwable -> Ld3
            r6.f4188d = r0     // Catch: java.lang.Throwable -> Ld3
            goto Ld1
        Lcb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ld3
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Ld3
            throw r0     // Catch: java.lang.Throwable -> Ld3
        Ld1:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Ld3
            goto Ld6
        Ld3:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Ld3
            throw r0
        Ld6:
            java.lang.Object r0 = r6.f4189e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.n0.b():java.lang.Object");
    }

    public final String c() {
        String str = this.f4185a.f4120d;
        return this.f4186b;
    }
}
