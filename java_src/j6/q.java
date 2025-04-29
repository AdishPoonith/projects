package j6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class q extends r {

    /* renamed from: a  reason: collision with root package name */
    private final b f12299a;

    /* renamed from: b  reason: collision with root package name */
    private final d7.b0 f12300b;

    /* renamed from: c  reason: collision with root package name */
    private final m6.r f12301c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12302a;

        static {
            int[] iArr = new int[b.values().length];
            f12302a = iArr;
            try {
                iArr[b.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12302a[b.LESS_THAN_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12302a[b.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12302a[b.NOT_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12302a[b.GREATER_THAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12302a[b.GREATER_THAN_OR_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        LESS_THAN("<"),
        LESS_THAN_OR_EQUAL("<="),
        EQUAL("=="),
        NOT_EQUAL("!="),
        GREATER_THAN(">"),
        GREATER_THAN_OR_EQUAL(">="),
        ARRAY_CONTAINS("array_contains"),
        ARRAY_CONTAINS_ANY("array_contains_any"),
        IN("in"),
        NOT_IN("not_in");
        

        /* renamed from: j  reason: collision with root package name */
        private final String f12314j;

        b(String str) {
            this.f12314j = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f12314j;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public q(m6.r rVar, b bVar, d7.b0 b0Var) {
        this.f12301c = rVar;
        this.f12299a = bVar;
        this.f12300b = b0Var;
    }

    public static q f(m6.r rVar, b bVar, d7.b0 b0Var) {
        if (!rVar.x()) {
            return bVar == b.ARRAY_CONTAINS ? new f(rVar, b0Var) : bVar == b.IN ? new q0(rVar, b0Var) : bVar == b.ARRAY_CONTAINS_ANY ? new e(rVar, b0Var) : bVar == b.NOT_IN ? new y0(rVar, b0Var) : new q(rVar, bVar, b0Var);
        } else if (bVar == b.IN) {
            return new s0(rVar, b0Var);
        } else {
            if (bVar == b.NOT_IN) {
                return new t0(rVar, b0Var);
            }
            boolean z10 = (bVar == b.ARRAY_CONTAINS || bVar == b.ARRAY_CONTAINS_ANY) ? false : true;
            q6.b.d(z10, bVar.toString() + "queries don't make sense on document keys", new Object[0]);
            return new r0(rVar, bVar, b0Var);
        }
    }

    @Override // j6.r
    public String a() {
        return g().h() + h().toString() + m6.y.b(i());
    }

    @Override // j6.r
    public List<r> b() {
        return Collections.singletonList(this);
    }

    @Override // j6.r
    public m6.r c() {
        if (j()) {
            return g();
        }
        return null;
    }

    @Override // j6.r
    public List<q> d() {
        return Collections.singletonList(this);
    }

    @Override // j6.r
    public boolean e(m6.i iVar) {
        d7.b0 b10 = iVar.b(this.f12301c);
        return this.f12299a == b.NOT_EQUAL ? b10 != null && k(m6.y.i(b10, this.f12300b)) : b10 != null && m6.y.G(b10) == m6.y.G(this.f12300b) && k(m6.y.i(b10, this.f12300b));
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f12299a == qVar.f12299a && this.f12301c.equals(qVar.f12301c) && this.f12300b.equals(qVar.f12300b);
    }

    public m6.r g() {
        return this.f12301c;
    }

    public b h() {
        return this.f12299a;
    }

    public int hashCode() {
        return ((((1147 + this.f12299a.hashCode()) * 31) + this.f12301c.hashCode()) * 31) + this.f12300b.hashCode();
    }

    public d7.b0 i() {
        return this.f12300b;
    }

    public boolean j() {
        return Arrays.asList(b.LESS_THAN, b.LESS_THAN_OR_EQUAL, b.GREATER_THAN, b.GREATER_THAN_OR_EQUAL, b.NOT_EQUAL, b.NOT_IN).contains(this.f12299a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean k(int i10) {
        switch (a.f12302a[this.f12299a.ordinal()]) {
            case 1:
                return i10 < 0;
            case 2:
                return i10 <= 0;
            case 3:
                return i10 == 0;
            case 4:
                return i10 != 0;
            case 5:
                return i10 > 0;
            case 6:
                return i10 >= 0;
            default:
                throw q6.b.a("Unknown FieldFilter operator: %s", this.f12299a);
        }
    }

    public String toString() {
        return a();
    }
}
