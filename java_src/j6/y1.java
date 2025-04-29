package j6;

import j6.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class y1 {

    /* renamed from: a  reason: collision with root package name */
    private final b1 f12378a;

    /* renamed from: b  reason: collision with root package name */
    private final m6.n f12379b;

    /* renamed from: c  reason: collision with root package name */
    private final m6.n f12380c;

    /* renamed from: d  reason: collision with root package name */
    private final List<n> f12381d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f12382e;

    /* renamed from: f  reason: collision with root package name */
    private final d6.e<m6.l> f12383f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f12384g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f12385h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f12386i;

    /* loaded from: classes.dex */
    public enum a {
        NONE,
        LOCAL,
        SYNCED
    }

    public y1(b1 b1Var, m6.n nVar, m6.n nVar2, List<n> list, boolean z10, d6.e<m6.l> eVar, boolean z11, boolean z12, boolean z13) {
        this.f12378a = b1Var;
        this.f12379b = nVar;
        this.f12380c = nVar2;
        this.f12381d = list;
        this.f12382e = z10;
        this.f12383f = eVar;
        this.f12384g = z11;
        this.f12385h = z12;
        this.f12386i = z13;
    }

    public static y1 c(b1 b1Var, m6.n nVar, d6.e<m6.l> eVar, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList = new ArrayList();
        Iterator<m6.i> it = nVar.iterator();
        while (it.hasNext()) {
            arrayList.add(n.a(n.a.ADDED, it.next()));
        }
        return new y1(b1Var, nVar, m6.n.k(b1Var.c()), arrayList, z10, eVar, true, z11, z12);
    }

    public boolean a() {
        return this.f12384g;
    }

    public boolean b() {
        return this.f12385h;
    }

    public List<n> d() {
        return this.f12381d;
    }

    public m6.n e() {
        return this.f12379b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y1) {
            y1 y1Var = (y1) obj;
            if (this.f12382e == y1Var.f12382e && this.f12384g == y1Var.f12384g && this.f12385h == y1Var.f12385h && this.f12378a.equals(y1Var.f12378a) && this.f12383f.equals(y1Var.f12383f) && this.f12379b.equals(y1Var.f12379b) && this.f12380c.equals(y1Var.f12380c) && this.f12386i == y1Var.f12386i) {
                return this.f12381d.equals(y1Var.f12381d);
            }
            return false;
        }
        return false;
    }

    public d6.e<m6.l> f() {
        return this.f12383f;
    }

    public m6.n g() {
        return this.f12380c;
    }

    public b1 h() {
        return this.f12378a;
    }

    public int hashCode() {
        return (((((((((((((((this.f12378a.hashCode() * 31) + this.f12379b.hashCode()) * 31) + this.f12380c.hashCode()) * 31) + this.f12381d.hashCode()) * 31) + this.f12383f.hashCode()) * 31) + (this.f12382e ? 1 : 0)) * 31) + (this.f12384g ? 1 : 0)) * 31) + (this.f12385h ? 1 : 0)) * 31) + (this.f12386i ? 1 : 0);
    }

    public boolean i() {
        return this.f12386i;
    }

    public boolean j() {
        return !this.f12383f.isEmpty();
    }

    public boolean k() {
        return this.f12382e;
    }

    public String toString() {
        return "ViewSnapshot(" + this.f12378a + ", " + this.f12379b + ", " + this.f12380c + ", " + this.f12381d + ", isFromCache=" + this.f12382e + ", mutatedKeys=" + this.f12383f.size() + ", didSyncStateChange=" + this.f12384g + ", excludesMetadataChanges=" + this.f12385h + ", hasCachedResults=" + this.f12386i + ")";
    }
}
