package s0;

import java.util.Arrays;
/* loaded from: classes.dex */
public enum a {
    MOBILE_APP_INSTALL,
    CUSTOM,
    OTHER;
    

    /* renamed from: j  reason: collision with root package name */
    public static final C0250a f16858j = new C0250a(null);

    /* renamed from: s0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0250a {
        private C0250a() {
        }

        public /* synthetic */ C0250a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final a a(String rawValue) {
            kotlin.jvm.internal.l.e(rawValue, "rawValue");
            return kotlin.jvm.internal.l.a(rawValue, "MOBILE_APP_INSTALL") ? a.MOBILE_APP_INSTALL : kotlin.jvm.internal.l.a(rawValue, "CUSTOM_APP_EVENTS") ? a.CUSTOM : a.OTHER;
        }
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        a[] valuesCustom = values();
        return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
