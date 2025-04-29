package w1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
/* loaded from: classes.dex */
public final class m implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: j  reason: collision with root package name */
    private final b[] f19726j;

    /* renamed from: k  reason: collision with root package name */
    private int f19727k;

    /* renamed from: l  reason: collision with root package name */
    public final String f19728l;

    /* renamed from: m  reason: collision with root package name */
    public final int f19729m;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<m> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: j  reason: collision with root package name */
        private int f19730j;

        /* renamed from: k  reason: collision with root package name */
        public final UUID f19731k;

        /* renamed from: l  reason: collision with root package name */
        public final String f19732l;

        /* renamed from: m  reason: collision with root package name */
        public final String f19733m;

        /* renamed from: n  reason: collision with root package name */
        public final byte[] f19734n;

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

        b(Parcel parcel) {
            this.f19731k = new UUID(parcel.readLong(), parcel.readLong());
            this.f19732l = parcel.readString();
            this.f19733m = (String) p3.n0.j(parcel.readString());
            this.f19734n = parcel.createByteArray();
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f19731k = (UUID) p3.a.e(uuid);
            this.f19732l = str;
            this.f19733m = (String) p3.a.e(str2);
            this.f19734n = bArr;
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean a(b bVar) {
            return c() && !bVar.c() && d(bVar.f19731k);
        }

        public b b(byte[] bArr) {
            return new b(this.f19731k, this.f19732l, this.f19733m, bArr);
        }

        public boolean c() {
            return this.f19734n != null;
        }

        public boolean d(UUID uuid) {
            return s1.i.f17251a.equals(this.f19731k) || uuid.equals(this.f19731k);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                if (obj == this) {
                    return true;
                }
                b bVar = (b) obj;
                return p3.n0.c(this.f19732l, bVar.f19732l) && p3.n0.c(this.f19733m, bVar.f19733m) && p3.n0.c(this.f19731k, bVar.f19731k) && Arrays.equals(this.f19734n, bVar.f19734n);
            }
            return false;
        }

        public int hashCode() {
            if (this.f19730j == 0) {
                int hashCode = this.f19731k.hashCode() * 31;
                String str = this.f19732l;
                this.f19730j = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f19733m.hashCode()) * 31) + Arrays.hashCode(this.f19734n);
            }
            return this.f19730j;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f19731k.getMostSignificantBits());
            parcel.writeLong(this.f19731k.getLeastSignificantBits());
            parcel.writeString(this.f19732l);
            parcel.writeString(this.f19733m);
            parcel.writeByteArray(this.f19734n);
        }
    }

    m(Parcel parcel) {
        this.f19728l = parcel.readString();
        b[] bVarArr = (b[]) p3.n0.j((b[]) parcel.createTypedArray(b.CREATOR));
        this.f19726j = bVarArr;
        this.f19729m = bVarArr.length;
    }

    public m(String str, List<b> list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    private m(String str, boolean z10, b... bVarArr) {
        this.f19728l = str;
        bVarArr = z10 ? (b[]) bVarArr.clone() : bVarArr;
        this.f19726j = bVarArr;
        this.f19729m = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public m(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    public m(List<b> list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    public m(b... bVarArr) {
        this((String) null, bVarArr);
    }

    private static boolean b(ArrayList<b> arrayList, int i10, UUID uuid) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (arrayList.get(i11).f19731k.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static m d(m mVar, m mVar2) {
        String str;
        b[] bVarArr;
        b[] bVarArr2;
        ArrayList arrayList = new ArrayList();
        if (mVar != null) {
            str = mVar.f19728l;
            for (b bVar : mVar.f19726j) {
                if (bVar.c()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (mVar2 != null) {
            if (str == null) {
                str = mVar2.f19728l;
            }
            int size = arrayList.size();
            for (b bVar2 : mVar2.f19726j) {
                if (bVar2.c() && !b(arrayList, size, bVar2.f19731k)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new m(str, arrayList);
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(b bVar, b bVar2) {
        UUID uuid = s1.i.f17251a;
        return uuid.equals(bVar.f19731k) ? uuid.equals(bVar2.f19731k) ? 0 : 1 : bVar.f19731k.compareTo(bVar2.f19731k);
    }

    public m c(String str) {
        return p3.n0.c(this.f19728l, str) ? this : new m(str, false, this.f19726j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public b e(int i10) {
        return this.f19726j[i10];
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return p3.n0.c(this.f19728l, mVar.f19728l) && Arrays.equals(this.f19726j, mVar.f19726j);
    }

    public m f(m mVar) {
        String str;
        String str2 = this.f19728l;
        p3.a.f(str2 == null || (str = mVar.f19728l) == null || TextUtils.equals(str2, str));
        String str3 = this.f19728l;
        if (str3 == null) {
            str3 = mVar.f19728l;
        }
        return new m(str3, (b[]) p3.n0.F0(this.f19726j, mVar.f19726j));
    }

    public int hashCode() {
        if (this.f19727k == 0) {
            String str = this.f19728l;
            this.f19727k = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f19726j);
        }
        return this.f19727k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19728l);
        parcel.writeTypedArray(this.f19726j, 0);
    }
}
