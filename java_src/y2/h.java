package y2;

import p3.n0;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f20422a;

    /* renamed from: b  reason: collision with root package name */
    public final String f20423b;

    /* renamed from: c  reason: collision with root package name */
    public final String f20424c;

    /* renamed from: d  reason: collision with root package name */
    public final String f20425d;

    /* renamed from: e  reason: collision with root package name */
    public final String f20426e;

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f20422a = str;
        this.f20423b = str2;
        this.f20424c = str3;
        this.f20425d = str4;
        this.f20426e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return n0.c(this.f20422a, hVar.f20422a) && n0.c(this.f20423b, hVar.f20423b) && n0.c(this.f20424c, hVar.f20424c) && n0.c(this.f20425d, hVar.f20425d) && n0.c(this.f20426e, hVar.f20426e);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f20422a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f20423b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f20424c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f20425d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f20426e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
