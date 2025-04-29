package u1;
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final int f18744a;

    /* renamed from: b  reason: collision with root package name */
    public final float f18745b;

    public y(int i10, float f10) {
        this.f18744a = i10;
        this.f18745b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return this.f18744a == yVar.f18744a && Float.compare(yVar.f18745b, this.f18745b) == 0;
    }

    public int hashCode() {
        return ((527 + this.f18744a) * 31) + Float.floatToIntBits(this.f18745b);
    }
}
