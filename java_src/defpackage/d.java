package defpackage;

import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import t9.o;
/* renamed from: d  reason: default package */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f7549b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f7550a;

    /* renamed from: d$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final d a(List<? extends Object> list) {
            l.e(list, "list");
            return new d((Boolean) list.get(0));
        }
    }

    public d() {
        this(null, 1, null);
    }

    public d(Boolean bool) {
        this.f7550a = bool;
    }

    public /* synthetic */ d(Boolean bool, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : bool);
    }

    public final Boolean a() {
        return this.f7550a;
    }

    public final List<Object> b() {
        List<Object> b10;
        b10 = o.b(this.f7550a);
        return b10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && l.a(this.f7550a, ((d) obj).f7550a);
    }

    public int hashCode() {
        Boolean bool = this.f7550a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        return "ToggleMessage(enable=" + this.f7550a + ')';
    }
}
