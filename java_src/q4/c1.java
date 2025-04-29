package q4;

import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class c1 extends e implements d1 {
    public c1() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // q4.e
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            m.b(parcel);
            Y1((t4.h) m.a(parcel, t4.h.CREATOR));
            return true;
        }
        return false;
    }
}
