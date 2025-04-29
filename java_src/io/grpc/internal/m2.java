package io.grpc.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class m2 {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f11467a = Logger.getLogger(m2.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f11468b = "-bin".getBytes(b5.d.f2948a);

    private m2() {
    }

    private static boolean a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i10 = length; i10 < bArr.length; i10++) {
            if (bArr[i10] != bArr2[i10 - length]) {
                return false;
            }
        }
        return true;
    }

    private static boolean b(byte[] bArr) {
        for (byte b10 : bArr) {
            if (b10 < 32 || b10 > 126) {
                return false;
            }
        }
        return true;
    }

    private static byte[][] c(byte[][] bArr, int i10) {
        ArrayList arrayList = new ArrayList(bArr.length + 10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(bArr[i11]);
        }
        while (i10 < bArr.length) {
            byte[] bArr2 = bArr[i10];
            byte[] bArr3 = bArr[i10 + 1];
            if (a(bArr2, f11468b)) {
                int i12 = 0;
                for (int i13 = 0; i13 <= bArr3.length; i13++) {
                    if (i13 == bArr3.length || bArr3[i13] == 44) {
                        byte[] b10 = c5.a.a().b(new String(bArr3, i12, i13 - i12, b5.d.f2948a));
                        arrayList.add(bArr2);
                        arrayList.add(b10);
                        i12 = i13 + 1;
                    }
                }
            } else {
                arrayList.add(bArr2);
                arrayList.add(bArr3);
            }
            i10 += 2;
        }
        return (byte[][]) arrayList.toArray(new byte[0]);
    }

    public static byte[][] d(i9.y0 y0Var) {
        byte[][] d10 = i9.m0.d(y0Var);
        if (d10 == null) {
            return new byte[0];
        }
        int i10 = 0;
        for (int i11 = 0; i11 < d10.length; i11 += 2) {
            byte[] bArr = d10[i11];
            byte[] bArr2 = d10[i11 + 1];
            if (a(bArr, f11468b)) {
                d10[i10] = bArr;
                d10[i10 + 1] = i9.m0.f9987b.e(bArr2).getBytes(b5.d.f2948a);
            } else if (b(bArr2)) {
                d10[i10] = bArr;
                d10[i10 + 1] = bArr2;
            } else {
                String str = new String(bArr, b5.d.f2948a);
                Logger logger = f11467a;
                logger.warning("Metadata key=" + str + ", value=" + Arrays.toString(bArr2) + " contains invalid ASCII characters");
            }
            i10 += 2;
        }
        return i10 == d10.length ? d10 : (byte[][]) Arrays.copyOfRange(d10, 0, i10);
    }

    public static byte[][] e(byte[][] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10 += 2) {
            byte[] bArr2 = bArr[i10];
            int i11 = i10 + 1;
            byte[] bArr3 = bArr[i11];
            if (a(bArr2, f11468b)) {
                for (byte b10 : bArr3) {
                    if (b10 == 44) {
                        return c(bArr, i10);
                    }
                }
                bArr[i11] = c5.a.a().b(new String(bArr3, b5.d.f2948a));
            }
        }
        return bArr;
    }
}
