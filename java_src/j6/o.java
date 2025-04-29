package j6;

import j6.n;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private final TreeMap<m6.l, n> f12266a = new TreeMap<>();

    public void a(n nVar) {
        m6.l key = nVar.b().getKey();
        n nVar2 = this.f12266a.get(key);
        if (nVar2 == null) {
            this.f12266a.put(key, nVar);
            return;
        }
        n.a c10 = nVar2.c();
        n.a c11 = nVar.c();
        n.a aVar = n.a.ADDED;
        if (c11 == aVar || c10 != n.a.METADATA) {
            if (c11 != n.a.METADATA || c10 == n.a.REMOVED) {
                n.a aVar2 = n.a.MODIFIED;
                if (c11 != aVar2 || c10 != aVar2) {
                    if (c11 == aVar2 && c10 == aVar) {
                        nVar = n.a(aVar, nVar.b());
                    } else {
                        n.a aVar3 = n.a.REMOVED;
                        if (c11 == aVar3 && c10 == aVar) {
                            this.f12266a.remove(key);
                            return;
                        } else if (c11 == aVar3 && c10 == aVar2) {
                            nVar = n.a(aVar3, nVar2.b());
                        } else if (c11 != aVar || c10 != aVar3) {
                            throw q6.b.a("Unsupported combination of changes %s after %s", c11, c10);
                        }
                    }
                }
                nVar = n.a(aVar2, nVar.b());
            } else {
                nVar = n.a(c10, nVar.b());
            }
        }
        this.f12266a.put(key, nVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<n> b() {
        return new ArrayList(this.f12266a.values());
    }
}
