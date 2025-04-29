package o3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import o3.n0;
/* loaded from: classes.dex */
public class n0 {

    /* renamed from: h  reason: collision with root package name */
    private static final Comparator<b> f14496h = new Comparator() { // from class: o3.m0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int g10;
            g10 = n0.g((n0.b) obj, (n0.b) obj2);
            return g10;
        }
    };

    /* renamed from: i  reason: collision with root package name */
    private static final Comparator<b> f14497i = new Comparator() { // from class: o3.l0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int h10;
            h10 = n0.h((n0.b) obj, (n0.b) obj2);
            return h10;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final int f14498a;

    /* renamed from: e  reason: collision with root package name */
    private int f14502e;

    /* renamed from: f  reason: collision with root package name */
    private int f14503f;

    /* renamed from: g  reason: collision with root package name */
    private int f14504g;

    /* renamed from: c  reason: collision with root package name */
    private final b[] f14500c = new b[5];

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<b> f14499b = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private int f14501d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f14505a;

        /* renamed from: b  reason: collision with root package name */
        public int f14506b;

        /* renamed from: c  reason: collision with root package name */
        public float f14507c;

        private b() {
        }
    }

    public n0(int i10) {
        this.f14498a = i10;
    }

    private void d() {
        if (this.f14501d != 1) {
            Collections.sort(this.f14499b, f14496h);
            this.f14501d = 1;
        }
    }

    private void e() {
        if (this.f14501d != 0) {
            Collections.sort(this.f14499b, f14497i);
            this.f14501d = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int g(b bVar, b bVar2) {
        return bVar.f14505a - bVar2.f14505a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int h(b bVar, b bVar2) {
        return Float.compare(bVar.f14507c, bVar2.f14507c);
    }

    public void c(int i10, float f10) {
        b bVar;
        int i11;
        b bVar2;
        int i12;
        d();
        int i13 = this.f14504g;
        if (i13 > 0) {
            b[] bVarArr = this.f14500c;
            int i14 = i13 - 1;
            this.f14504g = i14;
            bVar = bVarArr[i14];
        } else {
            bVar = new b();
        }
        int i15 = this.f14502e;
        this.f14502e = i15 + 1;
        bVar.f14505a = i15;
        bVar.f14506b = i10;
        bVar.f14507c = f10;
        this.f14499b.add(bVar);
        int i16 = this.f14503f + i10;
        while (true) {
            this.f14503f = i16;
            while (true) {
                int i17 = this.f14503f;
                int i18 = this.f14498a;
                if (i17 <= i18) {
                    return;
                }
                i11 = i17 - i18;
                bVar2 = this.f14499b.get(0);
                i12 = bVar2.f14506b;
                if (i12 <= i11) {
                    this.f14503f -= i12;
                    this.f14499b.remove(0);
                    int i19 = this.f14504g;
                    if (i19 < 5) {
                        b[] bVarArr2 = this.f14500c;
                        this.f14504g = i19 + 1;
                        bVarArr2[i19] = bVar2;
                    }
                }
            }
            bVar2.f14506b = i12 - i11;
            i16 = this.f14503f - i11;
        }
    }

    public float f(float f10) {
        e();
        float f11 = f10 * this.f14503f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f14499b.size(); i11++) {
            b bVar = this.f14499b.get(i11);
            i10 += bVar.f14506b;
            if (i10 >= f11) {
                return bVar.f14507c;
            }
        }
        if (this.f14499b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<b> arrayList = this.f14499b;
        return arrayList.get(arrayList.size() - 1).f14507c;
    }

    public void i() {
        this.f14499b.clear();
        this.f14501d = -1;
        this.f14502e = 0;
        this.f14503f = 0;
    }
}
