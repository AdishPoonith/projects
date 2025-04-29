package ha;

import java.util.NoSuchElementException;
import t9.c0;
/* loaded from: classes.dex */
public final class e extends c0 {

    /* renamed from: j  reason: collision with root package name */
    private final int f9558j;

    /* renamed from: k  reason: collision with root package name */
    private final int f9559k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f9560l;

    /* renamed from: m  reason: collision with root package name */
    private int f9561m;

    public e(int i10, int i11, int i12) {
        this.f9558j = i12;
        this.f9559k = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f9560l = z10;
        this.f9561m = z10 ? i10 : i11;
    }

    @Override // t9.c0
    public int a() {
        int i10 = this.f9561m;
        if (i10 != this.f9559k) {
            this.f9561m = this.f9558j + i10;
        } else if (!this.f9560l) {
            throw new NoSuchElementException();
        } else {
            this.f9560l = false;
        }
        return i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f9560l;
    }
}
