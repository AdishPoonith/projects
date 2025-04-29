package f1;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public enum i0 {
    None(0),
    Enabled(1),
    RequireConfirm(2);
    

    /* renamed from: k  reason: collision with root package name */
    public static final a f8448k = new a(null);

    /* renamed from: l  reason: collision with root package name */
    private static final EnumSet<i0> f8449l;

    /* renamed from: j  reason: collision with root package name */
    private final long f8454j;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final EnumSet<i0> a(long j10) {
            EnumSet<i0> result = EnumSet.noneOf(i0.class);
            Iterator it = i0.f8449l.iterator();
            while (it.hasNext()) {
                i0 i0Var = (i0) it.next();
                if ((i0Var.h() & j10) != 0) {
                    result.add(i0Var);
                }
            }
            kotlin.jvm.internal.l.d(result, "result");
            return result;
        }
    }

    static {
        EnumSet<i0> allOf = EnumSet.allOf(i0.class);
        kotlin.jvm.internal.l.d(allOf, "allOf(SmartLoginOption::class.java)");
        f8449l = allOf;
    }

    i0(long j10) {
        this.f8454j = j10;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static i0[] valuesCustom() {
        i0[] valuesCustom = values();
        return (i0[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final long h() {
        return this.f8454j;
    }
}
