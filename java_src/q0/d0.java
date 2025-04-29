package q0;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class d0 implements Serializable {

    /* renamed from: k  reason: collision with root package name */
    public static final a f15919k = new a(null);

    /* renamed from: j  reason: collision with root package name */
    private final HashMap<q0.a, List<d>> f15920j;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Serializable {

        /* renamed from: k  reason: collision with root package name */
        public static final a f15921k = new a(null);

        /* renamed from: j  reason: collision with root package name */
        private final HashMap<q0.a, List<d>> f15922j;

        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public b(HashMap<q0.a, List<d>> proxyEvents) {
            kotlin.jvm.internal.l.e(proxyEvents, "proxyEvents");
            this.f15922j = proxyEvents;
        }

        private final Object readResolve() {
            return new d0(this.f15922j);
        }
    }

    public d0() {
        this.f15920j = new HashMap<>();
    }

    public d0(HashMap<q0.a, List<d>> appEventMap) {
        kotlin.jvm.internal.l.e(appEventMap, "appEventMap");
        HashMap<q0.a, List<d>> hashMap = new HashMap<>();
        this.f15920j = hashMap;
        hashMap.putAll(appEventMap);
    }

    private final Object writeReplace() {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            return new b(this.f15920j);
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    public final void a(q0.a accessTokenAppIdPair, List<d> appEvents) {
        List<d> R;
        if (k1.a.d(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(accessTokenAppIdPair, "accessTokenAppIdPair");
            kotlin.jvm.internal.l.e(appEvents, "appEvents");
            if (!this.f15920j.containsKey(accessTokenAppIdPair)) {
                HashMap<q0.a, List<d>> hashMap = this.f15920j;
                R = t9.x.R(appEvents);
                hashMap.put(accessTokenAppIdPair, R);
                return;
            }
            List<d> list = this.f15920j.get(accessTokenAppIdPair);
            if (list == null) {
                return;
            }
            list.addAll(appEvents);
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public final Set<Map.Entry<q0.a, List<d>>> b() {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            Set<Map.Entry<q0.a, List<d>>> entrySet = this.f15920j.entrySet();
            kotlin.jvm.internal.l.d(entrySet, "events.entries");
            return entrySet;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }
}
