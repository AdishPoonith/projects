package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class s implements Iterable<Intent> {

    /* renamed from: j  reason: collision with root package name */
    private final ArrayList<Intent> f1627j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    private final Context f1628k;

    /* loaded from: classes.dex */
    public interface a {
        Intent n();
    }

    private s(Context context) {
        this.f1628k = context;
    }

    public static s l(Context context) {
        return new s(context);
    }

    public s b(Intent intent) {
        this.f1627j.add(intent);
        return this;
    }

    public s e(Activity activity) {
        Intent n10 = activity instanceof a ? ((a) activity).n() : null;
        if (n10 == null) {
            n10 = i.a(activity);
        }
        if (n10 != null) {
            ComponentName component = n10.getComponent();
            if (component == null) {
                component = n10.resolveActivity(this.f1628k.getPackageManager());
            }
            k(component);
            b(n10);
        }
        return this;
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f1627j.iterator();
    }

    public s k(ComponentName componentName) {
        int size = this.f1627j.size();
        try {
            Context context = this.f1628k;
            while (true) {
                Intent b10 = i.b(context, componentName);
                if (b10 == null) {
                    return this;
                }
                this.f1627j.add(size, b10);
                context = this.f1628k;
                componentName = b10.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public void m() {
        p(null);
    }

    public void p(Bundle bundle) {
        if (this.f1627j.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f1627j.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (androidx.core.content.a.h(this.f1628k, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f1628k.startActivity(intent);
    }
}
