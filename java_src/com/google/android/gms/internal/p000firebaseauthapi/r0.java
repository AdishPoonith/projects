package com.google.android.gms.internal.p000firebaseauthapi;

import c4.s;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.json.JSONException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.r0  reason: invalid package */
/* loaded from: classes.dex */
public final class r0 {
    public static void a(String str, o0 o0Var, Type type, w wVar) {
        String message;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(60000);
            wVar.a(httpURLConnection);
            c(httpURLConnection, o0Var, type);
        } catch (SocketTimeoutException unused) {
            message = "TIMEOUT";
            o0Var.zza(message);
        } catch (UnknownHostException unused2) {
            message = "<<Network Error>>";
            o0Var.zza(message);
        } catch (IOException e10) {
            message = e10.getMessage();
            o0Var.zza(message);
        }
    }

    public static void b(String str, s sVar, o0 o0Var, Type type, w wVar) {
        String str2;
        try {
            s.j(sVar);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = sVar.zza().getBytes(Charset.defaultCharset());
            int length = bytes.length;
            httpURLConnection.setFixedLengthStreamingMode(length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setConnectTimeout(60000);
            wVar.a(httpURLConnection);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), length);
            try {
                bufferedOutputStream.write(bytes, 0, length);
                bufferedOutputStream.close();
                c(httpURLConnection, o0Var, type);
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        } catch (IOException e10) {
            e = e10;
            str2 = e.getMessage();
            o0Var.zza(str2);
        } catch (NullPointerException e11) {
            e = e11;
            str2 = e.getMessage();
            o0Var.zza(str2);
        } catch (SocketTimeoutException unused) {
            str2 = "TIMEOUT";
            o0Var.zza(str2);
        } catch (UnknownHostException unused2) {
            str2 = "<<Network Error>>";
            o0Var.zza(str2);
        } catch (JSONException e12) {
            e = e12;
            str2 = e.getMessage();
            o0Var.zza(str2);
        }
    }

    private static void c(HttpURLConnection httpURLConnection, o0 o0Var, Type type) {
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                InputStream inputStream = d(responseCode) ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                String sb2 = sb.toString();
                if (d(responseCode)) {
                    o0Var.zzb((t) r.a(sb2, type));
                } else {
                    o0Var.zza((String) r.a(sb2, String.class));
                }
                httpURLConnection.disconnect();
            } catch (sx e10) {
                e = e10;
                o0Var.zza(e.getMessage());
                httpURLConnection.disconnect();
            } catch (SocketTimeoutException unused) {
                o0Var.zza("TIMEOUT");
                httpURLConnection.disconnect();
            } catch (IOException e11) {
                e = e11;
                o0Var.zza(e.getMessage());
                httpURLConnection.disconnect();
            }
        } catch (Throwable th3) {
            httpURLConnection.disconnect();
            throw th3;
        }
    }

    private static final boolean d(int i10) {
        return i10 >= 200 && i10 < 300;
    }
}
