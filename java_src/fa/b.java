package fa;

import java.util.Random;
import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public final class b extends fa.a {

    /* renamed from: l  reason: collision with root package name */
    private final a f8871l = new a();

    /* loaded from: classes.dex */
    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // fa.a
    public Random f() {
        Random random = this.f8871l.get();
        l.d(random, "implStorage.get()");
        return random;
    }
}
