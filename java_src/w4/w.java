package w4;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
/* loaded from: classes.dex */
public final class w extends d4.a {
    public static final Parcelable.Creator<w> CREATOR = new s0();

    /* renamed from: j  reason: collision with root package name */
    private final float f19927j;

    /* renamed from: k  reason: collision with root package name */
    private final int f19928k;

    /* renamed from: l  reason: collision with root package name */
    private final int f19929l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f19930m;

    /* renamed from: n  reason: collision with root package name */
    private final v f19931n;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private float f19932a;

        /* renamed from: b  reason: collision with root package name */
        private int f19933b;

        /* renamed from: c  reason: collision with root package name */
        private int f19934c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f19935d;

        /* renamed from: e  reason: collision with root package name */
        private v f19936e;

        public a(w wVar) {
            this.f19932a = wVar.D();
            Pair E = wVar.E();
            this.f19933b = ((Integer) E.first).intValue();
            this.f19934c = ((Integer) E.second).intValue();
            this.f19935d = wVar.C();
            this.f19936e = wVar.B();
        }

        public w a() {
            return new w(this.f19932a, this.f19933b, this.f19934c, this.f19935d, this.f19936e);
        }

        public final a b(boolean z10) {
            this.f19935d = z10;
            return this;
        }

        public final a c(float f10) {
            this.f19932a = f10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(float f10, int i10, int i11, boolean z10, v vVar) {
        this.f19927j = f10;
        this.f19928k = i10;
        this.f19929l = i11;
        this.f19930m = z10;
        this.f19931n = vVar;
    }

    public v B() {
        return this.f19931n;
    }

    public boolean C() {
        return this.f19930m;
    }

    public final float D() {
        return this.f19927j;
    }

    public final Pair E() {
        return new Pair(Integer.valueOf(this.f19928k), Integer.valueOf(this.f19929l));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.i(parcel, 2, this.f19927j);
        d4.c.l(parcel, 3, this.f19928k);
        d4.c.l(parcel, 4, this.f19929l);
        d4.c.c(parcel, 5, C());
        d4.c.r(parcel, 6, B(), i10, false);
        d4.c.b(parcel, a10);
    }
}
