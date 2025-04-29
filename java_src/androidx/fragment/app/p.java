package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.n;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* renamed from: j  reason: collision with root package name */
    ArrayList<t> f2346j;

    /* renamed from: k  reason: collision with root package name */
    ArrayList<String> f2347k;

    /* renamed from: l  reason: collision with root package name */
    b[] f2348l;

    /* renamed from: m  reason: collision with root package name */
    int f2349m;

    /* renamed from: n  reason: collision with root package name */
    String f2350n;

    /* renamed from: o  reason: collision with root package name */
    ArrayList<String> f2351o;

    /* renamed from: p  reason: collision with root package name */
    ArrayList<Bundle> f2352p;

    /* renamed from: q  reason: collision with root package name */
    ArrayList<n.l> f2353q;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<p> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public p[] newArray(int i10) {
            return new p[i10];
        }
    }

    public p() {
        this.f2350n = null;
        this.f2351o = new ArrayList<>();
        this.f2352p = new ArrayList<>();
    }

    public p(Parcel parcel) {
        this.f2350n = null;
        this.f2351o = new ArrayList<>();
        this.f2352p = new ArrayList<>();
        this.f2346j = parcel.createTypedArrayList(t.CREATOR);
        this.f2347k = parcel.createStringArrayList();
        this.f2348l = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f2349m = parcel.readInt();
        this.f2350n = parcel.readString();
        this.f2351o = parcel.createStringArrayList();
        this.f2352p = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f2353q = parcel.createTypedArrayList(n.l.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedList(this.f2346j);
        parcel.writeStringList(this.f2347k);
        parcel.writeTypedArray(this.f2348l, i10);
        parcel.writeInt(this.f2349m);
        parcel.writeString(this.f2350n);
        parcel.writeStringList(this.f2351o);
        parcel.writeTypedList(this.f2352p);
        parcel.writeTypedList(this.f2353q);
    }
}
