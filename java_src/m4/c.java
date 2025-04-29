package m4;

import android.util.Base64;
import java.util.Random;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Random f13777a = new Random();

    public static String a() {
        byte[] bArr = new byte[16];
        f13777a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
