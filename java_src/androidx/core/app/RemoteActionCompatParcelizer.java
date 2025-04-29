package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1502a = (IconCompat) aVar.v(remoteActionCompat.f1502a, 1);
        remoteActionCompat.f1503b = aVar.l(remoteActionCompat.f1503b, 2);
        remoteActionCompat.f1504c = aVar.l(remoteActionCompat.f1504c, 3);
        remoteActionCompat.f1505d = (PendingIntent) aVar.r(remoteActionCompat.f1505d, 4);
        remoteActionCompat.f1506e = aVar.h(remoteActionCompat.f1506e, 5);
        remoteActionCompat.f1507f = aVar.h(remoteActionCompat.f1507f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f1502a, 1);
        aVar.D(remoteActionCompat.f1503b, 2);
        aVar.D(remoteActionCompat.f1504c, 3);
        aVar.H(remoteActionCompat.f1505d, 4);
        aVar.z(remoteActionCompat.f1506e, 5);
        aVar.z(remoteActionCompat.f1507f, 6);
    }
}
