package androidx.media;

import java.util.Arrays;
/* loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    int f2605a = 0;

    /* renamed from: b  reason: collision with root package name */
    int f2606b = 0;

    /* renamed from: c  reason: collision with root package name */
    int f2607c = 0;

    /* renamed from: d  reason: collision with root package name */
    int f2608d = -1;

    public int a() {
        return this.f2606b;
    }

    public int b() {
        int i10 = this.f2607c;
        int c10 = c();
        if (c10 == 6) {
            i10 |= 4;
        } else if (c10 == 7) {
            i10 |= 1;
        }
        return i10 & 273;
    }

    public int c() {
        int i10 = this.f2608d;
        return i10 != -1 ? i10 : AudioAttributesCompat.a(false, this.f2607c, this.f2605a);
    }

    public int d() {
        return this.f2605a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplBase) {
            AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
            return this.f2606b == audioAttributesImplBase.a() && this.f2607c == audioAttributesImplBase.b() && this.f2605a == audioAttributesImplBase.d() && this.f2608d == audioAttributesImplBase.f2608d;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2606b), Integer.valueOf(this.f2607c), Integer.valueOf(this.f2605a), Integer.valueOf(this.f2608d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f2608d != -1) {
            sb.append(" stream=");
            sb.append(this.f2608d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.b(this.f2605a));
        sb.append(" content=");
        sb.append(this.f2606b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f2607c).toUpperCase());
        return sb.toString();
    }
}
