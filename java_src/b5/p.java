package b5;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class p {

    /* loaded from: classes.dex */
    private static class b<T> implements o<T>, Serializable {

        /* renamed from: j  reason: collision with root package name */
        private final List<? extends o<? super T>> f2965j;

        private b(List<? extends o<? super T>> list) {
            this.f2965j = list;
        }

        @Override // b5.o
        public boolean apply(T t10) {
            for (int i10 = 0; i10 < this.f2965j.size(); i10++) {
                if (!this.f2965j.get(i10).apply(t10)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f2965j.equals(((b) obj).f2965j);
            }
            return false;
        }

        public int hashCode() {
            return this.f2965j.hashCode() + 306654252;
        }

        public String toString() {
            return p.d("and", this.f2965j);
        }
    }

    public static <T> o<T> b(o<? super T> oVar, o<? super T> oVar2) {
        return new b(c((o) n.n(oVar), (o) n.n(oVar2)));
    }

    private static <T> List<o<? super T>> c(o<? super T> oVar, o<? super T> oVar2) {
        return Arrays.asList(oVar, oVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, Iterable<?> iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z10 = true;
        for (Object obj : iterable) {
            if (!z10) {
                sb.append(',');
            }
            sb.append(obj);
            z10 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
