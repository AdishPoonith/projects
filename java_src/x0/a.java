package x0;

import f1.q;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.l;
import org.json.JSONObject;
import p0.f0;
import t9.x;
import z0.f;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f20076a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f20077b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f20078c;

    private a() {
    }

    public static final void a() {
        if (k1.a.d(a.class)) {
            return;
        }
        try {
            f20077b = true;
            q qVar = q.f8511a;
            f0 f0Var = f0.f14852a;
            f20078c = q.d("FBSDKFeatureIntegritySample", f0.m(), false);
        } catch (Throwable th) {
            k1.a.b(th, a.class);
        }
    }

    private final String b(String str) {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            f fVar = f.f20652a;
            String[] q10 = f.q(f.a.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
            if (q10 == null) {
                return "none";
            }
            String str2 = q10[0];
            return str2 == null ? "none" : str2;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    public static final void c(Map<String, String> parameters) {
        List<String> P;
        if (k1.a.d(a.class)) {
            return;
        }
        try {
            l.e(parameters, "parameters");
            if (f20077b && !parameters.isEmpty()) {
                try {
                    P = x.P(parameters.keySet());
                    JSONObject jSONObject = new JSONObject();
                    for (String str : P) {
                        String str2 = parameters.get(str);
                        if (str2 == null) {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                        String str3 = str2;
                        a aVar = f20076a;
                        if (aVar.d(str) || aVar.d(str3)) {
                            parameters.remove(str);
                            if (!f20078c) {
                                str3 = "";
                            }
                            jSONObject.put(str, str3);
                        }
                    }
                    if (jSONObject.length() == 0) {
                        return;
                    }
                    String jSONObject2 = jSONObject.toString();
                    l.d(jSONObject2, "restrictiveParamJson.toString()");
                    parameters.put("_onDeviceParams", jSONObject2);
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th) {
            k1.a.b(th, a.class);
        }
    }

    private final boolean d(String str) {
        if (k1.a.d(this)) {
            return false;
        }
        try {
            return !l.a("none", b(str));
        } catch (Throwable th) {
            k1.a.b(th, this);
            return false;
        }
    }
}
