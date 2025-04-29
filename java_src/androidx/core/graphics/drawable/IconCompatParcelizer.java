package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(androidx.versionedparcelable.a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1705a = aVar.p(iconCompat.f1705a, 1);
        iconCompat.f1707c = aVar.j(iconCompat.f1707c, 2);
        iconCompat.f1708d = aVar.r(iconCompat.f1708d, 3);
        iconCompat.f1709e = aVar.p(iconCompat.f1709e, 4);
        iconCompat.f1710f = aVar.p(iconCompat.f1710f, 5);
        iconCompat.f1711g = (ColorStateList) aVar.r(iconCompat.f1711g, 6);
        iconCompat.f1713i = aVar.t(iconCompat.f1713i, 7);
        iconCompat.f1714j = aVar.t(iconCompat.f1714j, 8);
        iconCompat.m();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(true, true);
        iconCompat.n(aVar.f());
        int i10 = iconCompat.f1705a;
        if (-1 != i10) {
            aVar.F(i10, 1);
        }
        byte[] bArr = iconCompat.f1707c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f1708d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i11 = iconCompat.f1709e;
        if (i11 != 0) {
            aVar.F(i11, 4);
        }
        int i12 = iconCompat.f1710f;
        if (i12 != 0) {
            aVar.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f1711g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f1713i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f1714j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
