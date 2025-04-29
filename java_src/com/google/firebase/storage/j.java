package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public class j extends w5.l {

    /* renamed from: j  reason: collision with root package name */
    private final int f6945j;

    /* renamed from: k  reason: collision with root package name */
    private final int f6946k;

    /* renamed from: l  reason: collision with root package name */
    private Throwable f6947l;

    j(int i10, Throwable th, int i11) {
        super(g(i10));
        this.f6947l = th;
        this.f6945j = i10;
        this.f6946k = i11;
        Log.e("StorageException", "StorageException has occurred.\n" + g(i10) + "\n Code: " + i10 + " HttpResult: " + i11);
        Throwable th2 = this.f6947l;
        if (th2 != null) {
            Log.e("StorageException", th2.getMessage(), this.f6947l);
        }
    }

    private static int a(Status status) {
        if (status.F()) {
            return -13040;
        }
        return status.equals(Status.f3737s) ? -13030 : -13000;
    }

    private static int b(Throwable th, int i10) {
        if (th instanceof a) {
            return -13040;
        }
        if (i10 != -2) {
            if (i10 != 401) {
                if (i10 != 409) {
                    if (i10 != 403) {
                        return i10 != 404 ? -13000 : -13010;
                    }
                    return -13021;
                }
                return -13031;
            }
            return -13020;
        }
        return -13030;
    }

    public static j c(Status status) {
        c4.s.j(status);
        c4.s.a(!status.G());
        return new j(a(status), null, 0);
    }

    public static j d(Throwable th) {
        return e(th, 0);
    }

    public static j e(Throwable th, int i10) {
        if (th instanceof j) {
            return (j) th;
        }
        if (h(i10) && th == null) {
            return null;
        }
        return new j(b(th, i10), th, i10);
    }

    static String g(int i10) {
        if (i10 != -13040) {
            if (i10 != -13031) {
                if (i10 != -13030) {
                    if (i10 != -13021) {
                        if (i10 != -13020) {
                            switch (i10) {
                                case -13013:
                                    return "Quota for bucket exceeded, please view quota on www.firebase.google.com/storage.";
                                case -13012:
                                    return "Project does not exist.";
                                case -13011:
                                    return "Bucket does not exist.";
                                case -13010:
                                    return "Object does not exist at location.";
                                default:
                                    return "An unknown error occurred, please check the HTTP result code and inner exception for server response.";
                            }
                        }
                        return "User is not authenticated, please authenticate using Firebase Authentication and try again.";
                    }
                    return "User does not have permission to access this object.";
                }
                return "The operation retry limit has been exceeded.";
            }
            return "Object has a checksum which does not match. Please retry the operation.";
        }
        return "The operation was cancelled.";
    }

    private static boolean h(int i10) {
        return i10 == 0 || (i10 >= 200 && i10 < 300);
    }

    public int f() {
        return this.f6945j;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        Throwable th = this.f6947l;
        if (th == this) {
            return null;
        }
        return th;
    }
}
