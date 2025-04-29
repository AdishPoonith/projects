package l6;

import java.util.Comparator;
/* loaded from: classes.dex */
class e {

    /* renamed from: c  reason: collision with root package name */
    static final Comparator<e> f13129c = new Comparator() { // from class: l6.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int e10;
            e10 = e.e((e) obj, (e) obj2);
            return e10;
        }
    };

    /* renamed from: d  reason: collision with root package name */
    static final Comparator<e> f13130d = new Comparator() { // from class: l6.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int f10;
            f10 = e.f((e) obj, (e) obj2);
            return f10;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final m6.l f13131a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13132b;

    public e(m6.l lVar, int i10) {
        this.f13131a = lVar;
        this.f13132b = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int e(e eVar, e eVar2) {
        int compareTo = eVar.f13131a.compareTo(eVar2.f13131a);
        return compareTo != 0 ? compareTo : q6.g0.l(eVar.f13132b, eVar2.f13132b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int f(e eVar, e eVar2) {
        int l10 = q6.g0.l(eVar.f13132b, eVar2.f13132b);
        return l10 != 0 ? l10 : eVar.f13131a.compareTo(eVar2.f13131a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f13132b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m6.l d() {
        return this.f13131a;
    }
}
