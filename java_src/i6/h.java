package i6;

import java.util.List;
import m6.l;
import m6.w;
/* loaded from: classes.dex */
public class h implements c {

    /* renamed from: a  reason: collision with root package name */
    private final l f9745a;

    /* renamed from: b  reason: collision with root package name */
    private final w f9746b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9747c;

    /* renamed from: d  reason: collision with root package name */
    private final List<String> f9748d;

    public h(l lVar, w wVar, boolean z10, List<String> list) {
        this.f9745a = lVar;
        this.f9746b = wVar;
        this.f9747c = z10;
        this.f9748d = list;
    }

    public boolean a() {
        return this.f9747c;
    }

    public l b() {
        return this.f9745a;
    }

    public List<String> c() {
        return this.f9748d;
    }

    public w d() {
        return this.f9746b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f9747c == hVar.f9747c && this.f9745a.equals(hVar.f9745a) && this.f9746b.equals(hVar.f9746b)) {
            return this.f9748d.equals(hVar.f9748d);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f9745a.hashCode() * 31) + this.f9746b.hashCode()) * 31) + (this.f9747c ? 1 : 0)) * 31) + this.f9748d.hashCode();
    }
}
