package ma;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.internal.r;
import la.g2;
/* loaded from: classes.dex */
public final class a implements r {
    @Override // kotlinx.coroutines.internal.r
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // kotlinx.coroutines.internal.r
    public g2 b(List<? extends r> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new d(f.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // kotlinx.coroutines.internal.r
    public int c() {
        return 1073741823;
    }
}
