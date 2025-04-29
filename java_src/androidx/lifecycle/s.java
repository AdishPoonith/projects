package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import t9.g0;
/* loaded from: classes.dex */
public final class s {

    /* renamed from: f  reason: collision with root package name */
    public static final a f2554f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    private static final Class<? extends Object>[] f2555g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f2556a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, a.c> f2557b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Object> f2558c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, oa.f<Object>> f2559d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    private final a.c f2560e = new a.c() { // from class: androidx.lifecycle.r
        @Override // androidx.savedstate.a.c
        public final Bundle a() {
            Bundle d10;
            d10 = s.d(s.this);
            return d10;
        }
    };

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final boolean a(Object obj) {
            Class[] clsArr;
            if (obj == null) {
                return true;
            }
            for (Class cls : s.f2555g) {
                kotlin.jvm.internal.l.b(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(s this$0) {
        Map m10;
        kotlin.jvm.internal.l.e(this$0, "this$0");
        m10 = g0.m(this$0.f2557b);
        for (Map.Entry entry : m10.entrySet()) {
            this$0.e((String) entry.getKey(), ((a.c) entry.getValue()).a());
        }
        Set<String> keySet = this$0.f2556a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(this$0.f2556a.get(str));
        }
        return androidx.core.os.d.a(s9.q.a("keys", arrayList), s9.q.a("values", arrayList2));
    }

    public final a.c c() {
        return this.f2560e;
    }

    public final <T> void e(String key, T t10) {
        kotlin.jvm.internal.l.e(key, "key");
        if (!f2554f.a(t10)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            kotlin.jvm.internal.l.b(t10);
            sb.append(t10.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj = this.f2558c.get(key);
        n nVar = obj instanceof n ? (n) obj : null;
        if (nVar != null) {
            nVar.n(t10);
        } else {
            this.f2556a.put(key, t10);
        }
        oa.f<Object> fVar = this.f2559d.get(key);
        if (fVar == null) {
            return;
        }
        fVar.setValue(t10);
    }
}
