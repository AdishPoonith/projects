package d4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class b {

    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(java.lang.String r3, android.os.Parcel r4) {
            /*
                r2 = this;
                int r0 = r4.dataPosition()
                int r4 = r4.dataSize()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " Parcel: pos="
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = " size="
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d4.b.a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    private static void A(Parcel parcel, int i10, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        String hexString = Integer.toHexString(i11);
        throw new a("Expected size " + i12 + " got " + i11 + " (0x" + hexString + ")", parcel);
    }

    private static void B(Parcel parcel, int i10, int i11) {
        int x10 = x(parcel, i10);
        if (x10 == i11) {
            return;
        }
        String hexString = Integer.toHexString(x10);
        throw new a("Expected size " + i11 + " got " + x10 + " (0x" + hexString + ")", parcel);
    }

    public static Bundle a(Parcel parcel, int i10) {
        int x10 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + x10);
        return readBundle;
    }

    public static byte[] b(Parcel parcel, int i10) {
        int x10 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + x10);
        return createByteArray;
    }

    public static int[] c(Parcel parcel, int i10) {
        int x10 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + x10);
        return createIntArray;
    }

    public static <T extends Parcelable> T d(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int x10 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + x10);
        return createFromParcel;
    }

    public static String e(Parcel parcel, int i10) {
        int x10 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + x10);
        return readString;
    }

    public static ArrayList<String> f(Parcel parcel, int i10) {
        int x10 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + x10);
        return createStringArrayList;
    }

    public static <T> T[] g(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int x10 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + x10);
        return tArr;
    }

    public static <T> ArrayList<T> h(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int x10 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + x10);
        return createTypedArrayList;
    }

    public static void i(Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        throw new a("Overread allowed size end=" + i10, parcel);
    }

    public static int j(int i10) {
        return (char) i10;
    }

    public static boolean k(Parcel parcel, int i10) {
        B(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean l(Parcel parcel, int i10) {
        int x10 = x(parcel, i10);
        if (x10 == 0) {
            return null;
        }
        A(parcel, i10, x10, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static byte m(Parcel parcel, int i10) {
        B(parcel, i10, 4);
        return (byte) parcel.readInt();
    }

    public static double n(Parcel parcel, int i10) {
        B(parcel, i10, 8);
        return parcel.readDouble();
    }

    public static float o(Parcel parcel, int i10) {
        B(parcel, i10, 4);
        return parcel.readFloat();
    }

    public static Float p(Parcel parcel, int i10) {
        int x10 = x(parcel, i10);
        if (x10 == 0) {
            return null;
        }
        A(parcel, i10, x10, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int q(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder r(Parcel parcel, int i10) {
        int x10 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + x10);
        return readStrongBinder;
    }

    public static int s(Parcel parcel, int i10) {
        B(parcel, i10, 4);
        return parcel.readInt();
    }

    public static Integer t(Parcel parcel, int i10) {
        int x10 = x(parcel, i10);
        if (x10 == 0) {
            return null;
        }
        A(parcel, i10, x10, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static void u(Parcel parcel, int i10, List list, ClassLoader classLoader) {
        int x10 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(dataPosition + x10);
    }

    public static long v(Parcel parcel, int i10) {
        B(parcel, i10, 8);
        return parcel.readLong();
    }

    public static Long w(Parcel parcel, int i10) {
        int x10 = x(parcel, i10);
        if (x10 == 0) {
            return null;
        }
        A(parcel, i10, x10, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int x(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void y(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + x(parcel, i10));
    }

    public static int z(Parcel parcel) {
        int q10 = q(parcel);
        int x10 = x(parcel, q10);
        int j10 = j(q10);
        int dataPosition = parcel.dataPosition();
        if (j10 == 20293) {
            int i10 = x10 + dataPosition;
            if (i10 < dataPosition || i10 > parcel.dataSize()) {
                throw new a("Size read is invalid start=" + dataPosition + " end=" + i10, parcel);
            }
            return i10;
        }
        throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(q10))), parcel);
    }
}
