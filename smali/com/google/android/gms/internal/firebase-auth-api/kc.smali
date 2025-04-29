.class final Lcom/google/android/gms/internal/firebase-auth-api/kc;
.super Lcom/google/android/gms/internal/firebase-auth-api/gj;
.source "SourceFile"


# instance fields
.field final synthetic b:Lcom/google/android/gms/internal/firebase-auth-api/lc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/lc;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/kc;->b:Lcom/google/android/gms/internal/firebase-auth-api/lc;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/gj;-><init>(Ljava/lang/Class;)V

    return-void
.end method

.method public static final g(Lcom/google/android/gms/internal/firebase-auth-api/fo;)Lcom/google/android/gms/internal/firebase-auth-api/bo;
    .locals 3

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/bo;->D()Lcom/google/android/gms/internal/firebase-auth-api/ao;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/fo;->H()Lcom/google/android/gms/internal/firebase-auth-api/io;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ao;->s(Lcom/google/android/gms/internal/firebase-auth-api/io;)Lcom/google/android/gms/internal/firebase-auth-api/ao;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/fo;->C()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/bv;->a(I)[B

    move-result-object p0

    array-length v1, p0

    const/4 v2, 0x0

    invoke-static {p0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->w([BII)Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/ao;->r(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/ao;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/ao;->t(I)Lcom/google/android/gms/internal/firebase-auth-api/ao;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/bo;

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/google/android/gms/internal/firebase-auth-api/w6;)Lcom/google/android/gms/internal/firebase-auth-api/w6;
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/fo;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/kc;->g(Lcom/google/android/gms/internal/firebase-auth-api/fo;)Lcom/google/android/gms/internal/firebase-auth-api/bo;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic b(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/w6;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/e5;->a()Lcom/google/android/gms/internal/firebase-auth-api/e5;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fo;->G(Lcom/google/android/gms/internal/firebase-auth-api/m4;Lcom/google/android/gms/internal/firebase-auth-api/e5;)Lcom/google/android/gms/internal/firebase-auth-api/fo;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic d(Lcom/google/android/gms/internal/firebase-auth-api/w6;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/fo;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/kc;->f(Lcom/google/android/gms/internal/firebase-auth-api/fo;)V

    return-void
.end method

.method public final f(Lcom/google/android/gms/internal/firebase-auth-api/fo;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/fo;->C()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/dv;->b(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/kc;->b:Lcom/google/android/gms/internal/firebase-auth-api/lc;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/fo;->H()Lcom/google/android/gms/internal/firebase-auth-api/io;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/lc;->k(Lcom/google/android/gms/internal/firebase-auth-api/lc;Lcom/google/android/gms/internal/firebase-auth-api/io;)V

    return-void
.end method
