package m9;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final okio.f f13890d = okio.f.i(":status");

    /* renamed from: e  reason: collision with root package name */
    public static final okio.f f13891e = okio.f.i(":method");

    /* renamed from: f  reason: collision with root package name */
    public static final okio.f f13892f = okio.f.i(":path");

    /* renamed from: g  reason: collision with root package name */
    public static final okio.f f13893g = okio.f.i(":scheme");

    /* renamed from: h  reason: collision with root package name */
    public static final okio.f f13894h = okio.f.i(":authority");

    /* renamed from: i  reason: collision with root package name */
    public static final okio.f f13895i = okio.f.i(":host");

    /* renamed from: j  reason: collision with root package name */
    public static final okio.f f13896j = okio.f.i(":version");

    /* renamed from: a  reason: collision with root package name */
    public final okio.f f13897a;

    /* renamed from: b  reason: collision with root package name */
    public final okio.f f13898b;

    /* renamed from: c  reason: collision with root package name */
    final int f13899c;

    public d(String str, String str2) {
        this(okio.f.i(str), okio.f.i(str2));
    }

    public d(okio.f fVar, String str) {
        this(fVar, okio.f.i(str));
    }

    public d(okio.f fVar, okio.f fVar2) {
        this.f13897a = fVar;
        this.f13898b = fVar2;
        this.f13899c = fVar.r() + 32 + fVar2.r();
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f13897a.equals(dVar.f13897a) && this.f13898b.equals(dVar.f13898b);
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f13897a.hashCode()) * 31) + this.f13898b.hashCode();
    }

    public String toString() {
        return String.format("%s: %s", this.f13897a.w(), this.f13898b.w());
    }
}
