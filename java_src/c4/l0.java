package c4;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    private final SparseIntArray f3340a = new SparseIntArray();

    /* renamed from: b  reason: collision with root package name */
    private b4.f f3341b;

    public l0(b4.f fVar) {
        s.j(fVar);
        this.f3341b = fVar;
    }

    public final int a(Context context, int i10) {
        return this.f3340a.get(i10, -1);
    }

    public final int b(Context context, a.f fVar) {
        s.j(context);
        s.j(fVar);
        int i10 = 0;
        if (fVar.g()) {
            int h10 = fVar.h();
            int a10 = a(context, h10);
            if (a10 == -1) {
                int i11 = 0;
                while (true) {
                    if (i11 >= this.f3340a.size()) {
                        i10 = -1;
                        break;
                    }
                    int keyAt = this.f3340a.keyAt(i11);
                    if (keyAt > h10 && this.f3340a.get(keyAt) == 0) {
                        break;
                    }
                    i11++;
                }
                a10 = i10 == -1 ? this.f3341b.g(context, h10) : i10;
                this.f3340a.put(h10, a10);
            }
            return a10;
        }
        return 0;
    }

    public final void c() {
        this.f3340a.clear();
    }
}
