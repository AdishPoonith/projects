package com.google.common.util.concurrent;

import java.util.concurrent.locks.LockSupport;
/* loaded from: classes.dex */
final class g {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Object obj, long j10) {
        LockSupport.parkNanos(obj, Math.min(j10, 2147483647999999999L));
    }
}
