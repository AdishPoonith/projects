package a1;

import a1.e;
import android.os.Bundle;
import f1.l0;
import f1.r;
import f1.v;
import java.util.List;
import kotlin.jvm.internal.l;
import org.json.JSONArray;
import t9.x;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f24a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final String f25b = e.class.getSimpleName();

    private d() {
    }

    public static final Bundle a(e.a eventType, String applicationId, List<q0.d> appEvents) {
        if (k1.a.d(d.class)) {
            return null;
        }
        try {
            l.e(eventType, "eventType");
            l.e(applicationId, "applicationId");
            l.e(appEvents, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString("event", eventType.toString());
            bundle.putString("app_id", applicationId);
            if (e.a.CUSTOM_APP_EVENTS == eventType) {
                JSONArray b10 = f24a.b(appEvents, applicationId);
                if (b10.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", b10.toString());
            }
            return bundle;
        } catch (Throwable th) {
            k1.a.b(th, d.class);
            return null;
        }
    }

    private final JSONArray b(List<q0.d> list, String str) {
        List<q0.d> R;
        if (k1.a.d(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            R = x.R(list);
            v0.a aVar = v0.a.f19332a;
            v0.a.d(R);
            boolean c10 = c(str);
            for (q0.d dVar : R) {
                if (!dVar.g()) {
                    l0 l0Var = l0.f8470a;
                    l0.e0(f25b, l.k("Event with invalid checksum: ", dVar));
                } else if ((!dVar.h()) || (dVar.h() && c10)) {
                    jSONArray.put(dVar.e());
                }
            }
            return jSONArray;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    private final boolean c(String str) {
        if (k1.a.d(this)) {
            return false;
        }
        try {
            v vVar = v.f8582a;
            r n10 = v.n(str, false);
            if (n10 != null) {
                return n10.l();
            }
            return false;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return false;
        }
    }
}
