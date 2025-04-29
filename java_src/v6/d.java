package v6;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    private static volatile d f19435b;

    /* renamed from: a  reason: collision with root package name */
    private final Set<f> f19436a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f19435b;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = f19435b;
                if (dVar == null) {
                    dVar = new d();
                    f19435b = dVar;
                }
            }
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<f> b() {
        Set<f> unmodifiableSet;
        synchronized (this.f19436a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f19436a);
        }
        return unmodifiableSet;
    }
}
