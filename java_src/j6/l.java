package j6;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class l extends r {

    /* renamed from: a  reason: collision with root package name */
    private final List<r> f12235a;

    /* renamed from: b  reason: collision with root package name */
    private final a f12236b;

    /* renamed from: c  reason: collision with root package name */
    private List<q> f12237c;

    /* loaded from: classes.dex */
    public enum a {
        AND("and"),
        OR("or");
        

        /* renamed from: j  reason: collision with root package name */
        private final String f12241j;

        a(String str) {
            this.f12241j = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f12241j;
        }
    }

    public l(List<r> list, a aVar) {
        this.f12235a = new ArrayList(list);
        this.f12236b = aVar;
    }

    private q g(q6.t<q, Boolean> tVar) {
        for (q qVar : d()) {
            if (tVar.apply(qVar).booleanValue()) {
                return qVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean m(q qVar) {
        return Boolean.valueOf(qVar.j());
    }

    @Override // j6.r
    public String a() {
        StringBuilder sb = new StringBuilder();
        if (l()) {
            for (r rVar : this.f12235a) {
                sb.append(rVar.a());
            }
            return sb.toString();
        }
        sb.append(this.f12236b.toString() + "(");
        sb.append(TextUtils.join(",", this.f12235a));
        sb.append(")");
        return sb.toString();
    }

    @Override // j6.r
    public List<r> b() {
        return Collections.unmodifiableList(this.f12235a);
    }

    @Override // j6.r
    public m6.r c() {
        q g10 = g(new q6.t() { // from class: j6.k
            @Override // q6.t
            public final Object apply(Object obj) {
                Boolean m10;
                m10 = l.m((q) obj);
                return m10;
            }
        });
        if (g10 != null) {
            return g10.g();
        }
        return null;
    }

    @Override // j6.r
    public List<q> d() {
        List<q> list = this.f12237c;
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        this.f12237c = new ArrayList();
        for (r rVar : this.f12235a) {
            this.f12237c.addAll(rVar.d());
        }
        return Collections.unmodifiableList(this.f12237c);
    }

    @Override // j6.r
    public boolean e(m6.i iVar) {
        if (i()) {
            for (r rVar : this.f12235a) {
                if (!rVar.e(iVar)) {
                    return false;
                }
            }
            return true;
        }
        for (r rVar2 : this.f12235a) {
            if (rVar2.e(iVar)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f12236b == lVar.f12236b && this.f12235a.equals(lVar.f12235a);
    }

    public a h() {
        return this.f12236b;
    }

    public int hashCode() {
        return ((1147 + this.f12236b.hashCode()) * 31) + this.f12235a.hashCode();
    }

    public boolean i() {
        return this.f12236b == a.AND;
    }

    public boolean j() {
        return this.f12236b == a.OR;
    }

    public boolean k() {
        for (r rVar : this.f12235a) {
            if (rVar instanceof l) {
                return false;
            }
        }
        return true;
    }

    public boolean l() {
        return k() && i();
    }

    public l n(List<r> list) {
        ArrayList arrayList = new ArrayList(this.f12235a);
        arrayList.addAll(list);
        return new l(arrayList, this.f12236b);
    }

    public String toString() {
        return a();
    }
}
