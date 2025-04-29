package u4;

import android.content.Context;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f19042a = "e";

    /* renamed from: b  reason: collision with root package name */
    private static boolean f19043b = false;

    /* renamed from: c  reason: collision with root package name */
    private static a f19044c = a.LEGACY;

    /* loaded from: classes.dex */
    public enum a {
        LEGACY,
        LATEST
    }

    private e() {
    }

    public static synchronized int a(Context context) {
        int b10;
        synchronized (e.class) {
            b10 = b(context, null, null);
        }
        return b10;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:11|12|13|14|15|16|(10:18|(1:(1:21))|22|23|(1:25)|26|27|(1:29)|30|31)|35|22|23|(0)|26|27|(0)|30|31) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
        android.util.Log.e(u4.e.f19042a, "Failed to retrieve renderer type or log initialization.", r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f A[Catch: RemoteException -> 0x005b, all -> 0x0089, TryCatch #3 {RemoteException -> 0x005b, blocks: (B:21:0x0049, B:23:0x004f, B:24:0x0053), top: B:48:0x0049, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: all -> 0x0089, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:7:0x001e, B:10:0x0025, B:11:0x0029, B:13:0x0038, B:15:0x003d, B:21:0x0049, B:23:0x004f, B:24:0x0053, B:28:0x0063, B:30:0x0076, B:27:0x005c, B:34:0x007e, B:35:0x0083, B:37:0x0085), top: B:47:0x0003, inners: #0, #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized int b(android.content.Context r5, u4.e.a r6, u4.g r7) {
        /*
            java.lang.Class<u4.e> r0 = u4.e.class
            monitor-enter(r0)
            java.lang.String r1 = "Context is null"
            c4.s.k(r5, r1)     // Catch: java.lang.Throwable -> L89
            java.lang.String r1 = u4.e.f19042a     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "preferredRenderer: "
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Throwable -> L89
            android.util.Log.d(r1, r2)     // Catch: java.lang.Throwable -> L89
            boolean r1 = u4.e.f19043b     // Catch: java.lang.Throwable -> L89
            r2 = 0
            if (r1 == 0) goto L25
            if (r7 == 0) goto L23
            u4.e$a r5 = u4.e.f19044c     // Catch: java.lang.Throwable -> L89
            r7.a(r5)     // Catch: java.lang.Throwable -> L89
        L23:
            monitor-exit(r0)
            return r2
        L25:
            v4.g0 r1 = v4.e0.a(r5, r6)     // Catch: b4.g -> L84 java.lang.Throwable -> L89
            v4.a r3 = r1.zze()     // Catch: android.os.RemoteException -> L7d java.lang.Throwable -> L89
            u4.b.k(r3)     // Catch: android.os.RemoteException -> L7d java.lang.Throwable -> L89
            r4.s r3 = r1.zzj()     // Catch: android.os.RemoteException -> L7d java.lang.Throwable -> L89
            w4.b.e(r3)     // Catch: android.os.RemoteException -> L7d java.lang.Throwable -> L89
            r3 = 1
            u4.e.f19043b = r3     // Catch: java.lang.Throwable -> L89
            r4 = 2
            if (r6 == 0) goto L48
            int r6 = r6.ordinal()     // Catch: java.lang.Throwable -> L89
            if (r6 == 0) goto L49
            if (r6 == r3) goto L46
            goto L48
        L46:
            r3 = 2
            goto L49
        L48:
            r3 = 0
        L49:
            int r6 = r1.zzd()     // Catch: android.os.RemoteException -> L5b java.lang.Throwable -> L89
            if (r6 != r4) goto L53
            u4.e$a r6 = u4.e.a.LATEST     // Catch: android.os.RemoteException -> L5b java.lang.Throwable -> L89
            u4.e.f19044c = r6     // Catch: android.os.RemoteException -> L5b java.lang.Throwable -> L89
        L53:
            k4.b r5 = k4.d.H2(r5)     // Catch: android.os.RemoteException -> L5b java.lang.Throwable -> L89
            r1.J0(r5, r3)     // Catch: android.os.RemoteException -> L5b java.lang.Throwable -> L89
            goto L63
        L5b:
            r5 = move-exception
            java.lang.String r6 = u4.e.f19042a     // Catch: java.lang.Throwable -> L89
            java.lang.String r1 = "Failed to retrieve renderer type or log initialization."
            android.util.Log.e(r6, r1, r5)     // Catch: java.lang.Throwable -> L89
        L63:
            java.lang.String r5 = u4.e.f19042a     // Catch: java.lang.Throwable -> L89
            java.lang.String r6 = "loadedRenderer: "
            u4.e$a r1 = u4.e.f19044c     // Catch: java.lang.Throwable -> L89
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L89
            java.lang.String r6 = r6.concat(r1)     // Catch: java.lang.Throwable -> L89
            android.util.Log.d(r5, r6)     // Catch: java.lang.Throwable -> L89
            if (r7 == 0) goto L7b
            u4.e$a r5 = u4.e.f19044c     // Catch: java.lang.Throwable -> L89
            r7.a(r5)     // Catch: java.lang.Throwable -> L89
        L7b:
            monitor-exit(r0)
            return r2
        L7d:
            r5 = move-exception
            w4.t r6 = new w4.t     // Catch: java.lang.Throwable -> L89
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L89
            throw r6     // Catch: java.lang.Throwable -> L89
        L84:
            r5 = move-exception
            int r5 = r5.f2910j     // Catch: java.lang.Throwable -> L89
            monitor-exit(r0)
            return r5
        L89:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.e.b(android.content.Context, u4.e$a, u4.g):int");
    }
}
