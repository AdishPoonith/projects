package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.w;
import androidx.lifecycle.e;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: j  reason: collision with root package name */
    final int[] f2154j;

    /* renamed from: k  reason: collision with root package name */
    final ArrayList<String> f2155k;

    /* renamed from: l  reason: collision with root package name */
    final int[] f2156l;

    /* renamed from: m  reason: collision with root package name */
    final int[] f2157m;

    /* renamed from: n  reason: collision with root package name */
    final int f2158n;

    /* renamed from: o  reason: collision with root package name */
    final String f2159o;

    /* renamed from: p  reason: collision with root package name */
    final int f2160p;

    /* renamed from: q  reason: collision with root package name */
    final int f2161q;

    /* renamed from: r  reason: collision with root package name */
    final CharSequence f2162r;

    /* renamed from: s  reason: collision with root package name */
    final int f2163s;

    /* renamed from: t  reason: collision with root package name */
    final CharSequence f2164t;

    /* renamed from: u  reason: collision with root package name */
    final ArrayList<String> f2165u;

    /* renamed from: v  reason: collision with root package name */
    final ArrayList<String> f2166v;

    /* renamed from: w  reason: collision with root package name */
    final boolean f2167w;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(Parcel parcel) {
        this.f2154j = parcel.createIntArray();
        this.f2155k = parcel.createStringArrayList();
        this.f2156l = parcel.createIntArray();
        this.f2157m = parcel.createIntArray();
        this.f2158n = parcel.readInt();
        this.f2159o = parcel.readString();
        this.f2160p = parcel.readInt();
        this.f2161q = parcel.readInt();
        this.f2162r = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2163s = parcel.readInt();
        this.f2164t = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2165u = parcel.createStringArrayList();
        this.f2166v = parcel.createStringArrayList();
        this.f2167w = parcel.readInt() != 0;
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f2388c.size();
        this.f2154j = new int[size * 5];
        if (!aVar.f2394i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2155k = new ArrayList<>(size);
        this.f2156l = new int[size];
        this.f2157m = new int[size];
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            w.a aVar2 = aVar.f2388c.get(i10);
            int i12 = i11 + 1;
            this.f2154j[i11] = aVar2.f2405a;
            ArrayList<String> arrayList = this.f2155k;
            Fragment fragment = aVar2.f2406b;
            arrayList.add(fragment != null ? fragment.f2099o : null);
            int[] iArr = this.f2154j;
            int i13 = i12 + 1;
            iArr[i12] = aVar2.f2407c;
            int i14 = i13 + 1;
            iArr[i13] = aVar2.f2408d;
            int i15 = i14 + 1;
            iArr[i14] = aVar2.f2409e;
            iArr[i15] = aVar2.f2410f;
            this.f2156l[i10] = aVar2.f2411g.ordinal();
            this.f2157m[i10] = aVar2.f2412h.ordinal();
            i10++;
            i11 = i15 + 1;
        }
        this.f2158n = aVar.f2393h;
        this.f2159o = aVar.f2396k;
        this.f2160p = aVar.f2151v;
        this.f2161q = aVar.f2397l;
        this.f2162r = aVar.f2398m;
        this.f2163s = aVar.f2399n;
        this.f2164t = aVar.f2400o;
        this.f2165u = aVar.f2401p;
        this.f2166v = aVar.f2402q;
        this.f2167w = aVar.f2403r;
    }

    public androidx.fragment.app.a a(n nVar) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(nVar);
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.f2154j.length) {
            w.a aVar2 = new w.a();
            int i12 = i10 + 1;
            aVar2.f2405a = this.f2154j[i10];
            if (n.F0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + this.f2154j[i12]);
            }
            String str = this.f2155k.get(i11);
            aVar2.f2406b = str != null ? nVar.h0(str) : null;
            aVar2.f2411g = e.b.values()[this.f2156l[i11]];
            aVar2.f2412h = e.b.values()[this.f2157m[i11]];
            int[] iArr = this.f2154j;
            int i13 = i12 + 1;
            int i14 = iArr[i12];
            aVar2.f2407c = i14;
            int i15 = i13 + 1;
            int i16 = iArr[i13];
            aVar2.f2408d = i16;
            int i17 = i15 + 1;
            int i18 = iArr[i15];
            aVar2.f2409e = i18;
            int i19 = iArr[i17];
            aVar2.f2410f = i19;
            aVar.f2389d = i14;
            aVar.f2390e = i16;
            aVar.f2391f = i18;
            aVar.f2392g = i19;
            aVar.e(aVar2);
            i11++;
            i10 = i17 + 1;
        }
        aVar.f2393h = this.f2158n;
        aVar.f2396k = this.f2159o;
        aVar.f2151v = this.f2160p;
        aVar.f2394i = true;
        aVar.f2397l = this.f2161q;
        aVar.f2398m = this.f2162r;
        aVar.f2399n = this.f2163s;
        aVar.f2400o = this.f2164t;
        aVar.f2401p = this.f2165u;
        aVar.f2402q = this.f2166v;
        aVar.f2403r = this.f2167w;
        aVar.m(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f2154j);
        parcel.writeStringList(this.f2155k);
        parcel.writeIntArray(this.f2156l);
        parcel.writeIntArray(this.f2157m);
        parcel.writeInt(this.f2158n);
        parcel.writeString(this.f2159o);
        parcel.writeInt(this.f2160p);
        parcel.writeInt(this.f2161q);
        TextUtils.writeToParcel(this.f2162r, parcel, 0);
        parcel.writeInt(this.f2163s);
        TextUtils.writeToParcel(this.f2164t, parcel, 0);
        parcel.writeStringList(this.f2165u);
        parcel.writeStringList(this.f2166v);
        parcel.writeInt(this.f2167w ? 1 : 0);
    }
}
