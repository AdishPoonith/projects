package p1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p1.u;
/* loaded from: classes.dex */
public abstract class f0 implements Parcelable {

    /* renamed from: l  reason: collision with root package name */
    public static final a f15128l = new a(null);

    /* renamed from: j  reason: collision with root package name */
    private Map<String, String> f15129j;

    /* renamed from: k  reason: collision with root package name */
    public u f15130k;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final p0.a a(Bundle bundle, p0.h hVar, String applicationId) {
            String string;
            kotlin.jvm.internal.l.e(bundle, "bundle");
            kotlin.jvm.internal.l.e(applicationId, "applicationId");
            f1.l0 l0Var = f1.l0.f8470a;
            Date w10 = f1.l0.w(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            Date w11 = f1.l0.w(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
            if (string2 != null) {
                if (!(string2.length() == 0) && (string = bundle.getString("com.facebook.platform.extra.USER_ID")) != null) {
                    if (!(string.length() == 0)) {
                        return new p0.a(string2, applicationId, string, stringArrayList, null, null, hVar, w10, new Date(), w11, bundle.getString("graph_domain"));
                    }
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final p0.a b(java.util.Collection<java.lang.String> r20, android.os.Bundle r21, p0.h r22, java.lang.String r23) {
            /*
                Method dump skipped, instructions count: 270
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p1.f0.a.b(java.util.Collection, android.os.Bundle, p0.h, java.lang.String):p0.a");
        }

        public final p0.i c(Bundle bundle, String str) {
            kotlin.jvm.internal.l.e(bundle, "bundle");
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (string != null) {
                if (!(string.length() == 0) && str != null) {
                    if (!(str.length() == 0)) {
                        try {
                            return new p0.i(string, str);
                        } catch (Exception e10) {
                            throw new p0.s(e10.getMessage());
                        }
                    }
                }
            }
            return null;
        }

        public final p0.i d(Bundle bundle, String str) {
            kotlin.jvm.internal.l.e(bundle, "bundle");
            String string = bundle.getString("id_token");
            if (string != null) {
                if (!(string.length() == 0) && str != null) {
                    if (!(str.length() == 0)) {
                        try {
                            return new p0.i(string, str);
                        } catch (Exception e10) {
                            throw new p0.s(e10.getMessage(), e10);
                        }
                    }
                }
            }
            return null;
        }

        public final String e(String str) {
            List b02;
            Object[] array;
            if (str != null) {
                if (!(str.length() == 0)) {
                    try {
                        b02 = ka.q.b0(str, new String[]{"."}, false, 0, 6, null);
                        array = b02.toArray(new String[0]);
                    } catch (UnsupportedEncodingException | JSONException unused) {
                    }
                    if (array != null) {
                        String[] strArr = (String[]) array;
                        if (strArr.length == 2) {
                            byte[] data = Base64.decode(strArr[1], 0);
                            kotlin.jvm.internal.l.d(data, "data");
                            String string = new JSONObject(new String(data, ka.d.f12805b)).getString("user_id");
                            kotlin.jvm.internal.l.d(string, "jsonObject.getString(\"user_id\")");
                            return string;
                        }
                        throw new p0.s("Failed to retrieve user_id from signed_request");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            throw new p0.s("Authorization response does not contain the signed_request");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public f0(Parcel source) {
        kotlin.jvm.internal.l.e(source, "source");
        f1.l0 l0Var = f1.l0.f8470a;
        Map<String, String> o02 = f1.l0.o0(source);
        this.f15129j = o02 == null ? null : t9.g0.o(o02);
    }

    public f0(u loginClient) {
        kotlin.jvm.internal.l.e(loginClient, "loginClient");
        s(loginClient);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str, Object obj) {
        if (this.f15129j == null) {
            this.f15129j = new HashMap();
        }
        Map<String, String> map = this.f15129j;
        if (map == null) {
            return;
        }
        map.put(str, obj == null ? null : obj.toString());
    }

    public void b() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String c(String authId) {
        kotlin.jvm.internal.l.e(authId, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", authId);
            jSONObject.put("3_method", f());
            q(jSONObject);
        } catch (JSONException e10) {
            Log.w("LoginMethodHandler", kotlin.jvm.internal.l.k("Error creating client state json: ", e10.getMessage()));
        }
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.l.d(jSONObject2, "param.toString()");
        return jSONObject2;
    }

    public final u d() {
        u uVar = this.f15130k;
        if (uVar != null) {
            return uVar;
        }
        kotlin.jvm.internal.l.p("loginClient");
        throw null;
    }

    public final Map<String, String> e() {
        return this.f15129j;
    }

    public abstract String f();

    /* JADX INFO: Access modifiers changed from: protected */
    public String j() {
        StringBuilder sb = new StringBuilder();
        sb.append("fb");
        p0.f0 f0Var = p0.f0.f14852a;
        sb.append(p0.f0.m());
        sb.append("://authorize/");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k(String str) {
        u.e z10 = d().z();
        String a10 = z10 == null ? null : z10.a();
        if (a10 == null) {
            p0.f0 f0Var = p0.f0.f14852a;
            a10 = p0.f0.m();
        }
        q0.c0 c0Var = new q0.c0(d().l(), a10);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", a10);
        c0Var.h("fb_dialogs_web_login_dialog_complete", null, bundle);
    }

    public boolean l() {
        return false;
    }

    public boolean m(int i10, int i11, Intent intent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Bundle p(u.e request, Bundle values) {
        p0.j0 a10;
        kotlin.jvm.internal.l.e(request, "request");
        kotlin.jvm.internal.l.e(values, "values");
        String string = values.getString("code");
        f1.l0 l0Var = f1.l0.f8470a;
        if (f1.l0.X(string)) {
            throw new p0.s("No code param found from the request");
        }
        if (string == null) {
            a10 = null;
        } else {
            m0 m0Var = m0.f15174a;
            String j10 = j();
            String f10 = request.f();
            if (f10 == null) {
                f10 = "";
            }
            a10 = m0.a(string, j10, f10);
        }
        if (a10 != null) {
            p0.o0 k10 = a10.k();
            p0.v b10 = k10.b();
            if (b10 == null) {
                try {
                    JSONObject c10 = k10.c();
                    String string2 = c10 != null ? c10.getString("access_token") : null;
                    if (c10 == null || f1.l0.X(string2)) {
                        throw new p0.s("No access token found from result");
                    }
                    values.putString("access_token", string2);
                    if (c10.has("id_token")) {
                        values.putString("id_token", c10.getString("id_token"));
                    }
                    return values;
                } catch (JSONException e10) {
                    throw new p0.s(kotlin.jvm.internal.l.k("Fail to process code exchange response: ", e10.getMessage()));
                }
            }
            throw new p0.h0(b10, b10.c());
        }
        throw new p0.s("Failed to create code exchange request");
    }

    public void q(JSONObject param) {
        kotlin.jvm.internal.l.e(param, "param");
    }

    public final void s(u uVar) {
        kotlin.jvm.internal.l.e(uVar, "<set-?>");
        this.f15130k = uVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.l.e(dest, "dest");
        f1.l0 l0Var = f1.l0.f8470a;
        f1.l0.C0(dest, this.f15129j);
    }

    public boolean x() {
        return false;
    }

    public abstract int z(u.e eVar);
}
