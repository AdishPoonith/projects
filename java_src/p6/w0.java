package p6;

import i9.j1;
import java.util.List;
/* loaded from: classes.dex */
public abstract class w0 {

    /* loaded from: classes.dex */
    public static final class b extends w0 {

        /* renamed from: a  reason: collision with root package name */
        private final List<Integer> f15719a;

        /* renamed from: b  reason: collision with root package name */
        private final List<Integer> f15720b;

        /* renamed from: c  reason: collision with root package name */
        private final m6.l f15721c;

        /* renamed from: d  reason: collision with root package name */
        private final m6.s f15722d;

        public b(List<Integer> list, List<Integer> list2, m6.l lVar, m6.s sVar) {
            super();
            this.f15719a = list;
            this.f15720b = list2;
            this.f15721c = lVar;
            this.f15722d = sVar;
        }

        public m6.l a() {
            return this.f15721c;
        }

        public m6.s b() {
            return this.f15722d;
        }

        public List<Integer> c() {
            return this.f15720b;
        }

        public List<Integer> d() {
            return this.f15719a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f15719a.equals(bVar.f15719a) && this.f15720b.equals(bVar.f15720b) && this.f15721c.equals(bVar.f15721c)) {
                m6.s sVar = this.f15722d;
                m6.s sVar2 = bVar.f15722d;
                return sVar != null ? sVar.equals(sVar2) : sVar2 == null;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = ((((this.f15719a.hashCode() * 31) + this.f15720b.hashCode()) * 31) + this.f15721c.hashCode()) * 31;
            m6.s sVar = this.f15722d;
            return hashCode + (sVar != null ? sVar.hashCode() : 0);
        }

        public String toString() {
            return "DocumentChange{updatedTargetIds=" + this.f15719a + ", removedTargetIds=" + this.f15720b + ", key=" + this.f15721c + ", newDocument=" + this.f15722d + '}';
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends w0 {

        /* renamed from: a  reason: collision with root package name */
        private final int f15723a;

        /* renamed from: b  reason: collision with root package name */
        private final p f15724b;

        public c(int i10, p pVar) {
            super();
            this.f15723a = i10;
            this.f15724b = pVar;
        }

        public p a() {
            return this.f15724b;
        }

        public int b() {
            return this.f15723a;
        }

        public String toString() {
            return "ExistenceFilterWatchChange{targetId=" + this.f15723a + ", existenceFilter=" + this.f15724b + '}';
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends w0 {

        /* renamed from: a  reason: collision with root package name */
        private final e f15725a;

        /* renamed from: b  reason: collision with root package name */
        private final List<Integer> f15726b;

        /* renamed from: c  reason: collision with root package name */
        private final com.google.protobuf.i f15727c;

        /* renamed from: d  reason: collision with root package name */
        private final j1 f15728d;

        public d(e eVar, List<Integer> list, com.google.protobuf.i iVar, j1 j1Var) {
            super();
            q6.b.d(j1Var == null || eVar == e.Removed, "Got cause for a target change that was not a removal", new Object[0]);
            this.f15725a = eVar;
            this.f15726b = list;
            this.f15727c = iVar;
            if (j1Var == null || j1Var.o()) {
                this.f15728d = null;
            } else {
                this.f15728d = j1Var;
            }
        }

        public j1 a() {
            return this.f15728d;
        }

        public e b() {
            return this.f15725a;
        }

        public com.google.protobuf.i c() {
            return this.f15727c;
        }

        public List<Integer> d() {
            return this.f15726b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f15725a == dVar.f15725a && this.f15726b.equals(dVar.f15726b) && this.f15727c.equals(dVar.f15727c)) {
                j1 j1Var = this.f15728d;
                return j1Var != null ? dVar.f15728d != null && j1Var.m().equals(dVar.f15728d.m()) : dVar.f15728d == null;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = ((((this.f15725a.hashCode() * 31) + this.f15726b.hashCode()) * 31) + this.f15727c.hashCode()) * 31;
            j1 j1Var = this.f15728d;
            return hashCode + (j1Var != null ? j1Var.m().hashCode() : 0);
        }

        public String toString() {
            return "WatchTargetChange{changeType=" + this.f15725a + ", targetIds=" + this.f15726b + '}';
        }
    }

    /* loaded from: classes.dex */
    public enum e {
        NoChange,
        Added,
        Removed,
        Current,
        Reset
    }

    private w0() {
    }
}
