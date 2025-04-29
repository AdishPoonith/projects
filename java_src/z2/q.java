package z2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k2.a;
import s1.a2;
import s1.n1;
/* loaded from: classes.dex */
public final class q implements a.b {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* renamed from: j  reason: collision with root package name */
    public final String f20839j;

    /* renamed from: k  reason: collision with root package name */
    public final String f20840k;

    /* renamed from: l  reason: collision with root package name */
    public final List<b> f20841l;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<q> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public q createFromParcel(Parcel parcel) {
            return new q(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public q[] newArray(int i10) {
            return new q[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: j  reason: collision with root package name */
        public final int f20842j;

        /* renamed from: k  reason: collision with root package name */
        public final int f20843k;

        /* renamed from: l  reason: collision with root package name */
        public final String f20844l;

        /* renamed from: m  reason: collision with root package name */
        public final String f20845m;

        /* renamed from: n  reason: collision with root package name */
        public final String f20846n;

        /* renamed from: o  reason: collision with root package name */
        public final String f20847o;

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

        public b(int i10, int i11, String str, String str2, String str3, String str4) {
            this.f20842j = i10;
            this.f20843k = i11;
            this.f20844l = str;
            this.f20845m = str2;
            this.f20846n = str3;
            this.f20847o = str4;
        }

        b(Parcel parcel) {
            this.f20842j = parcel.readInt();
            this.f20843k = parcel.readInt();
            this.f20844l = parcel.readString();
            this.f20845m = parcel.readString();
            this.f20846n = parcel.readString();
            this.f20847o = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f20842j == bVar.f20842j && this.f20843k == bVar.f20843k && TextUtils.equals(this.f20844l, bVar.f20844l) && TextUtils.equals(this.f20845m, bVar.f20845m) && TextUtils.equals(this.f20846n, bVar.f20846n) && TextUtils.equals(this.f20847o, bVar.f20847o);
        }

        public int hashCode() {
            int i10 = ((this.f20842j * 31) + this.f20843k) * 31;
            String str = this.f20844l;
            int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f20845m;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f20846n;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f20847o;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f20842j);
            parcel.writeInt(this.f20843k);
            parcel.writeString(this.f20844l);
            parcel.writeString(this.f20845m);
            parcel.writeString(this.f20846n);
            parcel.writeString(this.f20847o);
        }
    }

    q(Parcel parcel) {
        this.f20839j = parcel.readString();
        this.f20840k = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add((b) parcel.readParcelable(b.class.getClassLoader()));
        }
        this.f20841l = Collections.unmodifiableList(arrayList);
    }

    public q(String str, String str2, List<b> list) {
        this.f20839j = str;
        this.f20840k = str2;
        this.f20841l = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return TextUtils.equals(this.f20839j, qVar.f20839j) && TextUtils.equals(this.f20840k, qVar.f20840k) && this.f20841l.equals(qVar.f20841l);
    }

    public int hashCode() {
        String str = this.f20839j;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f20840k;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f20841l.hashCode();
    }

    @Override // k2.a.b
    public /* synthetic */ n1 n() {
        return k2.b.b(this);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("HlsTrackMetadataEntry");
        if (this.f20839j != null) {
            str = " [" + this.f20839j + ", " + this.f20840k + "]";
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // k2.a.b
    public /* synthetic */ void u(a2.b bVar) {
        k2.b.c(this, bVar);
    }

    @Override // k2.a.b
    public /* synthetic */ byte[] w() {
        return k2.b.a(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20839j);
        parcel.writeString(this.f20840k);
        int size = this.f20841l.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeParcelable(this.f20841l.get(i11), 0);
        }
    }
}
