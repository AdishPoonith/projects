package b5;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final String f2954a;

    private g(String str) {
        this.f2954a = (String) n.n(str);
    }

    public static g f(char c10) {
        return new g(String.valueOf(c10));
    }

    public <A extends Appendable> A a(A a10, Iterator<? extends Object> it) {
        n.n(a10);
        if (it.hasNext()) {
            while (true) {
                a10.append(g(it.next()));
                if (!it.hasNext()) {
                    break;
                }
                a10.append(this.f2954a);
            }
        }
        return a10;
    }

    public final StringBuilder b(StringBuilder sb, Iterable<? extends Object> iterable) {
        return c(sb, iterable.iterator());
    }

    public final StringBuilder c(StringBuilder sb, Iterator<? extends Object> it) {
        try {
            a(sb, it);
            return sb;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final String d(Iterable<? extends Object> iterable) {
        return e(iterable.iterator());
    }

    public final String e(Iterator<? extends Object> it) {
        return c(new StringBuilder(), it).toString();
    }

    CharSequence g(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
