package a6;

import android.text.TextUtils;
import com.google.android.gms.internal.p000firebaseauthapi.g3;
import com.google.android.gms.internal.p000firebaseauthapi.n2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class g0 {
    public static com.google.firebase.auth.j0 a(n2 n2Var) {
        if (n2Var == null) {
            return null;
        }
        if (TextUtils.isEmpty(n2Var.f())) {
            if (n2Var.c() != null) {
                return new com.google.firebase.auth.t1(n2Var.e(), n2Var.d(), n2Var.a(), (g3) c4.s.k(n2Var.c(), "totpInfo cannot not be null."));
            }
            return null;
        }
        return new com.google.firebase.auth.t0(n2Var.e(), n2Var.d(), n2Var.a(), c4.s.f(n2Var.f()));
    }

    public static List b(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.firebase.auth.j0 a10 = a((n2) it.next());
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return arrayList;
    }
}
