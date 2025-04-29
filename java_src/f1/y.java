package f1;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final y f8600a = new y();

    /* loaded from: classes.dex */
    public interface a {
        void a(String str);
    }

    /* loaded from: classes.dex */
    public static final class b implements InstallReferrerStateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InstallReferrerClient f8601a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f8602b;

        b(InstallReferrerClient installReferrerClient, a aVar) {
            this.f8601a = installReferrerClient;
            this.f8602b = aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
            if (r0 != false) goto L23;
         */
        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(int r5) {
            /*
                r4 = this;
                boolean r0 = k1.a.d(r4)
                if (r0 == 0) goto L7
                return
            L7:
                r0 = 2
                if (r5 == 0) goto L13
                if (r5 == r0) goto Ld
                goto L3e
            Ld:
                f1.y r5 = f1.y.f8600a     // Catch: java.lang.Throwable -> L44
            Lf:
                f1.y.a(r5)     // Catch: java.lang.Throwable -> L44
                goto L3e
            L13:
                com.android.installreferrer.api.InstallReferrerClient r5 = r4.f8601a     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L4a
                com.android.installreferrer.api.ReferrerDetails r5 = r5.b()     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L4a
                java.lang.String r1 = "{\n                      referrerClient.installReferrer\n                    }"
                kotlin.jvm.internal.l.d(r5, r1)     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L4a
                java.lang.String r5 = r5.a()     // Catch: java.lang.Throwable -> L44
                if (r5 == 0) goto L3b
                java.lang.String r1 = "fb"
                r2 = 0
                r3 = 0
                boolean r1 = ka.g.w(r5, r1, r3, r0, r2)     // Catch: java.lang.Throwable -> L44
                if (r1 != 0) goto L36
                java.lang.String r1 = "facebook"
                boolean r0 = ka.g.w(r5, r1, r3, r0, r2)     // Catch: java.lang.Throwable -> L44
                if (r0 == 0) goto L3b
            L36:
                f1.y$a r0 = r4.f8602b     // Catch: java.lang.Throwable -> L44
                r0.a(r5)     // Catch: java.lang.Throwable -> L44
            L3b:
                f1.y r5 = f1.y.f8600a     // Catch: java.lang.Throwable -> L44
                goto Lf
            L3e:
                com.android.installreferrer.api.InstallReferrerClient r5 = r4.f8601a     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
                r5.a()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
                goto L46
            L44:
                r5 = move-exception
                goto L47
            L46:
                return
            L47:
                k1.a.b(r5, r4)
            L4a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f1.y.b.a(int):void");
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void b() {
        }
    }

    private y() {
    }

    private final boolean b() {
        p0.f0 f0Var = p0.f0.f14852a;
        return p0.f0.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
    }

    private final void c(a aVar) {
        p0.f0 f0Var = p0.f0.f14852a;
        InstallReferrerClient a10 = InstallReferrerClient.c(p0.f0.l()).a();
        try {
            a10.d(new b(a10, aVar));
        } catch (Exception unused) {
        }
    }

    public static final void d(a callback) {
        kotlin.jvm.internal.l.e(callback, "callback");
        y yVar = f8600a;
        if (yVar.b()) {
            return;
        }
        yVar.c(callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        p0.f0 f0Var = p0.f0.f14852a;
        p0.f0.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }
}
