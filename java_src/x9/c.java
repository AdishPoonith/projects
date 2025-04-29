package x9;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.l;
import t9.k;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c<T extends Enum<T>> extends t9.c<T> implements a<T>, Serializable {

    /* renamed from: k  reason: collision with root package name */
    private final T[] f20276k;

    public c(T[] entries) {
        l.e(entries, "entries");
        this.f20276k = entries;
    }

    private final Object writeReplace() {
        return new d(this.f20276k);
    }

    @Override // t9.a
    public int b() {
        return this.f20276k.length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t9.a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return e((Enum) obj);
        }
        return false;
    }

    public boolean e(T element) {
        Object q10;
        l.e(element, "element");
        q10 = k.q(this.f20276k, element.ordinal());
        return ((Enum) q10) == element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t9.c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return l((Enum) obj);
        }
        return -1;
    }

    @Override // t9.c, java.util.List
    /* renamed from: k */
    public T get(int i10) {
        t9.c.f18370j.a(i10, this.f20276k.length);
        return this.f20276k[i10];
    }

    public int l(T element) {
        Object q10;
        l.e(element, "element");
        int ordinal = element.ordinal();
        q10 = k.q(this.f20276k, ordinal);
        if (((Enum) q10) == element) {
            return ordinal;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t9.c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return m((Enum) obj);
        }
        return -1;
    }

    public int m(T element) {
        l.e(element, "element");
        return indexOf(element);
    }
}
