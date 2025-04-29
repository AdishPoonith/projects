package defpackage;

import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import t9.o;
/* renamed from: b  reason: default package */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f2847b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f2848a;

    /* renamed from: b$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final b a(List<? extends Object> list) {
            l.e(list, "list");
            return new b((Boolean) list.get(0));
        }
    }

    public b() {
        this(null, 1, null);
    }

    public b(Boolean bool) {
        this.f2848a = bool;
    }

    public /* synthetic */ b(Boolean bool, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : bool);
    }

    public final List<Object> a() {
        List<Object> b10;
        b10 = o.b(this.f2848a);
        return b10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && l.a(this.f2848a, ((b) obj).f2848a);
    }

    public int hashCode() {
        Boolean bool = this.f2848a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        return "IsEnabledMessage(enabled=" + this.f2848a + ')';
    }
}
