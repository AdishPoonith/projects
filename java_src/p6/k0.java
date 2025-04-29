package p6;

import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    private final m6.w f15600a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, s0> f15601b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<Integer> f15602c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<m6.l, m6.s> f15603d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<m6.l> f15604e;

    public k0(m6.w wVar, Map<Integer, s0> map, Set<Integer> set, Map<m6.l, m6.s> map2, Set<m6.l> set2) {
        this.f15600a = wVar;
        this.f15601b = map;
        this.f15602c = set;
        this.f15603d = map2;
        this.f15604e = set2;
    }

    public Map<m6.l, m6.s> a() {
        return this.f15603d;
    }

    public Set<m6.l> b() {
        return this.f15604e;
    }

    public m6.w c() {
        return this.f15600a;
    }

    public Map<Integer, s0> d() {
        return this.f15601b;
    }

    public Set<Integer> e() {
        return this.f15602c;
    }

    public String toString() {
        return "RemoteEvent{snapshotVersion=" + this.f15600a + ", targetChanges=" + this.f15601b + ", targetMismatches=" + this.f15602c + ", documentUpdates=" + this.f15603d + ", resolvedLimboDocuments=" + this.f15604e + '}';
    }
}
