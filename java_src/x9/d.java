package x9;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public final class d<E extends Enum<E>> implements Serializable {

    /* renamed from: k  reason: collision with root package name */
    private static final a f20277k = new a(null);

    /* renamed from: j  reason: collision with root package name */
    private final Class<E> f20278j;

    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public d(E[] entries) {
        l.e(entries, "entries");
        Class<E> cls = (Class<E>) entries.getClass().getComponentType();
        l.b(cls);
        this.f20278j = cls;
    }

    private final Object readResolve() {
        E[] enumConstants = this.f20278j.getEnumConstants();
        l.d(enumConstants, "c.enumConstants");
        return b.a(enumConstants);
    }
}
