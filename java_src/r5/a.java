package r5;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16691b = a().a();

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f16692a;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private HashMap<String, String> f16693a = new HashMap<>();

        public a a() {
            if (this.f16693a != null) {
                a aVar = new a(Collections.unmodifiableMap(this.f16693a));
                this.f16693a = null;
                return aVar;
            }
            throw new IllegalStateException("cannot call build() twice");
        }
    }

    private a(Map<String, String> map) {
        this.f16692a = map;
    }

    public static b a() {
        return new b();
    }

    public Map<String, String> b() {
        return this.f16692a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f16692a.equals(((a) obj).f16692a);
        }
        return false;
    }

    public int hashCode() {
        return this.f16692a.hashCode();
    }

    public String toString() {
        return this.f16692a.toString();
    }
}
