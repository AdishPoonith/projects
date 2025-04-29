package k4;

import java.util.Iterator;
import java.util.LinkedList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f12579a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(a aVar) {
        this.f12579a = aVar;
    }

    @Override // k4.e
    public final void a(c cVar) {
        LinkedList linkedList;
        LinkedList linkedList2;
        c cVar2;
        this.f12579a.f12574a = cVar;
        linkedList = this.f12579a.f12576c;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            cVar2 = this.f12579a.f12574a;
            ((k) it.next()).a(cVar2);
        }
        linkedList2 = this.f12579a.f12576c;
        linkedList2.clear();
        this.f12579a.f12575b = null;
    }
}
