package j2;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
final class k {

    /* renamed from: a  reason: collision with root package name */
    private int f12018a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f12019b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f12020c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int[] f12021d;

    /* renamed from: e  reason: collision with root package name */
    private int f12022e;

    public k() {
        int[] iArr = new int[16];
        this.f12021d = iArr;
        this.f12022e = iArr.length - 1;
    }

    private void c() {
        int[] iArr = this.f12021d;
        int length = iArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i10 = this.f12018a;
        int i11 = length2 - i10;
        System.arraycopy(iArr, i10, iArr2, 0, i11);
        System.arraycopy(this.f12021d, 0, iArr2, i11, i10);
        this.f12018a = 0;
        this.f12019b = this.f12020c - 1;
        this.f12021d = iArr2;
        this.f12022e = iArr2.length - 1;
    }

    public void a(int i10) {
        if (this.f12020c == this.f12021d.length) {
            c();
        }
        int i11 = (this.f12019b + 1) & this.f12022e;
        this.f12019b = i11;
        this.f12021d[i11] = i10;
        this.f12020c++;
    }

    public void b() {
        this.f12018a = 0;
        this.f12019b = -1;
        this.f12020c = 0;
    }

    public boolean d() {
        return this.f12020c == 0;
    }

    public int e() {
        int i10 = this.f12020c;
        if (i10 != 0) {
            int[] iArr = this.f12021d;
            int i11 = this.f12018a;
            int i12 = iArr[i11];
            this.f12018a = (i11 + 1) & this.f12022e;
            this.f12020c = i10 - 1;
            return i12;
        }
        throw new NoSuchElementException();
    }
}
