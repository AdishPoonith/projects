package u2;
/* loaded from: classes.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    public final Object f18969a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18970b;

    /* renamed from: c  reason: collision with root package name */
    public final int f18971c;

    /* renamed from: d  reason: collision with root package name */
    public final long f18972d;

    /* renamed from: e  reason: collision with root package name */
    public final int f18973e;

    public s(Object obj) {
        this(obj, -1L);
    }

    public s(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    private s(Object obj, int i10, int i11, long j10, int i12) {
        this.f18969a = obj;
        this.f18970b = i10;
        this.f18971c = i11;
        this.f18972d = j10;
        this.f18973e = i12;
    }

    public s(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public s(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public s(s sVar) {
        this.f18969a = sVar.f18969a;
        this.f18970b = sVar.f18970b;
        this.f18971c = sVar.f18971c;
        this.f18972d = sVar.f18972d;
        this.f18973e = sVar.f18973e;
    }

    public s a(Object obj) {
        return this.f18969a.equals(obj) ? this : new s(obj, this.f18970b, this.f18971c, this.f18972d, this.f18973e);
    }

    public boolean b() {
        return this.f18970b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return this.f18969a.equals(sVar.f18969a) && this.f18970b == sVar.f18970b && this.f18971c == sVar.f18971c && this.f18972d == sVar.f18972d && this.f18973e == sVar.f18973e;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f18969a.hashCode()) * 31) + this.f18970b) * 31) + this.f18971c) * 31) + ((int) this.f18972d)) * 31) + this.f18973e;
    }
}
