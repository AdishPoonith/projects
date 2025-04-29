package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f1692e = new b(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f1693a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1694b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1695c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1696d;

    /* loaded from: classes.dex */
    static class a {
        static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    private b(int i10, int i11, int i12, int i13) {
        this.f1693a = i10;
        this.f1694b = i11;
        this.f1695c = i12;
        this.f1696d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f1693a, bVar2.f1693a), Math.max(bVar.f1694b, bVar2.f1694b), Math.max(bVar.f1695c, bVar2.f1695c), Math.max(bVar.f1696d, bVar2.f1696d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f1692e : new b(i10, i11, i12, i13);
    }

    public static b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.f1693a, this.f1694b, this.f1695c, this.f1696d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1696d == bVar.f1696d && this.f1693a == bVar.f1693a && this.f1695c == bVar.f1695c && this.f1694b == bVar.f1694b;
    }

    public int hashCode() {
        return (((((this.f1693a * 31) + this.f1694b) * 31) + this.f1695c) * 31) + this.f1696d;
    }

    public String toString() {
        return "Insets{left=" + this.f1693a + ", top=" + this.f1694b + ", right=" + this.f1695c + ", bottom=" + this.f1696d + '}';
    }
}
