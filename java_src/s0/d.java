package s0;

import android.content.SharedPreferences;
import f1.c0;
import f1.l0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p0.f0;
import p0.j0;
import p0.o0;
import p0.p0;
import p0.r0;
import t9.x;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f16881a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final String f16882b = d.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    private static boolean f16883c;

    private d() {
    }

    public static final void b() {
        String b10;
        try {
            c cVar = new j0.b() { // from class: s0.c
                @Override // p0.j0.b
                public final void b(o0 o0Var) {
                    d.c(o0Var);
                }
            };
            f0 f0Var = f0.f14852a;
            j0 j0Var = new j0(null, kotlin.jvm.internal.l.k(f0.m(), "/cloudbridge_settings"), null, p0.GET, cVar, null, 32, null);
            c0.a aVar = c0.f8388e;
            r0 r0Var = r0.APP_EVENTS;
            String str = f16882b;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            aVar.c(r0Var, str, " \n\nCreating Graph Request: \n=============\n%s\n\n ", j0Var);
            j0Var.l();
        } catch (JSONException e10) {
            c0.a aVar2 = c0.f8388e;
            r0 r0Var2 = r0.APP_EVENTS;
            String str2 = f16882b;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            b10 = s9.b.b(e10);
            aVar2.c(r0Var2, str2, " \n\nGraph Request Exception: \n=============\n%s\n\n ", b10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(o0 response) {
        kotlin.jvm.internal.l.e(response, "response");
        f16881a.d(response);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064 A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #0 {all -> 0x0099, blocks: (B:5:0x000a, B:8:0x001a, B:10:0x003b, B:17:0x0049, B:24:0x0057, B:31:0x0064), top: B:37:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<java.lang.String, java.lang.Object> e() {
        /*
            java.lang.Class<s0.d> r0 = s0.d.class
            boolean r1 = k1.a.d(r0)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            p0.f0 r1 = p0.f0.f14852a     // Catch: java.lang.Throwable -> L99
            android.content.Context r1 = p0.f0.l()     // Catch: java.lang.Throwable -> L99
            java.lang.String r3 = "com.facebook.sdk.CloudBridgeSavedCredentials"
            r4 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r3, r4)     // Catch: java.lang.Throwable -> L99
            if (r1 != 0) goto L1a
            return r2
        L1a:
            s0.o r3 = s0.o.DATASETID     // Catch: java.lang.Throwable -> L99
            java.lang.String r5 = r3.g()     // Catch: java.lang.Throwable -> L99
            java.lang.String r5 = r1.getString(r5, r2)     // Catch: java.lang.Throwable -> L99
            s0.o r6 = s0.o.URL     // Catch: java.lang.Throwable -> L99
            java.lang.String r7 = r6.g()     // Catch: java.lang.Throwable -> L99
            java.lang.String r7 = r1.getString(r7, r2)     // Catch: java.lang.Throwable -> L99
            s0.o r8 = s0.o.ACCESSKEY     // Catch: java.lang.Throwable -> L99
            java.lang.String r9 = r8.g()     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = r1.getString(r9, r2)     // Catch: java.lang.Throwable -> L99
            r9 = 1
            if (r5 == 0) goto L44
            boolean r10 = ka.g.m(r5)     // Catch: java.lang.Throwable -> L99
            if (r10 == 0) goto L42
            goto L44
        L42:
            r10 = 0
            goto L45
        L44:
            r10 = 1
        L45:
            if (r10 != 0) goto L98
            if (r7 == 0) goto L52
            boolean r10 = ka.g.m(r7)     // Catch: java.lang.Throwable -> L99
            if (r10 == 0) goto L50
            goto L52
        L50:
            r10 = 0
            goto L53
        L52:
            r10 = 1
        L53:
            if (r10 != 0) goto L98
            if (r1 == 0) goto L60
            boolean r10 = ka.g.m(r1)     // Catch: java.lang.Throwable -> L99
            if (r10 == 0) goto L5e
            goto L60
        L5e:
            r10 = 0
            goto L61
        L60:
            r10 = 1
        L61:
            if (r10 == 0) goto L64
            goto L98
        L64:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L99
            r10.<init>()     // Catch: java.lang.Throwable -> L99
            java.lang.String r6 = r6.g()     // Catch: java.lang.Throwable -> L99
            r10.put(r6, r7)     // Catch: java.lang.Throwable -> L99
            java.lang.String r3 = r3.g()     // Catch: java.lang.Throwable -> L99
            r10.put(r3, r5)     // Catch: java.lang.Throwable -> L99
            java.lang.String r3 = r8.g()     // Catch: java.lang.Throwable -> L99
            r10.put(r3, r1)     // Catch: java.lang.Throwable -> L99
            f1.c0$a r3 = f1.c0.f8388e     // Catch: java.lang.Throwable -> L99
            p0.r0 r6 = p0.r0.APP_EVENTS     // Catch: java.lang.Throwable -> L99
            java.lang.String r8 = s0.d.f16882b     // Catch: java.lang.Throwable -> L99
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L99
            java.lang.String r11 = " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n "
            r12 = 3
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L99
            r12[r4] = r5     // Catch: java.lang.Throwable -> L99
            r12[r9] = r7     // Catch: java.lang.Throwable -> L99
            r4 = 2
            r12[r4] = r1     // Catch: java.lang.Throwable -> L99
            r3.c(r6, r8, r11, r12)     // Catch: java.lang.Throwable -> L99
            return r10
        L98:
            return r2
        L99:
            r1 = move-exception
            k1.a.b(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.d.e():java.util.Map");
    }

    public final void d(o0 response) {
        String b10;
        String b11;
        Object u10;
        String b12;
        kotlin.jvm.internal.l.e(response, "response");
        boolean z10 = false;
        if (response.b() != null) {
            c0.a aVar = c0.f8388e;
            r0 r0Var = r0.APP_EVENTS;
            String str = f16882b;
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            aVar.c(r0Var, str, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", response.b().toString(), String.valueOf(response.b().e()));
            Map<String, Object> e10 = e();
            if (e10 != null) {
                URL url = new URL(String.valueOf(e10.get(o.URL.g())));
                g gVar = g.f16907a;
                String valueOf = String.valueOf(e10.get(o.DATASETID.g()));
                g.d(valueOf, url.getProtocol() + "://" + ((Object) url.getHost()), String.valueOf(e10.get(o.ACCESSKEY.g())));
                f16883c = true;
                return;
            }
            return;
        }
        c0.a aVar2 = c0.f8388e;
        r0 r0Var2 = r0.APP_EVENTS;
        String TAG = f16882b;
        Objects.requireNonNull(TAG, "null cannot be cast to non-null type kotlin.String");
        aVar2.c(r0Var2, TAG, " \n\nGraph Response Received: \n================\n%s\n\n ", response);
        JSONObject c10 = response.c();
        try {
            l0 l0Var = l0.f8470a;
            Object obj = c10 == null ? null : c10.get("data");
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            }
            u10 = x.u(l0.m((JSONArray) obj));
            Map<String, ? extends Object> n10 = l0.n(new JSONObject((String) u10));
            String str2 = (String) n10.get(o.URL.g());
            String str3 = (String) n10.get(o.DATASETID.g());
            String str4 = (String) n10.get(o.ACCESSKEY.g());
            if (str2 == null || str3 == null || str4 == null) {
                kotlin.jvm.internal.l.d(TAG, "TAG");
                aVar2.b(r0Var2, TAG, "CloudBridge Settings API response doesn't have valid data");
                return;
            }
            try {
                g gVar2 = g.f16907a;
                g.d(str3, str2, str4);
                g(n10);
                o oVar = o.ENABLED;
                if (n10.get(oVar.g()) != null) {
                    Object obj2 = n10.get(oVar.g());
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                    z10 = ((Boolean) obj2).booleanValue();
                }
                f16883c = z10;
            } catch (MalformedURLException e11) {
                c0.a aVar3 = c0.f8388e;
                r0 r0Var3 = r0.APP_EVENTS;
                String TAG2 = f16882b;
                kotlin.jvm.internal.l.d(TAG2, "TAG");
                b12 = s9.b.b(e11);
                aVar3.c(r0Var3, TAG2, "CloudBridge Settings API response doesn't have valid url\n %s ", b12);
            }
        } catch (NullPointerException e12) {
            c0.a aVar4 = c0.f8388e;
            r0 r0Var4 = r0.APP_EVENTS;
            String TAG3 = f16882b;
            kotlin.jvm.internal.l.d(TAG3, "TAG");
            b11 = s9.b.b(e12);
            aVar4.c(r0Var4, TAG3, "CloudBridge Settings API response is not a valid json: \n%s ", b11);
        } catch (JSONException e13) {
            c0.a aVar5 = c0.f8388e;
            r0 r0Var5 = r0.APP_EVENTS;
            String TAG4 = f16882b;
            kotlin.jvm.internal.l.d(TAG4, "TAG");
            b10 = s9.b.b(e13);
            aVar5.c(r0Var5, TAG4, "CloudBridge Settings API response is not a valid json: \n%s ", b10);
        }
    }

    public final boolean f() {
        return f16883c;
    }

    public final void g(Map<String, ? extends Object> map) {
        f0 f0Var = f0.f14852a;
        SharedPreferences sharedPreferences = f0.l().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        if (map == null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.clear();
            edit.apply();
            return;
        }
        o oVar = o.DATASETID;
        Object obj = map.get(oVar.g());
        o oVar2 = o.URL;
        Object obj2 = map.get(oVar2.g());
        o oVar3 = o.ACCESSKEY;
        Object obj3 = map.get(oVar3.g());
        if (obj == null || obj2 == null || obj3 == null) {
            return;
        }
        SharedPreferences.Editor edit2 = sharedPreferences.edit();
        edit2.putString(oVar.g(), obj.toString());
        edit2.putString(oVar2.g(), obj2.toString());
        edit2.putString(oVar3.g(), obj3.toString());
        edit2.apply();
        c0.f8388e.c(r0.APP_EVENTS, f16882b.toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
    }
}
