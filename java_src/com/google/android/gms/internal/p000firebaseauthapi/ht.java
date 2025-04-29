package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ht  reason: invalid package */
/* loaded from: classes.dex */
public final class ht {
    public static int a(int i10, int i11, String str) {
        String b10;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                b10 = d1.b("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else if (i11 < 0) {
                throw new IllegalArgumentException("negative size: " + i11);
            } else {
                b10 = d1.b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(b10);
        }
        return i10;
    }

    public static int b(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(d(i10, i11, "index"));
        }
        return i10;
    }

    public static void c(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? d(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? d(i11, i12, "end index") : d1.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    private static String d(int i10, int i11, String str) {
        if (i10 < 0) {
            return d1.b("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return d1.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }
}
