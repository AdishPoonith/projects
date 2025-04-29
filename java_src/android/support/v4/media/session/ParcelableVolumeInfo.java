package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: j  reason: collision with root package name */
    public int f426j;

    /* renamed from: k  reason: collision with root package name */
    public int f427k;

    /* renamed from: l  reason: collision with root package name */
    public int f428l;

    /* renamed from: m  reason: collision with root package name */
    public int f429m;

    /* renamed from: n  reason: collision with root package name */
    public int f430n;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f426j = parcel.readInt();
        this.f428l = parcel.readInt();
        this.f429m = parcel.readInt();
        this.f430n = parcel.readInt();
        this.f427k = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f426j);
        parcel.writeInt(this.f428l);
        parcel.writeInt(this.f429m);
        parcel.writeInt(this.f430n);
        parcel.writeInt(this.f427k);
    }
}
