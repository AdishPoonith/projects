package v8;

import com.google.firebase.firestore.z;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class a extends Exception {

    /* renamed from: j  reason: collision with root package name */
    private final String f19465j;

    /* renamed from: k  reason: collision with root package name */
    private final String f19466k;

    /* renamed from: v8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0276a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f19467a;

        static {
            int[] iArr = new int[z.a.values().length];
            f19467a = iArr;
            try {
                iArr[z.a.ABORTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19467a[z.a.ALREADY_EXISTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19467a[z.a.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19467a[z.a.DATA_LOSS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19467a[z.a.DEADLINE_EXCEEDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19467a[z.a.FAILED_PRECONDITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19467a[z.a.INTERNAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19467a[z.a.INVALID_ARGUMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19467a[z.a.NOT_FOUND.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19467a[z.a.OUT_OF_RANGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19467a[z.a.PERMISSION_DENIED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19467a[z.a.RESOURCE_EXHAUSTED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19467a[z.a.UNAUTHENTICATED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f19467a[z.a.UNAVAILABLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19467a[z.a.UNIMPLEMENTED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f19467a[z.a.UNKNOWN.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public a(z zVar, Throwable th) {
        super(zVar != null ? zVar.getMessage() : "", th);
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        char c10;
        String str6 = null;
        if (th == null || th.getMessage() == null) {
            str = "Operation was attempted past the valid range.";
        } else {
            str = "Operation was attempted past the valid range.";
            if (th.getMessage().contains(":")) {
                Matcher matcher = Pattern.compile("([A-Z_]{3,25}):\\s(.*)").matcher(th.getMessage());
                if (matcher.find()) {
                    String trim = matcher.group(1).trim();
                    str2 = "out-of-range";
                    str3 = matcher.group(2).trim();
                    trim.hashCode();
                    switch (trim.hashCode()) {
                        case -1842427240:
                            if (trim.equals("DATA_LOSS")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1711692763:
                            if (trim.equals("INVALID_ARGUMENT")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1416305653:
                            if (trim.equals("PERMISSION_DENIED")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1031784143:
                            if (trim.equals("CANCELLED")) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1025686472:
                            if (trim.equals("RESOURCE_EXHAUSTED")) {
                                c10 = 4;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -849706474:
                            if (trim.equals("UNAUTHENTICATED")) {
                                c10 = 5;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -476794961:
                            if (trim.equals("ABORTED")) {
                                c10 = 6;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -376214182:
                            if (trim.equals("DEADLINE_EXCEEDED")) {
                                c10 = 7;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 433141802:
                            if (trim.equals("UNKNOWN")) {
                                c10 = '\b';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 695165606:
                            if (trim.equals("OUT_OF_RANGE")) {
                                c10 = '\t';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 979228314:
                            if (trim.equals("FAILED_PRECONDITION")) {
                                c10 = '\n';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1023286998:
                            if (trim.equals("NOT_FOUND")) {
                                c10 = 11;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1353037501:
                            if (trim.equals("INTERNAL")) {
                                c10 = '\f';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1487498288:
                            if (trim.equals("UNAVAILABLE")) {
                                c10 = '\r';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1661336131:
                            if (trim.equals("ALREADY_EXISTS")) {
                                c10 = 14;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1854913705:
                            if (trim.equals("UNIMPLEMENTED")) {
                                c10 = 15;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    switch (c10) {
                        case 0:
                            str3 = "Unrecoverable data loss or corruption.";
                            str6 = "data-loss";
                            break;
                        case 1:
                            str3 = "Client specified an invalid argument. Note that this differs from failed-precondition. invalid-argument indicates arguments that are problematic regardless of the state of the system (e.g., an invalid field name).";
                            str6 = "invalid-argument";
                            break;
                        case 2:
                            str6 = "permission-denied";
                            str3 = "The caller does not have permission to execute the specified operation.";
                            break;
                        case 3:
                            str3 = "The operation was cancelled (typically by the caller).";
                            str6 = "cancelled";
                            break;
                        case 4:
                            str6 = "resource-exhausted";
                            str3 = "Some resource has been exhausted, perhaps a per-user quota, or perhaps the entire file system is out of space.";
                            break;
                        case 5:
                            str6 = "unauthenticated";
                            str3 = "The request does not have valid authentication credentials for the operation.";
                            break;
                        case 6:
                            str3 = "The operation was aborted, typically due to a concurrency issue like transaction aborts, etc.";
                            str6 = "aborted";
                            break;
                        case 7:
                            str3 = "Deadline expired before operation could complete. For operations that change the state of the system, this error may be returned even if the operation has completed successfully. For example, a successful response from a server could have been delayed long enough for the deadline to expire.";
                            str6 = "deadline-exceeded";
                            break;
                        case '\b':
                            str6 = "unknown";
                            str3 = "Operation is not implemented or not supported/enabled.";
                            break;
                        case '\t':
                            str3 = str;
                            str6 = str2;
                            break;
                        case '\n':
                            str3 = str3.contains("index") ? str3 : "Operation was rejected because the system is not in a state required for the operation's execution. If performing a query, ensure it has been indexed via the Firebase console.";
                            str6 = "failed-precondition";
                            break;
                        case 11:
                            str3 = "Some requested document was not found.";
                            str6 = "not-found";
                            break;
                        case '\f':
                            str3 = "Internal errors. Means some invariants expected by underlying system has been broken. If you see one of these errors, something is very broken.";
                            str6 = "internal";
                            break;
                        case '\r':
                            str6 = "unavailable";
                            str3 = "The service is currently unavailable. This is a most likely a transient condition and may be corrected by retrying with a backoff.";
                            break;
                        case 14:
                            str3 = "Some document that we attempted to create already exists.";
                            str6 = "already-exists";
                            break;
                        case 15:
                            str6 = "unimplemented";
                            str3 = "Operation is not implemented or not supported/enabled.";
                            break;
                        default:
                            str3 = null;
                            break;
                    }
                    if (str6 != null && zVar != null) {
                        switch (C0276a.f19467a[zVar.a().ordinal()]) {
                            case 1:
                                str4 = "The operation was aborted, typically due to a concurrency issue like transaction aborts, etc.";
                                str5 = "aborted";
                                break;
                            case 2:
                                str4 = "Some document that we attempted to create already exists.";
                                str5 = "already-exists";
                                break;
                            case 3:
                                str4 = "The operation was cancelled (typically by the caller).";
                                str5 = "cancelled";
                                break;
                            case 4:
                                str4 = "Unrecoverable data loss or corruption.";
                                str5 = "data-loss";
                                break;
                            case 5:
                                str4 = "Deadline expired before operation could complete. For operations that change the state of the system, this error may be returned even if the operation has completed successfully. For example, a successful response from a server could have been delayed long enough for the deadline to expire.";
                                str5 = "deadline-exceeded";
                                break;
                            case 6:
                                str4 = ((zVar.getMessage() == null || !zVar.getMessage().contains("query requires an index")) && !zVar.getMessage().contains("ensure it has been indexed")) ? "Operation was rejected because the system is not in a state required for the operation's execution. If performing a query, ensure it has been indexed via the Firebase console." : zVar.getMessage();
                                str5 = "failed-precondition";
                                break;
                            case 7:
                                str4 = "Internal errors. Means some invariants expected by underlying system has been broken. If you see one of these errors, something is very broken.";
                                str5 = "internal";
                                break;
                            case 8:
                                str4 = "Client specified an invalid argument. Note that this differs from failed-precondition. invalid-argument indicates arguments that are problematic regardless of the state of the system (e.g., an invalid field name).";
                                str5 = "invalid-argument";
                                break;
                            case 9:
                                str4 = "Some requested document was not found.";
                                str5 = "not-found";
                                break;
                            case 10:
                                str4 = str;
                                str5 = str2;
                                break;
                            case 11:
                                str5 = "permission-denied";
                                str4 = "The caller does not have permission to execute the specified operation.";
                                break;
                            case 12:
                                str5 = "resource-exhausted";
                                str4 = "Some resource has been exhausted, perhaps a per-user quota, or perhaps the entire file system is out of space.";
                                break;
                            case 13:
                                str5 = "unauthenticated";
                                str4 = "The request does not have valid authentication credentials for the operation.";
                                break;
                            case 14:
                                str5 = "unavailable";
                                str4 = "The service is currently unavailable. This is a most likely a transient condition and may be corrected by retrying with a backoff.";
                                break;
                            case 15:
                                str5 = "unimplemented";
                                str4 = "Operation is not implemented or not supported/enabled.";
                                break;
                            case 16:
                                str4 = "Unknown error or an error from a different error domain.";
                                str5 = "unknown";
                                break;
                            default:
                                str4 = "An unknown error occurred";
                                str5 = "unknown";
                                break;
                        }
                    } else {
                        str4 = str3;
                        str5 = str6;
                    }
                    this.f19465j = str5;
                    this.f19466k = str4;
                }
            }
        }
        str2 = "out-of-range";
        str3 = null;
        if (str6 != null) {
        }
        str4 = str3;
        str5 = str6;
        this.f19465j = str5;
        this.f19466k = str4;
    }

    public String a() {
        return this.f19465j;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f19466k;
    }
}
