package n2;

import android.os.Parcel;
import android.os.Parcelable;
import k2.a;
import p3.n0;
import s1.a2;
import s1.n1;
@Deprecated
/* loaded from: classes.dex */
public class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: j  reason: collision with root package name */
    public final String f14061j;

    /* renamed from: k  reason: collision with root package name */
    public final String f14062k;

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

    /* JADX INFO: Access modifiers changed from: protected */
    public b(Parcel parcel) {
        this.f14061j = (String) n0.j(parcel.readString());
        this.f14062k = (String) n0.j(parcel.readString());
    }

    public b(String str, String str2) {
        this.f14061j = str;
        this.f14062k = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f14061j.equals(bVar.f14061j) && this.f14062k.equals(bVar.f14062k);
    }

    public int hashCode() {
        return ((527 + this.f14061j.hashCode()) * 31) + this.f14062k.hashCode();
    }

    @Override // k2.a.b
    public /* synthetic */ n1 n() {
        return k2.b.b(this);
    }

    public String toString() {
        return "VC: " + this.f14061j + "=" + this.f14062k;
    }

    @Override // k2.a.b
    public void u(a2.b bVar) {
        String str = this.f14061j;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                bVar.N(this.f14062k);
                return;
            case 1:
                bVar.m0(this.f14062k);
                return;
            case 2:
                bVar.U(this.f14062k);
                return;
            case 3:
                bVar.M(this.f14062k);
                return;
            case 4:
                bVar.O(this.f14062k);
                return;
            default:
                return;
        }
    }

    @Override // k2.a.b
    public /* synthetic */ byte[] w() {
        return k2.b.a(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14061j);
        parcel.writeString(this.f14062k);
    }
}
