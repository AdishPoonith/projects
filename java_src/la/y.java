package la;
/* loaded from: classes.dex */
final class y {

    /* renamed from: a  reason: collision with root package name */
    public final Object f13681a;

    /* renamed from: b  reason: collision with root package name */
    public final j f13682b;

    /* renamed from: c  reason: collision with root package name */
    public final da.l<Throwable, s9.u> f13683c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f13684d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f13685e;

    /* JADX WARN: Multi-variable type inference failed */
    public y(Object obj, j jVar, da.l<? super Throwable, s9.u> lVar, Object obj2, Throwable th) {
        this.f13681a = obj;
        this.f13682b = jVar;
        this.f13683c = lVar;
        this.f13684d = obj2;
        this.f13685e = th;
    }

    public /* synthetic */ y(Object obj, j jVar, da.l lVar, Object obj2, Throwable th, int i10, kotlin.jvm.internal.g gVar) {
        this(obj, (i10 & 2) != 0 ? null : jVar, (i10 & 4) != 0 ? null : lVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th);
    }

    public static /* synthetic */ y b(y yVar, Object obj, j jVar, da.l lVar, Object obj2, Throwable th, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = yVar.f13681a;
        }
        if ((i10 & 2) != 0) {
            jVar = yVar.f13682b;
        }
        j jVar2 = jVar;
        da.l<Throwable, s9.u> lVar2 = lVar;
        if ((i10 & 4) != 0) {
            lVar2 = yVar.f13683c;
        }
        da.l lVar3 = lVar2;
        if ((i10 & 8) != 0) {
            obj2 = yVar.f13684d;
        }
        Object obj4 = obj2;
        if ((i10 & 16) != 0) {
            th = yVar.f13685e;
        }
        return yVar.a(obj, jVar2, lVar3, obj4, th);
    }

    public final y a(Object obj, j jVar, da.l<? super Throwable, s9.u> lVar, Object obj2, Throwable th) {
        return new y(obj, jVar, lVar, obj2, th);
    }

    public final boolean c() {
        return this.f13685e != null;
    }

    public final void d(m<?> mVar, Throwable th) {
        j jVar = this.f13682b;
        if (jVar != null) {
            mVar.n(jVar, th);
        }
        da.l<Throwable, s9.u> lVar = this.f13683c;
        if (lVar != null) {
            mVar.q(lVar, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            return kotlin.jvm.internal.l.a(this.f13681a, yVar.f13681a) && kotlin.jvm.internal.l.a(this.f13682b, yVar.f13682b) && kotlin.jvm.internal.l.a(this.f13683c, yVar.f13683c) && kotlin.jvm.internal.l.a(this.f13684d, yVar.f13684d) && kotlin.jvm.internal.l.a(this.f13685e, yVar.f13685e);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f13681a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        j jVar = this.f13682b;
        int hashCode2 = (hashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        da.l<Throwable, s9.u> lVar = this.f13683c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f13684d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f13685e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f13681a + ", cancelHandler=" + this.f13682b + ", onCancellation=" + this.f13683c + ", idempotentResume=" + this.f13684d + ", cancelCause=" + this.f13685e + ')';
    }
}
