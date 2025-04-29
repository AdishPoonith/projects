package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;
/* loaded from: classes.dex */
final class k implements j {

    /* renamed from: a  reason: collision with root package name */
    private final LocaleList f1772a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Object obj) {
        this.f1772a = (LocaleList) obj;
    }

    @Override // androidx.core.os.j
    public Object a() {
        return this.f1772a;
    }

    public boolean equals(Object obj) {
        return this.f1772a.equals(((j) obj).a());
    }

    @Override // androidx.core.os.j
    public Locale get(int i10) {
        return this.f1772a.get(i10);
    }

    public int hashCode() {
        return this.f1772a.hashCode();
    }

    public String toString() {
        return this.f1772a.toString();
    }
}
