package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0010a();

    /* renamed from: j  reason: collision with root package name */
    private final int f551j;

    /* renamed from: k  reason: collision with root package name */
    private final Intent f552k;

    /* renamed from: androidx.activity.result.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0010a implements Parcelable.Creator<a> {
        C0010a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, Intent intent) {
        this.f551j = i10;
        this.f552k = intent;
    }

    a(Parcel parcel) {
        this.f551j = parcel.readInt();
        this.f552k = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    public static String c(int i10) {
        return i10 != -1 ? i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED" : "RESULT_OK";
    }

    public Intent a() {
        return this.f552k;
    }

    public int b() {
        return this.f551j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + c(this.f551j) + ", data=" + this.f552k + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f551j);
        parcel.writeInt(this.f552k == null ? 0 : 1);
        Intent intent = this.f552k;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }
}
