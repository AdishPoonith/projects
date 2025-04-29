package x8;

import com.google.firebase.firestore.n;
/* loaded from: classes.dex */
public class b {
    public static n.a a(String str) {
        if (str == null) {
            return n.a.NONE;
        }
        char c10 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1959779032) {
            if (hashCode != -1273775369) {
                if (hashCode == 3387192 && str.equals("none")) {
                    c10 = 2;
                }
            } else if (str.equals("previous")) {
                c10 = 1;
            }
        } else if (str.equals("estimate")) {
            c10 = 0;
        }
        return c10 != 0 ? c10 != 1 ? n.a.NONE : n.a.PREVIOUS : n.a.ESTIMATE;
    }
}
