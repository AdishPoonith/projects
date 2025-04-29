package w4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import k4.b;
/* loaded from: classes.dex */
public class d extends d4.a {

    /* renamed from: j  reason: collision with root package name */
    private final int f19861j;

    /* renamed from: k  reason: collision with root package name */
    private final a f19862k;

    /* renamed from: l  reason: collision with root package name */
    private final Float f19863l;

    /* renamed from: m  reason: collision with root package name */
    private static final String f19860m = d.class.getSimpleName();
    public static final Parcelable.Creator<d> CREATOR = new i0();

    /* JADX INFO: Access modifiers changed from: protected */
    public d(int i10) {
        this(i10, (a) null, (Float) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(int i10, IBinder iBinder, Float f10) {
        this(i10, iBinder == null ? null : new a(b.a.x(iBinder)), f10);
    }

    private d(int i10, a aVar, Float f10) {
        boolean z10;
        boolean z11 = f10 != null && f10.floatValue() > 0.0f;
        if (i10 == 3) {
            if (aVar == null || !z11) {
                i10 = 3;
                z10 = false;
                c4.s.b(z10, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i10), aVar, f10));
                this.f19861j = i10;
                this.f19862k = aVar;
                this.f19863l = f10;
            }
            i10 = 3;
        }
        z10 = true;
        c4.s.b(z10, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i10), aVar, f10));
        this.f19861j = i10;
        this.f19862k = aVar;
        this.f19863l = f10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(a aVar, float f10) {
        this(3, aVar, Float.valueOf(f10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final d B() {
        int i10 = this.f19861j;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        c4.s.m(this.f19862k != null, "bitmapDescriptor must not be null");
                        c4.s.m(this.f19863l != null, "bitmapRefWidth must not be null");
                        return new g(this.f19862k, this.f19863l.floatValue());
                    }
                    String str = f19860m;
                    Log.w(str, "Unknown Cap type: " + i10);
                    return this;
                }
                return new s();
            }
            return new u();
        }
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f19861j == dVar.f19861j && c4.q.b(this.f19862k, dVar.f19862k) && c4.q.b(this.f19863l, dVar.f19863l);
        }
        return false;
    }

    public int hashCode() {
        return c4.q.c(Integer.valueOf(this.f19861j), this.f19862k, this.f19863l);
    }

    public String toString() {
        int i10 = this.f19861j;
        return "[Cap: type=" + i10 + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.l(parcel, 2, this.f19861j);
        a aVar = this.f19862k;
        d4.c.k(parcel, 3, aVar == null ? null : aVar.a().asBinder(), false);
        d4.c.j(parcel, 4, this.f19863l, false);
        d4.c.b(parcel, a10);
    }
}
