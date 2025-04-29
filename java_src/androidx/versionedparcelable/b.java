package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
class b extends a {

    /* renamed from: d  reason: collision with root package name */
    private final SparseIntArray f2827d;

    /* renamed from: e  reason: collision with root package name */
    private final Parcel f2828e;

    /* renamed from: f  reason: collision with root package name */
    private final int f2829f;

    /* renamed from: g  reason: collision with root package name */
    private final int f2830g;

    /* renamed from: h  reason: collision with root package name */
    private final String f2831h;

    /* renamed from: i  reason: collision with root package name */
    private int f2832i;

    /* renamed from: j  reason: collision with root package name */
    private int f2833j;

    /* renamed from: k  reason: collision with root package name */
    private int f2834k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new s.a(), new s.a(), new s.a());
    }

    private b(Parcel parcel, int i10, int i11, String str, s.a<String, Method> aVar, s.a<String, Method> aVar2, s.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f2827d = new SparseIntArray();
        this.f2832i = -1;
        this.f2834k = -1;
        this.f2828e = parcel;
        this.f2829f = i10;
        this.f2830g = i11;
        this.f2833j = i10;
        this.f2831h = str;
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f2828e.writeInt(-1);
            return;
        }
        this.f2828e.writeInt(bArr.length);
        this.f2828e.writeByteArray(bArr);
    }

    @Override // androidx.versionedparcelable.a
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f2828e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int i10) {
        this.f2828e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void G(Parcelable parcelable) {
        this.f2828e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(String str) {
        this.f2828e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i10 = this.f2832i;
        if (i10 >= 0) {
            int i11 = this.f2827d.get(i10);
            int dataPosition = this.f2828e.dataPosition();
            this.f2828e.setDataPosition(i11);
            this.f2828e.writeInt(dataPosition - i11);
            this.f2828e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f2828e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f2833j;
        if (i10 == this.f2829f) {
            i10 = this.f2830g;
        }
        int i11 = i10;
        return new b(parcel, dataPosition, i11, this.f2831h + "  ", this.f2824a, this.f2825b, this.f2826c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.f2828e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int readInt = this.f2828e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f2828e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f2828e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int i10) {
        while (this.f2833j < this.f2830g) {
            int i11 = this.f2834k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f2828e.setDataPosition(this.f2833j);
            int readInt = this.f2828e.readInt();
            this.f2834k = this.f2828e.readInt();
            this.f2833j += readInt;
        }
        return this.f2834k == i10;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.f2828e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public <T extends Parcelable> T q() {
        return (T) this.f2828e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String s() {
        return this.f2828e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int i10) {
        a();
        this.f2832i = i10;
        this.f2827d.put(i10, this.f2828e.dataPosition());
        E(0);
        E(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z10) {
        this.f2828e.writeInt(z10 ? 1 : 0);
    }
}
