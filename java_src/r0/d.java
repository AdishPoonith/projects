package r0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import ka.q;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final a f16622d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    private static final Set<d> f16623e = new CopyOnWriteArraySet();

    /* renamed from: a  reason: collision with root package name */
    private final String f16624a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16625b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f16626c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        private final void a(JSONObject jSONObject) {
            List b02;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(key);
                if (optJSONObject != null) {
                    String k10 = optJSONObject.optString("k");
                    String v10 = optJSONObject.optString("v");
                    l.d(k10, "k");
                    if (!(k10.length() == 0)) {
                        Set a10 = d.a();
                        l.d(key, "key");
                        b02 = q.b0(k10, new String[]{","}, false, 0, 6, null);
                        l.d(v10, "v");
                        a10.add(new d(key, b02, v10, null));
                    }
                }
            }
        }

        public final Set<String> b() {
            HashSet hashSet = new HashSet();
            for (d dVar : d.a()) {
                hashSet.add(dVar.c());
            }
            return hashSet;
        }

        public final Set<d> c() {
            return new HashSet(d.a());
        }

        public final void d(String rulesFromServer) {
            l.e(rulesFromServer, "rulesFromServer");
            try {
                d.a().clear();
                a(new JSONObject(rulesFromServer));
            } catch (JSONException unused) {
            }
        }
    }

    private d(String str, List<String> list, String str2) {
        this.f16624a = str;
        this.f16625b = str2;
        this.f16626c = list;
    }

    public /* synthetic */ d(String str, List list, String str2, g gVar) {
        this(str, list, str2);
    }

    public static final /* synthetic */ Set a() {
        if (k1.a.d(d.class)) {
            return null;
        }
        try {
            return f16623e;
        } catch (Throwable th) {
            k1.a.b(th, d.class);
            return null;
        }
    }

    public final List<String> b() {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            return new ArrayList(this.f16626c);
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    public final String c() {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            return this.f16624a;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    public final String d() {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            return this.f16625b;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }
}
