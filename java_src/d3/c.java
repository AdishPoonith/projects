package d3;

import android.os.Bundle;
import android.os.Parcel;
import com.google.common.collect.q;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class c {
    public q<b> a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return p3.c.b(b.S, (ArrayList) p3.a.e(readBundle.getParcelableArrayList("c")));
    }
}
