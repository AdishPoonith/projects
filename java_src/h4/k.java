package h4;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import c4.s;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private static String f9472a;

    /* renamed from: b  reason: collision with root package name */
    private static int f9473b;

    public static String a() {
        BufferedReader bufferedReader;
        if (f9472a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f9472a = Application.getProcessName();
            } else {
                int i10 = f9473b;
                if (i10 == 0) {
                    i10 = Process.myPid();
                    f9473b = i10;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i10 > 0) {
                    try {
                        String str2 = "/proc/" + i10 + "/cmdline";
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str2));
                            try {
                                String readLine = bufferedReader.readLine();
                                s.j(readLine);
                                str = readLine.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                i.a(bufferedReader2);
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    i.a(bufferedReader);
                }
                f9472a = str;
            }
        }
        return f9472a;
    }
}
