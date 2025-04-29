package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* renamed from: j  reason: collision with root package name */
    final String f2362j;

    /* renamed from: k  reason: collision with root package name */
    final String f2363k;

    /* renamed from: l  reason: collision with root package name */
    final boolean f2364l;

    /* renamed from: m  reason: collision with root package name */
    final int f2365m;

    /* renamed from: n  reason: collision with root package name */
    final int f2366n;

    /* renamed from: o  reason: collision with root package name */
    final String f2367o;

    /* renamed from: p  reason: collision with root package name */
    final boolean f2368p;

    /* renamed from: q  reason: collision with root package name */
    final boolean f2369q;

    /* renamed from: r  reason: collision with root package name */
    final boolean f2370r;

    /* renamed from: s  reason: collision with root package name */
    final Bundle f2371s;

    /* renamed from: t  reason: collision with root package name */
    final boolean f2372t;

    /* renamed from: u  reason: collision with root package name */
    final int f2373u;

    /* renamed from: v  reason: collision with root package name */
    Bundle f2374v;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<t> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public t createFromParcel(Parcel parcel) {
            return new t(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public t[] newArray(int i10) {
            return new t[i10];
        }
    }

    t(Parcel parcel) {
        this.f2362j = parcel.readString();
        this.f2363k = parcel.readString();
        this.f2364l = parcel.readInt() != 0;
        this.f2365m = parcel.readInt();
        this.f2366n = parcel.readInt();
        this.f2367o = parcel.readString();
        this.f2368p = parcel.readInt() != 0;
        this.f2369q = parcel.readInt() != 0;
        this.f2370r = parcel.readInt() != 0;
        this.f2371s = parcel.readBundle();
        this.f2372t = parcel.readInt() != 0;
        this.f2374v = parcel.readBundle();
        this.f2373u = parcel.readInt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(Fragment fragment) {
        this.f2362j = fragment.getClass().getName();
        this.f2363k = fragment.f2099o;
        this.f2364l = fragment.f2107w;
        this.f2365m = fragment.F;
        this.f2366n = fragment.G;
        this.f2367o = fragment.H;
        this.f2368p = fragment.K;
        this.f2369q = fragment.f2106v;
        this.f2370r = fragment.J;
        this.f2371s = fragment.f2100p;
        this.f2372t = fragment.I;
        this.f2373u = fragment.f2086a0.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f2362j);
        sb.append(" (");
        sb.append(this.f2363k);
        sb.append(")}:");
        if (this.f2364l) {
            sb.append(" fromLayout");
        }
        if (this.f2366n != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2366n));
        }
        String str = this.f2367o;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f2367o);
        }
        if (this.f2368p) {
            sb.append(" retainInstance");
        }
        if (this.f2369q) {
            sb.append(" removing");
        }
        if (this.f2370r) {
            sb.append(" detached");
        }
        if (this.f2372t) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f2362j);
        parcel.writeString(this.f2363k);
        parcel.writeInt(this.f2364l ? 1 : 0);
        parcel.writeInt(this.f2365m);
        parcel.writeInt(this.f2366n);
        parcel.writeString(this.f2367o);
        parcel.writeInt(this.f2368p ? 1 : 0);
        parcel.writeInt(this.f2369q ? 1 : 0);
        parcel.writeInt(this.f2370r ? 1 : 0);
        parcel.writeBundle(this.f2371s);
        parcel.writeInt(this.f2372t ? 1 : 0);
        parcel.writeBundle(this.f2374v);
        parcel.writeInt(this.f2373u);
    }
}
