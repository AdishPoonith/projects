package p6;

import j6.n;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
final class t0 {

    /* renamed from: a  reason: collision with root package name */
    private int f15682a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final Map<m6.l, n.a> f15683b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private boolean f15684c = true;

    /* renamed from: d  reason: collision with root package name */
    private com.google.protobuf.i f15685d = com.google.protobuf.i.f7143k;

    /* renamed from: e  reason: collision with root package name */
    private boolean f15686e = false;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15687a;

        static {
            int[] iArr = new int[n.a.values().length];
            f15687a = iArr;
            try {
                iArr[n.a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15687a[n.a.MODIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15687a[n.a.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(m6.l lVar, n.a aVar) {
        this.f15684c = true;
        this.f15683b.put(lVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.f15684c = false;
        this.f15683b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.f15684c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.f15686e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return this.f15682a != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        this.f15684c = true;
        this.f15686e = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        this.f15682a++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        this.f15682a--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(m6.l lVar) {
        this.f15684c = true;
        this.f15683b.remove(lVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s0 j() {
        d6.e<m6.l> i10 = m6.l.i();
        d6.e<m6.l> i11 = m6.l.i();
        d6.e<m6.l> i12 = m6.l.i();
        d6.e<m6.l> eVar = i10;
        d6.e<m6.l> eVar2 = i11;
        d6.e<m6.l> eVar3 = i12;
        for (Map.Entry<m6.l, n.a> entry : this.f15683b.entrySet()) {
            m6.l key = entry.getKey();
            n.a value = entry.getValue();
            int i13 = a.f15687a[value.ordinal()];
            if (i13 == 1) {
                eVar = eVar.k(key);
            } else if (i13 == 2) {
                eVar2 = eVar2.k(key);
            } else if (i13 != 3) {
                throw q6.b.a("Encountered invalid change type: %s", value);
            } else {
                eVar3 = eVar3.k(key);
            }
        }
        return new s0(this.f15685d, this.f15686e, eVar, eVar2, eVar3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(com.google.protobuf.i iVar) {
        if (iVar.isEmpty()) {
            return;
        }
        this.f15684c = true;
        this.f15685d = iVar;
    }
}
