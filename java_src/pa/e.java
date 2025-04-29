package pa;

import da.p;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.internal.z;
import la.v1;
import v9.g;
/* loaded from: classes.dex */
public final class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends m implements p<Integer, g.b, Integer> {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ c<?> f15853j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c<?> cVar) {
            super(2);
            this.f15853j = cVar;
        }

        public final Integer a(int i10, g.b bVar) {
            g.c<?> key = bVar.getKey();
            g.b b10 = this.f15853j.f15846k.b(key);
            if (key != v1.f13674g) {
                return Integer.valueOf(bVar != b10 ? Integer.MIN_VALUE : i10 + 1);
            }
            v1 v1Var = (v1) b10;
            v1 b11 = e.b((v1) bVar, v1Var);
            if (b11 == v1Var) {
                if (v1Var != null) {
                    i10++;
                }
                return Integer.valueOf(i10);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b11 + ", expected child of " + v1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // da.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, g.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    public static final void a(c<?> cVar, g gVar) {
        if (((Number) gVar.N(0, new a(cVar))).intValue() == cVar.f15847l) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + cVar.f15846k + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final v1 b(v1 v1Var, v1 v1Var2) {
        while (v1Var != null) {
            if (v1Var == v1Var2 || !(v1Var instanceof z)) {
                return v1Var;
            }
            v1Var = ((z) v1Var).T0();
        }
        return null;
    }
}
