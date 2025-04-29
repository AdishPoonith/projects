package fa;

import java.util.Random;
/* loaded from: classes.dex */
public abstract class a extends c {
    @Override // fa.c
    public int b(int i10) {
        return d.e(f().nextInt(), i10);
    }

    @Override // fa.c
    public int c() {
        return f().nextInt();
    }

    @Override // fa.c
    public int d(int i10) {
        return f().nextInt(i10);
    }

    public abstract Random f();
}
