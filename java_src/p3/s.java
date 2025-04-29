package p3;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private int f15434a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f15435b;

    public s() {
        this(32);
    }

    public s(int i10) {
        this.f15435b = new long[i10];
    }

    public void a(long j10) {
        int i10 = this.f15434a;
        long[] jArr = this.f15435b;
        if (i10 == jArr.length) {
            this.f15435b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f15435b;
        int i11 = this.f15434a;
        this.f15434a = i11 + 1;
        jArr2[i11] = j10;
    }

    public long b(int i10) {
        if (i10 < 0 || i10 >= this.f15434a) {
            throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f15434a);
        }
        return this.f15435b[i10];
    }

    public int c() {
        return this.f15434a;
    }

    public long[] d() {
        return Arrays.copyOf(this.f15435b, this.f15434a);
    }
}
