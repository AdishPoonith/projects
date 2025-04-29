package a6;

import com.google.android.gms.internal.p000firebaseauthapi.i3;
import com.google.firebase.auth.a2;
/* loaded from: classes.dex */
public final class g1 {
    public static i3 a(com.google.firebase.auth.h hVar, String str) {
        c4.s.j(hVar);
        if (com.google.firebase.auth.f0.class.isAssignableFrom(hVar.getClass())) {
            return com.google.firebase.auth.f0.E((com.google.firebase.auth.f0) hVar, str);
        }
        if (com.google.firebase.auth.l.class.isAssignableFrom(hVar.getClass())) {
            return com.google.firebase.auth.l.E((com.google.firebase.auth.l) hVar, str);
        }
        if (com.google.firebase.auth.w0.class.isAssignableFrom(hVar.getClass())) {
            return com.google.firebase.auth.w0.E((com.google.firebase.auth.w0) hVar, str);
        }
        if (com.google.firebase.auth.d0.class.isAssignableFrom(hVar.getClass())) {
            return com.google.firebase.auth.d0.E((com.google.firebase.auth.d0) hVar, str);
        }
        if (com.google.firebase.auth.u0.class.isAssignableFrom(hVar.getClass())) {
            return com.google.firebase.auth.u0.E((com.google.firebase.auth.u0) hVar, str);
        }
        if (a2.class.isAssignableFrom(hVar.getClass())) {
            return a2.H((a2) hVar, str);
        }
        throw new IllegalArgumentException("Unsupported credential type.");
    }
}
