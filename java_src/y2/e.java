package y2;

import p3.n0;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f20409a;

    /* renamed from: b  reason: collision with root package name */
    public final String f20410b;

    /* renamed from: c  reason: collision with root package name */
    public final String f20411c;

    public e(String str, String str2, String str3) {
        this.f20409a = str;
        this.f20410b = str2;
        this.f20411c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return n0.c(this.f20409a, eVar.f20409a) && n0.c(this.f20410b, eVar.f20410b) && n0.c(this.f20411c, eVar.f20411c);
    }

    public int hashCode() {
        int hashCode = this.f20409a.hashCode() * 31;
        String str = this.f20410b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f20411c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
