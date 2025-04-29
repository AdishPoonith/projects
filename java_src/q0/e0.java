package q0;

import android.content.Context;
import android.os.Bundle;
import f1.l0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p0.j0;
import y0.h;
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: f  reason: collision with root package name */
    public static final a f15924f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    private static final String f15925g = e0.class.getSimpleName();

    /* renamed from: h  reason: collision with root package name */
    private static final int f15926h = 1000;

    /* renamed from: a  reason: collision with root package name */
    private final f1.a f15927a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15928b;

    /* renamed from: c  reason: collision with root package name */
    private List<d> f15929c;

    /* renamed from: d  reason: collision with root package name */
    private final List<d> f15930d;

    /* renamed from: e  reason: collision with root package name */
    private int f15931e;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public e0(f1.a attributionIdentifiers, String anonymousAppDeviceGUID) {
        kotlin.jvm.internal.l.e(attributionIdentifiers, "attributionIdentifiers");
        kotlin.jvm.internal.l.e(anonymousAppDeviceGUID, "anonymousAppDeviceGUID");
        this.f15927a = attributionIdentifiers;
        this.f15928b = anonymousAppDeviceGUID;
        this.f15929c = new ArrayList();
        this.f15930d = new ArrayList();
    }

    private final void f(j0 j0Var, Context context, int i10, JSONArray jSONArray, boolean z10) {
        JSONObject jSONObject;
        try {
            if (k1.a.d(this)) {
                return;
            }
            try {
                y0.h hVar = y0.h.f20315a;
                jSONObject = y0.h.a(h.a.CUSTOM_APP_EVENTS, this.f15927a, this.f15928b, z10, context);
                if (this.f15931e > 0) {
                    jSONObject.put("num_skipped_events", i10);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            j0Var.F(jSONObject);
            Bundle u10 = j0Var.u();
            String jSONArray2 = jSONArray.toString();
            kotlin.jvm.internal.l.d(jSONArray2, "events.toString()");
            u10.putString("custom_events", jSONArray2);
            j0Var.I(jSONArray2);
            j0Var.H(u10);
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public final synchronized void a(d event) {
        if (k1.a.d(this)) {
            return;
        }
        kotlin.jvm.internal.l.e(event, "event");
        if (this.f15929c.size() + this.f15930d.size() >= f15926h) {
            this.f15931e++;
        } else {
            this.f15929c.add(event);
        }
    }

    public final synchronized void b(boolean z10) {
        if (k1.a.d(this)) {
            return;
        }
        if (z10) {
            this.f15929c.addAll(this.f15930d);
        }
        this.f15930d.clear();
        this.f15931e = 0;
    }

    public final synchronized int c() {
        if (k1.a.d(this)) {
            return 0;
        }
        return this.f15929c.size();
    }

    public final synchronized List<d> d() {
        if (k1.a.d(this)) {
            return null;
        }
        List<d> list = this.f15929c;
        this.f15929c = new ArrayList();
        return list;
    }

    public final int e(j0 request, Context applicationContext, boolean z10, boolean z11) {
        if (k1.a.d(this)) {
            return 0;
        }
        try {
            kotlin.jvm.internal.l.e(request, "request");
            kotlin.jvm.internal.l.e(applicationContext, "applicationContext");
            synchronized (this) {
                int i10 = this.f15931e;
                v0.a aVar = v0.a.f19332a;
                v0.a.d(this.f15929c);
                this.f15930d.addAll(this.f15929c);
                this.f15929c.clear();
                JSONArray jSONArray = new JSONArray();
                for (d dVar : this.f15930d) {
                    if (!dVar.g()) {
                        l0 l0Var = l0.f8470a;
                        l0.e0(f15925g, kotlin.jvm.internal.l.k("Event with invalid checksum: ", dVar));
                    } else if (z10 || !dVar.h()) {
                        jSONArray.put(dVar.e());
                    }
                }
                if (jSONArray.length() == 0) {
                    return 0;
                }
                s9.u uVar = s9.u.f17878a;
                f(request, applicationContext, i10, jSONArray, z11);
                return jSONArray.length();
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
            return 0;
        }
    }
}
