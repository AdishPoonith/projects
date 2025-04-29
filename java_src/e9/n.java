package e9;

import java.util.ArrayList;
import java.util.Iterator;
import r8.d;
/* loaded from: classes.dex */
final class n implements d.b {

    /* renamed from: a  reason: collision with root package name */
    private d.b f8200a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<Object> f8201b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private boolean f8202c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        String f8203a;

        /* renamed from: b  reason: collision with root package name */
        String f8204b;

        /* renamed from: c  reason: collision with root package name */
        Object f8205c;

        b(String str, String str2, Object obj) {
            this.f8203a = str;
            this.f8204b = str2;
            this.f8205c = obj;
        }
    }

    private void d(Object obj) {
        if (this.f8202c) {
            return;
        }
        this.f8201b.add(obj);
    }

    private void e() {
        if (this.f8200a == null) {
            return;
        }
        Iterator<Object> it = this.f8201b.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof a) {
                this.f8200a.c();
            } else if (next instanceof b) {
                b bVar = (b) next;
                this.f8200a.b(bVar.f8203a, bVar.f8204b, bVar.f8205c);
            } else {
                this.f8200a.a(next);
            }
        }
        this.f8201b.clear();
    }

    @Override // r8.d.b
    public void a(Object obj) {
        d(obj);
        e();
    }

    @Override // r8.d.b
    public void b(String str, String str2, Object obj) {
        d(new b(str, str2, obj));
        e();
    }

    @Override // r8.d.b
    public void c() {
        d(new a());
        e();
        this.f8202c = true;
    }

    public void f(d.b bVar) {
        this.f8200a = bVar;
        e();
    }
}
