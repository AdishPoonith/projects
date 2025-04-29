package i6;

import m6.w;
/* loaded from: classes.dex */
public class j implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f9751a;

    /* renamed from: b  reason: collision with root package name */
    private final i f9752b;

    /* renamed from: c  reason: collision with root package name */
    private final w f9753c;

    public j(String str, i iVar, w wVar) {
        this.f9751a = str;
        this.f9752b = iVar;
        this.f9753c = wVar;
    }

    public i a() {
        return this.f9752b;
    }

    public String b() {
        return this.f9751a;
    }

    public w c() {
        return this.f9753c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f9751a.equals(jVar.f9751a) && this.f9752b.equals(jVar.f9752b)) {
            return this.f9753c.equals(jVar.f9753c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f9751a.hashCode() * 31) + this.f9752b.hashCode()) * 31) + this.f9753c.hashCode();
    }
}
