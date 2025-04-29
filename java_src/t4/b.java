package t4;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
/* loaded from: classes.dex */
public interface b {
    Task<Void> e(d dVar);

    Task<Void> f(LocationRequest locationRequest, d dVar, Looper looper);
}
