package q4;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class z extends d4.a {
    public static final Parcelable.Creator<z> CREATOR = new u0();

    /* renamed from: j  reason: collision with root package name */
    private final int f16223j;

    /* renamed from: k  reason: collision with root package name */
    private final int f16224k;

    /* renamed from: l  reason: collision with root package name */
    private final String f16225l;

    /* renamed from: m  reason: collision with root package name */
    private final String f16226m;

    /* renamed from: n  reason: collision with root package name */
    private final int f16227n;

    /* renamed from: o  reason: collision with root package name */
    private final String f16228o;

    /* renamed from: p  reason: collision with root package name */
    private final z f16229p;

    /* renamed from: q  reason: collision with root package name */
    private final List f16230q;

    static {
        Process.myUid();
        Process.myPid();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(int i10, int i11, String str, String str2, String str3, int i12, List list, z zVar) {
        this.f16223j = i10;
        this.f16224k = i11;
        this.f16225l = str;
        this.f16226m = str2;
        this.f16228o = str3;
        this.f16227n = i12;
        this.f16230q = q0.t(list);
        this.f16229p = zVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f16223j == zVar.f16223j && this.f16224k == zVar.f16224k && this.f16227n == zVar.f16227n && this.f16225l.equals(zVar.f16225l) && j0.a(this.f16226m, zVar.f16226m) && j0.a(this.f16228o, zVar.f16228o) && j0.a(this.f16229p, zVar.f16229p) && this.f16230q.equals(zVar.f16230q)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16223j), this.f16225l, this.f16226m, this.f16228o});
    }

    public final String toString() {
        int length = this.f16225l.length() + 18;
        String str = this.f16226m;
        if (str != null) {
            length += str.length();
        }
        StringBuilder sb = new StringBuilder(length);
        sb.append(this.f16223j);
        sb.append("/");
        sb.append(this.f16225l);
        if (this.f16226m != null) {
            sb.append("[");
            if (this.f16226m.startsWith(this.f16225l)) {
                sb.append((CharSequence) this.f16226m, this.f16225l.length(), this.f16226m.length());
            } else {
                sb.append(this.f16226m);
            }
            sb.append("]");
        }
        if (this.f16228o != null) {
            sb.append("/");
            sb.append(Integer.toHexString(this.f16228o.hashCode()));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.l(parcel, 1, this.f16223j);
        d4.c.l(parcel, 2, this.f16224k);
        d4.c.s(parcel, 3, this.f16225l, false);
        d4.c.s(parcel, 4, this.f16226m, false);
        d4.c.l(parcel, 5, this.f16227n);
        d4.c.s(parcel, 6, this.f16228o, false);
        d4.c.r(parcel, 7, this.f16229p, i10, false);
        d4.c.v(parcel, 8, this.f16230q, false);
        d4.c.b(parcel, a10);
    }
}
