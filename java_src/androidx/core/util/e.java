package androidx.core.util;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final float f1821a;

    /* renamed from: b  reason: collision with root package name */
    private final float f1822b;

    public e(float f10, float f11) {
        this.f1821a = d.a(f10, "width");
        this.f1822b = d.a(f11, "height");
    }

    public float a() {
        return this.f1822b;
    }

    public float b() {
        return this.f1821a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return eVar.f1821a == this.f1821a && eVar.f1822b == this.f1822b;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f1821a) ^ Float.floatToIntBits(this.f1822b);
    }

    public String toString() {
        return this.f1821a + "x" + this.f1822b;
    }
}
