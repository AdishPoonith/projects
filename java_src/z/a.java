package z;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* renamed from: j  reason: collision with root package name */
    private final Parcelable f20630j;

    /* renamed from: k  reason: collision with root package name */
    public static final a f20629k = new C0291a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: z.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0291a extends a {
        C0291a() {
            super((C0291a) null);
        }
    }

    /* loaded from: classes.dex */
    static class b implements Parcelable.ClassLoaderCreator<a> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f20629k;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    private a() {
        this.f20630j = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f20630j = readParcelable == null ? f20629k : readParcelable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f20630j = parcelable == f20629k ? null : parcelable;
    }

    /* synthetic */ a(C0291a c0291a) {
        this();
    }

    public final Parcelable a() {
        return this.f20630j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f20630j, i10);
    }
}
