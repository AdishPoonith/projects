package z3;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: l  reason: collision with root package name */
    private static final f4.a f20866l = new f4.a("RevokeAccessOperation", new String[0]);

    /* renamed from: j  reason: collision with root package name */
    private final String f20867j;

    /* renamed from: k  reason: collision with root package name */
    private final com.google.android.gms.common.api.internal.t f20868k = new com.google.android.gms.common.api.internal.t(null);

    public f(String str) {
        this.f20867j = c4.s.f(str);
    }

    public static com.google.android.gms.common.api.h a(String str) {
        if (str == null) {
            return com.google.android.gms.common.api.i.a(new Status(4), null);
        }
        f fVar = new f(str);
        new Thread(fVar).start();
        return fVar.f20868k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.f3736r;
        try {
            String str = this.f20867j;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + str).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f3734p;
            } else {
                f20866l.c("Unable to revoke access!", new Object[0]);
            }
            f4.a aVar = f20866l;
            aVar.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            f20866l.c("IOException when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]);
        } catch (Exception e11) {
            f20866l.c("Exception when revoking access: ".concat(String.valueOf(e11.toString())), new Object[0]);
        }
        this.f20868k.f(status);
    }
}
