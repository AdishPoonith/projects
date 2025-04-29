package q0;

import android.preference.PreferenceManager;
import android.util.Log;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f15900a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final String f15901b = c.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private static final ReentrantReadWriteLock f15902c = new ReentrantReadWriteLock();

    /* renamed from: d  reason: collision with root package name */
    private static String f15903d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile boolean f15904e;

    private c() {
    }

    public static final String b() {
        if (!f15904e) {
            Log.w(f15901b, "initStore should have been called before calling setUserID");
            f15900a.c();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f15902c;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str = f15903d;
            reentrantReadWriteLock.readLock().unlock();
            return str;
        } catch (Throwable th) {
            f15902c.readLock().unlock();
            throw th;
        }
    }

    private final void c() {
        if (f15904e) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f15902c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f15904e) {
                reentrantReadWriteLock.writeLock().unlock();
                return;
            }
            p0.f0 f0Var = p0.f0.f14852a;
            f15903d = PreferenceManager.getDefaultSharedPreferences(p0.f0.l()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
            f15904e = true;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            f15902c.writeLock().unlock();
            throw th;
        }
    }

    public static final void d() {
        if (f15904e) {
            return;
        }
        c0.f15905b.b().execute(new Runnable() { // from class: q0.b
            @Override // java.lang.Runnable
            public final void run() {
                c.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e() {
        f15900a.c();
    }
}
