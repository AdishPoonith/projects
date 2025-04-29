package k6;

import com.google.auto.value.AutoValue;
import m6.l;
import q6.g0;
@AutoValue
/* loaded from: classes.dex */
public abstract class e implements Comparable<e> {
    public static e g(int i10, l lVar, byte[] bArr, byte[] bArr2) {
        return new a(i10, lVar, bArr, bArr2);
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(e eVar) {
        int compare = Integer.compare(l(), eVar.l());
        if (compare != 0) {
            return compare;
        }
        int compareTo = k().compareTo(eVar.k());
        if (compareTo != 0) {
            return compareTo;
        }
        int i10 = g0.i(h(), eVar.h());
        return i10 != 0 ? i10 : g0.i(i(), eVar.i());
    }

    public abstract byte[] h();

    public abstract byte[] i();

    public abstract l k();

    public abstract int l();
}
