package ga;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public final class a extends fa.a {
    @Override // fa.c
    public int e(int i10, int i11) {
        return ThreadLocalRandom.current().nextInt(i10, i11);
    }

    @Override // fa.a
    public Random f() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        l.d(current, "current()");
        return current;
    }
}
