package a6;

import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.f2;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import java.security.MessageDigest;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d0 implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f207a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ IntegrityManager f208b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ e1 f209c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(e1 e1Var, String str, IntegrityManager integrityManager) {
        this.f209c = e1Var;
        this.f207a = str;
        this.f208b = integrityManager;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Object then(Task task) {
        String str;
        if (!task.isSuccessful()) {
            str = e1.f214b;
            Log.e(str, "Problem retrieving Play Integrity producer project:  ".concat(String.valueOf(task.getException().getMessage())));
            return Tasks.forException(task.getException());
        }
        this.f209c.f216a = ((f2) task.getResult()).a();
        return this.f208b.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(((f2) task.getResult()).a())).setNonce(new String(Base64.encode(MessageDigest.getInstance("SHA-256").digest(this.f207a.getBytes("UTF-8")), 11))).build());
    }
}
