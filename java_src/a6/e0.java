package a6;

import com.google.android.gms.internal.p000firebaseauthapi.iv;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    private static final f4.a f213a = new f4.a("GetTokenResultFactory", new String[0]);

    public static com.google.firebase.auth.c0 a(String str) {
        Map hashMap;
        try {
            hashMap = f0.b(str);
        } catch (iv e10) {
            f213a.b("Error parsing token claims", e10, new Object[0]);
            hashMap = new HashMap();
        }
        return new com.google.firebase.auth.c0(str, hashMap);
    }
}
