package i6;

import m6.w;
/* loaded from: classes.dex */
public class e implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f9731a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9732b;

    /* renamed from: c  reason: collision with root package name */
    private final w f9733c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9734d;

    /* renamed from: e  reason: collision with root package name */
    private final long f9735e;

    public e(String str, int i10, w wVar, int i11, long j10) {
        this.f9731a = str;
        this.f9732b = i10;
        this.f9733c = wVar;
        this.f9734d = i11;
        this.f9735e = j10;
    }

    public String a() {
        return this.f9731a;
    }

    public w b() {
        return this.f9733c;
    }

    public int c() {
        return this.f9732b;
    }

    public long d() {
        return this.f9735e;
    }

    public int e() {
        return this.f9734d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f9732b == eVar.f9732b && this.f9734d == eVar.f9734d && this.f9735e == eVar.f9735e && this.f9731a.equals(eVar.f9731a)) {
            return this.f9733c.equals(eVar.f9733c);
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f9735e;
        return (((((((this.f9731a.hashCode() * 31) + this.f9732b) * 31) + this.f9734d) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f9733c.hashCode();
    }
}
