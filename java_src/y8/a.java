package y8;
/* loaded from: classes.dex */
class a extends Exception {

    /* renamed from: j  reason: collision with root package name */
    private int f20531j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Exception exc, Throwable th) {
        super(exc.getMessage(), th);
        if (exc instanceof com.google.firebase.storage.j) {
            this.f20531j = ((com.google.firebase.storage.j) exc).f();
        }
    }

    public String a() {
        int i10 = this.f20531j;
        if (i10 != -13040) {
            if (i10 != -13031) {
                if (i10 != -13030) {
                    if (i10 != -13021) {
                        if (i10 != -13020) {
                            switch (i10) {
                                case -13013:
                                    return "quota-exceeded";
                                case -13012:
                                    return "project-not-found";
                                case -13011:
                                    return "bucket-not-found";
                                case -13010:
                                    return "object-not-found";
                                default:
                                    return "unknown";
                            }
                        }
                        return "unauthenticated";
                    }
                    return "unauthorized";
                }
                return "retry-limit-exceeded";
            }
            return "invalid-checksum";
        }
        return "canceled";
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        int i10 = this.f20531j;
        if (i10 != -13040) {
            if (i10 != -13031) {
                if (i10 != -13030) {
                    if (i10 != -13021) {
                        if (i10 != -13020) {
                            switch (i10) {
                                case -13013:
                                    return "Quota on your Firebase Storage bucket has been exceeded.";
                                case -13012:
                                    return "No project is configured for Firebase Storage.";
                                case -13011:
                                    return "No bucket is configured for Firebase Storage.";
                                case -13010:
                                    return "No object exists at the desired reference.";
                                default:
                                    return "An unknown error occurred";
                            }
                        }
                        return "User is unauthenticated. Authenticate and try again.";
                    }
                    return "User is not authorized to perform the desired action.";
                }
                return "The maximum time limit on an operation (upload, download, delete, etc.) has been exceeded.";
            }
            return "File on the client does not match the checksum of the file received by the server.";
        }
        return "User cancelled the operation.";
    }
}
