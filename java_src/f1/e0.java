package f1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final e0 f8417a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f8418b;

    /* renamed from: c  reason: collision with root package name */
    private static final List<e> f8419c;

    /* renamed from: d  reason: collision with root package name */
    private static final List<e> f8420d;

    /* renamed from: e  reason: collision with root package name */
    private static final Map<String, List<e>> f8421e;

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicBoolean f8422f;

    /* renamed from: g  reason: collision with root package name */
    private static final Integer[] f8423g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a extends e {
        @Override // f1.e0.e
        public /* bridge */ /* synthetic */ String c() {
            return (String) g();
        }

        @Override // f1.e0.e
        public String d() {
            return "com.facebook.arstudio.player";
        }

        public Void g() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    private static final class b extends e {
        @Override // f1.e0.e
        public String c() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        @Override // f1.e0.e
        public String d() {
            return "com.instagram.android";
        }

        @Override // f1.e0.e
        public String e() {
            return "token,signed_request,graph_domain,granted_scopes";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c extends e {
        private final boolean g() {
            p0.f0 f0Var = p0.f0.f14852a;
            return p0.f0.l().getApplicationInfo().targetSdkVersion >= 30;
        }

        @Override // f1.e0.e
        public String c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // f1.e0.e
        public String d() {
            return "com.facebook.katana";
        }

        @Override // f1.e0.e
        public void f() {
            if (g()) {
                Log.w(e0.c(), "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d extends e {
        @Override // f1.e0.e
        public /* bridge */ /* synthetic */ String c() {
            return (String) g();
        }

        @Override // f1.e0.e
        public String d() {
            return "com.facebook.orca";
        }

        public Void g() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        private TreeSet<Integer> f8424a;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
            if (kotlin.jvm.internal.l.a(r2 == null ? null : java.lang.Boolean.valueOf(r2.isEmpty()), java.lang.Boolean.FALSE) == false) goto L3;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0033 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:9:0x0013, B:12:0x0023, B:14:0x0027, B:20:0x0033, B:8:0x000b, B:11:0x001b), top: B:26:0x0003 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final synchronized void a(boolean r2) {
            /*
                r1 = this;
                monitor-enter(r1)
                if (r2 != 0) goto L1b
                java.util.TreeSet<java.lang.Integer> r2 = r1.f8424a     // Catch: java.lang.Throwable -> L38
                if (r2 == 0) goto L1b
                if (r2 != 0) goto Lb
                r2 = 0
                goto L13
            Lb:
                boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L38
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L38
            L13:
                java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L38
                boolean r2 = kotlin.jvm.internal.l.a(r2, r0)     // Catch: java.lang.Throwable -> L38
                if (r2 != 0) goto L23
            L1b:
                f1.e0 r2 = f1.e0.f8417a     // Catch: java.lang.Throwable -> L38
                java.util.TreeSet r2 = f1.e0.b(r2, r1)     // Catch: java.lang.Throwable -> L38
                r1.f8424a = r2     // Catch: java.lang.Throwable -> L38
            L23:
                java.util.TreeSet<java.lang.Integer> r2 = r1.f8424a     // Catch: java.lang.Throwable -> L38
                if (r2 == 0) goto L30
                boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L38
                if (r2 == 0) goto L2e
                goto L30
            L2e:
                r2 = 0
                goto L31
            L30:
                r2 = 1
            L31:
                if (r2 == 0) goto L36
                r1.f()     // Catch: java.lang.Throwable -> L38
            L36:
                monitor-exit(r1)
                return
            L38:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: f1.e0.e.a(boolean):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
            if (kotlin.jvm.internal.l.a(r0 == null ? null : java.lang.Boolean.valueOf(r0.isEmpty()), java.lang.Boolean.FALSE) == false) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.TreeSet<java.lang.Integer> b() {
            /*
                r2 = this;
                java.util.TreeSet<java.lang.Integer> r0 = r2.f8424a
                if (r0 == 0) goto L18
                if (r0 != 0) goto L8
                r0 = 0
                goto L10
            L8:
                boolean r0 = r0.isEmpty()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            L10:
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                boolean r0 = kotlin.jvm.internal.l.a(r0, r1)
                if (r0 != 0) goto L1c
            L18:
                r0 = 0
                r2.a(r0)
            L1c:
                java.util.TreeSet<java.lang.Integer> r0 = r2.f8424a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: f1.e0.e.b():java.util.TreeSet");
        }

        public abstract String c();

        public abstract String d();

        public String e() {
            return "id_token,token,signed_request,graph_domain";
        }

        public void f() {
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: c  reason: collision with root package name */
        public static final a f8425c = new a(null);

        /* renamed from: a  reason: collision with root package name */
        private e f8426a;

        /* renamed from: b  reason: collision with root package name */
        private int f8427b;

        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final f a(e eVar, int i10) {
                f fVar = new f(null);
                fVar.f8426a = eVar;
                fVar.f8427b = i10;
                return fVar;
            }

            public final f b() {
                f fVar = new f(null);
                fVar.f8427b = -1;
                return fVar;
            }
        }

        private f() {
        }

        public /* synthetic */ f(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final int c() {
            return this.f8427b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g extends e {
        @Override // f1.e0.e
        public String c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // f1.e0.e
        public String d() {
            return "com.facebook.wakizashi";
        }
    }

    static {
        e0 e0Var = new e0();
        f8417a = e0Var;
        f8418b = e0.class.getName();
        f8419c = e0Var.f();
        f8420d = e0Var.e();
        f8421e = e0Var.d();
        f8422f = new AtomicBoolean(false);
        f8423g = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    private e0() {
    }

    public static final Intent A(Context context, Intent intent, e eVar) {
        ResolveInfo resolveService;
        if (k1.a.d(e0.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(context, "context");
            if (intent == null || (resolveService = context.getPackageManager().resolveService(intent, 0)) == null) {
                return null;
            }
            k kVar = k.f8465a;
            String str = resolveService.serviceInfo.packageName;
            kotlin.jvm.internal.l.d(str, "resolveInfo.serviceInfo.packageName");
            if (k.a(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th) {
            k1.a.b(th, e0.class);
            return null;
        }
    }

    public static final /* synthetic */ TreeSet b(e0 e0Var, e eVar) {
        if (k1.a.d(e0.class)) {
            return null;
        }
        try {
            return e0Var.o(eVar);
        } catch (Throwable th) {
            k1.a.b(th, e0.class);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        if (k1.a.d(e0.class)) {
            return null;
        }
        try {
            return f8418b;
        } catch (Throwable th) {
            k1.a.b(th, e0.class);
            return null;
        }
    }

    private final Map<String, List<e>> d() {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new d());
            List<e> list = f8419c;
            hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", f8420d);
            hashMap.put("com.facebook.platform.action.request.SHARE_STORY", list);
            return hashMap;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    private final List<e> e() {
        ArrayList c10;
        if (k1.a.d(this)) {
            return null;
        }
        try {
            c10 = t9.p.c(new a());
            c10.addAll(f());
            return c10;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    private final List<e> f() {
        ArrayList c10;
        if (k1.a.d(this)) {
            return null;
        }
        try {
            c10 = t9.p.c(new c(), new g());
            return c10;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    private final Uri g(e eVar) {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            Uri parse = Uri.parse("content://" + eVar.d() + ".provider.PlatformProvider/versions");
            kotlin.jvm.internal.l.d(parse, "parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS)");
            return parse;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    public static final int h(TreeSet<Integer> treeSet, int i10, int[] versionSpec) {
        if (k1.a.d(e0.class)) {
            return 0;
        }
        try {
            kotlin.jvm.internal.l.e(versionSpec, "versionSpec");
            if (treeSet == null) {
                return -1;
            }
            int length = versionSpec.length - 1;
            Iterator<Integer> descendingIterator = treeSet.descendingIterator();
            int i11 = -1;
            while (descendingIterator.hasNext()) {
                Integer fbAppVersion = descendingIterator.next();
                kotlin.jvm.internal.l.d(fbAppVersion, "fbAppVersion");
                i11 = Math.max(i11, fbAppVersion.intValue());
                while (length >= 0 && versionSpec[length] > fbAppVersion.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (versionSpec[length] == fbAppVersion.intValue()) {
                    if (length % 2 == 0) {
                        return Math.min(i11, i10);
                    }
                    return -1;
                }
            }
            return -1;
        } catch (Throwable th) {
            k1.a.b(th, e0.class);
            return 0;
        }
    }

    public static final Bundle i(p0.s sVar) {
        if (k1.a.d(e0.class) || sVar == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("error_description", sVar.toString());
            if (sVar instanceof p0.u) {
                bundle.putString("error_type", "UserCanceled");
            }
            return bundle;
        } catch (Throwable th) {
            k1.a.b(th, e0.class);
            return null;
        }
    }

    public static final Intent j(Context context, String applicationId, Collection<String> permissions, String e2e, boolean z10, boolean z11, p1.e defaultAudience, String clientState, String authType, String str, boolean z12, boolean z13, boolean z14) {
        if (k1.a.d(e0.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(context, "context");
            kotlin.jvm.internal.l.e(applicationId, "applicationId");
            kotlin.jvm.internal.l.e(permissions, "permissions");
            kotlin.jvm.internal.l.e(e2e, "e2e");
            kotlin.jvm.internal.l.e(defaultAudience, "defaultAudience");
            kotlin.jvm.internal.l.e(clientState, "clientState");
            kotlin.jvm.internal.l.e(authType, "authType");
            b bVar = new b();
            return z(context, f8417a.k(bVar, applicationId, permissions, e2e, z11, defaultAudience, clientState, authType, false, str, z12, p1.i0.INSTAGRAM, z13, z14, "", null, null), bVar);
        } catch (Throwable th) {
            k1.a.b(th, e0.class);
            return null;
        }
    }

    private final Intent k(e eVar, String str, Collection<String> collection, String str2, boolean z10, p1.e eVar2, String str3, String str4, boolean z11, String str5, boolean z12, p1.i0 i0Var, boolean z13, boolean z14, String str6, String str7, String str8) {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            String c10 = eVar.c();
            if (c10 == null) {
                return null;
            }
            Intent putExtra = new Intent().setClassName(eVar.d(), c10).putExtra("client_id", str);
            kotlin.jvm.internal.l.d(putExtra, "Intent()\n            .setClassName(appInfo.getPackage(), activityName)\n            .putExtra(FACEBOOK_PROXY_AUTH_APP_ID_KEY, applicationId)");
            p0.f0 f0Var = p0.f0.f14852a;
            putExtra.putExtra("facebook_sdk_version", p0.f0.B());
            l0 l0Var = l0.f8470a;
            if (!l0.Y(collection)) {
                putExtra.putExtra("scope", TextUtils.join(",", collection));
            }
            if (!l0.X(str2)) {
                putExtra.putExtra("e2e", str2);
            }
            putExtra.putExtra("state", str3);
            putExtra.putExtra("response_type", eVar.e());
            putExtra.putExtra("nonce", str6);
            putExtra.putExtra("return_scopes", "true");
            if (z10) {
                putExtra.putExtra("default_audience", eVar2.g());
            }
            putExtra.putExtra("legacy_override", p0.f0.w());
            putExtra.putExtra("auth_type", str4);
            if (z11) {
                putExtra.putExtra("fail_on_logged_out", true);
            }
            putExtra.putExtra("messenger_page_id", str5);
            putExtra.putExtra("reset_messenger_state", z12);
            if (z13) {
                putExtra.putExtra("fx_app", i0Var.toString());
            }
            if (z14) {
                putExtra.putExtra("skip_dedupe", true);
            }
            return putExtra;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    public static final Intent l(Context context) {
        if (k1.a.d(e0.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(context, "context");
            for (e eVar : f8419c) {
                Intent A = A(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(eVar.d()).addCategory("android.intent.category.DEFAULT"), eVar);
                if (A != null) {
                    return A;
                }
            }
            return null;
        } catch (Throwable th) {
            k1.a.b(th, e0.class);
            return null;
        }
    }

    public static final Intent m(Intent requestIntent, Bundle bundle, p0.s sVar) {
        if (k1.a.d(e0.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(requestIntent, "requestIntent");
            UUID p10 = p(requestIntent);
            if (p10 == null) {
                return null;
            }
            Intent intent = new Intent();
            intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", v(requestIntent));
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", p10.toString());
            if (sVar != null) {
                bundle2.putBundle("error", i(sVar));
            }
            intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle != null) {
                intent.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
            }
            return intent;
        } catch (Throwable th) {
            k1.a.b(th, e0.class);
            return null;
        }
    }

    public static final List<Intent> n(Context context, String applicationId, Collection<String> permissions, String e2e, boolean z10, boolean z11, p1.e defaultAudience, String clientState, String authType, boolean z12, String str, boolean z13, boolean z14, boolean z15, String str2, String str3, String str4) {
        if (k1.a.d(e0.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(applicationId, "applicationId");
            kotlin.jvm.internal.l.e(permissions, "permissions");
            kotlin.jvm.internal.l.e(e2e, "e2e");
            kotlin.jvm.internal.l.e(defaultAudience, "defaultAudience");
            kotlin.jvm.internal.l.e(clientState, "clientState");
            kotlin.jvm.internal.l.e(authType, "authType");
            List<e> list = f8419c;
            ArrayList arrayList = new ArrayList();
            for (e eVar : list) {
                ArrayList arrayList2 = arrayList;
                Intent k10 = f8417a.k(eVar, applicationId, permissions, e2e, z11, defaultAudience, clientState, authType, z12, str, z13, p1.i0.FACEBOOK, z14, z15, str2, str3, str4);
                if (k10 != null) {
                    arrayList2.add(k10);
                }
                arrayList = arrayList2;
            }
            return arrayList;
        } catch (Throwable th) {
            k1.a.b(th, e0.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007a A[Catch: all -> 0x0087, TRY_ENTER, TryCatch #1 {all -> 0x0087, blocks: (B:5:0x000c, B:40:0x0086, B:39:0x0083, B:33:0x007a), top: B:46:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005b A[EXC_TOP_SPLITTER, LOOP:0: B:44:0x005b->B:26:0x0061, LOOP_START, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.TreeSet<java.lang.Integer> o(f1.e0.e r13) {
        /*
            r12 = this;
            java.lang.String r0 = "version"
            java.lang.String r1 = "Failed to query content resolver."
            boolean r2 = k1.a.d(r12)
            r3 = 0
            if (r2 == 0) goto Lc
            return r3
        Lc:
            java.util.TreeSet r2 = new java.util.TreeSet     // Catch: java.lang.Throwable -> L87
            r2.<init>()     // Catch: java.lang.Throwable -> L87
            p0.f0 r4 = p0.f0.f14852a     // Catch: java.lang.Throwable -> L87
            android.content.Context r4 = p0.f0.l()     // Catch: java.lang.Throwable -> L87
            android.content.ContentResolver r5 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L87
            java.lang.String[] r7 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L87
            android.net.Uri r6 = r12.g(r13)     // Catch: java.lang.Throwable -> L87
            android.content.Context r4 = p0.f0.l()     // Catch: java.lang.Throwable -> L7e
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r13 = r13.d()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r8 = ".provider.PlatformProvider"
            java.lang.String r13 = kotlin.jvm.internal.l.k(r13, r8)     // Catch: java.lang.Throwable -> L7e
            r8 = 0
            android.content.pm.ProviderInfo r13 = r4.resolveContentProvider(r13, r8)     // Catch: java.lang.RuntimeException -> L3b java.lang.Throwable -> L7e
            goto L42
        L3b:
            r13 = move-exception
            java.lang.String r4 = f1.e0.f8418b     // Catch: java.lang.Throwable -> L7e
            android.util.Log.e(r4, r1, r13)     // Catch: java.lang.Throwable -> L7e
            r13 = r3
        L42:
            if (r13 == 0) goto L76
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r13 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.IllegalArgumentException -> L4c java.lang.SecurityException -> L4f java.lang.NullPointerException -> L55 java.lang.Throwable -> L7e
            goto L59
        L4c:
            java.lang.String r13 = f1.e0.f8418b     // Catch: java.lang.Throwable -> L7e
            goto L51
        L4f:
            java.lang.String r13 = f1.e0.f8418b     // Catch: java.lang.Throwable -> L7e
        L51:
            android.util.Log.e(r13, r1)     // Catch: java.lang.Throwable -> L7e
            goto L58
        L55:
            java.lang.String r13 = f1.e0.f8418b     // Catch: java.lang.Throwable -> L7e
            goto L51
        L58:
            r13 = r3
        L59:
            if (r13 == 0) goto L77
        L5b:
            boolean r1 = r13.moveToNext()     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L77
            int r1 = r13.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L71
            int r1 = r13.getInt(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L71
            r2.add(r1)     // Catch: java.lang.Throwable -> L71
            goto L5b
        L71:
            r0 = move-exception
            r11 = r0
            r0 = r13
            r13 = r11
            goto L80
        L76:
            r13 = r3
        L77:
            if (r13 != 0) goto L7a
            goto L7d
        L7a:
            r13.close()     // Catch: java.lang.Throwable -> L87
        L7d:
            return r2
        L7e:
            r13 = move-exception
            r0 = r3
        L80:
            if (r0 != 0) goto L83
            goto L86
        L83:
            r0.close()     // Catch: java.lang.Throwable -> L87
        L86:
            throw r13     // Catch: java.lang.Throwable -> L87
        L87:
            r13 = move-exception
            k1.a.b(r13, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.e0.o(f1.e0$e):java.util.TreeSet");
    }

    public static final UUID p(Intent intent) {
        String stringExtra;
        if (k1.a.d(e0.class) || intent == null) {
            return null;
        }
        try {
            if (w(v(intent))) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
            } else {
                stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
            }
            if (stringExtra != null) {
                try {
                    return UUID.fromString(stringExtra);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            }
            return null;
        } catch (Throwable th) {
            k1.a.b(th, e0.class);
            return null;
        }
    }

    public static final p0.s q(Bundle bundle) {
        boolean l10;
        if (k1.a.d(e0.class) || bundle == null) {
            return null;
        }
        try {
            String string = bundle.getString("error_type");
            if (string == null) {
                string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
            }
            String string2 = bundle.getString("error_description");
            if (string2 == null) {
                string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            }
            if (string != null) {
                l10 = ka.p.l(string, "UserCanceled", true);
                if (l10) {
                    return new p0.u(string2);
                }
            }
            return new p0.s(string2);
        } catch (Throwable th) {
            k1.a.b(th, e0.class);
            return null;
        }
    }

    private final f r(List<? extends e> list, int[] iArr) {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            x();
            if (list == null) {
                return f.f8425c.b();
            }
            for (e eVar : list) {
                int h10 = h(eVar.b(), t(), iArr);
                if (h10 != -1) {
                    return f.f8425c.a(eVar, h10);
                }
            }
            return f.f8425c.b();
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    public static final int s(int i10) {
        if (k1.a.d(e0.class)) {
            return 0;
        }
        try {
            return f8417a.r(f8419c, new int[]{i10}).c();
        } catch (Throwable th) {
            k1.a.b(th, e0.class);
            return 0;
        }
    }

    public static final int t() {
        if (k1.a.d(e0.class)) {
            return 0;
        }
        try {
            return f8423g[0].intValue();
        } catch (Throwable th) {
            k1.a.b(th, e0.class);
            return 0;
        }
    }

    public static final Bundle u(Intent intent) {
        if (k1.a.d(e0.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(intent, "intent");
            return !w(v(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th) {
            k1.a.b(th, e0.class);
            return null;
        }
    }

    public static final int v(Intent intent) {
        if (k1.a.d(e0.class)) {
            return 0;
        }
        try {
            kotlin.jvm.internal.l.e(intent, "intent");
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th) {
            k1.a.b(th, e0.class);
            return 0;
        }
    }

    public static final boolean w(int i10) {
        boolean j10;
        if (k1.a.d(e0.class)) {
            return false;
        }
        try {
            j10 = t9.k.j(f8423g, Integer.valueOf(i10));
            return j10 && i10 >= 20140701;
        } catch (Throwable th) {
            k1.a.b(th, e0.class);
            return false;
        }
    }

    public static final void x() {
        if (k1.a.d(e0.class)) {
            return;
        }
        try {
            if (f8422f.compareAndSet(false, true)) {
                p0.f0 f0Var = p0.f0.f14852a;
                p0.f0.t().execute(new Runnable() { // from class: f1.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        e0.y();
                    }
                });
            }
        } catch (Throwable th) {
            k1.a.b(th, e0.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y() {
        if (k1.a.d(e0.class)) {
            return;
        }
        try {
            for (e eVar : f8419c) {
                eVar.a(true);
            }
            f8422f.set(false);
        } catch (Throwable th) {
            k1.a.b(th, e0.class);
        }
    }

    public static final Intent z(Context context, Intent intent, e eVar) {
        ResolveInfo resolveActivity;
        if (k1.a.d(e0.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(context, "context");
            if (intent == null || (resolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null) {
                return null;
            }
            k kVar = k.f8465a;
            String str = resolveActivity.activityInfo.packageName;
            kotlin.jvm.internal.l.d(str, "resolveInfo.activityInfo.packageName");
            if (k.a(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th) {
            k1.a.b(th, e0.class);
            return null;
        }
    }
}
