package ha;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;
import t9.m;
/* loaded from: classes.dex */
public final class b extends m {

    /* renamed from: j  reason: collision with root package name */
    private final int f9548j;

    /* renamed from: k  reason: collision with root package name */
    private final int f9549k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f9550l;

    /* renamed from: m  reason: collision with root package name */
    private int f9551m;

    public b(char c10, char c11, int i10) {
        this.f9548j = i10;
        this.f9549k = c11;
        boolean z10 = true;
        if (i10 <= 0 ? l.f(c10, c11) < 0 : l.f(c10, c11) > 0) {
            z10 = false;
        }
        this.f9550l = z10;
        this.f9551m = z10 ? c10 : c11;
    }

    @Override // t9.m
    public char a() {
        int i10 = this.f9551m;
        if (i10 != this.f9549k) {
            this.f9551m = this.f9548j + i10;
        } else if (!this.f9550l) {
            throw new NoSuchElementException();
        } else {
            this.f9550l = false;
        }
        return (char) i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f9550l;
    }
}
